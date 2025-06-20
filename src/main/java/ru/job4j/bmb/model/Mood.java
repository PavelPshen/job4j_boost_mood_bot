package ru.job4j.bmb.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "mb_mood")
public class Mood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    private boolean good;

    public Mood(String text, boolean good) {
        this.text = text;
        this.good = good;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setGood(boolean good) {
        this.good = good;
    }

    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public boolean getGood() {
        return good;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Mood mood = (Mood) o;
        return Objects.equals(id, mood.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
