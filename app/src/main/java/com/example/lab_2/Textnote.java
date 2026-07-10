package com.example.lab_2;

public class Textnote extends Note{
    //Attributes
    private String content;
    //Method
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void getSummary(){
        System.out.println(getTitle() + content + createdDate);
    }
    ;
}
