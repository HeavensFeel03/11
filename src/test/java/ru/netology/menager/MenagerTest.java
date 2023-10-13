package ru.netology.menager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Poster;

public class MenagerTest {
    MenagerPosters mena = new MenagerPosters();
    Poster item1 = new Poster(1, "The Green Mile", "drama", "???", 1999);
    Poster item2 = new Poster(2, "The Shawshank Redemption", "drama", "???", 1994);
    Poster item3 = new Poster(3, "Forrest Gump", "drama", "???", 1994);
    Poster item4 = new Poster(4, "Interstellar", "fantastic", "???", 2014);
    Poster item5 = new Poster(5, "Fight Club", "drama", "???", 1999);
    Poster item6 = new Poster(6, "Shrek", "comedy", "???", 2001);
    Poster item7 = new Poster(7, "Knockin' on Heaven's Door", "drama", "???", 1997);

    @BeforeEach
    public void setup() {
        mena.add(item1);
        mena.add(item2);
        mena.add(item3);
        mena.add(item4);
        mena.add(item5);
        mena.add(item6);
        mena.add(item7);
    }

    @Test
    public void shouldAllPoster() {
        Poster[] expected = {item1, item2, item3, item4, item5, item6, item7};
        Poster[] actual = mena.getPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReversePoster() {
        Poster[] expected = {item7, item6, item5, item4, item3, item2, item1};
        Poster[] actual = mena.getReversePosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReversePoster5() {
        Poster[] expected = {item7, item6, item5, item4, item3};
        Poster[] actual = mena.getReversePoster5();

        Assertions.assertArrayEquals(expected, actual);
    }


}
