package com.mycompany.shapes;

public class Circle implements Shape {
  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return 3.14*this.radius*this.radius;
  }

  
  
}
