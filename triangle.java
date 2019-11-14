
package latihan4;
public class triangle extends shape{
    // private member variables
    private int base;
    private int height;
    // constructor
    public triangle (String color, int base, int height){
        super(color);
        this.base = base;
        this.height = height;
    }
    @Override
    public String toString(){
        return "triangle[base=" + base + ",height=" + height + " , "
                + super.toString() + "]";
    }
    // Override the inherited gerArea()
    @Override
    public double getArea() {
        return 0.5*base*height;
    }
}
