package ru.gb.kazarezov.homework_7;

public class Plate {

    private int volume;

    public Plate(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void decreaseFood(int count) {
        if ((this.volume - count) >= 0) {
            this.volume = this.volume - count;
        } else {
            System.out.println("Not enough food in the plate !");
        }

    }
    public void putFoodToPlate(int quantity) {
        this.volume = this.volume + quantity;
    }
}




