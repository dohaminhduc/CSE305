package CSE_305.Lab6_CodeSmell.AS1;


class Message {
    private final String content;
    private final String sender;
    private final String recipient;
    

    public Message(String content, String sender, String recipient) {
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
    }

    // Getters for message properties
    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }



    @Override
    public String toString() {
        return "Content: " + content + "\n" +
                "Sender: " + sender + "\n" +
                "Recipient: " + recipient;
    }

}
