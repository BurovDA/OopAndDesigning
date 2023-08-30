package ru.Netology.radio.services;

public class Radio {
    private int currentRadioStation;
    private int maxCurrentStation;
    private int currentVolume;
    private int maxCurrentVolume;

    public Radio () {
        this.maxCurrentStation = 30;
        this.maxCurrentVolume = 100;
    }

    public Radio (int stationsCount, int volumeCount) {
        this.maxCurrentStation = stationsCount - 1;
        this.maxCurrentVolume = volumeCount;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxCurrentStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void next() {
        if (currentRadioStation != maxCurrentStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxCurrentStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > maxCurrentVolume) {
            currentVolume = maxCurrentVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxCurrentVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reductionVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        }
    }
}