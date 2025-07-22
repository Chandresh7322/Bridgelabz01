interface TicketRequest {
    void process();
}

class FlightTicket implements TicketRequest {
    public void process() {
        System.out.println("Processing flight ticket");
    }
}

class TicketService {
    Queue<TicketRequest> queue = new LinkedList<>();

    void addRequest(TicketRequest req) {
        queue.add(req);
    }

    void processNext() {
        if (!queue.isEmpty()) {
            queue.poll().process();
        }
    }
}
