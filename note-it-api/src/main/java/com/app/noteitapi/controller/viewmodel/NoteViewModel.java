package com.app.noteitapi.controller.viewmodel;

import org.springframework.lang.NonNull;

import java.util.Date;

public class NoteViewModel {

    private String id;

//    @NonNull
//    @Min(3)
    private String title;

//    @NonNull
    private String text;

//    @NonNull
    private String notebookId;

    private Date lastModifiedOn;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public String getNotebookId() {
        return notebookId;
    }

    public Date getLastModifiedOn() {
        return lastModifiedOn;
    }

    public void setLastModifiedOn(Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    public void setNotebookId(String notebookId) {
        this.notebookId = notebookId;
    }
}
