import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void currentChanel() {
        Radio rad = new Radio();

        rad.setCurrentChanel(-1);

        int actual = rad.getCurrentChanel();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentChanel1() {
        Radio rad = new Radio();

        rad.setCurrentChanel(12);

        int actual = rad.getCurrentChanel();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(11);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolume1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChanel() {
        Radio rad = new Radio();

        rad.setCurrentChanel(8);
        rad.nextChanel();

        int actual = rad.getCurrentChanel();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChane1() {

        Radio rad = new Radio();

        rad.setCurrentChanel(9);
        rad.nextChanel();

        int actual = rad.getCurrentChanel();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevChanel() {
        Radio rad = new Radio();

        rad.setCurrentChanel(5);
        rad.prevChanel();

        int actual = rad.getCurrentChanel();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChanel1() {
        Radio rad = new Radio();

        rad.setCurrentChanel(-1);
        rad.prevChanel();

        int actual = rad.getCurrentChanel();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(6);
        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(5);
        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);
        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
