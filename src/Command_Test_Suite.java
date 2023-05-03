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

    // Unit tests for Command interface (Waitress invokes execute on a Command object)
    @Test
    public void testWaitressSetAndGetCommand() {
        Waitress waitress = new Waitress();
        Command command1 = () -> "Command1 executed";
        Command command2 = () -> "Command2 executed";

        waitress.setCommand(command1);
        assertEquals(command1, waitress.getCommand());

        waitress.setCommand(command2);
        assertEquals(command2, waitress.getCommand());
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

}
