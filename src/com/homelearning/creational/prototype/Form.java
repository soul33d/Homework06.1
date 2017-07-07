package com.homelearning.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Form implements Copyable {
    private String title;
    private List<String> questions;
    private String contacts;

    public Form(String title, List<String> questions, String contacts) {
        this.title = title;
        this.questions = questions;
        this.contacts = contacts;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    @Override
    public Form copy() {
        return new Form(title, new ArrayList<>(questions), contacts);
    }

    @Override
    public String toString() {
        return title + '\n' +
                "questions=" + questions +
                "\n" + contacts;
    }
}
