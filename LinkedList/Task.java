class Task {
    int id;
    String name;
    int priority;
    String dueDate;
    Task next;

    public Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    Task head = null;
    Task current = null;

    public void addAtBeginning(Task newTask) {
        if (head == null) {
            head = newTask;
            newTask.next = head;
        } else {
            Task temp = head;
            while (temp.next != head)
                temp = temp.next;
            newTask.next = head;
            temp.next = newTask;
            head = newTask;
        }
    }

    public void addAtEnd(Task newTask) {
        if (head == null) {
            addAtBeginning(newTask);
        } else {
            Task temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = newTask;
            newTask.next = head;
        }
    }

    public void addAtPosition(Task newTask, int position) {
        if (position <= 1) {
            addAtBeginning(newTask);
            return;
        }
        Task temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++)
            temp = temp.next;
        newTask.next = temp.next;
        temp.next = newTask;
    }

    public void removeById(int id) {
        if (head == null) return;
        if (head.id == id) {
            Task temp = head;
            while (temp.next != head)
                temp = temp.next;
            if (head == head.next) {
                head = null;
            } else {
                temp.next = head.next;
                head = head.next;
            }
            return;
        }

        Task prev = head, curr = head.next;
        while (curr != head && curr.id != id) {
            prev = curr;
            curr = curr.next;
        }
        if (curr.id == id) {
            prev.next = curr.next;
        }
    }

    public Task getCurrentTask() {
        if (current == null) current = head;
        return current;
    }

    public void moveToNextTask() {
        if (current != null)
            current = current.next;
    }

    public void displayAllTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println(temp.id + " - " + temp.name + " - " + temp.priority + " - " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByPriority(int priority) {
        if (head == null) return;
        Task temp = head;
        do {
            if (temp.priority == priority)
                System.out.println("Found: " + temp.name);
            temp = temp.next;
        } while (temp != head);
    }
}
