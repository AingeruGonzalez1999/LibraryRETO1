/*
 * This package have our exceptions.
 */
package exceptions;

/**
 * This class will return user is not exist exception.
 * @author Garikoitz
 */
public class UserNotExistException extends Exception{
    
    /**
     * This method shows exception.
     */
    public UserNotExistException() {
        super("This user or password does not exist.");
    }
    
}
