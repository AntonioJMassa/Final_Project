
public class makeMilkshake implements Command {
	Milkshake milkshake;
	
	public makeMilkshake(Milkshake milkshake) {
		this.milkshake = milkshake;
	}
	
	public void execute() {
		milkshake.make();
	}
}
