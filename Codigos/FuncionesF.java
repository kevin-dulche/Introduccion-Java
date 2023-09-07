public class FuncionesF {
    /*
        Los Java Docs son una herramienta usada por muchas otras herramientas
        y aplicaciones porque nos ayuda a documentar todo nuestro codigo usando comentarios.
        Ademas, nos permite visualizar la docuemntacion en formato HTML

        Comentarios bvarias lineas
     * Linea 1
     * Linea 2
     * Linea 3
     */

        // Comentario de un linea

     /**
      * Comentario para Java Docs
      * @param args
      */
    public static void main(String[] args) {
        double y = 3;
        // Area de un circulo
        // PI * r^2
        circleArea(y);

        // Area de una esfera
        // 4 * PI * r^2
        sphereArea(y);

        // Volumen de una esfera
        // (4/3) * PI * r^3
        sphereVolumen(y);

        System.out.println("PESOS A DOLARES: " + converToDolar(1000, "COP"));
        converToDolar(y, "MXN");
    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r, 3);
    }

    /**
     * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero a dolares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de Moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en Dolares
     */
    public static double converToDolar(double quantity, String currency){
        //MXN COP
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
            default:
                break;
        }
        return quantity;
    }
}
