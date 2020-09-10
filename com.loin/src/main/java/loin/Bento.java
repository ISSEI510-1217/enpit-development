package loin;
//しゃけ弁当の購入

//num_shakebento = しゃけ弁当の個数

import java.util.Scanner;
public class Bento {
    int shakebentonum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("しゃけ弁当いくつ買いますか？: ");
        int num_shakebento = scanner.nextInt();
        return num_shakebento;
    }
}