import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("What is your name?\n: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
