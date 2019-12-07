
//import java.awt.Point;
//import java.awt.geom.Point2D;

class car {

    double price; //屬性類(宣告變數)----非功能
    int volume;
    String brand;
    int speed;

    void speedup() {    //功能
        speed = speed + 10;
    }

    void slowdown() {
        speed -=10;
    }
}

public class Object {

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2);
        //p1.setX(12);
        //p1.setY(7);
        //System.out.println("p1.x " + p1.getX());
        //System.out.println("p1.y " + p1.getY());
        p1.print();
//        car c1 = new car();     //car=類別名 c1=變數名 //car c1(第一個物件) car c2(第二個物件)
//        c1.brand = "Toyota";
//        c1.price = 750000;
//        c1.volume = 3000;
//        System.out.println("c1.brand = " + c1.brand);
//        System.out.println("c1.price = " + c1.price + "$");
//        System.out.println("c1.volume = " + c1.volume + "c.c.");
//        System.out.println("c1.speed = " + c1.speed);
//        c1.speedup();
//        c1.speedup();
//        System.out.println("c1.speed = " + c1.speed);
//        c1.slowdown();
//        c1.slowdown();
//        System.out.println("c1.speed = " + c1.speed);
//        car c2 = new car();
//        c2.brand = "Suzuki";
//        c2.price = 780000;
//        c2.volume = 3000;
//        System.out.println("c2.brand = " + c2.brand);
//        System.out.println("c2.price = " + c2.price + "$");
//        System.out.println("c2.volume = " + c2.volume + "c.c.");
//        System.out.println("c2.speed = " + c2.speed);

//        Point p2 = new Point(6, 8);
//        System.out.println("" + p2.toString());
//
//        Point2D p3 = new Point(5, 6);
//        System.out.println("" + p3.toString());
    }

}
