/*
 * This package contains the interface we will use.
 */
package interfaces;

import model.User;

/**
 * Contain sign methods for being used by a DB.
 *
 * @author gsalg
 */
public interface Signeable {

    /**
     * This method receives a user to be able to sign in.
     * @param user
     * @return
     */
    public User signIn(User user);

    /**
     * This method receives a user to be able to sign up.
     * @param user
     * @return
     */
    public User signUp(User user);

}
