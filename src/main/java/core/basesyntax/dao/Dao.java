package core.basesyntax.dao;

import java.util.List;

public interface Dao<T> {
    void add(T value);
    
    void addAll(List<T> list);
    
    List<T> getAll();
    
    boolean contains(T value);
    
    boolean remove(T value);
}
