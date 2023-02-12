public class TestRendimiento13 {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";

        StringBuilder d = new StringBuilder(a);

        long inicio = System.currentTimeMillis();// es mucho mas eficiente para concatener grandes cantidades de String

        for (int i = 0; i < 1000; i++) {
            //c = c.concat(a).concat(b).concat("\n");// menos lentos
            //c += a+b +"\n";// es lentos
            d.append(a);
            d.append(b);
            d.append("\n");
        }
        //System.out.println("c = "+ c);
        System.out.println("d  " + d.toString());
        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
    }
}
