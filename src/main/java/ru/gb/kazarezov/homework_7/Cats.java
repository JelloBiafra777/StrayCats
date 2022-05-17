package ru.gb.kazarezov.homework_7;

public class Cats {

    private String name;
    private int appetite;
    private boolean satiety;

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public Cats(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {

        if (p.getVolume() > this.appetite) {
            p.decreaseFood(this.appetite);
        } else {
            System.out.println("Not enough food in this plate !!!");
        }
    }

}
