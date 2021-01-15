//
// Class files
//
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import static java.lang.Math.*;

import java.awt.List;


public class Deer {
    String deerName;

    String strA = "Mom";
    String strB = "Dad";
    String strC = "Emily Huang";

    static Integer y = 0;
    final static int xx = 99;
    static int y5=999;


    public enum MyEnum
    {
        INVITER_ID("userId"),
        INVITER_ORG_ID("orgId-new-test");
     
        private final String myEum;
    
        MyEnum (final String myEum) {
            this.myEum = myEum;
        }
    
        @Override
        public String toString() {
            return this.myEum;
        }
    }
    public Deer() {
        deerName="defaultName";
        System.out.println("-- Deer-- with default name");
    }


    
    public Deer(String name) {
        this.deerName = name;
        System.out.println("-- Deer--");
    }
    public Deer(int age) {
        System.out.print("DeerAge");
    }
    
    public boolean equals( Deer deer)
    {
        if (this.deerName.equals(deer.deerName))
            return true;
        return false;
    }

    private boolean hasHorns() {
        System.out.println("mmmmm...." + 5.0 / 0.0);

        for (int i = 0; i < 10; i++, System.out.print(i + "hhh"))
            ;
        return false;
    }

    public void add(int a, int b) {
        // final int xx = 0;
        a = a + b;
        System.out.println("add::- a=" + a);
        System.out.println("xx========================= [" + xx + "] ========== ");

    }

    public void stringAdd(String aStr, String bStr) {
        aStr = aStr + bStr;
        System.out.println("/////////INSIDE::- stringAdd::- aStr=" + aStr);

    }

    public static void unaryOperator() {
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);

        double e = 39.21;
        // float y = 2.1; --- compiler error. doubl 2.1 cannot convert to float,
        // which is shorter
        // data type. add f and the end would work
        float f = 2.1f;

        long x1 = 10;
        int y1 = 5;
        x1 = x1 * y1;
        System.out.println("x1 is " + x1);

        // y1 = y1 * x1; // DOES NOT COMPILE
        y1 *= x1;
        System.out.println("y1 is " + y1);
        x1 += x + y1;

        if (x1 < 10)
            System.out.println("HHH y1 is " + y1);
        else
            System.out.println("BBB y1 is " + y1);
        ;

        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println("s2======> " + s2);
        s2 = s2 + 3;
        System.out.println("New s2======> " + s2);
        int[] numbers = { 2, 4, 6, 8 };
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5
        int number = 4;
        

    }

    public static int number(int number) {
        int LEN = 5;
        number++;
        return number;
    }

    public static void changeAToEmily(Deer deer) {
        deer.strA = "Emily";
        String testlocVar;
        // System.out.println("testLocVar:::=" + testlocVar);

    }

    public static final long main(String[] args) {

        System.out.println("Y=" + y5++);

        // null Integer
        if (++y == 1)
            System.out.println("Y=" + y++);

        Deer myHome = new Deer();
        System.out.println("Before::--->strA :::=" + myHome.strA);
        changeAToEmily(myHome);
        System.out.println("After---->> strA  :::=" + myHome.strA);

        // TODO Auto-generated method stub
        Deer deer = new Reindeer(5);
        System.out.println("," + deer.hasHorns());
        int a = 1, b = 10;
        String aStr = "Hello,-==-", bStr = "World=++++";

        deer.add(a, b);
        System.out.println("a=" + a);
        deer.stringAdd(aStr, bStr);
        System.out.println("IN main::-----   aStr=" + aStr);

        /*
        int x = 0;
        while (++x < 5) {
            x += 1;
        }
        String message = x > 5 ? "Greater than" : "Less Than";
        System.out.println(message + "," + x);

        unaryOperator();
        ///////////////////////////////////////
        int number = 2;
        System.out.println("number =" + number); // 2

        // number = number(number);
        number(number);

        // number becomes 6
        System.out.println("number =" + number); // 6
        
        */
        Date date = new Date();
        System.out.println("date = " + date); 

        LocalDate date2 = LocalDate.of(2011,2,2);
        System.out.println("localdate2 = " + date2); 
        
       //  LocalDate date3 = new LocalDate(2011,2,2);
        System.out.println("power = " + pow(5,5)); 
        
        Integer iii =100;
        // System.out.println("equals = " +  iii.equals(obj)); 
        
        Deer deer1 = new Deer();
        Deer deer2 = new Deer();
        if (!deer1.equals(deer2))
            System.out.println("deer1 is not equals deer2 ="); 
        else
            System.out.println("deer1"+deer1.deerName+";deer2=" +deer2.deerName); 

        Deer deer3 = new Deer("Black Deer");
        Deer deer4 = new Deer("White Deer ");
        if (!deer3.equals(deer4))
            System.out.println("deer3 is not equals deer4!"+deer3.deerName+ ";"+deer4.deerName); 
        
        TestEnum test = new TestEnum();
        System.out.println("INVITER_ORG_ID= "+ MyEnum.INVITER_ORG_ID); 

        //List list1 = new ArrayList();
        boolean bb= true | false;
        System.out.println("bb= "+ bb); 
        return 10L;
        
    }

}

class Reindeer extends Deer {
    public Reindeer(int age) {
        System.out.print("Reindeer");
    }

    public boolean hasHorns() {
        return true;
    }

}
