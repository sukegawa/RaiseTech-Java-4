import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Menuクラスをインスタンス化してArrayListを作成、追加
        List<Menu> foodMenu = new ArrayList<>();
        foodMenu.add(new Menu("ピクルス", 300));
        foodMenu.add(new Menu("牛筋の煮込み", 700));
        foodMenu.add(new Menu("ポテトサラダ", 450));
        foodMenu.add(new Menu("炙り〆鯖", 700));

        System.out.println("値段の安い順にフードを並び変える");
        //priceでソートするためにMenuクラスのComparatorを作成、変数に宣言
        Comparator<Menu> priceComp = Comparator.comparing(Menu::getPrice);
        //priceを昇順でソート、要素を取得し必要な記載を追加、それぞれ出力する。
        foodMenu.stream().sorted(priceComp).map(menu -> menu.getFood() + "　" + menu.getPrice() + "円").forEach(System.out::println);

        System.out.println("この中に500円以上のフードがあるか？");
        //priceに500以上の数値が含まれているか判定し、結果を出力
        System.out.println(
                foodMenu.stream().anyMatch(menu -> menu.getPrice() >= 500));

        System.out.println("500円以上のメニューは");
        //filter中間操作で500円以上の要素を抽出、foodを取得しそれぞれ出力する。
        foodMenu.stream().filter(menu -> menu.getPrice() >= 500).map(Menu::getFood).forEach(System.out::println);
    }
}
