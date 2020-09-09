//購入者は100円玉を1つ渡す
import java.util.Scanner;

class Recieved100{
    void buy_apple(int num1) {
        //100円入れたら, りんごがもらえる。
        if(num1 == 100){
            System.out.println("りんごを1つ購入しました。");
        } else {
            System.out.println("硬貨が違います。");
        }
    }
}