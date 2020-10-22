/*
 * This package have our exceptions.
 */
package exceptions;

/**
 * This class will return maximun connection exception.
 * @author gsalg
 */
public class MaxConnectionException extends Exception{
    
    /**
     * This method shows exception.
     */
    public MaxConnectionException() {
        super("The served reached the maximum amount database connections.");
    }
    
}
