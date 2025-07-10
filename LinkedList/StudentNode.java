class StudentNode {
    int roll;
    String name;
    int age;
    String grade;
    StudentNode next;

    public StudentNode(int roll, String name, int age, String grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    StudentNode head;

    void addAtBeginning(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    void addAtEnd(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void addAtPosition(int pos, int roll, String name, int age, String grade) {
        if (pos == 0) {
            addAtBeginning(roll, name, age, grade);
            return;
        }
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        StudentNode temp = head;
        for (int i = 0; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteByRoll(int roll) {
        StudentNode temp = head;
        StudentNode prev = null;
        while (temp != null && temp.roll != roll) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Student not found");
            return;
        }
        if (prev == null) {
            head = temp.next;
        } else {
            prev.next = temp.next;
        }
    }

    void searchByRoll(int roll) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println("Found: " + temp.roll + ", " + temp.name + ", " + temp.age + ", " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    void updateGrade(int roll, String newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    void displayAll() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println(temp.roll + ", " + temp.name + ", " + temp.age + ", " + temp.grade);
            temp = temp.next;
        }
    }
}
