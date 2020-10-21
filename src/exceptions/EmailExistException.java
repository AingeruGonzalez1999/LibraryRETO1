/*
 * This package have our exceptions.
 */
package exceptions;

/**
 *
 * @author gsalg
 */
public class EmailExistException extends Exception{

    public EmailExistException() {
        super("This email already exist.");
    }
    
}
