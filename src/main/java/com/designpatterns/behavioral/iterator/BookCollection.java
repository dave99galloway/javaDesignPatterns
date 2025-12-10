package com.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookCollection implements Collection<String> {
    private List<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
    }

    @Override
    public Iterator<String> createIterator() {
        return new BookIterator();
    }

    private class BookIterator implements Iterator<String> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < books.size();
        }

        @Override
        public String next() {
            if (hasNext()) {
                return books.get(currentIndex++);
            }
            return null;
        }
    }

    public List<String> getBooks() {
        return new ArrayList<>(books);
    }
}
