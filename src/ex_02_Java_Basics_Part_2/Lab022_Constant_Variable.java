package ex_02_Java_Basics_Part_2;

public class Lab022_Constant_Variable {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);

        final int b = 99;
//        b =11;  // java: cannot assign a value to final variable b
        System.out.println(b);
        //b = b+1;
        System.out.println(b);
        System.out.println(b);

        final float PI = 3.14f;
        final float PI1 = 3.14f;
        final float PI2 = 3.14f;
        final float PI4 = 3.14f;

        final int a1 = 10;

        //PI = 90;
    }
}
