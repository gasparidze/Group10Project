package org.example.enums;

public class Main {
    public static void main(String[] args) {
        Status status = Status.NEW;
        System.out.println(status);
        System.out.println(status.getDescription());

        String name = Status.NEW.name();
    }
}
