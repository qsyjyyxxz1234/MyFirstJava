
public class test1 {
    public static void firstMethod () {
        System.out.println("Method 1");
    }
    
    public static void main(String[] args) {
        int a = 1, b = 2, c = 0;
        if ( a == 1 && b ==2 && c == 1) {
            System.out.println("case 1");
        } else if ( a == 0 || b == 2) {
            System.out.println("case 2");
        }
        int z = 0;
        for (int i = 1 ; i < 11; i++) {
            z = z + i;
        }
        System.out.println("total :" + z);
        
        
    }
}
