package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void addFilmMin() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addFilmAboveMin() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addFilm() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Человек невидимка");
        manager.addFilm("Джентельмены");

        String[] expected = {"Бладшот", "Человек невидимка", "Джентельмены"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastFilm() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Человек невидимка");
        manager.addFilm("Джентельмены");

        String[] expected = {"Джентельмены", "Человек невидимка", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastFilmMin() {
        FilmManager manager = new FilmManager();


        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastFilmAboveMin() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");


        String[] expected = {"Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastFilmDefault() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Человек невидимка");
        manager.addFilm("Джентельмены");
        manager.addFilm("Вперед");
        manager.addFilm("Номер один");

        String[] expected = {"Номер один", "Вперед", "Джентельмены", "Человек невидимка", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastFilmAboveDefault() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Человек невидимка");
        manager.addFilm("Джентельмены");
        manager.addFilm("Вперед");
        manager.addFilm("Номер один");
        manager.addFilm("Отель");

        String[] expected = {"Отель", "Номер один", "Вперед", "Джентельмены", "Человек невидимка"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastFilmLimit() {
        FilmManager manager = new FilmManager(4);


        manager.addFilm("Джентельмены");
        manager.addFilm("Вперед");
        manager.addFilm("Номер один");
        manager.addFilm("Отель");

        String[] expected = {"Отель", "Номер один", "Вперед", "Джентельмены"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastFilmAboveLimit() {
        FilmManager manager = new FilmManager(4);


        manager.addFilm("Человек невидимка");
        manager.addFilm("Джентельмены");
        manager.addFilm("Вперед");
        manager.addFilm("Номер один");
        manager.addFilm("Отель");

        String[] expected = {"Отель", "Номер один", "Вперед", "Джентельмены"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastFilmBelowLimit() {
        FilmManager manager = new FilmManager(4);


        manager.addFilm("Вперед");
        manager.addFilm("Номер один");
        manager.addFilm("Отель");

        String[] expected = {"Отель", "Номер один", "Вперед"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }


}
