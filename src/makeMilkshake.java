public class makeMilkshake implements Command {
    Milkshake milkshake;
    
    public makeMilkshake(Milkshake milkshake) {
        this.milkshake = milkshake;
    }
    
    public String execute() {
        return milkshake.make();
    }
}
