package clases;

public class FormulasDescarga extends CircuitoRC {

    public FormulasDescarga(double fem, double c, double r, double t) {
        super(fem, c, r, t);
    }

    @Override
    public double q() {
        double exp;
        exp = (double) (-t / (r * c));
        double q;
        q = (double) (fem) * (c) * (Math.pow(Math.E, exp));
        return q;
    }

    @Override
    public double i() {
        double exp;
        exp = (double) (-t / (r * c));
        double ic;
        ic = (double) (-fem / r) * (Math.pow(Math.E, exp));
        return ic;
    }

}
