//購入者は100円玉を1つ渡す
import java.util.Scanner;

public class recieved100{
    public static void main(String[] args) {
        //100円入れたら, りんごがもらえる。
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("100円玉を入れてください: ");
            int num1 = scanner.nextInt();
            if(num1 == 100){
                System.out.println("りんごを1つ購入しました。");
                break;
            } else {
                System.out.println("硬貨が違います。");
            }
        }
    }
}

