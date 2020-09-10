package loin;
//購入者は100円玉を1つ渡す
//package 1;
import java.util.Scanner;

class Recieved100{
    void buy_apple() {
        //100円入れたら, りんごがもらえる。
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("100円玉を入れてください: ");
            int num1 = scanner.nextInt();
            if(num1 == 100){
                System.out.println("りんごを1つ購入しました。");
            } else {
                System.out.println("硬貨が違います。");
            }
        }
    }
}