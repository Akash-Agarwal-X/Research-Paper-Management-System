package models;

import java.util.List;

public class Paper {
    private int id;
    private String title;
    private List<Author> authors;
    private int year;
    private Journal journal;
    private List<String> keywords;

    public Paper(int id, String title, List<Author> authors, int year, Journal journal, List<String> keywords) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.year = year;
        this.journal = journal;
        this.keywords = keywords;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public List<Author> getAuthors() { return authors; }
    public int getYear() { return year; }
    public Journal getJournal() { return journal; }
    public List<String> getKeywords() { return keywords; }

    public void setTitle(String title) { this.title = title; }
    public void setAuthors(List<Author> authors) { this.authors = authors; }
    public void setYear(int year) { this.year = year; }
    public void setJournal(Journal journal) { this.journal = journal; }
    public void setKeywords(List<String> keywords) { this.keywords = keywords; }
}
