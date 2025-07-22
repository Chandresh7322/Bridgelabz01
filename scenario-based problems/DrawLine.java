interface DrawingAction {
    void execute();
    void undo();
}

class DrawLine implements DrawingAction {
    public void execute() {
        System.out.println("Line drawn");
    }
    public void undo() {
        System.out.println("Undo line");
    }
}

class DrawingApp {
    Stack<DrawingAction> undoStack = new Stack<>();
    
    void performAction(DrawingAction action) {
        action.execute();
        undoStack.push(action);
    }

    void undo() {
        if (!undoStack.isEmpty()) {
            undoStack.pop().undo();
        }
    }
}
