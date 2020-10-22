/*
 * This package have our exceptions.
 */
package exceptions;

/**
 * This class will return user already exist exception.
 * @author gsalg
 */
public class UserExistException extends Exception {
    
    /**
     * This method shows exception.
     */
    public UserExistException() {
        super("This user already exist.");
    }

}
