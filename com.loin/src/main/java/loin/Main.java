package loin;
//import java.util.Scanner;
//package 1;
public class Main {
    public static void main(String[] args) {

        // //issue3and4
        // ApplesCount appc = new ApplesCount();
        // Dragonfruit drac = new Dragonfruit();
        // Bento bento = new Bento();
        // CaluculateApple calapp = new CaluculateApple();
        // CaluculateDragonfruit caldf = new CaluculateDragonfruit();
        // CaluculateShakebento calsb = new CaluculateShakebento();
        // Pay pay =  new Pay();

        // int sample_applenum = appc.applenum();
        // int num_dragonfruit = drac.dragonfruitnum();
        // int num_shakebento = bento.shakebentonum();
        // pay.pay_apple(calapp.applesumvalue(sample_applenum), sample_applenum, caldf.dfsumvalue(num_dragonfruit), num_dragonfruit, calsb.shakebensumvalue(num_shakebento), num_shakebento);

        //issue5 refactoring
        Food food = new Food();
        FoodSubtotal foodsubtotal = new FoodSubtotal();
        Pay pay =  new Pay();
        int num_apple = food.applenum();
        int num_dragonfruit = food.dragonfruitnum();
        int num_shakebento = food.shakebentonum();
        int num_mixjuice = food.mixjuicenum();
        // foodsubtotal.applesumvalue(num_apple);
        // foodsubtotal.dfsumvalue(num_dragonfruit);
        // foodsubtotal.shakebensumvalue(num_shakebento);
        pay.pay_apple(foodsubtotal.applesumvalue(num_apple), num_apple, foodsubtotal.dfsumvalue(num_dragonfruit), num_dragonfruit, foodsubtotal.shakebensumvalue(num_shakebento), num_shakebento, foodsubtotal.mixjuicevalue(num_mixjuice), num_mixjuice);
    }
}