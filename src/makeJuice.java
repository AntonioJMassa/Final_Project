
public class makeJuice implements Command{
	    Juice juice;
	    
	    public makeJuice(Juice juice) {
	        this.juice = juice;
	    }
	    
	    public String execute() {
	        return juice.make();
	    }
}
