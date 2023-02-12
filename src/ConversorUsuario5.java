import javax.swing.*;

public class ConversorUsuario5 {
    public static void main(String[] args) {
        String numeroStr  = JOptionPane.showInputDialog(null,"Ingrese un numero");
        int decimal = 0;
        try{
            decimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException error){
            JOptionPane.showMessageDialog(null,"Eso no es un numero");
            main(args); //continuara ejecutandose
            System.exit(0); //para cerrara el programa
        }

        System.out.println("decimal = " + decimal);

        String binarito = Integer.toBinaryString(decimal);
        System.out.println("binarito = " + binarito);
        
        String octal = Integer.toOctalString(decimal);
        System.out.println("octal = " + octal);
        
        String Hexa = Integer.toHexString(decimal);
        System.out.println("Hexa = " + Hexa);

        String mensaje = "decimal = " + decimal;
        mensaje += "\nbinarito = " + binarito;
        mensaje += "\noctal = " + octal;
        mensaje += "\nHexa = " + Hexa;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
