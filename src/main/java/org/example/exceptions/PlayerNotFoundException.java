package org.example.exceptions;

import java.util.Scanner;

/**
 * Исключительных случаев в работе программы может быть много, например, у вас может не найтись пользователсь по login,
 * а может возникнуть исключение из-за того, что обрщаетесь к null или выходите за пределы массива, и нам надо как-то
 * разграничивать эти сценарии, т.е. понимать, что именнно произошло в работе программы => один RuntimeException на все случаи
 * жизни нам не подходит => необходимо создавать свои, кастомные, исключения
 *
 * Чтобы создать свой exception, необходимо:
 * 1) для создания checked exception - наследуемся от Exception
 * 2) для создания unchecked exception - наследуемся от RuntimeException
 */
public class PlayerNotFoundException extends RuntimeException {
    public PlayerNotFoundException(String message) {
        super(message);
    }
}

class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("enter login: ");
            String login = scanner.nextLine();
            if (login.contains("test")){
                throw new PlayerNotFoundException("Пользователь по данному login [%s] не найден, повторите попытку".formatted(login));
            } else {
                System.out.println("Пользователь найден");
            }
        } catch (PlayerNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}