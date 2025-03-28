package ru.netology.javaqa;

public class Radio {
    private int currentWave;
    private int currentVolume;

    public int getCurrentWave() {
        return currentWave;
    }

    public void setCurrentWave(int currentWave) {
        if (currentWave > 9)
            return;
        if (currentWave < 0)
            return;
        this.currentWave = currentWave;
    }

    public void nextWave() {
        if (currentWave < 9) {
            currentWave = currentWave + 1;
        } else {
            currentWave = 0;
        }
    }

    public void prevWave() {
        if (currentWave > 0) {
            currentWave = currentWave - 1;
        } else {
            currentWave = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }
}