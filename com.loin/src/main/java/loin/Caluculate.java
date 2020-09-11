package loin;

public class Caluculate {
    int caluculate(int num, int value, String foodname, String unit) {
        int sumvalue = num * value;
        // System.out.println(foodname + num + unit + "の値段は" + sumvalue + "円です");
        return sumvalue;
    }

    int discount(int num, int disc_num, int disc_value) {
        int dis_apple = (num / disc_num) * disc_value;
        // System.out.println("りんごが" + num + "個なので" + dis_apple + "円引きです");
        return dis_apple;
    }
    
    int consumptionTax(int value, int rate) {
        double tax = Math.ceil( (double)value * rate/100);
        return (int)tax;
    }
    
}
