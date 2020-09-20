package com.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
        Library library = new Library("First library");
        IntStream.iterate(1, n -> n + 1)
                .limit(30)
                .forEach(n -> library.getBooks().add(new Book("Title " + n,"Author " + n, LocalDate.now())));
        Book book = new Book("Tit", "Au", LocalDate.now());
        library.getBooks().add(book);

        Library shallowClone = null;
        try {
            shallowClone = library.shallowCopy();
            shallowClone.setName("Cloned library");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClone = null;
        try {
            deepClone = library.deepCopy();
            deepClone.setName("Cloned library");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //when
        library.getBooks().remove(book);

        //then
        System.out.println(library);
        System.out.println(shallowClone);
        System.out.println(deepClone);

        Assert.assertEquals(30, library.getBooks().size());
        Assert.assertEquals(30, shallowClone.getBooks().size());
        Assert.assertEquals(31, deepClone.getBooks().size());
    }
}
