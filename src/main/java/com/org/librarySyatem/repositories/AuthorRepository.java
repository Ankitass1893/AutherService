package com.org.librarySyatem.repositories;

import com.org.librarySyatem.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}

