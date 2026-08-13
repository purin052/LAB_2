package com.example.lab_2;

public class NoteController {
    private AddNote view;

    public NoteController(AddNote view) {
        this.view = view;
    }

    public void saveTextNote(String userName, String title, String content, String date) {

        Textnote textNote = new Textnote();
        textNote.setNameUser(userName);
        textNote.setTitle(title);
        textNote.setContent(content);
        textNote.setDate(date);

        view.displayNoteSummary(textNote.getSummary());
    }

    public void saveCheckListNote(String userName, String title, String item, String date) {

        ChekListNote checkListNote = new ChekListNote();
        checkListNote.setNameUser(userName);
        checkListNote.setTitle(title);
        checkListNote.addCheckList(item);
        checkListNote.setDate(date);

        view.displayNoteSummary(checkListNote.getSummary());
    }
}