package com.kodilla.good.patterns.challenges;

public final class Movie {

    private final String englishTitle;
    private final String polishTitle;
    private final String titleShortcut;

    public String getEnglishTitle() {
        return englishTitle;
    }

    public String getPolishTitle() {
        return polishTitle;
    }

    public String getTitleShortcut() {
        return titleShortcut;
    }

    public Movie(String englishTitle, String polishTitle, String titleShortcut) {
        this.englishTitle = englishTitle;
        this.polishTitle = polishTitle;
        this.titleShortcut = titleShortcut;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "englishTitle='" + englishTitle + '\'' +
                ", polishTitle='" + polishTitle + '\'' +
                ", titleShortcut='" + titleShortcut + '\'' +
                '}';
    }
}
