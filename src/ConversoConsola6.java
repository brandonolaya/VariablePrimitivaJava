import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversoConsola6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        //String numeroStr  = scanner.nextLine();
        int decimal = 0;
        try{
            decimal = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Eso no es un numero");
            main(args); //continuara ejecutandose
            System.exit(0); //para cerrara el programa
        }

        String binarito = Integer.toBinaryString(decimal);
        String octal = Integer.toOctalString(decimal);
        String Hexa = Integer.toHexString(decimal);

        String mensaje = "decimal = " + decimal;
        mensaje += "\nbinarito = " + binarito;
        mensaje += "\noctal = " + octal;
        mensaje += "\nHexa = " + Hexa;

        System.out.println(mensaje);
    }


}
