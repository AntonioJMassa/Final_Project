
public class makeBurger implements Command {
	Burger burger;
	
	public makeBurger(Burger burger) {
		this.burger = burger;
	}
	
	public void execute() {
		burger.make();
	}
}
