package Base;
import java.util.Scanner;

class Matrix {

    float mat[][];
    int col;
    int row;

    public Matrix(int col, int row) {
        this.col = col;
        this.row = row;
        mat = new float[col][row];

        this.setMat();

    }

    private void setMat() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("Enter [%d][%d]", i+1, j+1);
                mat[i][j] = scan.nextInt();
            }
        }
        scan.close();
    }

}