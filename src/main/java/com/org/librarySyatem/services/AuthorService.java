package com.org.librarySyatem.services;



import com.org.librarySyatem.entity.Author;
import com.org.librarySyatem.feign.BookServiceClient;
import com.org.librarySyatem.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;
    private final BookServiceClient bookServiceClient;

    public AuthorService(AuthorRepository authorRepository, BookServiceClient bookServiceClient) {
        this.authorRepository = authorRepository;
        this.bookServiceClient = bookServiceClient;
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author getAuthorById(Long id) {
        return authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Author not found"));
    }

    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Author updateAuthor(Long id, Author updatedAuthor) {
        Author existingAuthor = getAuthorById(id);
        existingAuthor.setName(updatedAuthor.getName());
        return authorRepository.save(existingAuthor);
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }

    public List<Map<String, Object>> getBooksByAuthor(String authorName) {
        return bookServiceClient.getBooksByAuthor(authorName);    }

}

