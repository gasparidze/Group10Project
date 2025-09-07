package org.example.ordering;

public class Lion extends Animal{
    public static String uniqueParam = "unique param";
    private String grivaColor = "orange";
    public Lion(String name) {
        super(name);
        System.out.println("вызов конструктора наследника");
    }

    static {
        System.out.println("Вызов статического блока наследника");
    }

    public String getGrivaColor() {
        return grivaColor;
    }

    public void setGrivaColor(String grivaColor) {
        this.grivaColor = grivaColor;
    }
}
