import java.util.ArrayList;

import Pattern.Behavioural.Command.*;
import Pattern.Behavioural.Observer.*;
import Pattern.Behavioural.Visitor.*;
import Pattern.Creational.AbstractFactory.*;
import Pattern.Creational.ObjectPool.*;
import Pattern.Structural.Adapter.*;
import Pattern.Structural.Facade.*;
import Pattern.Structural.Proxy.*;


/**
 * @author: https://github.com/marclevin
 * @version: 1.0
 */

public class Main {
    public static void main(String[] args) {
        // Behavioural
        command_example();
        observer_example();
        visitor_example();

        // Structural
        adapter_example();
        facade_example();
        proxy_example();

        // Creational
        factory_example();
        object_example();
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
    public static void observer_example() {
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

    public static void visitor_example() {
        System.out.println("\n************* Visitor ***************");
        // Creating our visitor
        CartVisitor cartVisitor = new CartVisitor();
        // For the purpose of this example, an list of acceptors will be used as that is
        // a paradigm used by the visitor pattern.
        ArrayList<Acceptor> acceptors = new ArrayList<Acceptor>();

        // Adding acceptors to the list
        acceptors.add(new ChocolateAcceptor(100));
        acceptors.add(new CoffeeAcceptor(50));

        // Visitor is now visiting the acceptors, and will be able to access the
        // acceptor via the acceptor's accept method.
        int total_bean_and_cocoa = 0;
        for (Acceptor acceptor : acceptors) {
            total_bean_and_cocoa += acceptor.accept(cartVisitor);
        }
        ;
        System.out.println("Total bean and cocoa count: " + total_bean_and_cocoa);
    }

    /******************************************/

    /************** Structural ****************/

    public static void adapter_example() {
        System.out.println("\n************* Adapter ***************");
        // Create the adapter
        ConcreteAdapter adapter = new ConcreteAdapter();
        // Create the array
        Integer[] arr = { 1, 3, 2, 5, 4 };
        // Sort the array
        Integer[] sorted = adapter.sort_array(arr);
        // Print the array
        for (Integer i : sorted) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void facade_example() {
        System.out.println("\n************* Facade ***************");
        // Create the facade
        Facade facade = new Facade();
        // Call the unified operation, the client will be unaware of the internal
        // implementation but will witness results.
        facade.unifiedOperation();
    }

    public static void proxy_example() {
        System.out.println("\n************* Proxy ***************");
        ProxySubject proxySubject = new ProxySubject();
        // The proxy has hidden the real subject, and has used a common method between the real subject and the proxy.
        System.out.println(proxySubject.getSecret());
    }
     /******************************************/

     /************** Creational ****************/
     
     public static void factory_example() {
         System.out.println("\n************* Factory ***************");
         // Creating our abstract factory
         WarFactory warFactory = new WarFactory();
         // List of Orks to be filled with generated orks from the factory.
         ArrayList<Ork> orks = new ArrayList<Ork>();

         // Ork creation
         orks.add(warFactory.createWarboss(10));
         orks.add(warFactory.createWarlord(5));

         // Print the ork war cries.
         for (Ork ork : orks) {
             ork.warcry();
         }
     }

     public static void object_example()
     {
            System.out.println("\n************* Object ***************");
            // Get instance of object pool
            BulletPool pool = BulletPool.getInstance();
            // Get a bullet from the pool
            Bullet bullet = pool.getBullet();
            // "Fire" the bullet
            bullet.fire();
            // Return the bullet to the pool
            pool.returnBullet(bullet);
     }

     /******************************************/

     // End of file
}
