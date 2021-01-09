package core.basesyntax;

import core.basesyntax.controller.ConsoleHandler;
import core.basesyntax.factory.Factory;
import core.basesyntax.lib.Injector;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException,
            NoSuchMethodException,
            InstantiationException,
            IllegalAccessException {
        
        ConsoleHandler handler = (ConsoleHandler) Injector.getInstance(ConsoleHandler.class);
        
        System.out.println("To close the app type Exit");
        System.out.println("Please, provide space separated data"
                           + " First name, last name, bet, and risk");
        handler.handle();
        System.out.println("Thanks for coop");
        System.out.println("Good luck!");
    
        System.out.println(Factory.getUserDao().getAll());
        System.out.println(Factory.getBetDao().getAll());
    }
}
