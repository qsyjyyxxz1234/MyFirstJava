
public class test1 {

    static int hello(int a, int b, char c) {                                     //定義口號
        int i = 20;
        int total = 0;
        for (int j = a; j <= b; j++) {
            System.out.print(c + " ");
            total = total + j;
        }
        System.out.println("in result is ,total =" + total);
        return total;
    }

    public static void main(String[] args) {

        int result = hello(2, 8, '*');                                            //呼叫口號       
        hello(3, 7, '!');
        double d = Math.random();
        System.out.println("d =" + d++ * 1000 % 42 + 1);
        int[] data = new int[6];
        for (int o = 1; o < 6; o++) {                                            //.length
            data[o] = ((int) (Math.random() * 100)) % 42 + 1;
            System.out.println("data[" + o + "] =" + data[o]);
        }
        //data[0] = ((int) (Math.random() * 100)) % 42 + 1;
        //data[1] = ((int) (Math.random() * 100)) % 42 + 1;
        //data[2] = ((int) (Math.random() * 100)) % 42 + 1;
        //data[3] = ((int) (Math.random() * 100)) % 42 + 1;
        //data[4] = ((int) (Math.random() * 100)) % 42 + 1;
        //data[5] = ((int) (Math.random() * 100)) % 42 + 1;

    }
}
