public class String8 {
    public static void main(String[] args) {
        String str1 = "Hola mundo";//con la literal
        String str2 = new String("Hola mundo"); //con la intacia
        System.out.println("mismo objeto??" + (str1 == str2));//por objeto
        System.out.println("mismo valor?" + str1.equals(str2));//por valor
        System.out.println(str1.length());

        boolean esIgual = str2 == str1; // isntancias distintas
        System.out.println("esIgual = " + esIgual);
    }
}
