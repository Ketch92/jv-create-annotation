package core.basesyntax.factory;

import core.basesyntax.dao.BetDaoImpl;
import core.basesyntax.dao.Dao;
import core.basesyntax.dao.UserDaoImpl;
import core.basesyntax.model.Bet;
import core.basesyntax.model.User;

public class Factory {
    private static BetDaoImpl betDao;
    private static UserDaoImpl userDao;
    
    public static Dao<Bet> getBetDao() {
        if (betDao == null) {
            betDao = new BetDaoImpl();
        }
        return betDao;
    }
    
    public static Dao<User> getUserDao() {
        if (userDao == null) {
            userDao = new UserDaoImpl();
        }
        return userDao;
    }
}
