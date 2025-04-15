package part2;//PART2-----------------------------------------------------------------------------------------------------------------

public class RemoteControl {
    private Command[] slots;
    private Command lastCommand;

    public RemoteControl(int slotCount) {
        slots = new Command[slotCount];
    }

    public void setCommand(int slot, Command command) {
        slots[slot] = command;
    }

    public void pressButton(int slot) {
        if (slots[slot] != null) {
            slots[slot].execute();
            lastCommand = slots[slot];
        }
    }

    public void undoLast() {
        if (lastCommand != null) {
            System.out.println(" -| Undo last command |- ");
            lastCommand.undo();
        }
    }
}