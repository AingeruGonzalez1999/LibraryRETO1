/*
 * This package have our exceptions.
 */
package exceptions;

/**
 * This class will return email exception.
     * @author Garikoitz
 */
public class EmailExistException extends Exception{
    
    /**
     * This method shows exception.
     */
    public EmailExistException() {
        super("This email already exist.");
    }
    
}
