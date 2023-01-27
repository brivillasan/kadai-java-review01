
public class kadai_java {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int nedan = 1500;
        int zeiritu = 10;
        int syohizei = nedan / zeiritu;

        int result = add(nedan,syohizei);

        System.out.println(nedan + "円のの商品の税込価格は" + result + "円(消費税は" + syohizei + "円)です。");
    }

    public static int add(int nedan,int syohizei) {
        int result = nedan + syohizei;
        return result;
    }


}
