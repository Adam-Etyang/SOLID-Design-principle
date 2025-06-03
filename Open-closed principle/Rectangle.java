// GOOD: Shape hierarchy supports new shapes without modifying existing code.
abstract class Shape {
  abstract double area();
}

class Circle extends Shape {
  double radius;

  Circle(double r) {
    this.radius = r;
  }

  double area() {
    return Math.PI * radius * radius;
  }
}

class Rectangle extends Shape {
  double width, height;

  Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  double area() {
    return width * height;
  }
}

class AreaCalculator {
  public double totalArea(Shape[] shapes) {
    double total = 0;
    for (Shape shape : shapes) {
      total += shape.area(); // Open to new shapes!
    }
    return total;
  }
}
