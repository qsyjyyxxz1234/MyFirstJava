
public class test1 {
    
    static void hello() {
        for (int i = 1; i < 11; i++) {
            System.out.print(i);
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    System.out.print(j+"*"+k+" ");                    
                }
                System.out.println(" ");                               
            }
        }
        System.out.println("hi, in hello()");
        System.out.println("bye,in hello()");
    }
    public static void main(String[] args) {
        
        
hello();                                                                         //呼叫口號       
    }       
}
