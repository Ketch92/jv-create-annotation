package core.basesyntax.dao;

import core.basesyntax.lib.DaoAnnotation;
import java.util.List;

@DaoAnnotation
public interface Dao<T> {
    void add(T value);
    
    void addAll(List<T> list);
    
    List<T> getAll();
    
    boolean contains(T value);
    
    boolean remove(T value);
}
