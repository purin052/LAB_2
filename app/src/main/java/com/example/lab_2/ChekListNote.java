package com.example.lab_2;

import java.util.ArrayList;
import java.util.List;

public class ChekListNote extends Note {

    private final List<String> items = new ArrayList<>();

    public void addCheckList(String item) {
        items.add(item);
    }

    @Override
    public String getSummary() {
        return "User: " + getNameUser() + " | Title: " + getTitle() + " | Items: " + items.size() + " | Date: " + createdDate;
    }
}
