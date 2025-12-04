import javax.xml.transform.stream.StreamSource;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero");
              int popocho = scan.nextInt();
        if (popocho == 0) {
            System.out.println("Deberias conseguir uno");
        } else if (popocho == 1) {
            System.out.println("Esta muy mimado");
        } else if (popocho == 2 || popocho == 3) {
            System.out.println("Es una familia muy equilibrada");
        }else {
            System.out.println("Son demasiados popochos");
        }
        for (int i=0;i<popocho;i++) {
            System.out.print("Zzz...");
        }
        System.out.println("Todos los popochos estan durmiendo y tranquilos");
        System.out.println("Fin del programa");
         System.out.println("Este programa ha sido tocado desde github");

    }
}
