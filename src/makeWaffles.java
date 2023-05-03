
public class makeWaffles implements Command {
	    Waffles waffle;
	    
	    public makeWaffles(Waffles waffle) {
	        this.waffle = waffle;
	    }
	    
	    public String execute() {
	        return waffle.make();
	    }
}
