/*
 * This package have our exceptions.
 */
package exceptions;

/**
 *
 * @author gsalg
 */
public class MaxConnectionException extends Exception{

    public MaxConnectionException() {
        super("The served reached the maximum amount database connections.");
    }
    
}
