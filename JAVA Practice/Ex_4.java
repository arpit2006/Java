public class Ex_4 {
    public static void main(String[] args) {
        int[][] matrices;
        matrices = new int[2][3];
        matrices[0][0] = 101;
        matrices[0][1] = 102;
        matrices[0][2] = 103;
        matrices[1][0] = 201;
        matrices[1][1] = 202;
        matrices[1][2] = 203;

        int sum = 0;
        for (int i = 0; i < matrices.length; i++) {
            for (int j = 0; j < matrices[i].length; j++) {
                System.out.print(matrices[i][j]);
                System.out.print(" ");
                sum = sum + matrices[i][j];
            }
            System.out.print("\n");
        }

        System.out.println("Sum of 2D Arrays is..: " + sum);

    }
}
