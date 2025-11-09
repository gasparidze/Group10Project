package org.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream API - некий набор методов для работы с коллекциями, суть этих методов преобразования изначальной коллекции
 * в stream - некий поток данных, который может быть конвертирован в любую другую коллекцию.
 *
 * Методы stream api делятся на 2 вида:
 * 1) intermediate (промежуточные) - методы, возвращающие Stream
 * 2) terminal (окончательные) - методы, возвращающие отличное от Stream значение
 *
 * Правила:
 * 1) Методы stream api не модифицируют саму коллекцию, на которой они вызываются, создается новая коллекция
 * 2) Ни один промежуточный метод не будет вызван пока не выполнится терминальный метод
 */
public class StreamExample {
    /**
     * Основные методы stream api:
     * 1) filter - фильтрует данные
     * 2) map - преобразует данные
     * 3) collect - собирает данные
     * 4) foreach - пробегается по данным
     * 5) flatMap - разворачивает вложенную коллекцию
     *
     * Различные мелкие методы:
     * 1) findFirst/findAny
     * 2) max/min
     * 3) limit/distinct
     */
    public static void main(String[] args) {
        List<String> list = List.of("Hello" , "From" , "Russia");
        System.out.println(list);

        /**
         * method chaining
         */
        List<String> toList = list.stream()
                .filter(el -> el.contains("Hello"))
                .map(el -> el.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(toList);

        Set<String> toSet = list.stream()
                .filter(el -> el.contains("Hello"))
                .map(el -> el.toUpperCase())
                .collect(Collectors.toSet());

        System.out.println(toSet);

        Map<String, Integer> toMap = list.stream()
                .filter(el -> el.contains("Hello"))
                .map(el -> el.toUpperCase())
                .collect(Collectors.toMap(el -> el , el -> el.length()));

        System.out.println(toMap);

        Student student1 = new Student("Kate", 18);
        Student student2 = new Student("Masha", 20);
        Student student3 = new Student("Megan Fox", 21);
        Student student4 = new Student("Angelina Joli", 22);
        Student student5 = new Student("Michelle Pfieffer", 26);
        Student student6 = new Student("Artur", 26);
        List<Student> students1 = new ArrayList<>();
        List<Student> students2 = new ArrayList<>();
        List<Student> students3 = new ArrayList<>();
        students1.add(student1);
        students1.add(student2);
        students2.add(student3);
        students2.add(student4);
        students3.add(student5);
        students3.add(student6);

        Faculty faculty1 = new Faculty("math", students1);
        Faculty faculty2 = new Faculty("cinema", students2);
        Faculty faculty3 = new Faculty("physics", students3);
        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty1);
        faculties.add(faculty2);
        faculties.add(faculty3);

        /**
         * Вывести имена всех стунедтов всех факулетов
         * Преобразовать все имена всех студентов всех факультетов в верхний регистр
         */
        faculties.stream().forEach(el -> el.getStudents().stream().forEach(System.out::println));
        //        for (Faculty faculty : faculties) {
//            for (Student student : faculty.getStudents()) {
//                System.out.println(student);
//            }
//        }

//        faculties.stream()
//                .map(el -> el.getStudents().stream())
//                .filter()

        List<String> namesInUpperCase = faculties.stream()
                .flatMap(el -> el.getStudents().stream())
                .map(student -> student.getName().toUpperCase())
                .collect(Collectors.toList());

        System.out.println(namesInUpperCase);

    }
}
