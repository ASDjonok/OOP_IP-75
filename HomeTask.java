public class HomeTask {
    public static void main(String[] args) {
        byte[][] MatB = {{1, 0, 1},
                {0, 0, 1}};

        byte[][] MatA = {{2, 0, 1},
                {6, 7, 3}};
        byte maxEl;
        byte sum = 0;

        System.out.println(7582 % 5);
        System.out.println(7582 % 7);
        System.out.println(7582 % 11);

        for(int i = 0; i < MatA.length; i++){
            System.out.println();
            maxEl = MatA[i][0];
            for(int j = 1; j < MatA[i].length; j++){
                MatA[i][j] += MatB[i][j];
                System.out.print(MatA[i][j]+" " );
                if(MatA[i][j] > maxEl){
                    maxEl = MatA[i][j];
                }
            }
            sum+=maxEl;
        }
        System.out.println();
        System.out.println("result: " + sum);
    }
}