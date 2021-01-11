package core.basesyntax.model;

public class IllegalDaoType extends RuntimeException {
    private static final String MESSAGE = "Not correct dao implementation";
    
    public IllegalDaoType() {
        super(MESSAGE);
    }
}
