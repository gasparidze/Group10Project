package org.example;

/**
 * 1) git init (либо галочка при создании проекта) - инициализация/создание локального репозитория/хранилища
 * 2) связь локального репозитория с удаленным git -> manage remotes -> +
 * 3) добавление/фиксация изменений в основую ветку (master) -> commit
 * 4) залить/загрузить эту ветку/изменения в этой ветки в удаленный пепозиторий -> push
 *
 * выгрузить/скачать - это update
 * переключиться на другую ветку - checkout
 * создать ветку на основе другой ветки - new branch from master
 *
 * Заметка: git отслеживает изменений в только зафиксированных файлах (commit)
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
    }
}
