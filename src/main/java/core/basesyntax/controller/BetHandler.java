package core.basesyntax.controller;

import core.basesyntax.dao.BetDao;
import core.basesyntax.dao.Dao;
import core.basesyntax.model.Bet;
import java.util.Scanner;

public class BetHandler implements ConsoleHandler {
    private static final Scanner console = new Scanner(System.in);
    private static final String EXIT = "Exit";
    private static final String DELIMITER = " ";
    private final Dao<Bet> dao = new BetDao();
    
    @Override
    public void handle() {
        while (true) {
            String command = console.nextLine();
            if (command.equalsIgnoreCase(EXIT)) {
                return;
            }
            try {
                String[] betData = command.split(DELIMITER);
                int betAmount = Integer.parseInt(betData[0]);
                double risk = Double.parseDouble(betData[1]);
                dao.add(new Bet(betAmount, risk));
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("The input data isn't correct. Please, give a right input");
            }
        }
    }
}
