package core.basesyntax.model;

import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;
    
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o.getClass().equals(User.class))) {
            return false;
        }
        User user = (User) o;
        return firstName.equals(user.firstName) && lastName.equals(user.lastName);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
    
    @Override
    public String toString() {
        return "User{"
               + "firstName='" + firstName + '\''
               + ", lastName='" + lastName + '\''
               + '}';
    }
}
