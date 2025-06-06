package CSE_305_Lab2.Lab6_CodeSmell.AS1;

import java.util.*;
public class Test {
    public static void main(String[] args) {
         MessagingService messagingService = new MessagingService(); 
         MessagePrinter messagePrinter = new MessagePrinter();

        messagingService.sendMessage("Hello, tenant!", "Property Manager", "Tenant A"); 
        messagingService.sendMessage("Important notice: Rent due next week.", "Property Owner", "Tenant A"); 
        messagingService.sendMessage("Maintenance request received.", "Tenant A", "Property Manager"); 

        List<Message> tenantAMessages = messagingService.getMessagesForRecipient("Tenant A"); 
        messagePrinter.printAllMessagesForRecipient(tenantAMessages);

        Message exampleMessage = new Message("Test", "Sender", "Recipient"); 
        messagePrinter.printSummaryMessage(exampleMessage);
 
        messagePrinter.printAllMessages(messagingService.getInbox());
    }
}
