import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Input mode value: (1 is metric) (2 is inches + pounds) (3 is inches + feets + pounds): ");

        int modeIndex = input.nextInt();

        while(modeIndex < 1 || modeIndex > 3){
            System.out.println("Incorrect value, try to use value in range of 1-3!");
            System.out.println();
            System.out.print("Input mode value: (1 is metric) (2 is inches + pounds) (3 is inches + feets + pounds): ");
            
            modeIndex = input.nextInt();
        }

        switch (modeIndex) {
        case 1:
            System.out.println("BMI Calculator mode set to metric, lets start!");
            BMICalc();
            break;
        case 2:
            System.out.println("BMI Calculator mode set to inches + pounds, lets start!");
            BMICalcBonus1();
            break;
        case 3:
            System.out.println("BMI Calculator mode set to inches + feets + pounds, lets start!");
            BMICalcBonus2();
            break;
        }
    }

    public static void BMICalc() {
        Scanner input = new Scanner(System.in);

        double height, weight, BMI;

        System.out.print("Your height in m: ");

        height = input.nextDouble();

        System.out.print("Your weight in kg: ");

        weight = input.nextDouble();

        BMI = weight / (height * height);

        System.out.println();
        System.out.println("Your BMI is " + BMI);
    }

    public static void BMICalcBonus1() {
        Scanner input = new Scanner(System.in);

        double height, weight, BMI;

        System.out.print("Your height in inches: ");

        height = input.nextDouble();

        System.out.print("Your weight in pounds: ");

        weight = input.nextDouble();

        //weight (lb) / [height (in)]^2 x 703
        BMI = weight * (703 / (height * height));

        System.out.println();
        System.out.println("Your BMI is " + BMI);
    }

    public static void BMICalcBonus2() {
        Scanner input = new Scanner(System.in);

        double height, heightFeet, heightInches, weight, BMI;

        System.out.print("Your height (feet only): ");

        heightFeet = input.nextDouble();

        System.out.print("Your height (inches): ");

        heightInches = input.nextDouble();

        System.out.print("Your weight in pounds: ");

        weight = input.nextDouble();

        //d(″) = d(ft) × 12
        height = heightFeet * 12 + heightInches;

        //weight (lb) / [height (in)]^2 x 703
        BMI = weight * (703 / (height * height));

        System.out.println();
        System.out.println("Your BMI is " + BMI);
    }
}