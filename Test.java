import base.*;

public class Test {
    
    static public void main(String args[]) {

        MultiMatOps ops = new MultiMatOps();

        Matrix a = new Matrix(3, 2);
        Matrix b = new Matrix(2, 3);
        System.out.println("A = \n" + a + "\n");
        System.out.println("B = \n" + b + "\n");

        Matrix c = ops.multiply(a, b);
        System.out.println("A * B = \n" + c);
    }

}
