package core_java_assignment1;

import java.util.ArrayList;

class LibraryNonGeneric {
    private ArrayList<Object> items = new ArrayList<>();

    // Add any media item
    public void add(Object item) {
        items.add(item);
    }

    // Retrieve by index
    public Object retrieve(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null;
    }

    public int size() {
        return items.size();
    }
}

// Example media classes
class Book {
    String title;
    public Book(String title) { this.title = title; }
    public String toString() { return "Book: " + title; }
}

class Video {
    String title;
    public Video(String title) { this.title = title; }
    public String toString() { return "Video: " + title; }
}

class Newspaper {
    String headline;
    public Newspaper(String headline) { this.headline = headline; }
    public String toString() { return "Newspaper: " + headline; }
}

// Demo
public class Question39 {
    public static void main(String[] args) {
        LibraryNonGeneric lib = new LibraryNonGeneric();

        lib.add(new Book("Java Basics"));
        lib.add(new Video("Nature Documentary"));
        lib.add(new Newspaper("Daily Times"));

        for (int i = 0; i < lib.size(); i++) {
            Object item = lib.retrieve(i);
            System.out.println(item);
        }
    }
}

/*
Book: Java Basics
Video: Nature Documentary
Newspaper: Daily Times
*/