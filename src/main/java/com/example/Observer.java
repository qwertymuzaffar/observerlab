package com.example;

/**
 * Observer interface - defines what observers must implement
 */
public interface Observer {
    void update(String sender, String message);
    String getName();
}