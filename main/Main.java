import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Recieved100 re100 = new Recieved100();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("100円玉を入れてください: ");
            int num1 = scanner.nextInt();
            re100.buy_apple(num1);
        }
    }
}