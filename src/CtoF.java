import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        String trash = "";
        double cValue = 0;
        double fValue = 0;

        do{
            System.out.print("Enter the temp in C you want converted to F: ");
            if(in.hasNextDouble()){
                cValue = in.nextDouble();
                in.nextLine();
                done = true;
                fValue = ((cValue*(9.0/5))+32.0);
                System.out.println(cValue + " converted to F is " + fValue + " degrees");
            } else{
                trash = in.nextLine();
                System.out.println("Please enter a valid temp in C, not " + trash);
            }
        }while(!done);
    }
}
