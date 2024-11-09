package services;

import models.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorService {
    private List<Author> authors = new ArrayList<>();

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public List<Author> getAllAuthors() {
        return new ArrayList<>(authors);
    }

    public Author getAuthorById(int id) {
        return authors.stream()
                .filter(author -> author.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void updateAuthor(Author updatedAuthor) {
        for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i).getId() == updatedAuthor.getId()) {
                authors.set(i, updatedAuthor);
                return;
            }
        }
    }

    public void deleteAuthor(int id) {
        authors.removeIf(author -> author.getId() == id);
    }
}
