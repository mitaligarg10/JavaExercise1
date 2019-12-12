import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        float principle,rate,time,sinterest;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        principle = scanner.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        rate = scanner.nextFloat();
        System.out.print("Enter the Time period : ");
        time = scanner.nextFloat();
        sinterest= (principle*rate*time)/100;
        System.out.print("Simple Interest is : " +sinterest );

    }
}
