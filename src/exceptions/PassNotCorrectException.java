/*
 * This package have our exceptions.
 */
package exceptions;

/**
 * This class will return password incorrect exception.
 * @author gsalg
 */
public class PassNotCorrectException extends Exception{
    
    /**
     * This method shows exception.
     */
    public PassNotCorrectException() {
        super("The password is wrong.");
    }
    
}
