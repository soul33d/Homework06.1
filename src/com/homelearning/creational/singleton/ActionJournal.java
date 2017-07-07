package com.homelearning.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class ActionJournal {

    private List<String> actionList;

    private ActionJournal() {
        actionList = new ArrayList<>();
    }

    public void addAction(String action){
        actionList.add(action);
    }

    public void undoAction(){
        actionList.remove(actionList.size() - 1);
    }

    @Override
    public String toString() {
        return "ActionJournal{" + actionList +
                '}';
    }

    public static ActionJournal getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final ActionJournal instance = new ActionJournal();
    }
}
