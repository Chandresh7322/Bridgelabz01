class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode prev;
    MovieNode next;

    public MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}

class MovieDoublyLinkedList {
    MovieNode head;
    MovieNode tail;

    void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos == 0) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        MovieNode newNode = new MovieNode(title, director, year, rating);
        MovieNode temp = head;
        for (int i = 0; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }
        temp.next = newNode;
    }

    void removeByTitle(String title) {
        MovieNode temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Movie not found");
            return;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }
    }

    void searchByDirectorOrRating(String key) {
        MovieNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equals(key) || String.valueOf(temp.rating).equals(key)) {
                System.out.println(temp.title + ", " + temp.director + ", " + temp.year + ", " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movie found");
        }
    }

    void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + ", " + temp.director + ", " + temp.year + ", " + temp.rating);
            temp = temp.next;
        }
    }

    void displayBackward() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title + ", " + temp.director + ", " + temp.year + ", " + temp.rating);
            temp = temp.prev;
        }
    }
}
