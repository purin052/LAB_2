package com.example.lab_2;

public abstract class Note {
    //Attributes
    private String title;
    public String createdDate;

    //Method
    public abstract String getSummary();

    public String getTitle(){
        return title;
    }
    public void setTitle(String newTitle){
        this.title = newTitle;
    }
    public void setDate(String date){
        this.createdDate = date;
    }

}
