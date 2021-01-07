package core.basesyntax;

import core.basesyntax.controller.BetHandler;
import core.basesyntax.controller.ConsoleHandler;
import core.basesyntax.controller.UserHandler;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        ConsoleHandler betHandler = new BetHandler();
        ConsoleHandler userHandler = new UserHandler();
    
        System.out.println("Give a bet and risk, please");
        betHandler.handle();
    
        System.out.println("Give a first and lastName, please");
        userHandler.handle();
    }
}
