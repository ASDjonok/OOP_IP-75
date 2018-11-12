public class Lab2 {
    public static void main(String[] args) {
        char[][] B = {
                {1, 2},
                {3, 4},
                {51345, 6}
        };
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
//                System.out.println(i + " " + j);
                System.out.print((int)B[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("+++++++++++++++++");

        for (int j = 0; j < B[0].length; j++) {
            for (int i = 0; i < B.length; i++) {
//                System.out.println(i + " " + j);
                System.out.print((int)B[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("+++++++++++++++++++");
        char[][] C = new char[B[0].length][B.length];
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                C[i][j] = B[j][i];
            }
        }

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(/*(int)*/C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
