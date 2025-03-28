import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Radio;

public class RadioTest {

    @Test
    public void shouldSetWave6() {

        Radio radio = new Radio();

        radio.setCurrentWave(6);

        int expected = 6;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetWaveToMin() {
        Radio radio = new Radio();

        radio.setCurrentWave(-1);

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWave0() {
        Radio radio = new Radio();

        radio.setCurrentWave(0);

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetWave1() {
        Radio radio = new Radio();

        radio.setCurrentWave(1);

        int expected = 1;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWave8() {
        Radio radio = new Radio();

        radio.setCurrentWave(8);

        int expected = 8;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWave9() {
        Radio radio = new Radio();

        radio.setCurrentWave(9);

        int expected = 9;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotSetWaveToMax() {

        Radio radio = new Radio();

        radio.setCurrentWave(10);

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentWave6() {
        Radio radio = new Radio();
        radio.setCurrentWave(6);

        radio.nextWave();

        int expected = 7;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentWave0() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);

        radio.nextWave();

        int expected = 1;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentWave1() {
        Radio radio = new Radio();
        radio.setCurrentWave(1);

        radio.nextWave();

        int expected = 2;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentWave8() {
        Radio radio = new Radio();
        radio.setCurrentWave(8);

        radio.nextWave();

        int expected = 9;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentWave9() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);

        radio.nextWave();

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentWave6() {
        Radio radio = new Radio();
        radio.setCurrentWave(6);

        radio.prevWave();

        int expected = 5;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentWave0() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);

        radio.prevWave();

        int expected = 9;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentWave1() {
        Radio radio = new Radio();
        radio.setCurrentWave(1);

        radio.prevWave();

        int expected = 0;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentWave8() {
        Radio radio = new Radio();
        radio.setCurrentWave(8);

        radio.prevWave();

        int expected = 7;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentWave9() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);

        radio.prevWave();

        int expected = 8;
        int actual = radio.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(24);

        radio.increaseVolume();

        int expected = 25;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseCurrentVolumeToMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(24);

        radio.decreaseVolume();

        int expected = 23;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseCurrentVolumeToMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.decreaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.decreaseVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
