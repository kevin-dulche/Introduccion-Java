public class P1Ejercicio02 {
    public static void main(String[] args) {
            /*
            Usando los dos tipos de casting que aprendiste (implícito y explícito),
            resuelve los siguientes casteos indicando qué tipo es y si se está calculando estimación o exactitud.
        
            char c = ‘z’; conviertelo a int
            int i = 250; conviertelo a long y luego de long a short
            double d = 301.067; conviertelo a long
            int i = 100; súmale 5000.66 y conviertelo a float
            int i = 737; multiplícalo por 100 y conviertelo a byte
            double d = 298.638; divídelo entre 25 y conviertelo a long
            */
            char c = 'z';
            int ic = c;

            int i = 250;
            long iL = i;
            short iS = (short)iL;

            double d = 301.067;
            long dL = (long)d;

            int i2 = 100;
            i2 += 5000.66;
            float i2F = (float)i2;

            int i3 = 737;
            i3 *= 100;
            byte i3B = (byte)i3;

            double d2 = 298.638;
            d2 /= 25;
            long d2L = (long)d2;

    }
}