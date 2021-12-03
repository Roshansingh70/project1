import java.util.Scanner;
public class javafunction {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter first no : ");
            int first = scan.nextInt();
            System.out.println("enter second no : ");
            int second = scan.nextInt();
            int result = first + second;
            System.out.println("sum is :" + result);
            System.out.println("do you want continue (y/n) ?");
            ch = scan.next().toLowerCase().charAt(0);
        } while (ch == 'y');
    }
}