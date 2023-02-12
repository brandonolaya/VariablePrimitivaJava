public class StringMetodos14 {
    public static void main(String[] args) {
        String nombre = "Brandon";
        System.out.println("nombre.le = "+ nombre.length());
        System.out.println("nombre UpperCase " + nombre.toUpperCase());
        System.out.println("nombre lowercase " + nombre.toLowerCase());
        System.out.println("nombre equals \"Brandon\" " + nombre.equals("Brandon"));
        System.out.println("nombre equals \"Brandon\" " + nombre.equals("brandon"));
        System.out.println("nombre ignoreCase = " + nombre.equalsIgnoreCase("BraNdoN"));
        System.out.println("nombre comparete = " + nombre.compareTo("Brandon"));// asigna ordenamiento con unicode
        System.out.println("nombre Char letra a = " + nombre.charAt(2));
        System.out.println("nombre substring = " + nombre.substring(2,5));
        System.out.println("nombre alrevez = " + nombre.replace("n", "m"));
        System.out.println("nombre index = " + nombre.indexOf("n"));
        System.out.println("nombre lastIndex = " + nombre.lastIndexOf("n"));
        System.out.println("nombre index = " + nombre.indexOf("e"));
        System.out.println("nombre contains = " + nombre.contains("h"));//secunecia no caracter

    }
}
