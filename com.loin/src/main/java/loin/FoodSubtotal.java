package loin;

public class FoodSubtotal extends Caluculate{
    int applesumvalue(int num_apple) {
        int apple_value =super.caluculate(num_apple, 100, "りんご", "個");
        int apple_discount = super.discount(num_apple, 3, 20);
        int apple_tax = super.consumptionTax(apple_value,8);
        return apple_value - apple_discount + apple_tax;
    }

    int dfsumvalue(int num_df) {
        int df_value =super.caluculate(num_df, 400, "ドラゴンフルーツ", "個");
        int df_tax = super.consumptionTax(df_value,8);
        return df_value + df_tax;
    }


    int shakebensumvalue(int num_sb) {
        int sb_value =super.caluculate(num_sb, 390, "しゃけ弁当", "個");
        int sb_tax = super.consumptionTax(sb_value,8);
        return sb_value + sb_tax;
    }

    int mixjuicevalue(int num_mj) {
        int mj_value =super.caluculate(num_mj, 550, "ミックスジュース", "杯");
        int mj_tax = super.consumptionTax(mj_value,8);
        return mj_value + mj_tax;
    }
}
