import java.io.IOException;
import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        int arr[][] = {{2, 8, 5}, {6, 4, 10}, {12, 7, 16}};

        for (int i = 0; i < 3; i++) {
            boolean isPrime = true;
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }



        /*Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number : ");*/
        //System.out.println("Prime Numbers in the array are : " + arr[0][0] + " " + arr[0][2] + " " + arr[2][1]);


    }
}
