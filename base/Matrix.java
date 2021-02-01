package base;
import java.util.Scanner;

public class Matrix {

    private double mat[][];
    private int row;
    private int col;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        mat = new double[row][col];

        this.setMat();

    }

    public Matrix(int row, int col, boolean con) {
        this.row = row;
        this.col = col;
        mat = new double[row][col];
    }

    private void setMat() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter [%d][%d]: ", i, j);
                mat[i][j] = scan.nextDouble();
            }
        }
        //scan.close();
    }

    public void setEl(int row, int col, double el) {
        mat[row][col] = el;
    }

    public void setRow(int row, double[] newRow) {
        for (int i = 0; i < this.col; i++) {
            mat[row][i] = newRow[i];
        }
    }

    public void setCol(int col, double[] newCol) {
        for (int i = 0; i < this.row; i++) {
            mat[i][col] = newCol[i];
        }
    }

    public int getRowNum() {return this.row;}
    public int getColNum() {return this.col;}
    public int getRowSize() {return this.col;}
    public int getColSize() {return this.row;}

    public double[] getRow(int row) {
        return mat[row];
    }

    public double[] getCol(int col) {
        double out[] = new double[this.row];

        for (int i = 0; i < row; i++) {
            out[i] = mat[i][col];
        }

        return out;
    }

    public double getEl(int row, int col) {
        return mat[row][col];
    }

    public void scalarMul(double scalar) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = mat[i][j] * scalar;
            }
        }
    }

    public double[][] toArr() {
        return mat;
    }

    public String toString() {
        String out = "[";
        for (int i = 0; i < row; i++) {
            out += "[ ";
            for (int j = 0; j < col; j++) {
                out += this.getEl(i, j) + " ";
            }
            out += "]";
            if (i != row -1) {
                out += "\n";
            } 
        }
        out += "]";
        return out;
    }

}