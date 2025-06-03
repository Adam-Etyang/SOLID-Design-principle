// BAD: One interface for all appliances
interface Machine {
  void print();

  void scan();

  void fax();
}

// GOOD: Split interfaces
interface Printer {
  void print();
}

interface Scanner {
  void scan();
}

class MultiFunctionPrinter implements Printer, Scanner {
  @Override
  public void print() {
    /* print */ }

  @Override
  public void scan() {
    /* scan */ }
}

class SimplePrinter implements Printer {
  @Override
  public void print() {
    /* print */ }
}
