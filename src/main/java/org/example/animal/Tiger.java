package org.example.animal;

/**
 * extends Animal - говорит о том, что Tiger будет наследоваться от Animal
 * => как мы знаем при создании объекта класса Tiger будет инициализироваться его конструктор => т.к. он наследуется от Animal,
 * то сперва сначала должен проинициализироваться конструктор родителя, именно поэтому пишем super
 * super - это ссылка к супер классу (на класс родителя)
 * с помощью super мы можем обращаться ко всем сущностям класса родителя:
 * 1) super(param1, .., paramN) - вызывает конструктор класса родителя
 * 2) super.field - обращается к полю класса родителя
 * 3) super.method() - вызывает метод класса родителя
 */
public class Tiger extends Animal{
    private String uniqueParam;

    public Tiger(double weight , String environment , String nickname , String uniqueParam) {
        super(weight , environment , nickname);
        this.uniqueParam = uniqueParam;
    }

    /**
     * Мы можем переопределять метода класса родителя, т.е. мы можем реализовывать какую-то свою логику в этом методе,
     * но сигнатуру менять нельзя
     * @Override - аннотация Override проверяет как раз-таки сигнатуру нашего метода
     */
    @Override
    public void saySmth() {
        System.out.println("Tiger is saying");
    }

    public void uniqueMethod(){
        System.out.println("alalala");
    }

    public String getUniqueParam() {
        return uniqueParam;
    }

    public void setUniqueParam(String uniqueParam) {
        this.uniqueParam = uniqueParam;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "weight=" + super.getWeight() +
                ", environment='" + super.getEnvironment() + '\'' +
                ", nickname='" + super.getNickname() + '\'' +
                ", uniqueParam='" + uniqueParam + '\'' +
                '}';
    }
}
