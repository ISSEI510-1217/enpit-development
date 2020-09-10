package loin;
//import java.util.Scanner;
//package 1;
public class Main {
    public static void main(String[] args) {
        //issue1
        //Recieved100 re100 = new Recieved100();
        //re100.buy_apple();

        //issue2
        // ApplesCount appc = new ApplesCount();
        // CaluculateApple calapp = new CaluculateApple();
        // Pay pay =  new Pay();
        // int sample_applenum = appc.applenum();
        // pay.pay_apple(calapp.applesumvalue(sample_applenum), sample_applenum);

        //issue3and4
        ApplesCount appc = new ApplesCount();
        Dragonfruit drac = new Dragonfruit();
        Bento bento = new Bento();
        CaluculateApple calapp = new CaluculateApple();
        CaluculateDragonfruit caldf = new CaluculateDragonfruit();
        CaluculateShakebento calsb = new CaluculateShakebento();
        Pay pay =  new Pay();
        int sample_applenum = appc.applenum();
        int num_dragonfruit = drac.dragonfruitnum();
        int num_shakebento = bento.shakebentonum();
        pay.pay_apple(calapp.applesumvalue(sample_applenum), sample_applenum, caldf.dfsumvalue(num_dragonfruit), num_dragonfruit, calsb.shakebensumvalue(num_shakebento), num_shakebento);

    }
}