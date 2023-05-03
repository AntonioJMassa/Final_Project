public class Waitress {
    Command command;
    
    public Waitress() {
        
    }
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
    public Command getCommand() {
        return command;
    }
    
    public String orderUp() {
        return command.execute();
    }
}
