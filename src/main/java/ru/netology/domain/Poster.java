package ru.netology.domain;

public class Poster {
    private int posterId;
    private String name;
    private String genre;
    private String imageURL;
    private int yearRelease;

    public Poster(int posterId, String name, String genre, String imageURL, int yearRelease) {
        this.posterId = posterId;
        this.name = name;
        this.genre = genre;
        this.imageURL = imageURL;
        this.yearRelease = yearRelease;
    }

    public int getPosterId() {
        return posterId;
    }

    public void setPosterId(int posterId) {
        this.posterId = posterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
}
