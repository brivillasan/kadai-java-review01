
public class Review01 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        int nedan = 1500;
        int zeiritu = 8;
        int result = tax(nedan,zeiritu);

        System.out.println(nedan + "円の商品の税込価格は" + (result+nedan) + "円(消費税は" + result + "円)です。");
    }

    public static int tax(int nedan,int zeiritu) {
        int result = nedan * zeiritu / 100;
        return result;
    }

}
