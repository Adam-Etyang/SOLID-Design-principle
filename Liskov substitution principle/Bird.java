class Bird {
  void fly() {
    System.out.println("Flying");
  }
}

class Sparrow extends Bird {
}

class Ostrich extends Bird {
  @Override
  void fly() {
    throw new UnsupportedOperationException("Ostriches can't fly!");
  }
}

// BAD: Ostrich violates LSP. It shouldn't extend Bird if it can't fly.
// GOOD: Refactor using interfaces:
interface Flyable {
  void fly();
}

class FlyingBird implements Flyable {
  @Override
  public void fly() {
    System.out.println("Flying");
  }
}

class Ostrich {
} // No need to implement Flyable
