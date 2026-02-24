package org.cleancoding.behavioural.template;

public abstract class CoursePublisher {

    // Template method (final is common practice)
    public final void publish() {

        validate();
        processContent(); // customizable
        notifyUsers();
    }

    private void validate() {
        System.out.println("Validating course...");
    }

    protected abstract void processContent();

    private void notifyUsers() {
        System.out.println("Notifying users...");
    }
}