package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(55);

    @Test
    public void shouldSetNextRadioNumberBeforeMax() {
        radio.setCurrentRadioNumber(5);
        radio.setNextRadioNumber();
        assertEquals(6, radio.getCurrentRadioNumber());
    }

    @Test
    public void shouldSetNextRadioNumberMoreMax() {
        int maxRadioNumber = radio.getMaxRadioNumber();
        radio.setCurrentRadioNumber(maxRadioNumber);
        radio.setNextRadioNumber();
        assertEquals(0, radio.getCurrentRadioNumber());
    }

    @Test
    public void shouldSetPrevRadioNumberMoreMin() {
        radio.setCurrentRadioNumber(5);
        radio.setPrevRadioNumber();
        assertEquals(4, radio.getCurrentRadioNumber());
    }

    @Test
    public void shouldSetPrevRadioNumberLessMin() {
        int minRadioNumber = radio.getMinRadioNumber();
        radio.setCurrentRadioNumber(minRadioNumber);
        radio.setPrevRadioNumber();
        assertEquals(55, radio.getCurrentRadioNumber());
    }

    @Test
    public void shouldSetRadioNumber() {
        radio.setRadioNumber(7);
        assertEquals(7, radio.getCurrentRadioNumber());
    }

    @Test
    public void shouldSetRadioNumberLessMin() {
        int radioNumber = radio.getCurrentRadioNumber();
        radio.setRadioNumber(-1);
        assertEquals(radioNumber, radio.getCurrentRadioNumber());
    }

    @Test
    public void shouldSetRadioNumberMoreMax() {
        int radioNumber = radio.getCurrentRadioNumber();
        radio.setRadioNumber(56);
        assertEquals(radioNumber, radio.getCurrentRadioNumber());
    }


    @Test
    public void shouldIncreaseVolumeLessMax() {
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(11, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeMoreMax() {
        int maxVolume = radio.getMaxVolume();
        radio.setCurrentVolume(maxVolume);
        radio.increaseVolume();
        assertEquals(maxVolume, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeLessMin() {
        int minVolume = radio.getMinVolume();
        radio.setCurrentVolume(minVolume);
        radio.decreaseVolume();
        assertEquals(minVolume, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeMoreMin() {
        radio.setCurrentVolume(8);
        radio.decreaseVolume();
        assertEquals(7, radio.getCurrentVolume());
    }
}