import java.util.Scanner;
public class PrimeNumbers{
    public static void main (String[] args){
        int[][] array = new int [2][2];
        Scanner in = new Scanner (System.in);

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<2; i++)
        for(int m=0;m<2;m++)
        {
            array[i][m] = in.nextInt();
        }
        //loop through the numbers one by one
        for(int i=0; i<array.length; i++)
        for(int m=0; m<array.length; m++){
            boolean isPrime = true;

            //check to see if the numbers are prime
            for (int j=2; j<array[i][m]; j++) {
                if (array[i][m] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            //print the number
            if(isPrime)

                System.out.println("["+i + ","+ m+"] " +" are the prime numbers in the array ");
        }
    }
}