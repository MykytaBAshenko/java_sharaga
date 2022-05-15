import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Shape {
  public String color;
  
  public String toString(){
    return "color=" + color;
  }
  public Shape(String color) {
    this.color = color;
  }

  public double calcArea() {
    return 0.0;
  }
}

class Circle extends Shape{
  public double radius;

  public Circle(String color, double radius) {
      super(color); 
      this.radius = radius;
  }

  public double calcArea(){
    return Math.PI * radius * radius;
  }

  public String toString(){
    return  "color=" + color + ";radius=" + radius + ";calcArea=" + calcArea();
  }
}


class Rectangle extends Shape{
  public double width;
  public double height;

  public Rectangle(String color, double width, double height) {
      super(color); 
      this.width = width;
      this.height = height;

  }

  public double calcArea(){
    return width * height;
  }

  public String toString(){
    return "color=" + color + ";height=" + height + ";width=" + width + ";calcArea=" + calcArea();
  }
}


class Triangle extends Shape{
  public double a;
  public double b;
  public double c;


  public Triangle(String color, double a, double b, double c) {
      super(color); 
      this.a = a;
      this.b = b;
      this.c = c;
  }

  public double calcArea(){
    double p = 0.5*(a + b + c);
     
    return Math.sqrt(p*(p-a) *(p-b) * (p - c));
  }

  public String toString(){
    return "color=" + color + ";a=" + a + ";b=" + b + ";c=" + c +";calcArea=" + calcArea();
  }
}


public class Main {
    public static Shape[] shapes = new Shape[10];

    public static void getAllArea(){
      double allArea = 0.0;
      for(int t = 0; t < 9; t++) {
        allArea += shapes[t].calcArea();
      }
      System.out.println(allArea + " - All shapes area");
    }

    public static void getAllAreaOfEachType(){
      double allAreaC = 0.0;
      double allAreaT = 0.0;
      double allAreaR = 0.0;

      for(int t = 0; t < 9; t++) {
        if(shapes[t] instanceof Circle)
          allAreaC += shapes[t].calcArea();
        if(shapes[t] instanceof Triangle)
          allAreaT += shapes[t].calcArea();
        if(shapes[t] instanceof Rectangle)
          allAreaR += shapes[t].calcArea();
      }
      System.out.println(allAreaT + " - All shapes area of Triangles");
      System.out.println(allAreaR + " - All shapes area of Rectangles");
      System.out.println(allAreaC + " - All shapes area of Circles");

    }


    public static void main(String[] args) {

      shapes[0] = new Circle("blue", 2.25); 
      shapes[1] = new Circle("blue", 4.25); 
      shapes[2] = new Circle("blue", 5.25); 

      shapes[3] = new Rectangle("blue", 2.25, 2.25); 
      shapes[4] = new Rectangle("blue", 4.25, 22); 
      shapes[5] = new Rectangle("blue", 5.25, 12); 
      shapes[6] = new Rectangle("blue", 4.25,32);

      shapes[7] = new Triangle("blue", 3, 3, 3); 
      shapes[8] = new Triangle("blue", 3, 4, 5); 
      getAllArea();
      getAllAreaOfEachType();
    }
}