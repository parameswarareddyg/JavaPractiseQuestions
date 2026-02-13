package com.java.oops.inheritance;

interface Reader {
    void read();
}

interface Writer {
    void write();
}

class Person {
    String name;

    void showName() {
        System.out.println("Name: " + name);
    }
}

class Author extends Person implements Reader, Writer {
    public void read() {
        System.out.println("Author is reading.");
    }

    public void write() {
        System.out.println("Author is writing.");
    }
}

public class HybridInheritance  {
    public static void main(String[] args) {
        Author author = new Author();
        author.name = "Gunnampalli";
        author.showName();     // From Person
        author.read();         // From Reader
        author.write();        // From Writer
    }

}
