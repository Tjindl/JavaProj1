import java.util.Scanner;

public class LearningStars {



    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int packageNumber;
        int coursesEnrolledIn;
        PackageOne p1;
        PackageTwo p2;
        PackageThree p3;
        double cost;


        System.out.println("Hello!, Welcome to LearningStars.");
        System.out.println("LearningStars is the world leader in middle school grade boosting!");
        System.out.println("We currently have three packages : ");
        System.out.println("");
        System.out.println("");
        System.out.println("PackageOne :");
        System.out.println("BaseCost : 10$");
        System.out.println("Number of courses included : 2");
        System.out.println("Cost per additional course : 6$");
        System.out.println("");
        System.out.println("");
        System.out.println("PackageTwo :");
        System.out.println("BaseCost : 12$");
        System.out.println("Number of courses included : 4");
        System.out.println("Cost per additional course : 4$");
        System.out.println("");
        System.out.println("");
        System.out.println("PackageThree :");
        System.out.println("BaseCost : 15$");
        System.out.println("Number of courses included : 6");
        System.out.println("Cost per additional course : 3$");

        System.out.println("Kindly enter a package number you want to enrol in...");
        packageNumber = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("How many courses are you already enrolled in? (0 if none)");
        coursesEnrolledIn = keyboard.nextInt();
        keyboard.nextLine();

        if (packageNumber == 1) {
            p1 = new PackageOne();
            cost = p1.costCalculator(coursesEnrolledIn);
            System.out.println("Your total cost is $" + cost);
        } else if (packageNumber == 2) {
            p2 = new PackageTwo();
            cost = p2.costCalculator(coursesEnrolledIn);
            System.out.println("Your total cost is $" + cost);
        } else if (packageNumber == 3){
            p3 = new PackageThree();
            cost = p3.costCalculator(coursesEnrolledIn);
            System.out.println("Your total cost is $" + cost);
        } else {
            System.out.println("InvalidInput!!");
        }
    }
}
