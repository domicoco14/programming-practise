import java.util.Scanner;

public class SumAverage { // A program to get the SUm and Average of 4 numbers 
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Collect the first two numbers
        System.out.println("Enter the numbers; ");
        int j= console.nextInt();
        int a = console.nextInt();
        Double v = console.nextDouble();
        Double A = console.nextDouble();

        Double Sum =  j + a + v + A;
        Double Average  = Sum / 4;

        System.out.println("The Sum of the 4 numbers is " + Sum + " and \n the Average of the 4 numbers is " + Average);

    }  // end of main
    
} // end of SumAverage Class
