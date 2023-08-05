package Behavioural.Command;
import java.util.Stack;

/*
The Command Design Pattern addresses several problems and needs in software design:

Decoupling Invokers and Receivers: In complex applications, maintaining direct references between components (like buttons and their actions) can create tightly-coupled and hard-to-maintain code. The command pattern decouples the object that invokes the operation from the one that knows how to perform it.

Parameterizing Actions: The command pattern allows you to parameterize clients with operations to perform, allowing the same client to execute different operations.

Supporting Undo/Redo: Command objects can maintain state about an operation, allowing the operation to be undone or redone later.

Supporting Macros: A macro is a recording of a sequence of commands. The command pattern allows you to define high-level operations in terms of smaller operations, which supports defining, saving, and replaying macros.

Supporting Logging and Transactional Behavior: By extending the command pattern, you can add logging and transactional capabilities. If an operation fails, you can roll back the effects of the prior operations.
 */

class BoldCommand implements Command {
    private String text;
    private String prevText;

    public BoldCommand(String text){
        this.text = text;
        this.prevText = text;
    }

    public void execute(){
        System.out.println("Executed bold command");
        this.prevText = this.text;
        this.text = "**" + this.text + "**";
    }

    public void undo(){
        this.text = this.prevText;
    }
}

class TextEditor {
    private Stack<Command> history = new Stack<>();

    public void executeCommand(Command command){
        this.history.push(command);
        command.execute();
    }

    public void undo(){
        if(!history.empty()){
            Command command = this.history.pop();
            command.undo();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        BoldCommand command = new BoldCommand("Hello");
        editor.executeCommand(command);
        editor.undo();
    }
}
