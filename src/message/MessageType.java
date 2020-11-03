/*
 * This package will be contein the message.
 */
package message;

/**
 * This class have the type of the message.
 *
 * @author Garikoitz
 */
public enum MessageType {
    /**
     * Request signIn operation.
     */
    SIGNIN,
    /**
     * Request signUp operation.
     */
    SIGNUP,
    /**
     * Respond to the customer with the validation OK
     */
    OK,
    /**
     * Respond to the customer with the error EMAIL_EXIST
     */
    EMAIL_EXIST,
    /**
     * Respond to the customer with the error USER_EXIST
     */
    USER_EXIST,
    /**
     * Respond to the customer with the error USER_NOT_EXIST
     */
    USER_NOT_EXIST,
    /**
     * Respond to the customer with the error INVALID_PASSWORD
     */
    INVALID_PASSWORD,
    /**
     * Respond to the customer with the error SERVER_ERROR
     */
    SERVER_ERROR;
}
