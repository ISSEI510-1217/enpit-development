import java.util.Scanner;

//sum_value = "りんごの合計金額"
//sum_apple = "りんごの合計個数"
//change = "お釣り"
//num1 = "入金金額"

class Pay{
    void pay_apple(int sum_value, int sum_apple) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print(sum_value + "円を入れてください: ");
            int num1 = scanner.nextInt();
            if(num1 > sum_value) {
                System.out.println("りんごを" + sum_apple + "個購入しました");
                int change = num1 - sum_value;
                System.out.println("お釣りが" + change + " 円です");
                break;
            } else if(num1 == sum_value) {
                System.out.println("りんごを" + sum_apple + "個購入しました");
                System.out.println("お釣りはありません");
                break;
            } else {
                System.out.println("お金が足りません");
            }
        }
    }
}