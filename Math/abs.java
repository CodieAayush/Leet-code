abstract class Shape {
    
    public abstract void draw();
}


class Circle extends Shape {
    
    public void draw() {
        System.out.println("Drawing a circle");
    }
}


class Rectangle extends Shape {
    
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}


public class abs {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw(); 

        Shape rectangle = new Rectangle();
        rectangle.draw(); 
    }
}
