package core.basesyntax.controller;

import core.basesyntax.dao.Dao;
import core.basesyntax.dao.UserDao;
import core.basesyntax.model.User;
import java.util.Scanner;

public class UserHandler implements ConsoleHandler {
    private static final Scanner console = new Scanner(System.in);
    private static final String EXIT = "Exit";
    private static final String DELIMITER = " ";
    private final Dao<User> dao = new UserDao();
    
    @Override
    public void handle() {
        while (true) {
            String command = console.nextLine();
            if (command.equalsIgnoreCase(EXIT)) {
                return;
            }
            try {
                if (command.isEmpty()) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                String[] betData = command.split(DELIMITER);
                dao.add(new User(betData[0], betData[1]));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("The input data isn't correct. Please, give a right input");
            }
        }
    }
}
