import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
Radio rad = new Radio();

    @Test
    public void currentChanel() {

        rad.setCurrentChanel(-1);

        int actual = rad.getCurrentChanel();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentChanel1() {

        rad.setCurrentChanel(12);

        int actual = rad.getCurrentChanel();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolume() {

        rad.setCurrentVolume(89);

        int actual = rad.getCurrentVolume();
        int expected = 89;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void currentVolume1() {

        rad.setCurrentVolume(101);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolume2() {

        rad.setCurrentVolume(-1);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChanel() {

        rad.setCurrentChanel(8);
        rad.nextChanel();

        int actual = rad.getCurrentChanel();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChane1() {

        rad.setCurrentChanel(9);
        rad.nextChanel();

        int actual = rad.getCurrentChanel();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevChanel() {

        rad.setCurrentChanel(5);
        rad.prevChanel();

        int actual = rad.getCurrentChanel();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChanel1() {

        rad.setCurrentChanel(-1);
        rad.prevChanel();

        int actual = rad.getCurrentChanel();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {

        rad.setCurrentVolume(6);
        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume1() {

        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {

        rad.setCurrentVolume(5);
        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume1() {

        rad.setCurrentVolume(-1);
        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
