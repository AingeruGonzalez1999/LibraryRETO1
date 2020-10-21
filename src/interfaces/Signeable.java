/*
 * This package contains the interface we will use.
 */
package interfaces;

import classes.User;

/**
 * Contain sign methods for being used by a DB.
 * @author gsalg
 */
public interface Signeable {
    
    public User signIn(User user);
    public User signUp(User user);
    
}
