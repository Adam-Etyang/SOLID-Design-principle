// GOOD: Separate responsibilities into different classes
class User {
  private String name;
  private String email;

  public User(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }
}

class UserRepository {
  public void save(User user) {
    System.out.println("Saving user " + user.getName() + " to database...");
  }
}

class EmailService {
  public void sendEmail(User user, String message) {
    System.out.println("Sending email to " + user.getEmail() + ": " + message);
  }
}
