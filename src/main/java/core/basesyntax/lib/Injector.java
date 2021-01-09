package core.basesyntax.lib;

import core.basesyntax.dao.BetDao;
import core.basesyntax.dao.UserDao;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Injector {
    
    public static Object getInstance(Class<?> clazzOfT) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {
        
        Constructor<?> declaredConstructor = clazzOfT.getDeclaredConstructor();
        Object instance = declaredConstructor.newInstance();
        
        Field[] declaredFields = clazzOfT.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.getAnnotation(Inject.class) != null) {
                field.setAccessible(true);
                field.set(instance, field.getGenericType()
                        .getTypeName()
                        .equals("User") ? new UserDao() : new BetDao());
            }
        }
        return null;
    }
}
