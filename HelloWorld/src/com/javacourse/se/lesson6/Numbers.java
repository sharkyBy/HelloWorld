package com.javacourse.se.lesson6;

public class Numbers {
    //x+3=5
    //Integer variable type
    //Примитиыные типы данных (int, byte, str)
    static byte a = 126;    //2^8=256                                      (from -128 to 127)
    static short b = 32_000;   //2^16=65.538                                  (from -32.768 to 32.657)
    static int c = 2_000_111_222;     //2^32=4.294.967.296                           (from -2.147.483.648 to 2.147.483.647)
    static long d = 9_000_111_222_333_444_555l;    //2^64=18.446.744.073.709.551.616          (from -9.223.372.036.854.775.808 to 9.223.372.036.854.775.807)

    //Character data type
    static char e = 'C';    //2^16=65.538                                  (from 0 to 65.537)

    //Real data types
    static float f = 7.1f;   //2^32                                     (from ~1,4*10^-45 to ~3,4*10^38)
    static double g = 6.3;  //2^64                                         (from ~4,9*10^-324 to ~1,8*10^308)

    //Logical data type
    static boolean h = true;    //8 bit (in arrow) and 32bit (is not arrow)




    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

    }


}
