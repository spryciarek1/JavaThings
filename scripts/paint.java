//For practice i recommend trying to imporove this scripts, eg. try inputing values 0 and try to fix that
import java.util.Scanner;
public class Paint {
    public static void main(String[] args) {
        line();;
        triangle();
        rectangle();
    }
    public static void line(){
        Scanner input = new Scanner(System.in);
        System.out.println("What length do you want your braclet?");
        int n = input.nextInt();
        System.out.print("~");
        while(n != 0){
            System.out.print("o~");
            n--;
        }

        System.out.println();
    }
    public static void triangle(){
        Scanner input = new Scanner(System.in);
        System.out.println("The height of a triangle?");
        int n = input.nextInt();
        String o ="";
        while(0<n){
            o = o + "o";
            n--;
            System.out.println(o);
        }


    }
    public static void rectangle(){
        Scanner input = new Scanner(System.in);
        System.out.println("The lenght of a rectangle?");
        int a = input.nextInt();
        System.out.println("The height of a rectangle?");
        int b = input.nextInt();
        String o = "";
        while(a>0){
            o += "o";
            a--;
        }
        while(b>0){
            System.out.println(o);
            b--;
        }
    }
}
