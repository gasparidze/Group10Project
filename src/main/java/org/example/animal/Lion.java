package org.example.animal;

public class Lion extends Animal{
    private String grivaColor;

    public Lion(double weight , String environment , String nickname , String grivaColor) {
        super(weight , environment , nickname);
        this.grivaColor = grivaColor;
    }

    @Override
    public void saySmth() {
        System.out.println("Lion is saying");
    }

    @Override
    public void makeSound() {
        System.out.println("lion makes sound");
    }

    @Override
    public void eat() {
        System.out.println("lion is eating");
    }

    public String getGrivaColor() {
        return grivaColor;
    }

    public void setGrivaColor(String grivaColor) {
        this.grivaColor = grivaColor;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "weight=" + super.getWeight() +
                ", environment='" + super.getEnvironment() + '\'' +
                ", nickname='" + super.getNickname() + '\'' +
                ", grivaColor='" + grivaColor + '\'' +
                '}';
    }
}
