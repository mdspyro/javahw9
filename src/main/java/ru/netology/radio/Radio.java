package ru.netology.radio;

public class Radio {
    private int currentStation; // Номер текущей радиостанции
    private int currentVolume; // Уровень громкости звука

    // Метод для переключения на следующую радиостанцию
    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    // Метод для переключения на предыдущую радиостанцию
    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    // Метод для увеличения громкости звука на 1
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    // Метод для уменьшения громкости звука на 1
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    // Метод для установки номера радиостанции
    public void setCurrentStation(int station) {
        if (station >= 0 && station <= 9) {
            currentStation = station;
        }
    }

    // Метод для получения текущего номера радиостанции
    public int getCurrentStation() {
        return currentStation;
    }

    // Метод для получения текущего уровня громкости
    public int getCurrentVolume() {
        return currentVolume;
    }
}

