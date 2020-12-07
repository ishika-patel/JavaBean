public class Rectangle 
{
    //instance variables
    private int length;
    private int width;
    
    //Constructor
    public Rectangle(int len, int w){
        length = len;
        width = w;
    }
    
    //Accessor method
    public int getPerimeter(){
        return 2 * (length + width);
    }
    
    //Accessor method
    public int getArea(){
        return length * width;
    }
    
    //mutator method
    public void setDimensions(int len, int w){
        length = len;
        width = w;
    }
}
