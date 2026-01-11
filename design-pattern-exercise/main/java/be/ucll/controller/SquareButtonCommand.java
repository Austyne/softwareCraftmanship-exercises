package be.ucll.controller;

public class SquareButtonCommand implements Command {
    private final Receiver receiver;

    public SquareButtonCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionSquare();
    }
}