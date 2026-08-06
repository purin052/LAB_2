package com.example.lab_2;

public abstract class Note {
    //Attributes
    private String title;
    public String createdDate;
    private String userName;
    private String content;

    //Method
    public abstract String getSummary();

    public String getNameUser() {
        return userName;
    }

    public void setNameUser(String userName) {
        this.userName = userName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String newContent) {
        this.content = newContent;
    }

    public void setDate(String date) {
        this.createdDate = date;
    }

    public User getUser() {
        return null; // Placeholder
    }

    public void setUser(User newUser) {
        // Placeholder
    }
}
