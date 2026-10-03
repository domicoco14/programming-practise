/** Question
 * Consider the following series of integer values
 * 
 * 99   88   77     66      ...     11
 * 
 * Write a javaa program using the "for" construct to generate and compute
 * the sum, sum of of square of each number and the average of the numbers
 * omitting all numbers that are divisible by 5 in the set
 */


public class ClassForTask {
    public static void main (String [] args){

        int sum = 0;
        Double Average;
        int count = 0;
        int SquareofSum = 0;

        for (int i = 99; i >= 11; i = i - 11){
            if (i % 5 != 0) {
                sum = sum + i;
                SquareofSum = SquareofSum + (i * i);
                count = count + 1;
                
                Average = sum / (double) count;
                System.out.println("\ni = " + i + "\nSum: " + sum + "\n Sum Of Square: " + SquareofSum + "\n Average is: " + Average);
            } 
        }                                                      

    }

}

