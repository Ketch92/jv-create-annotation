package core.basesyntax;

import core.basesyntax.controller.ConsoleHandler;

public class Main {
    public static void main(String[] args) {
        ConsoleHandler handler = new ConsoleHandler();
    
        System.out.println("To close the app type Exit");
        System.out.println("Please, provide space separated data First name, last name, bet, and risk");
        handler.handle();
        System.out.println("Thanks for coop");
        System.out.println("Good luck!");
    }
}
