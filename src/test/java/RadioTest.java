import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "1, 0",
            "0, 9",
            "1, 10",
            "3, 2",
            "9, 8",
            "2, 1",
            "1, -1"
    })
    public void shouldSetNextStation(int expected, int newStation) {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(newStation);
        radio.next();

        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "9, 0",
            "8, 9",
            "7, 8",
            "0, 1",
            "1, 2",
            "9, 10",
            "9, -1"

    })
    public void shouldSetPrevStation(int expected, int newStation) {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(newStation);
        radio.prev();

        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "100, 100",
            "100, 99",
            "1, 101",
            "1, 0",
            "51, 50",
            "1, -1",
            "99, 98"
    })
    public void shouldSetIncreaseVolume(int expected, int newCurrentVolume) {
        Radio radio = new Radio();

        radio.setCurrentVolume(newCurrentVolume);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "0, 1",
            "99, 100",
            "1, 2",
            "49, 50",
            "0, 101",
            "0, -1"
    })
    public void shouldSetDecreaseVolume(int expected, int newCurrentVolume) {
        Radio radio = new Radio();

        radio.setCurrentVolume(newCurrentVolume);
        radio.decreaseVolume();

        //int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
