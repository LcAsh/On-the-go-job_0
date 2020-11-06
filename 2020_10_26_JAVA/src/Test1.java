import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);


        /*00
      try {
          System.out.println("请输入圆的半径值：");
          double r = sc.nextDouble() ;
          double PI = 3.14159;
          double area;
          area = PI*r*r;
          System.out.println("面积是："+ area);
      }catch (InputMismatchException e)
      {
          System.out.println("要放字符类型的判断");
      }
      finally {
          System.out.println("无论怎样，都会执行");
      }

         */


       /*01
       double a,b;
        try {
            System.out.println("请输入两个大于零的数");
            a=sc.nextDouble();
            b=sc.nextDouble();
            if(a<=0||b<=0){
                *//*Test2 e = new  Test2("第一个数"+ a +",第二个数"+ b);
                throw e;
                 *//*
                throw  new Test2 ("第一个数"+ a +",第二个数"+ b);
            }
            System.out.println("两数之和是："+(a+b));
        }catch (InputMismatchException e){
            System.out.println("输入一个正数");
        }catch (Test2 e){
            //自定义异常捕获
            System.out.println(e.toString());
        }
       finally {
            System.out.println("无论怎样，都会执行");
        }*/

        //03
        try {
            ExceptionTest();
        }catch (Test2 e){
            System.out.println(e.toString());
        }catch (InputMismatchException e){
            System.out.println("请输入一个正数！");
        }
    }



    public static void ExceptionTest() throws Test2,InputMismatchException {
        double a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入两个大于零的数");
        a = sc.nextDouble();
        b = sc.nextDouble();
        if (a <= 0 || b <= 0) {
            throw new Test2("第一个数"+ a +",第二个数"+ b);
        }
        System.out.println("两数之和是："+(a+b));
    }
}
