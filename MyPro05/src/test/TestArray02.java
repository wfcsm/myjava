package test;

public class TestArray02 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
//        只能读取不能修改 foreach
        for(int m:a){
            System.out.println(m);
        }
    }
}
