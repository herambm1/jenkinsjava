import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println("Current date and time: " + today);
        System.out.println("Hello from Jenkins build!");

        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + sum);

        String[] fruits = {"Apple", "Banana", "Mango"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
