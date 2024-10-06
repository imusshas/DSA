package _12_math;

public class _11_NewtonRaphsonSquareRoot {
  public static void main(String[] args) {
    /*
    The algorithm works based on the tolerance label:
      Root = 0.5 x (X + N / X)
        Here,
          X = Assumed root
          N = Actual number
        
      1st iteration:
        Let, X = N;
    */
    
    _11_NewtonRaphsonSquareRoot obj = new _11_NewtonRaphsonSquareRoot();

    obj.newtonRaphsonSquareRoot(4, 0.00001);
  }



  public double newtonRaphsonSquareRoot(double num, double toleranceLabel) {
    double X = num ;
    double root = 0.5 * (X + num / X);
    while(X - root > toleranceLabel) {
      X = root;
      root = 0.5 * (X + num / X);
      // System.out.println("prevRoot: " + X + " root: " + root);
    }
    System.out.println(root);

    return root;
  }
}
