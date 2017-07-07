package com.homelearning.creational.singleton;

public class ActionJournalDemo {
    public static void main(String[] args) {
        ActionJournal.getInstance().addAction("Crop image");
        ActionJournal.getInstance().addAction("Apply filter noise");
        ActionJournal.getInstance().addAction("Flip image horizontally");
        ActionJournal.getInstance().addAction("Apply auto-contrast");
        ActionJournal.getInstance().addAction("Apply mask");
        ActionJournal.getInstance().addAction("Brush");
        ActionJournal.getInstance().addAction("Brush");
        ActionJournal.getInstance().undoAction();
        System.out.println(ActionJournal.getInstance());
        ActionJournal.getInstance().undoAction();
        System.out.println(ActionJournal.getInstance());
    }
}
