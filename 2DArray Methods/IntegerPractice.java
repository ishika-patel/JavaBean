

public class IntegerPractice
{
    // instance variables 
    private int[][] myArray;
    
    //default constructor
    public IntegerPractice()
    {
        myArray = new int[][] {{2,10,7},{12,0,3},{4,5,16},{19,20,2}};
    }
    
    //create methods below
    public void printMyArray() {
        for(int r = 0; r<myArray.length; r++){
            for(int c=0; c<myArray[0].length; c++){
                System.out.print(myArray[r][c] +" ");    
}
System.out.println("");
}    
}

public int getRow(){
    return myArray.length;
}

public int getColumn() {
    return myArray[0].length;
}

public int getUnder10() {
    int total = 0;
    for(int r = 0; r<myArray.length; r++){
            for(int c=0; c<myArray[0].length; c++){
                if (myArray[r][c]<10) {
                    total++;
                }
                    
}
}
    return total;
}

public void multiplyMyArray(int scalar){
    for(int r = 0; r<myArray.length; r++){
            for(int c=0; c<myArray[0].length; c++){
                myArray[r][c] *= scalar;
}
}
}

public void switchRows(){   
    int[] firstMyArray = myArray[0];
    myArray[0] = myArray[1];
    myArray[1] = firstMyArray;
}
}


    