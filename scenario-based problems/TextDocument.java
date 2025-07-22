interface Printable {
    void print();
}

class TextDocument implements Printable {
    public void print() {
        System.out.println("Printing text document");
    }
}

class PrintQueue {
    Queue<Printable> queue = new LinkedList<>();

    void addJob(Printable doc) {
        queue.add(doc);
    }

    void processJob() {
        if (!queue.isEmpty()) {
            queue.poll().print();
        }
    }
}
