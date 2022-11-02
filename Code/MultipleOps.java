import java.util.Scanner;
public class MultipleOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstInt=sc.nextInt();
        System.out.println("Enter the second number:");
        int secondInt=sc.nextInt();

        int sum=firstInt+secondInt;
        System.out.println("Sum will be: "+sum);

        int subs =firstInt-secondInt;
        System.out.println("Difference will be: "+subs);

        int product=firstInt*secondInt;
        System.out.println("Product will be: "+product);

        int avg=(firstInt+secondInt)/2;
        System.out.println("Average will be: "+avg);
    }
}
