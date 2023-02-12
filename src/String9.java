public class String9 {
    public static void main(String[] args) {
        String curso = "Programacion Uno";
        String curso1 = new String("programacion uno");
        boolean esIgual = curso.equalsIgnoreCase(curso1);
        System.out.println("esIgual = " + esIgual);


        String curso2 = "Programacion Uno";
        var sonIguales = curso.equals(curso2);
        System.out.println("sonIguales = " + sonIguales);
        System.out.println("son lo mismo: " + (curso == curso2));
    }
}
