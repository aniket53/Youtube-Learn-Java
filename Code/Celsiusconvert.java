import java.util.Scanner;

public class Celsiusconvert {
    public static void main(String[] args) {
//        C=(5(F-32))/9
        Scanner input = new Scanner(System.in);
        System.out.println("Input a degree in Fah.");
        double fah =input.nextDouble();

        double celsius = ((5*(fah -32.0))/9.0);
        System.out.println(fah+" "+ "degree Fah. is equal to "+celsius+" in celsius");

    }
}
