/*
 * This package have our exceptions.
 */
package exceptions;

/**
 * This class will return user is not exist exception.
 * @author gsalg
 */
public class UserOrPassNotExistException extends Exception{
    
    /**
     * This method shows exception.
     */
    public UserOrPassNotExistException() {
        super("This user or password does not exist.");
    }
    
}
