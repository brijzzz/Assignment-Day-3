package com.bridgelabz;

public class Helloworld {

    // Data types => primitive and non-primitive
    // primitive => 8 data types ---> byte,short,int,long,float,double,char,boolean
    // Non-primitive => String,arrays,Class,interface

    // 3 types of variables : Local variables , Instance variables , Static variables
    final int instanceVar = 30;
    static String str="BridgeLabs";// by defualt NULL
    //static Sample2 emp1; // NULL
    static int[] arr= new int[3]; // NULL // size of array is 3
    static float[] floatArr= new float[5];
    static int i= 10; // by defualt 0 // 4 bytes
    static long l=13; // by defualt 0// 8 bytes
    static float f=0.1f; // by defualt 0.0f // 4 bytes
    static double d=0.5; // by defualt 0.0 // 8 bytes
    static byte b=4; // by default 0 //-128 to 127 // 1 byte
    static short s=8; // by default 0 // 2 bytes
    static char c='B'; // by default '\u0000'// 2 bytes
    static boolean b1= true; // by default false // 1 bit

    // Method implementation
    static int m1(int a, int b) {
        int x=10;
        Helloworld helloworld=new Helloworld();
        helloworld.m2();
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(str);
        System.out.println("this is method m1()");
        int sum= a+b;
        return sum;
    }

    static void methodSample1(){
        str="intellij";
        System.out.println("this is methodSample1(),str="+str);
        System.out.println("this is method methodSample()");
    }
    void m3(){
        m1(5,6);
        methodSample1();
        m2();

    }
    void m2(){
        methodSample1();
        System.out.println("m2()");
    }

    public static void main (String[] args) {

        Helloworld helloworld1=new Helloworld();
        Helloworld helloworld2=new Helloworld();
        System.out.println("helloworld 1"+helloworld1.instanceVar);
        System.out.println("helloworld 1 after"+helloworld1.instanceVar);
        System.out.println("helloworld 2 "+helloworld2.instanceVar);
        int sum=m1(1,3); // method call
        System.out.println("sum:"+sum);
        helloworld1.m2();
        helloworld2.m3();
        System.out.println("sum:"+sum);
        methodSample1();
        System.out.println("HelloWorld");
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
        System.out.println(b1);
        System.out.println(str);
        str="Bridge";
        System.out.println(str);


        int x=40;
        if(x==30){
            System.out.println("true condition"+" "+x);
        }else if(x==40){
            System.out.println("true condition"+" "+x);
        }else{
            System.out.println("false condition");
        }

        for(int i=0;i<3;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("***********");
        int var=0;
        int result=++var + var++ + ++var + var++;
        System.out.println("Value of var:"+var);
        System.out.println(result);

        System.out.println("**********");


        System.out.println();
        arr[0]=20;
        arr[1]=40;
        arr[2]=60;

        for(int i=0;i<3;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
