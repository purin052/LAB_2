package com.example.lab_2;

public class Textnote extends Note {
    //Attributes
    private String content;

    //Method
    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getSummary() {
        return "User: " + getNameUser() + " | Title: " + getTitle() + " | Content: " + getContent() + " | Date: " + createdDate;
    }
}
