public class Booleans3 {
    public static void main(String[] args) {
        boolean elAntigulo = Boolean.FALSE.booleanValue();
        boolean elLogico = Boolean.FALSE;
        System.out.println(elAntigulo);
        System.out.println(elLogico);

        boolean practico = false;
        System.out.println(practico);

        System.out.println();
        long numero = 154364l;
        float otroNumero = 0.598e6f;
        boolean quienEs = numero > otroNumero;
        System.out.println(quienEs);

        boolean esVerdadero = "Hola"=="Hola";
        System.out.println(esVerdadero);
    }
}
