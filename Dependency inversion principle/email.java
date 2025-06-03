// BAD: High-level class depends on low-level Email class
class Email {
  public void send(String message) {
    System.out.println("Email: " + message);
  }
}

class Notification {
  private Email email = new Email(); // tightly coupled

  public void alert(String message) {
    email.send(message);
  }
}

// GOOD: Depend on abstraction
interface MessageSender {
  void send(String message);
}

class EmailSender implements MessageSender {
  @Override
  public void send(String message) {
    System.out.println("Email: " + message);
  }
}

class NotificationService {
  private MessageSender sender;

  public NotificationService(MessageSender sender) {
    this.sender = sender;
  }

  public void alert(String message) {
    sender.send(message);
  }
}
