package org.example.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * В Java есть 4 основных функциональных интерфейса:
 * 1) Predicate - проверяет какое-то условие и возвращает boolean
 * 2) Consumer - принимает какое-то значение, но ничего не возвращает
 * 3) Supplier - предоставляет какое-то значение, на вход же ничего не принимает
 * 4) Function - что-то принимает, что-то возвращает
 */
public class LambdaExample {
    public static void main(String[] args) {
        /**
         * Программисты пошли еще дальше и ввели лямбда выражения - специальная конструкция, которая реализует
         * функциональный интерфейс
         * стрелка разделяет входные параметры от тела метода
         *
         * Благодаря функциональным интерфейсам и лямбда выражениям нам доступно функциональное программирование
         */
        Operation operation = (a, b) -> a + b;

        Predicate<Integer> condition = age -> age >= 18;
        if (condition.test(20)){
            System.out.println("вы совершеннолетний");
        }

        Consumer<String> consumerExample = str -> System.out.println("Hello from " + str);
        consumerExample.accept("Java 10 Group");

        Supplier<String> supplierExample = () -> "Hello from Russia";
        String str = supplierExample.get();
        System.out.println(str);

        Function<Integer, String> functionExample = age -> {
            String message = "";
            if (age >= 18){
                message = "вы совершеннолетний";
            } else {
                message = "нет 18";
            }
            return message;
        };

        String apply = functionExample.apply(16);
        System.out.println(apply);

        System.out.println(test(functionExample , 18));

        String test = test(age -> age >= 7 ? "можете идти в первый класс" : "еще стоит походить в садик", 4);
        System.out.println(test);

        Predicate<String> task1 = string -> string != null;
        Predicate<String> task2 = string -> !string.isBlank();
        Predicate<String> task3 = task1.and(task2);

        System.out.println(task3.test("Hello"));
    }

    private static String test(Function<Integer, String> function, int age){
        String apply = function.apply(age);
        return apply.toUpperCase();
    }
}

class FunctionImpl implements Function<Integer, String>{
    @Override
    public String apply(Integer age) {
        return age >= 7 ? "можете идти в первый класс" : "еще стоит походить в садик";
    }
}