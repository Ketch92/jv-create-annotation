package core.basesyntax.model;

public class IllegalDaoType extends RuntimeException {
    
    public IllegalDaoType() {
        super("Not correct dao implementation");
    }
}
