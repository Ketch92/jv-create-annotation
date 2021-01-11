package core.basesyntax.lib;

import core.basesyntax.factory.Factory;
import core.basesyntax.model.IllegalDaoType;
import core.basesyntax.model.User;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

public class Injector {
    
    public static Object getInstance(Class<?> clazz) throws NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {
        
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor();
        Object instance = declaredConstructor.newInstance();
        
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.getAnnotation(Inject.class) != null) {
                field.setAccessible(true);
                field.set(instance, getDao(field.getGenericType()));
            }
        }
        return instance;
    }
    
    private static core.basesyntax.dao.Dao<?> getDao(Type type) {
        core.basesyntax.dao.Dao<?> dao;
        if (type.getTypeName().contains(User.class.getTypeName())) {
            dao = Factory.getUserDao();
            if (dao.getClass().getAnnotation(Dao.class) != null) {
                return dao;
            }
        }
        dao = Factory.getBetDao();
        if (dao.getClass().getAnnotation(Dao.class) != null) {
            return dao;
        }
        throw new IllegalDaoType("No correct Dao implementation found "
                                 + type.getTypeName());
    }
}
