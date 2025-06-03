// VIOLATION: Class has multiple responsibilities
class BadUser {
  private String name;
  private String email;

  public BadUser(String name, String email) {
    this.name = name;
    this.email = email;
  }

  // User data responsibility
  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  // Database responsibility (violation!)
  public void saveToDatabase() {
    System.out.println("Saving user to database...");
  }

  // Email responsibility (violation!)
  public void sendEmail(String message) {
    System.out.println("Sending email to " + email + ": " + message);
  }
}
