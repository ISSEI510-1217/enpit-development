package loin;

public class Item {
    int itemcount(String foodname) {
        Scan scan = new Scan();
        System.out.print(foodname + "いくつ買いますか？: ");
        int num = scan.scan();
        return num;
    }
}