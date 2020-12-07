public class SeatingChart
{
    private String[][] names;
    
    public SeatingChart()
    {
       names = new String[][] {{null, "Dylan","Lyrik", "Chase", "Soland", null, "Conner", "Devin"},{"Anthony", "Nicole", "Peyton", "Cole", "Ishika", "Helen", "Garrett", "Preston"}, {"Chandan", "Sallah", "Gabe", "Seth", "Chase", "Makayla", "Alec", "Addi"}, {null, null, "Brett", "Fox", "Camron","Matt", "Bailey", "Rohin"}};
    }
    public void printmyArray(){
        for(int r = 0; r < names.length; r++){
            for(int c = 0; c < names[0].length; c++){
                System.out.print(names[r][c] + " ");
            }
            System.out.println();
        }
}

    public int getClassNum()
{   int totalClass = 0;    
    for(int r = 0; r < names.length; r++){
            for(int c = 0; c < names[0].length; c++){
                if(names[r][c] == null){
                    totalClass=totalClass;
                }
                else {
                    totalClass++;
                }               
    
}
}
return totalClass;
}

public int countC(){
    int total = 0;
    for(int r = 0; r < names.length; r++){
            for(int c = 0; c < names[0].length; c++){
                if(names[r][c].startsWith("C")){
                total++;
            }
            }   
            }
            return total;            
}

public void changeCs(String n){
for(int r = 0; r < names.length; r++){
            for(int c = 0; c < names[0].length; c++){
                if(names[r][c].startsWith("C")){
                names[r][c].replace(names[r][c], n);
            }
            }   
            }
}
}



    