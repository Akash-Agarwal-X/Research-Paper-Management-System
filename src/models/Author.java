package models;

public class Author {
    private int id;
    private String name;
    private String affiliation;

    public Author(int id, String name, String affiliation) {
        this.id = id;
        this.name = name;
        this.affiliation = affiliation;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getAffiliation() { return affiliation; }

    public void setName(String name) { this.name = name; }
    public void setAffiliation(String affiliation) { this.affiliation = affiliation; }
}
