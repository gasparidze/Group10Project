package org.example.exceptions;

public class RuntimeExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 3 / 0;
        } catch (RuntimeException e){
            System.out.println("деленеи на ноль");
        }
    }
}
