//import java.util.Scanner;
//package 1;
public class Main {
    public static void main(String[] args) {
        //issue1
        //Recieved100 re100 = new Recieved100();
        //re100.buy_apple();

        //issue2
        ApplesCount appc = new ApplesCount();
        CaluculateApple calapp = new CaluculateApple();
        // calapp.applesumvalue(appc.applenum());
        Pay pay =  new Pay();
        int sample_applenum = appc.applenum();
        pay.pay_apple(calapp.applesumvalue(sample_applenum), sample_applenum);
    }
}