package one;
import java.util.Scanner;
public class Trinagulo {





        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double a, b, c;
            System.out.print("Ingresa el valor de a: ");
            a = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de b: ");
            b = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de c: ");
            c = in.nextDouble();
            in.nextLine();
            if(a*a==b*b+c*c)
                System.out.println("Rect\u00E1ngulo");
            if(a*a<b*b+c*c)
                System.out.println("Acut\u00E1ngulo");
            if(a*a>b*b+c*c)
                System.out.println("Obtus\u00E1ngulo");
        }




}
