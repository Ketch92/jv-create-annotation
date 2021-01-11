package core.basesyntax.dao;

import core.basesyntax.lib.Dao;
import core.basesyntax.model.User;
import core.basesyntax.storage.Storage;
import java.util.ArrayList;
import java.util.List;

@Dao
public class UserDao implements UserDaoIntf {
    
    @Override
    public void add(User value) {
        Storage.userStorage.add(value);
    }
    
    @Override
    public void addAll(List<User> list) {
        Storage.userStorage.addAll(list);
    }
    
    @Override
    public List<User> getAll() {
        return new ArrayList<>(Storage.userStorage);
    }
    
    @Override
    public boolean contains(User value) {
        return Storage.userStorage.contains(value);
    }
    
    @Override
    public boolean remove(User value) {
        return Storage.userStorage.remove(value);
    }
}
