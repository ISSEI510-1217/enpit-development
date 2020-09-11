package loin;

public class Caluculate {
    int caluculate(int num, int value, String foodname, String unit) {
        int sumvalue = num * value;
        System.out.println(foodname + num + unit + "の値段は" + sumvalue + "円です");
        return sumvalue;
    }
}