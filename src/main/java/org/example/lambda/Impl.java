package org.example.lambda;

public class Impl implements Operation{
    @Override
    public double operate(int a , int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Impl impl = new Impl();
        double operate = impl.operate(2 , 4);
        System.out.println(operate);

        /**
         * Такая конструкция называется анонимный класс,
         * эта конструкция на лету создает класс, имплементирующий интерфейс Operation, но у этого класса нет имени
         * => он одноразовый
         *
         * Анонимные классы используются когда нам нужно реализовать много разных поведений для разных целей
         * и чтобы не создавать много разных отдельных классов, мы можем использовать анонимные классы
         */
        Operation operation = new Operation() {
            @Override
            public double operate(int a , int b) {
                return a + b;
            }
        };
        double operate1 = operation.operate(2 , 4);
        System.out.println(operate1);
    }
}

/**
 * Функциональный интерфейс - это интерфейс, в котором содержится только один метод
 */
@FunctionalInterface
interface Operation {
    double operate(int a, int b);
}
