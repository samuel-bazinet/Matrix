package Base;
import java.util.Scanner;

class Matrix {

    double mat[][];
    int row;
    int col;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        mat = new double[row][col];

        this.setMat();

    }

    private void setMat() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter [%d][%d]", i+1, j+1);
                mat[i][j] = scan.nextDouble();
            }
        }
        scan.close();
    }

    public int getRowSize() {return this.row;}
    public int getColSize() {return this.col;}

    public double[] getRow(int row) {
        double out[] = new double[this.col];

        for (int i = 0; i < col; i++) {
            out[i] = mat[row][i];
        }

        return out;
    }

    public double[] getCol(int col) {
        double out[] = new double[this.row];

        for (int i = 0; i < row; i++) {
            out[i] = mat[col][i];
        }

        return out;
    }

    public void scalarMul(double scalar) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = mat[i][j] * scalar;
            }
        }
    }

}