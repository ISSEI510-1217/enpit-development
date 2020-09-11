package loin;
public class Food extends Item  {
    int applenum() {
        int num = super.itemcount("りんご", "個");
        return num;
    }

    int dragonfruitnum() {
        int num = super.itemcount("ドラゴンフルーツ", "個");
        return num;
    }

    int shakebentonum() {
        int num = super.itemcount("しゃけ弁当", "個");
        return num;
    }

    int mixjuicenum() {
        int num = super.itemcount("ミックスジュース", "杯");
        return num;
    }

}