public class TestRendimiento12 {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";
        long inicio = System.currentTimeMillis();

        for (int i=0; i<1000; i++){
            //c = c.concat(a).concat(b).concat("\n");
            c += a+b +"\n";
        }
        System.out.println("c = "+ c);

        long fin = System.currentTimeMillis();
        System.out.println(fin -inicio);
    }
}
