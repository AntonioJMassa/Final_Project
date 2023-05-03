
public class makeBill implements Command{
	    Bill bill;
	    
	    public makeBill(Bill bill) {
	        this.bill = bill;
	    }
	    
	    public String execute() {
	        return bill.make();
	    }
}
