
public class MyPoint {

    private int x;                                                  //private(只能在同一類別內,若超出範圍則不能存取)
    private int y;                                                  //可加在成員變數、涵式與( *類別(class) )上

    public MyPoint(int x, int y) {                                  //constructor建構子(製造/產生物件的涵式)(沒有回傳值)(名稱跟類別名稱一致)
        System.out.println("in MyPoint()");
        this.x = x;                                                 //this(只能用在涵式裡面/關鍵字)(正在執行程式中的物件)
        this.y = y;
        //print();
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
        System.out.println("(x,y)@(" + this.x + "," + this.y + ")");
    }

}
