package com.app.noteitapi.controller.viewmodel;



public class NotebookViewModel {
    private String id;

//    @NonNull
    private String name;

    private int nbNotes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbNotes() {
        return nbNotes;
    }

    public void setNbNotes(int nbNotes) {
        this.nbNotes = nbNotes;
    }
}
