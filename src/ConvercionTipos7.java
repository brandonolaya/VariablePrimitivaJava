public class ConvercionTipos7 {
    public static void main(String[] args) {

        String numero = "20";
        int numeroInt = Integer.parseInt(numero);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "15.5e-2";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logiBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logiBoolean = " + logiBoolean);


        int elNumero = 42;
        String stringNum = Integer.toString(elNumero);
        System.out.println("stringNum = " + stringNum);

        stringNum = String.valueOf(elNumero+11);
        System.out.println("stringNum = " + stringNum);


        int grande = 32777;
        short pequeño = (short)grande; //forzado
        System.out.println("pequeño = " + pequeño);
        System.out.println(Short.MAX_VALUE);

    }
}
