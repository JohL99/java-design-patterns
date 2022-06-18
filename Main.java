import java.util.ArrayList;

import Pattern.Behavioural.Command.*;
import Pattern.Behavioural.Observer.*;
import Pattern.Behavioural.Visitor.*;

/**
 * @author: https://github.com/marclevin
 * @version: 1.0
 */

public class Main {
    public static void main(String[] args) {
        command_example();
        observer_example();
        visitor_example();

    }

    /************* Behavioural ***************/

    /**
     * This is an example function showing the usage of the command pattern.
     */
    public static void command_example() {
        System.out.println("\n************* Command ***************");
        // Create a simple reciever
        Receiver remoteControl = new Receiver();

        // Create a two commands
        Command turnOnCommand = new OnCommand(remoteControl);
        Command turnOffCommand = new OffCommand(remoteControl);

        // Create a controller
        Controller controller = new Controller(turnOffCommand);

        // Turn off the receiver
        controller.executeCommand();

        // Change command
        controller.setCommand(turnOnCommand);

        // Turn on reciever
        controller.executeCommand();

    }

    /**
     * This is an example function showing the usage of the observer pattern.
     */
    public static void observer_example()
    {
    System.out.println("\n************* Observer ***************");

    // Create our subject and observable types.
    MarketTrend marketTrend = new MarketTrend(5);
    ApplStock applStock = new ApplStock(10);
    GoogStock googStock = new GoogStock(10);


    // Subscribe our observerable(s) to the subject.
    marketTrend.registerObserver(applStock);
    marketTrend.registerObserver(googStock);

    // Notify all observers of a change.
    marketTrend.notifyObservers();
    }


    public static void visitor_example()
    {
        System.out.println("\n************* Visitor ***************");
        // Creating our visitor
        CartVisitor cartVisitor = new CartVisitor();
        // For the purpose of this example, an list of acceptors will be used as that is a paradigm used by the visitor pattern.
        ArrayList<Acceptor> acceptors = new ArrayList<Acceptor>();
        
        // Adding acceptors to the list
        acceptors.add(new ChocolateAcceptor(100));
        acceptors.add(new CoffeeAcceptor(50));

        // Visitor is now visiting the acceptors, and will be able to access the acceptor via the acceptor's accept method.
        int total_bean_and_cocoa = 0;
        for (Acceptor acceptor : acceptors) {
         total_bean_and_cocoa+= acceptor.accept(cartVisitor);
        };
        System.out.println("Total bean and cocoa count: " + total_bean_and_cocoa);
    }
    /******************************************/



}