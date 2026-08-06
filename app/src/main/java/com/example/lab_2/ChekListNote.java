package com.example.lab_2;

import java.util.ArrayList;
import java.util.List;

public class ChekListNote extends Note{
    private List<String> CheckList = new ArrayList<>();

    public List<String> getCheckList() {
        return CheckList;
    }
    public void addCheckListItem(String item) {
        this.CheckList.add(item);
    }

    @Override
    public String getSummary() {
        return getNameUser() + "" + getTitle() + " Items: " + CheckList.size() + " Date: " + createdDate;
    }
}


