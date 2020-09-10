package loin;

public class FoodSubtotal extends Caluculate{
    int applesumvalue(int num_apple) {
        int apple_value =super.caluculate(num_apple, 100, "りんご");
        return apple_value;
    }

    int dfsumvalue(int num_df) {
        int df_value =super.caluculate(num_df, 400, "ドラゴンフルーツ");
        return df_value;
    }


    int shakebensumvalue(int num_sb) {
        int sb_value =super.caluculate(num_sb, 390, "しゃけ弁当");
        return sb_value;
    }
}
