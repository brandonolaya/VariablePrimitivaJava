public class Precedencia10 {
    public static void main(String[] args) {
        String curso = "Programacion Uno";
        String profesor = new String("del profe");
        String informacion = curso + " Con el instructor el "+ profesor;
        int edad = 19;
        int years = 2023;
        System.out.println(informacion + edad +years);
        System.out.println(informacion + (edad+years));


        var detalle = curso.concat(profesor);
        System.out.println("detalle = " + detalle);
        
        
        var detalle2 = curso.concat(" ".concat(profesor));
        System.out.println("detalle2 = " + detalle2);

        var detalle3 = curso.concat(" ").concat(profesor);
        System.out.println("detalle3 = " + detalle3);
    }
}
