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

    public void receiveEmail(String sender, String message) {
        System.out.println("\n📧 New email from: " + sender);

        // Notify all observers
        for (Observer observer : observers) {
            observer.update(sender, message);
        }
    }

    public int getObserverCount() {
        return observers.size();
    }
}