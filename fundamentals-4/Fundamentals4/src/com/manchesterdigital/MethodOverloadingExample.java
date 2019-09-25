package com.manchesterdigital;

public class MethodOverloadingExample {


    public int multiply(int a, int b, int c, int d) {
        return a * b * c * d;
    } // member method as it belongs to the class

    public int multiply(int first, int second, int third) {
        return first * second * third;
    }

    public static void main(String[] args) {
        MethodOverloadingExample me = new MethodOverloadingExample();
        int result = me.multiply(3, 3, 4, 6);
        System.out.println(result);
    }
}
// assad used four different versions of multiply, and then made different versions of results to work them out
// this is overloading because the compiler won't know which one to use
// more than we can actually make use of
/*
you can overlap some of these even further. like bringing the second one into the third. his examples are on
recording after 05:40 hours
need to research this even further
if something is no longer useful, deprecate it!

 */