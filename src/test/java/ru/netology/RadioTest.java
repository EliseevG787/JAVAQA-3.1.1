package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(55);

    @Test
    public void shouldSetNextRadioNumberBeforeMax() {
        radio.setRadioNumber(5);
        radio.setNextRadioNumber();
        assertEquals(6, radio.getRadioNumber());
    }

    @Test
    public void shouldSetNextRadioNumberMoreMax() {
        int maxRadioNumber = radio.getMaxRadioNumber();
        radio.setRadioNumber(maxRadioNumber);
        radio.setNextRadioNumber();
        assertEquals(0, radio.getRadioNumber());
    }

    @Test
    public void shouldSetPrevRadioNumberMoreMin() {
        radio.setRadioNumber(5);
        radio.setPrevRadioNumber();
        assertEquals(4, radio.getRadioNumber());
    }

    @Test
    public void shouldSetPrevRadioNumberLessMin() {
        int minRadioNumber = radio.getMinRadioNumber();
        radio.setRadioNumber(minRadioNumber);
        radio.setPrevRadioNumber();
        assertEquals(55, radio.getRadioNumber());
    }

    @Test
    public void shouldSetCurrentRadioNumber() {
        radio.setCurrentRadioNumber(7);
        assertEquals(7, radio.getRadioNumber());
    }

    @Test
    public void shouldSetCurrentRadioNumberLessMin() {
        int radioNumber = radio.getRadioNumber();
        radio.setCurrentRadioNumber(-1);
        assertEquals(radioNumber, radio.getRadioNumber());
    }

    @Test
    public void shouldSetCurrentRadioNumberMoreMax() {
        int radioNumber = radio.getRadioNumber();
        radio.setCurrentRadioNumber(56);
        assertEquals(radioNumber, radio.getRadioNumber());
    }


    @Test
    public void shouldIncreaseVolumeLessMax() {
        radio.setVolume(10);
        radio.increaseVolume();
        assertEquals(11, radio.getVolume());
    }

    @Test
    public void shouldIncreaseVolumeMoreMax() {
        int maxVolume = radio.getMaxVolume();
        radio.setVolume(maxVolume);
        radio.increaseVolume();
        assertEquals(maxVolume, radio.getVolume());
    }

    @Test
    public void shouldDecreaseVolumeLessMin() {
        int minVolume = radio.getMinVolume();
        radio.setVolume(minVolume);
        radio.decreaseVolume();
        assertEquals(minVolume, radio.getVolume());
    }

    @Test
    public void shouldDecreaseVolumeMoreMin() {
        radio.setVolume(8);
        radio.decreaseVolume();
        assertEquals(7, radio.getVolume());
    }
}