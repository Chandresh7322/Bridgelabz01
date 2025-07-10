class Book {
    String title, author, genre;
    int id;
    boolean available;
    Book next, prev;

    public Book(String title, String author, String genre, int id, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.id = id;
        this.available = available;
    }
}

class Library {
    Book head = null, tail = null;

    public void addAtBeginning(Book newBook) {
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    public void addAtEnd(Book newBook) {
        if (tail == null) {
            addAtBeginning(newBook);
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    public void removeById(int id) {
        Book temp = head;
        while (temp != null && temp.id != id)
            temp = temp.next;
        if (temp == null) return;

        if (temp.prev != null)
            temp.prev.next = temp.next;
        else
            head = temp.next;

        if (temp.next != null)
            temp.next.prev = temp.prev;
        else
            tail = temp.prev;
    }

    public void updateAvailability(int id, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.available = status;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.title + " - " + (temp.available ? "Available" : "Checked Out"));
            temp = temp.next;
        }
    }

    public void displayReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " - " + (temp.available ? "Available" : "Checked Out"));
            temp = temp.prev;
        }
    }

    public int countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
