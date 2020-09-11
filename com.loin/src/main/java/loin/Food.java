package loin;
public class Food extends Item  {
    int applenum() {
        int num = super.itemcount("りんご");
        return num;
    }

    int dragonfruitnum() {
        int num = super.itemcount("ドラゴンフルーツ");
        return num;
    }

    int shakebentonum() {
        int num = super.itemcount("しゃけ弁当");
        return num;
    }
}