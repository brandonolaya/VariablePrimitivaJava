public class StringArreglo15 {
    public static void main(String[] args) {

        String odin = "Hola a los hijos de odin";
        System.out.println("odin = " + odin.toCharArray()); //objeto array
        char[] arreglo = odin.toCharArray();
        int largo = arreglo.length; //length es una propiedad

        for (int i = 0; i < largo; i++){
            System.out.println("arreglo = " + arreglo[i]);
        }
        System.out.println("largo = " + largo);
    }
}
