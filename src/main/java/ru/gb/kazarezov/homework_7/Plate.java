package ru.gb.kazarezov.homework_7;

public class Plate {

    private int volume;

    public Plate(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void decreaseFood (int count) {
        this.volume = this.volume - count;

    }
    public void putFoodToPlate(int quantity) {
        this.volume = this.volume + quantity;
    }
    }




