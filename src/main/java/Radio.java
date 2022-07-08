public class Radio {

    private int currentVolume;
    private int currentChanel;
    private int maxChanel;
    private int maxVolume;

    public Radio() {
        maxChanel = 9;
        maxVolume = 100;
    }

    public Radio(int Chanel, int Volume) {
        maxChanel = Chanel - 1;
        maxVolume = Volume - 1;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void nextChanel() {
        if (currentChanel < maxChanel) {
            currentChanel++;
        } else {
            currentChanel = 0;
        }
    }

    public void prevChanel() {
        if (currentChanel > 0) {
            currentChanel--;
        } else {
            currentChanel = maxChanel;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentChanel() {
        return currentChanel;
    }

    public void setCurrentChanel(int currentChanel) {
        if (currentChanel < 0) {
            return;
        }
        if (currentChanel > maxChanel) {
            return;
        }
        this.currentChanel = currentChanel;
    }
}
