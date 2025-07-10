class Process {
    int pid;
    int burstTime;
    int priority;
    Process next;

    public Process(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.priority = priority;
    }
}

class RoundRobinScheduler {
    Process head = null;
    int timeQuantum = 2;

    public void addProcess(Process p) {
        if (head == null) {
            head = p;
            p.next = head;
        } else {
            Process temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = p;
            p.next = head;
        }
    }

    public void simulate() {
        Process curr = head;
        int time = 0;
        do {
            int execTime = Math.min(curr.burstTime, timeQuantum);
            System.out.println("Executing Process " + curr.pid
