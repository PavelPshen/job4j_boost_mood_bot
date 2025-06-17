package ru.job4j.bmb.model;

import jakarta.persistence.*;
import ru.job4j.bmb.content.Content;

import java.util.Objects;

@Entity
@Table(name = "mb_mood_log")
public class MoodLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "mood_id")
    private Mood mood;

    private long createdAt;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public Mood getMood() {
        return mood;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MoodLog moodLog = (MoodLog) o;
        return Objects.equals(id, moodLog.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

