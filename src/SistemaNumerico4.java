public class SistemaNumerico4 {
    public static void main(String[] args) {
        int decimal = 15;
        System.out.println("Decimal = " + decimal);
        System.out.println("Decimal binario " + decimal + " es " + Integer.toBinaryString(decimal));

        int decimalBinario = 0B1111; // puede se B o b
        System.out.println("decimalBinario = " + decimalBinario);

        System.out.println("Decimal Octal = " + decimalBinario + " es " + Integer.toOctalString(decimalBinario));

        int decimalOctal = 017;
        System.out.println("decimalOctal = " + decimalOctal);

        System.out.println("decimalHexa = " + decimalOctal + " es " + Integer.toHexString(decimalOctal));

        int decimalHexa = 0xf; // puede se H o h
        System.out.println("decimalHexa = " + decimalHexa);
    }
}
