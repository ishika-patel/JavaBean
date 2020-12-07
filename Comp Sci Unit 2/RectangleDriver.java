public class RectangleDriver {
    public static void main(String[] args)
    {
        //creating an object that has the parameter
        Rectangle myRectangle = new Rectangle(3,8);
        
        myRectangle.setDimensions(5,5);
        
        int per = myRectangle.getPerimeter();
        int area =myRectangle.getArea();
        
        System.out.println("The rectangle has a perimeter of " + per + " and area of " + area);
        
    }
}
