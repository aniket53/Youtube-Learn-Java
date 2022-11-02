import java.util.Scanner;

public class Exercise2Solutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        1st
//        int sum=0;
//        for(int i=1;i<=10;i++){
//            sum+=i;
//        }
//        System.out.println("Sum: "+sum);

//        2nd

//        int num;
//        System.out.println("Enter any positive number: ");
//        num=sc.nextInt();
//
//        System.out.println("Multiplication table of "+num);
//        for(int i=1;i<=10;i++){
//            System.out.println(num+" x "+i+" = "+(num*i));
////            2 x 1 = 2
//        }

//        3rd
//        5!=5*4*3*2*1
//        int num;
//        int fact =1;
//        System.out.println("Enter a number: ");
//        num=sc.nextInt();
//
//        for(int i=1;i<=num;i++){
//            fact*=i;
//        }
//        System.out.println("Factorial is: "+fact);

//        4th
//        int number;
//        int reverse =0;
//
//        System.out.println("Enter the number: ");
//        number=sc.nextInt();
//
//        int temp=number;
//        int remainder =0;
//
//        while (temp>0){
//            remainder = temp%10;
//            reverse =reverse *10+remainder;
//            temp/=10; //temp=temp/10;
//        }
//        System.out.println("Reverse of "+number+" is "+ reverse);

//        5th
//        0 1 1 2....
        int number;
        int firstTerm=0,secondTerm=1,thirdTerm;

        System.out.println("Enter the number of terms you want in the series :");
        number=sc.nextInt();

        System.out.print(firstTerm+ " "+secondTerm+" ");

        for (int i=3;i<=number;i++){
            thirdTerm=firstTerm+secondTerm;
            System.out.print(thirdTerm+" ");
            firstTerm=secondTerm;
            secondTerm=thirdTerm;
        }
    }
}


