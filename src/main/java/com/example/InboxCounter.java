package com.example;

/**
 * Counts unread emails - like the badge on email apps
 */
public class InboxCounter implements Observer {
    private int count = 0;
    private int urgentCount = 0;

    @Override
    public void update(String sender, String message, boolean isUrgent) {
        count++;
        if (isUrgent) urgentCount++;
        System.out.println("📬 Inbox: " + count + " unread emails");
    }

    @Override
    public String getName() {
        return "Inbox Counter";
    }

    public int getCount() {
        return count;
    }
    public int getUrgentCount() { return urgentCount; }
}
