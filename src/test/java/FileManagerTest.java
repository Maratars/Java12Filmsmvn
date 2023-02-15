import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileManagerTest {

    @Test
    public void testFindAll() {
        String film1 = "Movie1";
        String film2 = "movie2";
        String film3 = "Movie3";
        String film4 = "Movie4";
        String film5 = "Movie5";
        String film6 = "Movie6";
        String film7 = "Movie7";

        FileManager manager = new FileManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);

        String[] actual = manager.findAll();
        String[] expected = {film1, film2, film3, film4, film5, film6, film7};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLimitLastMax() {
        String film1 = "Movie1";
        String film2 = "movie2";
        String film3 = "Movie3";
        String film4 = "Movie4";
        String film5 = "Movie5";
        String film6 = "Movie6";
        String film7 = "Movie7";
        String film8 = "Movie8";
        String film9 = "Movie9";
        String film10 = "Movie10";

        FileManager manager = new FileManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] actual = manager.findLast();
        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLimitLastOverMax() {
        String film1 = "Movie1";
        String film2 = "movie2";
        String film3 = "Movie3";
        String film4 = "Movie4";
        String film5 = "Movie5";
        String film6 = "Movie6";
        String film7 = "Movie7";
        String film8 = "Movie8";
        String film9 = "Movie9";
        String film10 = "Movie10";
        String film11 = "Movie11";


        FileManager manager = new FileManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);

        String[] actual = manager.findLast();
        String[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLimitLastUnderMax() {
        String film1 = "Movie1";
        String film2 = "movie2";
        String film3 = "Movie3";
        String film4 = "Movie4";
        String film5 = "Movie5";
        String film6 = "Movie6";
        String film7 = "Movie7";
        String film8 = "Movie8";
        String film9 = "Movie9";

        FileManager manager = new FileManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);

        String[] actual = manager.findLast();
        String[] expected = {film9, film8, film7, film6, film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLimitLastMin() {
        String film1 = "Movie1";

        FileManager manager = new FileManager();
        manager.addFilm(film1);

        String[] actual = manager.findLast();
        String[] expected = {film1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void tesLastUserLimit() {
        String film1 = "Movie1";
        String film2 = "movie2";
        String film3 = "Movie3";
        String film4 = "Movie4";
        String film5 = "Movie5";

        FileManager manager = new FileManager(5);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);

        String[] actual = manager.findLast();
        String[] expected = {film5, film4, film3, film2, film1,};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastOverUserLimit() {
        String film1 = "Movie1";
        String film2 = "movie2";
        String film3 = "Movie3";
        String film4 = "Movie4";
        String film5 = "Movie5";
        String film6 = "Movie6";

        FileManager manager = new FileManager(5);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);

        String[] actual = manager.findLast();
        String[] expected = {film6, film5, film4, film3, film2,};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastUnderUserLimit() {
        String film1 = "Movie1";
        String film2 = "movie2";
        String film3 = "Movie3";
        String film4 = "Movie4";

        FileManager manager = new FileManager(5);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);

        String[] actual = manager.findLast();
        String[] expected = {film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastUserLimit1() {
        String film1 = "Movie1";

        FileManager manager = new FileManager(5);
        manager.addFilm(film1);

        String[] actual = manager.findLast();
        String[] expected = {film1};

        Assertions.assertArrayEquals(expected, actual);
    }
}
