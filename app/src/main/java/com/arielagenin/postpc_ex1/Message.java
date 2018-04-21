package com.arielagenin.postpc_ex1;

/**
 * A class representing a Message.
 */
public class Message {
    String timeOfMessage;
    String messageContent;
    String messageSender;

    /**
     * A constructor for the Message class.
     * @param timeOfMessage - The time that the was sent at.
     * @param messageContent - The message content.
     * @param messageSender - The name of the message sender.
     */
    public Message(String timeOfMessage, String messageContent, String messageSender)
    {
        this.timeOfMessage = timeOfMessage;
        this.messageContent = messageContent;
        this.messageSender = messageSender;
    }

    /**
     * @return The time that the message was written at.
     */
    public String getTimeOfMessage() {
        return timeOfMessage;
    }

    /**
     * @return The content of the message.
     */
    public String getMessageContent() {
        return messageContent;
    }

    /**
     * @return The message sender's name.
     */
    public String getMessageSender() {
        return messageSender;
    }

    /**
     * Updates the message sender name according to the given name.
     * @param messageSender - The sender name to update to.
     */
    public void setMessageSender(String messageSender) {
        this.messageSender = messageSender;
    }
}
