package ru.netology.menager;

import ru.netology.domain.Poster;

public class MenagerPosters {
    private Poster[] afisha = new Poster[0];
    private int resultLength = 5;

    public MenagerPosters() {
    }

    public MenagerPosters(int resultLength) {
        this.resultLength = resultLength;
    }


    public void add(Poster item) {

        Poster[] temp = new Poster[afisha.length + 1];
        for (int i = 0; i < afisha.length; i++) {
            temp[i] = afisha[i];
        }
        temp[temp.length - 1] = item;
        afisha = temp;
    }

    public Poster[] findAll() {
        return afisha;
    }

    public Poster[] getReversePosters() {
        Poster[] all = findAll();
        Poster[] reversed = new Poster[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

    public Poster[] findLast() {
        Poster[] reversed = getReversePosters();
        Poster[] temp = new Poster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            temp[i] = reversed[i];
        }
        return temp;
    }

}



