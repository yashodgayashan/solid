package com.mycompany.shapes;

public class Squre implements Shape{

  private int width;

  public Squre(int width) {
    this.width = width;
  }

  @Override
  public double calculateArea() {
    return this.width*this.width;  
  }
}
