package loin;
//ドラゴンフルーツの購入

//num_dragonfruit = ドラゴンフルーツの個数

import java.util.Scanner;
public class Dragonfruit {
    int dragonfruitnum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ドラゴンフルーツいくつ買いますか？: ");
        int num_dragonfruit = scanner.nextInt();
        return num_dragonfruit;
    }
}