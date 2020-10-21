/*
 * This package have our exceptions.
 */
package exceptions;

/**
 *
 * @author gsalg
 */
public class PassNotCorrectException extends Exception{

    public PassNotCorrectException() {
        super("The password is wrong.");
    }
    
}
