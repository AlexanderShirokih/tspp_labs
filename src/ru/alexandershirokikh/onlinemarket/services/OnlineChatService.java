package ru.alexandershirokikh.onlinemarket.services;

import ru.alexandershirokikh.onlinemarket.users.User;

import java.util.List;
import java.util.stream.Stream;

/**
 * A service used for communication between customers and sellers
 */
public interface OnlineChatService {

    /**
     * Describes a chat message
     */
    static class Message {
        private final User sender;
        private final String message;

        /**
         * Creates new message with sender and its message
         */
        public Message(User sender, String message) {
            this.sender = sender;
            this.message = message;
        }

        /**
         * Returns the message sender
         */
        public User getSender() {
            return sender;
        }

        /**
         * Returns the message content
         */
        public String getMessage() {
            return message;
        }
    }

    /**
     * Adds message to the message queue
     */
    void sendMessage(User user, String message);

    /**
     * Gets all input messages
     */
    Stream<Message> getMessages();

}
