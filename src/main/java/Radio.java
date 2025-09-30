public class Radio {
    private int numberCurrentStation; //номер текущей радиостанции
    private int currentVolume; //текущая громкость звука

    public Radio() {
        numberCurrentStation = 0; //начальная станция
        currentVolume = 0; //начальная громкость
    }

    public void next() {
        if (numberCurrentStation == 9) {
            numberCurrentStation = 0;
        } else {
            numberCurrentStation = numberCurrentStation + 1;
        }
    }

    public void prev() {
        if (numberCurrentStation == 0) {
            numberCurrentStation = 9;
        } else {
            numberCurrentStation = numberCurrentStation - 1;
        }
    }

    public void setNumberCurrentStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        numberCurrentStation = newStation;

    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

}
