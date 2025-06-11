//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
       //Sword s = new Sword();
       //s.name = "炎の剣";
       //s.damage = 10;
        Hero h1 = new Hero("ミナト");
        //h1.name = "ミナト";
        System.out.println(h1.hp);
        System.out.println(h1.name);
       /*Hero h2 = new Hero();
        h2.name = "アサカ";
        h2.hp = 100;
        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;

        System.out.println("現在のぶきは" + h.sword.name);*/
        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';


        /*System.out.println("勇者" + h.name + "を生み出しました！");
        h.sit(5);
        h.slip();
        h.sit(25);
        h.run();
        h.slip();
        Hero h1;*/

    }
}