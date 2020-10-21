/*
 * This package will be contein the message.
 */
package message;

/**
 * This class have the type of message.
 * @author gsalg
 */
public class Message {
    
    MessageType messageType;
    
    public Message(MessageType messageType){
        this.messageType=messageType;
    }
    
    switch(messageType){
    
        case SIGNIN:
            break;
            
        case SIGNUP:
            break;
            
        default:
            break;
    }
}
