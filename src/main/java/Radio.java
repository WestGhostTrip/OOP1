public class Radio {

    private int currentVolume;
    private int currentChanel;

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void nextChanel() {
        if (currentChanel < 9) {
            currentChanel++;
        } else {
            currentChanel = 0;
        }
    }

    public void prevChanel() {
        if (currentChanel > 0) {
            currentChanel--;
        } else {
            currentChanel = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
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
        if (currentChanel > 9) {
            return;
        }
        this.currentChanel = currentChanel;
    }
}
