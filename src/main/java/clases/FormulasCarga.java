package clases;

public class FormulasCarga extends CircuitoRC {

    public FormulasCarga(double fem, double c, double r, double t) {
        super(fem, c, r, t);
    }

    @Override
    public double q() {
        double exp;
        exp = (double) (-t / (r * c));
        double q;
        q = (double) (fem) * (c) * (1 - Math.pow(Math.E, exp));
        return q;
    }

    @Override
    public double i() {
        double exp;
        exp = (double) -(t / (r * c));
        double ic;
        ic = (double) (fem / r) * (Math.pow(Math.E, exp));
        return ic;
    }


}
