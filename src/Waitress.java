
public class Waitress {
	Command slot;
	
	public Waitress() {
		
	}
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void orderUp() {
		slot.execute();
	}
}
