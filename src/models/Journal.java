package models;

public class Journal {
    private int id;
    private String name;
    private String publisher;

    public Journal(int id, String name, String publisher) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getPublisher() { return publisher; }

    public void setName(String name) { this.name = name; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
}
