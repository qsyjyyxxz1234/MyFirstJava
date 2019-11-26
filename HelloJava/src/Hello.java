
public class Hello {

    public static void main(String[] args) {
        System.out.println("hello java");
        int i;                                  //(要求空間) 宣告 declare 一個變數
        i = 10;                                   //(放資料) 指派 asign
        System.out.println(i);
        long L = 12345;
        double d;
        d = 1;
        float f;
        f = 3.14F;                                // 1. F=修飾型態
        f = (float) 3.14;                          // 2. (float)強制轉化
        float ff;
        ff = 1;

        int x = (int) 12345678901L;                // print ?   二進位補數算法
        System.out.println(x);

        System.out.println(d);
        System.out.println(L);
        System.out.println(f);
        System.out.println(ff);

        boolean bbb = true;
        System.out.println(bbb);
        bbb = false;
        System.out.println(bbb);

        char c = '\u1406';
        System.out.println(c);
        char aa = '\'';
        System.out.println(aa);

        int a = 1;
        a = a + 1;
        System.out.print("a=");
        System.out.println(a);

        System.out.println("a=" + a);           // +為串接符號 +前後若為數字 則為加法;若有字元 則為串接

        a += 1;
        System.out.println("a+=1 >>" + a);      //a-=1  a/=1  a*=1  a%=1

        a++;
        System.out.println("a++; >>" + a);

        ++a;
        System.out.println("++a; >>" + a);

        int score = 9;
        if (score > 10) {
            System.out.println("PASS!!");
        } else {
            System.out.println("FAIL!");
        }
        a = 1;
        int b = 2;
        if (a == b) {
            System.out.println("a= =b");
        } else {
            if (a < b) {
                System.out.println("a<b");
            } else {
                System.out.println("a>b");
            }
        }
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("excellent!");
                break;
            case 'B':
                System.out.println("nice!");
                break;
            case 'C':
                System.out.println("so so");
                break;
            default:
                System.out.println("error~");
        }
        double F, C = 50;
        F = C * 9 / 5 + 32;
        System.out.println("F =" + F);

        //java.util.Scanner sc = new java.util.Scanner(System.in);
        //System.out.print("請輸入:");
        //int userChoice = sc.nextInt();
        //System.out.println(userChoice);
        for (int s = 1; s < 10; s = s + 2) {
            System.out.println(s);
        }
        for (int o = 2; o < 12; o = o + 2) {
            System.out.println(o);
        }
        for (int q = 10; q > 0; q = q - 2) {
            System.out.println(q);
        }
        System.out.println("----test----");
        for (int e = 1; e < 10; e++) {                                                 //九九乘法表
            for (int r = 1; r <= e; r++) {                                             //(if r<=e) 
                System.out.printf("%d", e);
                System.out.print("*");
                System.out.printf("%d", r);
                System.out.print("=");
                System.out.printf("%2d", e * r);
                System.out.print("  ");
//                System.out.print(e + "*" + r + "=" + e * r + " ");
            }
            System.out.println(" ");
        }
        for (int t = 5; t < 96; t = t + 10) {
            System.out.println(t);
        }
        for (int u = 1; u < 10; u++) {
            for (int p = 1; p < 10; p++) {
                System.out.print(u + "*" + p + "=" + u * p + " ");
            }
            System.out.println();
        }
        for (int l = 1; l < 11; l++) {
            System.out.println(10 * l - 5 + " ");
        }
        while (b < 11) {
            System.out.println("b=" + b);
            b++;
            if (b == 6) {                                                      //中斷執行
                //continue 略過
                java.util.Scanner sc = new java.util.Scanner(System.in);
                System.out.println("請輸入: ");
                int input = sc.nextInt();
                System.out.println("input=" + input);

                for (int g = 1; 1 <= input; g++) {
                    //System.out.println(g);
                }
                break;
                
            }
        }
    }
}
