import org.junit.Test;
import static org.junit.Assert.*;

public class Command_Test_Suite {

    // Unit tests for Burger class
    @Test
    public void testBurgerMake() {
        Burger burger = new Burger();
        String expectedOutput = "Toasting buns\nBurning the burgers\nAdding Lettuce\nPutting it all together\nReady\n";
        assertEquals(expectedOutput, burger.make());
    }

    // Unit tests for Milkshake class
    @Test
    public void testMilkshakeMake() {
        Milkshake milkshake = new Milkshake();
        String expectedOutput = "Chopping the strawberries\nAdding the icecream\nBlending it all together\nReady\n";
        assertEquals(expectedOutput, milkshake.make());
    }

    // Unit tests for Waffles class
    @Test
    public void testWafflesMake() {
        Waffles waffles = new Waffles();
        String expectedOutput = "Mixing the batter\nAdding butter to the pan\nChopping fruit\nPutting it all together\nReady\n";
        assertEquals(expectedOutput, waffles.make());
    }

    // Unit tests for Juice class
    @Test
    public void testJuiceMake() {
        Juice juice = new Juice();
        String expectedOutput = "Cleaning the glass\nSqueezing the oranges\nWatering it dowm\nAdding ice\nReady\n";
        assertEquals(expectedOutput, juice.make());
    }

    // Unit tests for Bill class
    @Test
    public void testBillMake() {
        Bill bill = new Bill();
        String expectedOutput = "Adding cost of order\nAdding tips\nOVercharging for water\nAdding the total\nReady\n";
        assertEquals(expectedOutput, bill.make());
    }
    
    // Unit tests for makeBurger class
    @Test
    public void testMakeBurgerExecute() {
        Burger burger = new Burger();
        makeBurger makeBurger = new makeBurger(burger);
        String expectedOutput = "Toasting buns\nBurning the burgers\nAdding Lettuce\nPutting it all together\nReady\n";
        assertEquals(expectedOutput, makeBurger.execute());
    }

    // Unit tests for makeMilkshake class
    @Test
    public void testMakeMilkshakeExecute() {
        Milkshake milkshake = new Milkshake();
        makeMilkshake makeMilkshake = new makeMilkshake(milkshake);
        String expectedOutput = "Chopping the strawberries\nAdding the icecream\nBlending it all together\nReady\n";
        assertEquals(expectedOutput, makeMilkshake.execute());
    }
    
    // Unit tests for makeWaffles class
    @Test
    public void testMakeWafflesExecute() {
        Waffles waffles = new Waffles();
        makeWaffles makeWaffles = new makeWaffles(waffles);
        String expectedOutput = "Mixing the batter\nAdding butter to the pan\nChopping fruit\nPutting it all together\nReady\n";
        assertEquals(expectedOutput, makeWaffles.execute());
    }

    // Unit tests for makeJuice class
    @Test
    public void testMakeJuiceExecute() {
        Juice juice = new Juice();
        makeJuice makeJuice = new makeJuice(juice);
        String expectedOutput = "Cleaning the glass\nSqueezing the oranges\nWatering it dowm\nAdding ice\nReady\n";
        assertEquals(expectedOutput, makeJuice.execute());
    }
    
    // Unit tests for makeBill class
    @Test
    public void testMakeBillExecute() {
        Bill bill = new Bill();
        makeBill makeBill = new makeBill(bill);
        String expectedOutput = "Adding cost of order\nAdding tips\nOVercharging for water\nAdding the total\nReady\n";
        assertEquals(expectedOutput, makeBill.execute());
    }
    
    // Unit tests for Command interface (Waitress invokes execute on a Command object)
    @Test
    public void testWaitressSetAndGetCommand() {
        Waitress waitress = new Waitress();
        Command command1 = () -> "Command1 executed";
        Command command2 = () -> "Command2 executed";
        Command command3 = () -> "Command3 executed";
        Command command4 = () -> "Command4 executed";
        Command command5 = () -> "Command5 executed";

        waitress.setCommand(command1);
        assertEquals(command1, waitress.getCommand());

        waitress.setCommand(command2);
        assertEquals(command2, waitress.getCommand());
        
        waitress.setCommand(command3);
        assertEquals(command3, waitress.getCommand());
        
        waitress.setCommand(command4);
        assertEquals(command4, waitress.getCommand());
        
        waitress.setCommand(command5);
        assertEquals(command5, waitress.getCommand());
    }

    // Integration test for Waitress and makeBurger
    @Test
    public void testWaitressWithMakeBurger() {
        Waitress waitress = new Waitress();
        Burger burger = new Burger();
        makeBurger makeBurger = new makeBurger(burger);

        waitress.setCommand(makeBurger);
        String expectedOutput = "Toasting buns\nBurning the burgers\nAdding Lettuce\nPutting it all together\nReady\n";
        assertEquals(expectedOutput, waitress.orderUp());
    }

    // Integration test for Waitress and makeMilkshake
    @Test
    public void testWaitressWithMakeMilkshake() {
        Waitress waitress = new Waitress();
        Milkshake milkshake = new Milkshake();
        makeMilkshake makeMilkshake = new makeMilkshake(milkshake);

        waitress.setCommand(makeMilkshake);
        String expectedOutput = "Chopping the strawberries\nAdding the icecream\nBlending it all together\nReady\n";
        assertEquals(expectedOutput, waitress.orderUp());
    }
    
    // Integration test for Waitress and makeJuice
    @Test
    public void testWaitressWithMakeJuice() {
        Waitress waitress = new Waitress();
        Juice juice = new Juice();
        makeJuice makeJuice = new makeJuice(juice);

        waitress.setCommand(makeJuice);
        String expectedOutput = "Cleaning the glass\nSqueezing the oranges\nWatering it dowm\nAdding ice\nReady\n";
        assertEquals(expectedOutput, waitress.orderUp());
    }
    
    // Integration test for Waitress and makeWaffles
    @Test
    public void testWaitressWithMakeWaffles() {
        Waitress waitress = new Waitress();
        Waffles waffles = new Waffles();
        makeWaffles makeWaffles = new makeWaffles(waffles);

        waitress.setCommand(makeWaffles);
        String expectedOutput = "Mixing the batter\nAdding butter to the pan\nChopping fruit\nPutting it all together\nReady\n";
        assertEquals(expectedOutput, waitress.orderUp());
    }
    
    // Integration test for Waitress and makeBill
    @Test
    public void testWaitressWithMakeBill() {
        Waitress waitress = new Waitress();
        Bill bill = new Bill();
        makeBill makeBill = new makeBill(bill);

        waitress.setCommand(makeBill);
        String expectedOutput = "Adding cost of order\nAdding tips\nOVercharging for water\nAdding the total\nReady\n";
        assertEquals(expectedOutput, waitress.orderUp());
    }

}
