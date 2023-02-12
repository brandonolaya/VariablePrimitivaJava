public class ValorPrimitivo1 {
    public static void main(String[] args) {
        int num = 15;
        var nume34 = 23;
        byte numero;
        numero = 2;
        System.out.println("mi nombre es: "+ numero);

        boolean si = false;
        if (si){
            System.out.println("Es verdadero");
        }

        var name = "Graundio";
        char a = '\u0045';
        System.out.println(a);
        short enteroShort = -32768;
        System.out.println(enteroShort);

        byte miByte = 4;
        System.out.println("hola " + Byte.MAX_VALUE);
        System.out.println(Float.SIZE);
        System.out.println(Float.BYTES);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Integer.SIZE); //tamaño en bits
        System.out.println(Integer.BYTES); // tamaño en Bytes
        System.out.println(Integer.MAX_VALUE); //valor maximo
        System.out.println(Integer.MIN_VALUE); // valor minimo
    }
}
