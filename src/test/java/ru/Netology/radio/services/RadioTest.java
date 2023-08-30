package ru.Netology.radio.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void installStation0() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(5);
        cond.setCurrentRadioStation(0);
        int actual = cond.getCurrentRadioStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void installStation1() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(1);
        int actual = cond.getCurrentRadioStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void installStation8() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(8);
        int actual = cond.getCurrentRadioStation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void installStation9() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(9);
        int actual = cond.getCurrentRadioStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void installStationMinus1() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(-1);
        int actual = cond.getCurrentRadioStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void installStation30() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(30);
        int actual = cond.getCurrentRadioStation();
        int expected = 30;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationR1() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(0);
        cond.next();
        int actual = cond.getCurrentRadioStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationR9() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(28);
        cond.next();
        int actual = cond.getCurrentRadioStation();
        int expected = 29;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationR0() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(30);
        cond.next();
        int actual = cond.getCurrentRadioStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationR0() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(0);
        cond.prev();
        int actual = cond.getCurrentRadioStation();
        int expected = 30;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationR1() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(1);
        cond.prev();
        int actual = cond.getCurrentRadioStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationR9() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(9);
        cond.prev();
        int actual = cond.getCurrentRadioStation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void installVolume101() {
        Radio cond = new Radio();
        cond.setCurrentVolume(101);
        int actual = cond.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void installVolume99() {
        Radio cond = new Radio();
        cond.setCurrentVolume(99);
        int actual = cond.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void installVolume50() {
        Radio cond = new Radio();
        cond.setCurrentVolume(101);
        int actual = cond.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void installVolume2() {
        Radio cond = new Radio();
        cond.setCurrentVolume(2);
        int actual = cond.getCurrentVolume();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void installVolume1() {
        Radio cond = new Radio();
        cond.setCurrentVolume(1);
        int actual = cond.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void installVolume0() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);
        int actual = cond.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void installVolumeMinus1() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-1);
        int actual = cond.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume1() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);
        cond.increaseVolume();
        int actual = cond.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume99() {
        Radio cond = new Radio();
        cond.setCurrentVolume(99);
        cond.increaseVolume();
        int actual = cond.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume100() {
        Radio cond = new Radio();
        cond.setCurrentVolume(100);
        cond.increaseVolume();
        int actual = cond.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolume100() {
        Radio cond = new Radio();
        cond.setCurrentVolume(100);
        cond.reductionVolume();
        int actual = cond.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolume1() {
        Radio cond = new Radio();
        cond.setCurrentVolume(1);
        cond.reductionVolume();
        int actual = cond.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolume0() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);
        cond.reductionVolume();
        int actual = cond.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}



