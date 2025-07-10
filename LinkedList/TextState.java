class TextState {
    String content;
    TextState next;
    TextState prev;

    public TextState(String content) {
        this.content = content;
        this.next = null;
        this.prev = null;
    }
}

class TextEditor {
    TextState current;
    int maxHistory = 10;
    int size = 0;

    public void addState(String content) {
        TextState newState = new TextState(content);
        if (current != null) {
            current.next = newState;
            newState.prev = current;
        }

        current = newState;

        TextState temp = current;
        int count = 1;
        while (temp.prev != null) {
            temp = temp.prev;
            count++;
        }

        if (count > maxHistory) {
            temp = current;
            while (temp.prev != null && count > maxHistory) {
                temp = temp.prev;
                count--;
            }
            temp.prev = null;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo: " + current.content);
        } else {
            System.out.println("No previous state available");
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo: " + current.content);
        } else {
            System.out.println("No next state available");
        }
    }

    public void showCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("Editor is empty");
        }
    }
}
