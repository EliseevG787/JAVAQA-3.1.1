package ru.netology;

public class Radio {
    private int currentRadioNumber = 0;
    private int minRadioNumber = 0;
    private int maxRadioNumber = 10;
    private int currentVolume = 0;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int maxRadioNumber) {
        this.maxRadioNumber = maxRadioNumber;
    }

    public Radio() {

    }

    public int getMinRadioNumber() {
        return this.minRadioNumber;
    }

    public int getMaxRadioNumber() {
        return this.maxRadioNumber;
    }

    public void setRadioNumber(int radioNumber) {
        this.currentRadioNumber = radioNumber;
    }

    public int getRadioNumber() {
        return this.currentRadioNumber;
    }


    public void setNextRadioNumber() {
        if (this.currentRadioNumber == this.maxRadioNumber) {
            this.currentRadioNumber = this.minRadioNumber;
            return;
        }
        this.currentRadioNumber++;
        return;
    }

    public void setPrevRadioNumber() {
        if (this.currentRadioNumber == this.minRadioNumber) {
            this.currentRadioNumber = this.maxRadioNumber;
            return;
        }
        this.currentRadioNumber--;
        return;
    }

    public void setCurrentRadioNumber(int currentRadioNumber) {
        if (currentRadioNumber < this.minRadioNumber || currentRadioNumber > this.maxRadioNumber) {
            return;
        }
        this.currentRadioNumber = currentRadioNumber;
        return;
    }


    public int getMinVolume() {
        return this.minVolume;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    public void setVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getVolume() {
        return this.currentVolume;
    }

    public void increaseVolume() {
        if (this.currentVolume == maxVolume) {
            return;
        }
        this.currentVolume++;
        return;
    }

    public void decreaseVolume() {
        if (this.currentVolume == minVolume) {
            return;
        }
        this.currentVolume--;
        return;
    }
}