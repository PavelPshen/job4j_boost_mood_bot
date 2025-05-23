package ru.job4j.bmb.model;

public class User {

    private Long id;
    private long clientId;
    private long chatId;

    public User(long id, long clientId, long chatId) {
        this.id = id;
        this.clientId = clientId;
        this.chatId = chatId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public long getId() {
        return id;
    }

    public Long getClientId() {
        return clientId;
    }

    public long getChatId() {
        return chatId;
    }
}

