package core_java_assignment1;

import java.util.*;

class CD implements Comparable<CD> {
    private String title;
    private String singer;

    public CD(String title, String singer) {
        this.title = title;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }

    // Compare CDs based on singer name (ascending)
    @Override
    public int compareTo(CD other) {
        return this.singer.compareToIgnoreCase(other.singer);
    }

    @Override
    public String toString() {
        return "CD [Title=" + title + ", Singer=" + singer + "]";
    }
}

public class Question40 {
    public static void main(String[] args) {
        List<CD> cdList = new ArrayList<>();
        cdList.add(new CD("Shape of You", "Ed Sheeran"));
        cdList.add(new CD("Thriller", "Michael Jackson"));
        cdList.add(new CD("Imagine", "John Lennon"));
        cdList.add(new CD("Bad Guy", "Billie Eilish"));

        System.out.println("Before sorting:");
        for (CD cd : cdList) {
            System.out.println(cd);
        }

        Collections.sort(cdList);

        System.out.println("\nAfter sorting by singer:");
        for (CD cd : cdList) {
            System.out.println(cd);
        }
    }
}

/*
 Before sorting:
CD [Title=Shape of You, Singer=Ed Sheeran]
CD [Title=Thriller, Singer=Michael Jackson]
CD [Title=Imagine, Singer=John Lennon]
CD [Title=Bad Guy, Singer=Billie Eilish]

After sorting by singer:
CD [Title=Bad Guy, Singer=Billie Eilish]
CD [Title=Shape of You, Singer=Ed Sheeran]
CD [Title=Imagine, Singer=John Lennon]
CD [Title=Thriller, Singer=Michael Jackson]
*/


