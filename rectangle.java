
package latihan4;
public class rectangle extends shape{
    // private member variables
    private int length;
    private int width;
    // constructor
    public rectangle(String color, int length, int width){
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public String toString(){
        return "rectangle[length=" + length + ",width=" + width + "," + super.toString() + "]";
    }
    // Override the inherited getArea() to provide the proper implementation
    @Override
    public double getArea(){
        return length*width;
    }
}
