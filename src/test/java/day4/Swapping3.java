package day4;

public class Swapping3 {
    public static void main(String[]args){
        int x = 5;
        int y = 6;
        int z = 4;
        System.out.println("Before Swapping the numbers : "+ "x = "+ x +","+ "y = "+ y + ","+"z = "+ z);
        //Applying logic
        x = y;
        y = z;
        z = x;
        System.out.println("After Swapping the numbers : "+ "x = "+ x +","+ "y = "+ y + ","+"z = "+ z);


    }
}
