package controllers;

import models.Author;
import services.AuthorService;

import java.util.List;

public class AuthorController {
    private final AuthorService authorService;

    public AuthorController() {
        this.authorService = new AuthorService();
    }

    public void addAuthor(Author author) {
        authorService.addAuthor(author);
    }

    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    public Author getAuthorById(int id) {
        return authorService.getAuthorById(id);
    }

    public void updateAuthor(Author author) {
        authorService.updateAuthor(author);
    }

    public void deleteAuthor(int id) {
        authorService.deleteAuthor(id);
    }
}
