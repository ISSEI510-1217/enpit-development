package loin;

public class Item {
    int itemcount(String foodname, String unit) {
        Scan scan = new Scan();
        System.out.print(foodname + "何" + unit + "買いますか？: ");
        int num = scan.scan();
        return num;
    }
}