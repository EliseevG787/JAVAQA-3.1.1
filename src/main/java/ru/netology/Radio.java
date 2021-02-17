package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
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

    public void setRadioNumber(int currentRadioNumber) {
        if (currentRadioNumber < this.minRadioNumber || currentRadioNumber > this.maxRadioNumber) {
            return;
        }
        this.currentRadioNumber = currentRadioNumber;
        return;
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