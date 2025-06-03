// VIOLATION: Must modify existing code to add new shapes

class Rectangle {
  public double width;
  public double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
}

class Circle {
  public double radius;

  public Circle(double radius) {
    this.radius = radius;
  }
}

// Then the problematic calculator
class BadAreaCalculator {
  public double calculateArea(Object shape) {
    if (shape instanceof Rectangle) {
      Rectangle rect = (Rectangle) shape;
      return rect.width * rect.height;
    } else if (shape instanceof Circle) {
      Circle circle = (Circle) shape;
      return Math.PI * circle.radius * circle.radius;
    }
    // Problem: Adding Triangle means modifying this method!
    return 0;
  }
}
