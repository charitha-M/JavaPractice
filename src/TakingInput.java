import java.util.Scanner;

public class TakingInput {
    public void displayUserInput(){
        System.out.println("Taking Input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        System.out.println("Sum "+ sum);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Name "+name);
        sc.nextLine();
        System.out.println("Enter your address");
        String address = sc.nextLine();
        System.out.println("Address "+address);

        //decrement and increment operators
        int i = 2;
        System.out.println(i++);
        System.out.println(++i);
        char ch = 'A';
        System.out.println(++ch);
        System.out.println(ch++);
        System.out.println(ch);
    }
}
