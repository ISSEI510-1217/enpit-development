package loin;

//import java.util.Scanner;
//package 1;
public class Main {
    public static void main(String[] args) {

        // //issue3and4
        // ApplesCount appc = new ApplesCount();
        // Dragonfruit drac = new Dragonfruit();
        // Bento bento = new Bento();
        // CaluculateApple calapp = new CaluculateApple();
        // CaluculateDragonfruit caldf = new CaluculateDragonfruit();
        // CaluculateShakebento calsb = new CaluculateShakebento();
        // Pay pay = new Pay();

        // int sample_applenum = appc.applenum();
        // int num_dragonfruit = drac.dragonfruitnum();
        // int num_shakebento = bento.shakebentonum();
        // pay.pay_apple(calapp.applesumvalue(sample_applenum), sample_applenum,
        // caldf.dfsumvalue(num_dragonfruit), num_dragonfruit,
        // calsb.shakebensumvalue(num_shakebento), num_shakebento);

        // issue5 refactoring
        Scan scan = new Scan();
        Food food = new Food();
        FoodSubtotal foodsubtotal = new FoodSubtotal();
        Pay pay = new Pay();
        boolean flag = true;
        int num_apple = 0;
        int num_dragonfruit = 0;
        int num_shakebento = 0;
        int num_mixjuice = 0;
        while (flag) {
            System.out.println("—————  メニュー  ——————");
            System.out.println("1. りんご　　　　　　100円");
            System.out.println("2. ドラゴンフルーツ  400円");
            System.out.println("3. しゃけ弁当　　　　390円");
            System.out.println("4. ミックスジュース　550円");
            System.out.print("\n");
            System.out.println("0. 会計");
            System.out.print("\n");
            System.out.println("[割引情報]");
            System.out.println("りんご3個で20円割引");
            System.out.println("———————————————————————");
            System.out.print("番号を入力して、商品を選ぶか会計をしてください : ");

            int number = scan.scan();
            switch (number) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    num_apple += food.applenum();
                    break;
                case 2:
                    num_dragonfruit += food.dragonfruitnum();
                    break;
                case 3:
                    num_shakebento += food.shakebentonum();
                    break;
                case 4:
                    num_mixjuice += food.mixjuicenum();
                    break;
            }
        }
        
        // System.out.println("りんごは3個毎に20円引きです");
        // foodsubtotal.applesumvalue(num_apple);
        // foodsubtotal.dfsumvalue(num_dragonfruit);
        // foodsubtotal.shakebensumvalue(num_shakebento);
        pay.pay_apple(foodsubtotal.applesumvalue(num_apple), num_apple, foodsubtotal.dfsumvalue(num_dragonfruit),
                num_dragonfruit, foodsubtotal.shakebensumvalue(num_shakebento), num_shakebento,
                foodsubtotal.mixjuicevalue(num_mixjuice), num_mixjuice);
    }
}