package com.example.lab_2;

public abstract class Note {
    //Attributes
    private String title;
    private String content;
    public String createdDate;
    private User user;

    //Method
    public abstract String getSummary();

    public String getNameUser() {
        return user != null ? user.getUserName() : null;
    }

    public void setNameUser(String newNameUser) {
        if (user == null) {
            user = new User();
        }
        user.setUserName(newNameUser);
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

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(String date) {
        this.createdDate = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

