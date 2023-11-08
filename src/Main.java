
interface MessagingService {
    void sendMessage(String message);
}
class SMSMessagingService implements MessagingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}


class EmailMessagingService implements MessagingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}


class WhatsAppMessagingService implements MessagingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending WhatsApp Message: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        MessagingService smsService = new SMSMessagingService();
        MessagingService emailService = new EmailMessagingService();
        MessagingService whatsappService = new WhatsAppMessagingService();

        smsService.sendMessage("Hello, this is an SMS.");
        emailService.sendMessage("Greetings! Sending via Email.");
        whatsappService.sendMessage("Hey there, WhatsApp message here.");
    }
}