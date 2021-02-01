package base;

public class MultiMatOps {
    
    public Matrix add(Matrix a, Matrix b) {

        if (a.getColNum() != b.getColNum() || a.getRowNum() != b.getRowNum()) { 
            return null;
        }

        Matrix out = new Matrix(a.getRowNum(), a.getColNum(), true);

        for (int i = 0; i < out.getRowSize(); i++) {
            for (int j = 0; j < out.getColSize(); j++) {
                out.setEl(i, j, a.getEl(i, j) + b.getEl(i, j));;
            }
        }

        return out;
    }

    public double multRC(double a[], double b[]) {
        double out = 0;
        for (int i = 0; i < a.length; i++) {
            out += a[i]*b[i];
        }
        return out;
    }

    public Matrix multiply(Matrix a, Matrix b) {
        if (a.getColNum() != b.getRowNum()) {
            return null;
        }

        Matrix out = new Matrix(a.getRowNum(), b.getColNum(), true);
        double val;

        for (int i = 0; i < out.getRowNum(); i++) {
            for (int j = 0; j < out.getColNum(); j++) {
                val = multRC(a.getRow(i), b.getCol(j));
                out.setEl(i, j, val);
            }
        }

        return out;

    }

}
