package org.example.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Exceptions - исключительные случаи в работе программы
 * Error - ошибка в работе программы
 */
public class ExceptionExample {
    public static void main(String[] args){
        /**
         * Checked exceptions - компилятор обязазтельно требует обработки, т.е. проверки
         * Unchecked exceptions - желательно обрабатывать, но компилятор явно этого не требует
         *
         * в try помещаем потенциально опасный код, который может выкинуть exception
         * в catch помещается обработка этого исключения
         * зачем мы вообще обрабатываем исключение?
         * потому что если выкинется exception без обработки, то программа завершится с exit code 1
         * но благадаря catch, мы можем как-то обработать исключение, например, вывести сообщение и продолдить выполнение
         * работы программы
         *
         * в конструкции try-catch есть также блок finally, который выполняется вне зависимости от того,
         * программа кинуло исключение или нет, т.е. finally выполняется всегда в конце
         * ex: отправлять результат какого-то процесса на почту
         *
         * блоков catch может быть сколько угодно, если выкидывается несколько exceptions и если мы хотим обработать их одинаково,
         * то можем использовать multicatch инструмент
         *
         * блок try может быть и без catch, т.е. try-finally - вполне допустимо
         */
        try {
            test();
        } catch (FileNotFoundException | ArithmeticException e) {
            System.out.println("ошибка");
        } finally {
            System.out.println("блок finally");
        }
        System.out.println("программа продолжила работать");
    }

    private static void test() throws FileNotFoundException, ArithmeticException {
        /**
         * конструктор FileInputStream кидает FileNotFoundException,
         * т.е. компилятор предупреждает о том, что может возникнуть ошибка во время выполнения программы
         * т.е. пока не запустилась программа, на этапе компиляции мы должны обработать это ожидаемое искючение
         * Обработать можно двумя способами:
         * 1) пробросить исключение в сигнатуре метода, т.е. отдать ответственность за обработку вызывающему методу
         * 2) поместить в блок try-catch
         */
        FileInputStream fileInputStream = new FileInputStream("test");
        throw new ArithmeticException();
    }
}
