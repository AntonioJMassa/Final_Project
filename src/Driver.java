
public class Driver {
    public static void main(String[] args) {
        Waitress waitress = new Waitress();
        Burger burger = new Burger();
        Milkshake milkshake = new Milkshake();
        Waffles waffles = new Waffles();
        Juice juice = new Juice();
        Bill bill = new Bill();
        
        makeBurger SOC = new makeBurger(burger);
        waitress.setCommand(SOC);
        System.out.println(waitress.orderUp());
        
        makeMilkshake SOC2 = new makeMilkshake(milkshake);
        waitress.setCommand(SOC2);
        System.out.println(waitress.orderUp());
        
        makeWaffles SOC3 = new makeWaffles(waffles);
        waitress.setCommand(SOC3);
        System.out.println(waitress.orderUp());
        
        makeJuice SOC4 = new makeJuice(juice);
        waitress.setCommand(SOC4);
        System.out.println(waitress.orderUp());
        
        makeBill SOC5 = new makeBill(bill);
        waitress.setCommand(SOC5);
        System.out.println(waitress.orderUp());
    }
}