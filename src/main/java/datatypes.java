import java.awt.*;
import java.sql.SQLOutput;

public class datatypes {

    public static void main(String[] args){

        int i = 4523;   //Can store 32 bit integer values only.
        long l = 652345;  //Can store 64 bit integer values only.
        double d1 = 56.2354;         //Can store 64 bit decimal values.
        double d2 = 12456;  //We can use it for integer values too.
        char f = 'd';   //Can store single character only.
        boolean t = true;  //Can store only boolean values like true or false.
        String str = "Hello World";  //Can store any string values.

        System.out.println("Integer Var Is --> "+i);
        System.out.println("Long Var Is --> "+l);
      //  System.out.println("double Var d1 Is --> "+d1);
      //  System.out.println("double Var d2 Is --> "+d2);
      //  System.out.println("char Var c Is --> "+f);
      //  System.out.println("boolean Var b Is --> "+t);
      //  System.out.println("boolean Var str Is --> "+str);

      //  Color color = new Color(200,200,200);
       // Car c = new Car(color, 50);
      //  System.out.println(c);
      //  int y = 10;
      //  System.out.println(y++);
      //  System.out.println(y);

        Test incDec = new Test();
        int a = 10;
        //incDec.x(a++); //10
        //incDec.x(++a); //11
        incDec.x(a--);
        incDec.x(--a);

    }
}
