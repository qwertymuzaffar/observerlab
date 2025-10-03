package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * EmailSystem manages observers and sends notifications
 */
public class EmailSystem {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Added: " + observer.getName());
    }

    public void receiveEmail(String sender, String message, boolean isUrgent) {
        String urgentText = isUrgent ? " [URGENT]" : "";
        System.out.println("\n📧 New email from: " + sender + urgentText);

        // Notify all observers
        for (Observer observer : observers) {
            observer.update(sender, message, isUrgent);
        }
    }

    public int getObserverCount() {
        return observers.size();
    }
}
