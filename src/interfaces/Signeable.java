/*
 * This package contains the interface we will use.
 */
package interfaces;

import exceptions.EmailExistException;
import exceptions.ServerException;
import exceptions.UserExistException;
import exceptions.UserOrPassNotExistException;
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
     * @throws exceptions.UserOrPassNotExistException
     * @throws exceptions.ServerException
     */
    public User signIn(User user) throws UserOrPassNotExistException, ServerException;

    /**
     * This method receives a user to be able to sign up.
     * @param user
     * @return
     * @throws exceptions.UserExistException
     * @throws exceptions.EmailExistException
     * @throws exceptions.ServerException
     */
    public User signUp(User user) throws UserExistException, EmailExistException, ServerException;

}
