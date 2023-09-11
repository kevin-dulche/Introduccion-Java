public class Arrays {
    public static void main(String[] args) {
        String[] andoridVersions = new String[17];
        int days[] = new int[7];

        String[][] cities = new String[4][2]; // 4 * 2 = 8

        /*
        * +------------------------------+
        * |  Country    |  City          |
        * --------------------------------
        * | México      | CDMX           |
        * | México      | Guadalajara    |
        * | Colombia    | Bogotá         |
        * | Colombia    | Medellín       |
        * +------------------------------+
        * */

        int[][][] numbers = new int[2][2][2];
        int[][][][] numbers4 = new int[2][2][2][2];

        andoridVersions[0] = "Apple Pie";
        andoridVersions[1] = "Banana Bread";
        andoridVersions[2] = "Cupcake";
        andoridVersions[3] = "Donut";

                                    //17
        for (int i = 0; i < andoridVersions.length; i++) {
            System.out.println(andoridVersions[i]);
        }

        for (String andoridVersion : andoridVersions) {
            System.out.println(andoridVersion);
        }

        // for (int i = 0; i < days.length; i++) {
        //     System.out.println(days[i]);
        // }

        /*System.out.println(andoridVersions[0]);
        System.out.println(andoridVersions[1]);
        System.out.println(andoridVersions[2]);
        System.out.println(andoridVersions[3]);*/

        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        /*for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }*/

        for (String[] pair : cities) {
            for(String name : pair) {
                System.out.println(name);
            }
        }

        /*System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);*/


        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";

        System.out.println();
        System.out.println();
        
        
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0; j++) {
                for (int k = 0; k <= 0; k++) {
                    for (int l = 0; l <= 1; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }
    }
}
