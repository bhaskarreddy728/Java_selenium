package day5;

public class Particularstring {
    public static void main(String[] args) {
        String names[] = {"Bhaskar", "Ujwal", "Amrutha", "Sachi", "Sanpa"};
        for (String str :names) {
            if(str.equalsIgnoreCase("amrutha")){
                System.out.println(str);
            }
          else{
              System.out.println("Not found");
            }
        }
    }
}

