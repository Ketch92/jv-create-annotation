package core.basesyntax.factory;

import core.basesyntax.dao.BetDao;
import core.basesyntax.dao.Dao;
import core.basesyntax.dao.UserDao;
import core.basesyntax.model.Bet;
import core.basesyntax.model.User;

public class Factory {
    private static BetDao betDao;
    private static UserDao userDao;
    
    public static Dao<Bet> getBetDao() {
        if (betDao == null) {
            betDao = new BetDao();
        }
        return betDao;
    }
    
    public static Dao<User> getUserDao() {
        if (userDao == null) {
            userDao = new UserDao();
        }
        return userDao;
    }
}
