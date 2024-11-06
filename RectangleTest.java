class Rectangle {
  private double length = 1.0;
  private double width = 1.0;

  public double getLength() {
      return length;
  }

  public void setLength(double length) {
      if (length > 0.0 && length < 20.0) {
          this.length = length;
      } else {
          System.out.println("Invalid length. Please enter a value between 0.0 and 20.0.");
      }
  }

  public double getWidth() {
      return width;
  }

  public void setWidth(double width) {
      if (width > 0.0 && width < 20.0) {
          this.width = width;
      } else {
          System.out.println("Invalid width. Please enter a value between 0.0 and 20.0.");
      }
  }

  public double calculatePerimeter() {
      return 2 * (length + width);
  }

  public double calculateArea() {
      return length * width;
  }
}

public class RectangleTest {
  public static void main(String[] args) {
      Rectangle rectangle = new Rectangle();

      rectangle.setLength(10.5);
      rectangle.setWidth(5.3);

      System.out.println("Rectangle Length: " + rectangle.getLength());
      System.out.println("Rectangle Width: " + rectangle.getWidth());
      System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
      System.out.println("Rectangle Area: " + rectangle.calculateArea());

      rectangle.setLength(21.0);
      rectangle.setWidth(-3.0);
  }
}
