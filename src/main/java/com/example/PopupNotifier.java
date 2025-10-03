package com.example;

/**
 * Shows popup notifications - like desktop alerts
 */
public class PopupNotifier implements Observer {

    @Override
    public void update(String sender, String message, boolean isUrgent) {
        String priority = isUrgent ? "🔴 URGENT" : "🟡 NORMAL";
        System.out.println("🔔 POPUP " + priority + ": New email from " + sender);
        System.out.println("   Message: " + message.substring(0, Math.min(30, message.length())) + "...");
    }

    @Override
    public String getName() {
        return "Popup Notifier";
    }
}
