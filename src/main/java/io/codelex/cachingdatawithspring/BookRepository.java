package io.codelex.cachingdatawithspring;

public interface BookRepository {

    Book getByIsbn(String isbn);
}
