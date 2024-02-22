package trickyQuestion;

public class AntiClockwiseLoopMatrixCode {
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


        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;

        int dir=0;
//        0 : top to bottom
//        1 : left to right
//        2 : bottom to top
//        3 : right to left
        System.out.println("-----------------------------------------");
        while (top<=bottom && left<=right){
            if(dir==0){
                for (int i = top; i <=bottom ; i++) {
                    System.out.print(matrix[i][left]+" , ");
                }
                left++;
            }
            else if (dir==1) {
                for (int i = left; i <=right ; i++) {
                    System.out.print(matrix[bottom][i]+" , ");
                }
                bottom--;
            }
            else if (dir==2) {
                for (int i = bottom; i >=top ; i--) {
                    System.out.print(matrix[i][right]+" , ");
                }
                right--;
            }
            else if (dir==3) {
                for (int i = right; i >=left ; i--) {
                    System.out.print(matrix[top][i]+ " , ");
                }
                top++;
            }
            dir=(dir+1)%4;
        }
    }
}
