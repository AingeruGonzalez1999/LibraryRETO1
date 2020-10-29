/*
 * This package will be contein the message.
 */
package message;

import java.io.Serializable;
import model.User;

/**
 * This class have the type of message and the User we will send.
 * @author gsalg
 */
public class Message implements Serializable{
    
    private MessageType messageType;
    private User user;
    
    public Message(User user, MessageType messageType){
        this.user = user;
        this.messageType=messageType;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}
