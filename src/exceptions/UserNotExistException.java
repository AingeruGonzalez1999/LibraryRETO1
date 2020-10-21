/*
 * This package have our exceptions.
 */
package exceptions;

/**
 *
 * @author gsalg
 */
public class UserNotExistException extends Exception{

    public UserNotExistException() {
        super("This user not exist.");
    }
    
}
