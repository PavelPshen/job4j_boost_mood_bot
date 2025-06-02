package ru.job4j.bmb.content;

import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

public class Content {
    private final Long chatId;
    private String text;
    private InputFile photo;
    private InlineKeyboardMarkup markup;
    private InputFile audio;

    public Content() {
        this.chatId = 0L;
    }

    public Content(Long chatId) {
        this.chatId = chatId;
    }

    public void setAudio(InputFile audio) {
        this.audio = audio;
    }

    public InputFile getAudio() {
        return audio;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setPhoto(InputFile photo) {
        this.photo = photo;
    }

    public InputFile getPhoto() {
        return photo;
    }


    // Геттеры и сеттеры для полей
}

