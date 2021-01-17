
package polymorphism;


public class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Rectangle.erase()");

    }
    
    @Override
    public void printMessage() {
        System.out.println("Rectangle.printMessage()");
    }
}
