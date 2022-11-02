import java.util.Scanner;
public class BMICalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in pounds:");
        double weight = input.nextDouble();

        System.out.println("Enter your height in inches:");
        double inches = input.nextDouble();

        double BMI = weight * 0.4535/(inches*0.0254*inches*0.0254);
        System.out.println("Your BMI will be: "+BMI);
    }
}
