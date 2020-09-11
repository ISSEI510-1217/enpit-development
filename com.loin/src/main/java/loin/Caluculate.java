package loin;

public class Caluculate {
    int caluculate(int num, int value, String foodname){
        int sumvalue = num * value;
        System.out.println(foodname + num + "個の値段は" + sumvalue + "円です");
        return sumvalue;
    }
}