package loin;

import java.util.Scanner;

class Pay {
    int num1;
    int num2;
    int all_value;
    int change;

    void pay_apple(int sum_apple_value, int sum_apple, int sum_df_value, int sum_df, int sum_sb_value, int sum_sb,
            int sum_mj_value, int sum_mj) {
        Scan scan = new Scan();
        all_value = sum_apple_value + sum_df_value + sum_sb_value + sum_mj_value;
        System.out.print("合計金額は" + all_value + "円です\n");
        while (true) {
            System.out.print(all_value + "円を入れてください: ");
            num1 = scan.scan();
            if (num1 >= all_value) {
                change = num1 - all_value;
                break;
            } else {
                System.out.println("お金が" + (all_value - num1) + "円足りません");
                System.out.print("支払いを続けますか？ yes→1/no→0:");
                num2 = scan.scan();
                switch(num2){
                    case 1:
                        break;
                    case 0:
                        System.out.println("買い物を終了します");
                        System.exit(0);
                }
            }
        }

        System.out.println("—————  レシート  ——————");
        if (sum_apple != 0) {
            System.out.printf("りんご　　　　　　%d個　　%d円\n", sum_apple, sum_apple_value);
        }
        if (sum_df != 0) {
            System.out.printf("ドラゴンフルーツ  %d個　　%d円\n", sum_df, sum_df_value);
        }
        if (sum_sb != 0) {
            System.out.printf("しゃけ弁当　　　　%d個　　%d円\n", sum_sb, sum_sb_value);
        }
        if (sum_mj != 0) {
            System.out.printf("ミックスジュース　%d個　　%d円\n", sum_mj, sum_mj_value);
        }
        System.out.print("\n");
        System.out.printf("[合計] 　　　　  %d円\n", all_value);
        System.out.printf("[お預かり金額]　　%d円\n", num1);
        System.out.printf("[お釣り]　　　　　%d円\n", change);
        System.out.println("———————————————————————");

    }

    int num1_getter() {
        return num1;
    }

    int all_value_getter() {
        return all_value;
    }
}