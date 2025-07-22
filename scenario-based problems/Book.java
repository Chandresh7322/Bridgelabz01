class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return title + " by " + author;
    }
}

class BookShelf {
    HashMap<String, LinkedList<Book>> catalog = new HashMap<>();

    void addBook(String genre, Book book) {
        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
    }

    void removeBook(String genre) {
        if (catalog.containsKey(genre) && !catalog.get(genre).isEmpty()) {
            catalog.get(genre).removeFirst();
        }
    }

    void displayGenre(String genre) {
        if (catalog.containsKey(genre)) {
            for (Book book : catalog.get(genre)) {
                System.out.println(book);
            }
        }
    }
}
