package day4;

public class Swapping2 {
    public static void main(String[]args){
        int x = 10;
        int y = 8;
        System.out.println("Before Swapping the numbers : "+ "x = "+ x +","+ "y = "+ y);
        //Applying logic
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("Before Swapping the numbers : "+ "x = "+ x +","+ "y = "+ y);
    }
}
