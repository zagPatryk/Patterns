package com.patterns.prototype.library;


import com.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws  CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepCopy() throws  CloneNotSupportedException {
        Library clonedLibrary = (Library)super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book temporaryBook : books) {
            Book clonedBook = new Book(temporaryBook.getTitle(),temporaryBook.getAuthor(),temporaryBook.getPublicationDate());
            clonedLibrary.getBooks().add(clonedBook);
        }
        return clonedLibrary;
    }

    @Override
    public String toString() {
        return "Library{"  + books.size() + '}';
    }
}