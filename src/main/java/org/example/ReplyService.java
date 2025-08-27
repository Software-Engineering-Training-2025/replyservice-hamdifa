package org.example;

/**
 * Students implement this method to return the exact outputs defined in README.
 */
public class ReplyService {

    public String reply(String message, ReplyType type) {
        // TODO: Implement mapping according to README canonical expectations.
        // Requirements:
        // - null or blank -> "Please say something."
        // - For known messages, return exact string for each ReplyType.
        // - For unknown messages, return the 'any other text' mapping.
        if (message==null || message.isBlank()) {
            return "Please say something.";
        }
//        throw new UnsupportedOperationException("Not implemented yet");
        else {
            return switch (type) {
                case ReplyType.CONCISE -> switch (message) {
                    case "hi", "hello" -> "Hello. How can I help?";
                    case "how are you" -> "I’m good. How can I help?";
                    case "i need help" -> "Share details; I’ll help.";
                    case "can you help me with my account" -> "Describe the account issue…";
                    case "thanks" -> "You’re welcome.";
                    case "bye" -> "Goodbye.";
                    case "what is your name" -> "I’m your assistant.";
                    default -> "Please clarify.";
                };
                case ReplyType.FORMAL -> switch (message) {
                    case "hi", "hello" -> "Hello. How may I assist you today?";
                    case "how are you" -> "I am functioning properly. How may I assist you?";
                    case "i need help" -> "I can assist with that. Please provide more details.";
                    case "can you help me with my account" -> "Certainly. Please describe the account issue.";
                    case "thanks" -> "You are welcome.";
                    case "bye" -> "Goodbye.";
                    case "what is your name" -> "I am your virtual assistant.";
                    default -> "Could you clarify your request?";
                };
                case ReplyType.FRIENDLY -> switch (message) {
                    case "hi" -> "Hey there! \uD83D\uDE0A How can I help?";
                    case "hello" -> "Hi! \uD83D\uDC4B What’s up?";
                    case "how are you" -> "Doing great! \uD83D\uDE04 How can I help?";
                    case "i need help" -> "I’ve got you! \uD83D\uDE42 Tell me a bit more.";
                    case "can you help me with my account" -> "Sure thing! \uD83D\uDE0A What’s wrong with the account?";
                    case "thanks" -> "Anytime! \uD83D\uDE4C";
                    case "bye" -> "See you later! \uD83D\uDC4B";
                    case "what is your name" -> "I’m your helper bot \uD83E\uDD16";
                    default -> "Could you tell me more?";
                };
            };
        }
    }
}
