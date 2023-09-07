## Liskov Substitution Principle

### Definition

The Liskov substitution principle states that, if S is a subtype of T, then objects of type T may be replaced with objects of type S (i.e., objects of type S may substitute objects of type T) without altering any of the desirable properties of the program (correctness, task performed, etc.).

### Scenario

There is a Rectangle class which has width and height properties. There is a Square class which extends Rectangle class. Square class has only one property side. We can create a Rectangle object and assign it to a Square variable. But, we can't assign a Square object to a Rectangle variable. Because, Rectangle class has width and height properties. If we assign a Square object to a Rectangle variable, we can't set width and height properties. So, we can't use Rectangle methods correctly.

```java

public class Rectangle {
    private long width;
    private long height;

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }
}

public class Square extends Rectangle {
    private long side;

    public long getSide() {
        return side;
    }

    public void setSide(long side) {
        this.side = side;
    }
}

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        System.out.println(rectangle.getWidth() + " " + rectangle.getHeight());

        Square square = new Square();
        square.setSide(10);
        System.out.println(square.getSide());

        Rectangle rectangle1 = new Square();
        rectangle1.setWidth(10);
        rectangle1.setHeight(20);
        System.out.println(rectangle1.getWidth() + " " + rectangle1.getHeight());

        Square square1 = new Rectangle(); // Compile time error
        square1.setSide(10);
        System.out.println(square1.getSide());
    }
}
```