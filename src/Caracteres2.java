public class Caracteres2 {

    public static void main(String[] args) {

        char a = 'a';
        char b = '\u0061';
        System.out.println(a);
        System.out.println(b);

        char elarroba = '\u0040'; //literal
        char arroba = 64;         //Decimal
        System.out.println(elarroba);
        System.out.println(arroba == elarroba); //operadores relacionales


        //especiales
        char espacio = '\u0020';
        char retroceso = '\b';
        char tabular = '\t';
        System.out.println("corresponte" + " " + "lo" + espacio+ "que" + "sea"+ " que "+ "sea");
        System.out.println("hola" + retroceso);
        System.out.println("columna1" + tabular + "columna2" + "\tColumna3");

        System.out.println("buenos" + System.lineSeparator()+"dias");

    }
}
