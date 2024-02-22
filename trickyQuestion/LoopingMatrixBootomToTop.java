package trickyQuestion;

public class LoopingMatrixBootomToTop {
    public static void main(String[] args) {
        int[][] matrix = new int[5][6];
        int k = 1;
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[i].length - 1; j++) {
                matrix[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[i].length - 1; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
// left to right from bottom to top
//        System.out.println("-------------------------------------");
//        for (int i = matrix.length - 1; i >= 0; i--) {
//            for (int j = 0; j <= matrix[i].length - 1; j++) {
//                System.out.print(matrix[i][j] + "  ,  ");
//            }
//        }

//right to left from bottom to top
//        System.out.println("-------------------------------------");
//        for (int i = matrix.length - 1; i >= 0; i--) {
//            for (int j = matrix[i].length - 1; j >= 0; j--) {
//                System.out.print(matrix[i][j] + "  ,  ");
//            }
//        }

        System.out.println("-------------------------------------");
        int i = matrix.length - 1;
        while (i >= 0) {
            int j = matrix[i].length - 1;
            boolean flag = false;
            while (j >= 0) {
                    System.out.print(matrix[i][j] + "  ,  ");
                    j--;
                i--;
                System.out.println();
                }
            }
            }

        }

