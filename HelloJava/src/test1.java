
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
        int[] data = new int[6];//陣列Array
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
        int[][] xyz = new int[2][];
        xyz[0] = new int[9];
        xyz[0][8] = 1;
        System.out.println("[0][8]=" + xyz[0][8]);
        int[][] nine = new int[9][9];//二維陣列
        for (int e = 0; e < 9; e++) {
            for (int r = 0; r < 9; r++) {
                nine[e][r] = (e + 1) * (r + 1);
                System.out.print("nine [" + e + "][" + r + "]=" + (e + 1) * (r + 1) + " ");
            }
            System.out.println(" ");

        }
        String s = "hello";
        System.out.println("String s =" + s);

        String src = new String("hi");
        System.out.println("String src =" + src);

        String river = "Mississippi";
        System.out.println("String river =" + river.length());//length()
        System.out.println("String river =" + river.charAt(3));//charAT()
        System.out.println("String river =" + river.indexOf("M"));//indexOF()
        System.out.println("String river =" + river.replace("M", "m"));//replace
        System.out.println("String river ="+ river.toLowerCase());//toLowerCase
        System.out.println("String river ="+river.toUpperCase());//toUpperCase
        System.out.println("String river ="+river.substring(10));//substring *
    }
}
