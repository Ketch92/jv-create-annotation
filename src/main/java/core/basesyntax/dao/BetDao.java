package core.basesyntax.dao;

import core.basesyntax.model.Bet;
import core.basesyntax.storage.Storage;
import java.util.ArrayList;
import java.util.List;

public class BetDao implements Dao<Bet>{
    @Override
    public void add(Bet value) {
        Storage.betsStorage.add(value);
    }
    
    @Override
    public void addAll(List<Bet> list) {
        Storage.betsStorage.addAll(list);
    }
    
    @Override
    public List<Bet> getAll() {
        return new ArrayList<>(Storage.betsStorage);
    }
    
    @Override
    public boolean contains(Bet value) {
        return Storage.betsStorage.contains(value);
    }
    
    @Override
    public boolean remove(Bet value) {
        return Storage.betsStorage.remove(value);
    }
}
