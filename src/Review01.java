
public class Review01 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        int nedan = 1500;
        int zeiritu = 10;
        int result = taxMethod(nedan,zeiritu);

        System.out.println(nedan + "円のの商品の税込価格は" + (result+nedan) + "円(消費税は" + result + "円)です。");
    }

    public static int taxMethod(int nedan,int zeiritu) {
        int result = nedan * zeiritu / 100;
        return result;
    }

}
