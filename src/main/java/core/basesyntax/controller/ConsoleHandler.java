package core.basesyntax.controller;

import core.basesyntax.dao.Dao;
import core.basesyntax.lib.Inject;
import core.basesyntax.model.Bet;
import core.basesyntax.model.User;
import java.util.Scanner;

public class ConsoleHandler {
    private static final String EXIT = "Exit";
    private static final String DELIMITER = " ";
    @Inject
    private Dao<Bet> betDao;
    @Inject
    private Dao<User> userDao;
    
    public void handle() {
        Scanner console = new Scanner(System.in);
        
        while (true) {
            String command = console.nextLine();
            if (command.equalsIgnoreCase(EXIT)) {
                return;
            }
            try {
                String[] data = command.split(DELIMITER);
                userDao.add(new User(data[0], data[1]));
                int betAmount = Integer.parseInt(data[2]);
                double risk = Double.parseDouble(data[3]);
                betDao.add(new Bet(betAmount, risk));
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("The input data isn't correct. Please, give a right input");
            }
        }
    }
}
