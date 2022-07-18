import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age:");
        int age = scanner.nextInt();

        if(age>=18){
            System.out.println("You can buy alcohol");
        }else {
            System.out.println("You are too young to buy alcohol");
        }

        if(age == 100){
            System.out.println("Woow you have 100 years");
        }

        System.out.println(age+2);
        System.out.println(age-2);
        System.out.println(age*2);
        System.out.println(age/2);
        System.out.println(age%2);

        if(age%2 == 0){
            System.out.println("This number divisible by two");
        } else {
            System.out.println("This number is not divisible by two");
        }
    }
}
