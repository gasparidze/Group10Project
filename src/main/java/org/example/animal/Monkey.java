package org.example.animal;

public class Monkey extends Animal{
    private int quantityOfBananas;

    public Monkey(double weight , String environment , String nickname , int quantityOfBananas) {
        super(weight , environment , nickname);
        this.quantityOfBananas = quantityOfBananas;
    }

    @Override
    public void saySmth() {
        System.out.println("Monkey is saying");
    }

    public int getQuantityOfBananas() {
        return quantityOfBananas;
    }

    public void setQuantityOfBananas(int quantityOfBananas) {
        this.quantityOfBananas = quantityOfBananas;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "weight=" + super.getWeight() +
                ", environment='" + super.getEnvironment() + '\'' +
                ", nickname='" + super.getNickname() + '\'' +
                ", quantityOfBananas=" + quantityOfBananas +
                '}';
    }
}
