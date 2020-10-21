/*
 * This package have our exceptions.
 */
package exceptions;

/**
 *
 * @author gsalg
 */
public class UserExistException extends Exception {

    public UserExistException() {
        super("This user already exist.");
    }

}
