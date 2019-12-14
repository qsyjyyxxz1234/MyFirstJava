
public class MyPoint {

    private int x;        //private(只能在同一類別內,若超出範圍則不能存取)
    private int y;        //可加在成員變數、涵式與( *類別(class) )上

    public MyPoint() {      //default constructor(預設的建構子)
        this(5, 6);       //在class(類別)內部呼叫建構子必須用this來呼叫
        //this.x = -11;  //或是
        System.out.println("in MyPoint()");
    }

    MyPoint(int i) {
        //System.out.println("in MyPoint(i)");
        this(i, i);
        System.out.println("in MyPoint(i)");
    }

    MyPoint(int x, int y) {//兩個參數必先執行 建立基礎架構          //constructor建構子(製造/產生物件的涵式)(沒有回傳值)(名稱跟類別名稱一致)
        System.out.println("in MyPoint(i,j)");
        this.x = x;          //this(只能用在涵式裡面/關鍵字)(正在執行程式中的物件)(該物件必須存在)
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int i) {
        x = i;
    }

    public int getY() {
        return y;
    }

    public void setY(int i) {
        y = i;
    }

    public void print() {
        System.out.println("(x,y)@(" + getX() + "," + getY() + ")");
    }

}
