package loin;
import java.util.Scanner;

//sum_value = "りんごの合計金額"
//sum_apple = "りんごの合計個数"
//change = "お釣り"
//num1 = "入金金額"

class Pay{
    int num1; 
    int all_value;
    void pay_apple(int sum_apple_value, int sum_apple, int sum_df_value, int sum_df, int sum_sb_value, int sum_sb, int sum_mj_value, int sum_mj) {
        Scanner scanner = new Scanner(System.in);
        all_value = sum_apple_value + sum_df_value + sum_sb_value + sum_mj_value;
        System.out.print("合計金額は" + all_value + "円です\n");
        while(true){
            System.out.print(all_value + "円を入れてください: ");
            num1 = scanner.nextInt();
            if(num1 > all_value) {
                System.out.println("りんごを" + sum_apple + "個購入しました");
                System.out.println("ドラゴンフルーツを" + sum_df + "個購入しました");
                System.out.println("しゃけ弁当を" + sum_sb + "個購入しました");
                System.out.println("ミックスジュース" + sum_mj + "杯購入しました");
                int change = num1 - all_value;
                System.out.println("お釣りが" + change + " 円です");
                break;
            } else if(num1 == all_value) {
                System.out.println("りんごを" + sum_apple + "個購入しました");
                System.out.println("ドラゴンフルーツを" + sum_df + "個購入しました");
                System.out.println("しゃけ弁当を" + sum_sb + "個購入しました");
                System.out.println("ミックスジュース" + sum_mj + "杯購入しました");
                System.out.println("お釣りはありません");
                break;
            } else {
                System.out.println("お金が足りません");
            }
        }
    }

    int num1_getter() {
        return num1;
    }

    int  all_value_getter() {
        return all_value;
    }
}