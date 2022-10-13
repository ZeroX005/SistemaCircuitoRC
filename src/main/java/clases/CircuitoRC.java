package clases;
public abstract class CircuitoRC {
    protected double fem;
    protected double c;
    protected double r;
    protected double t;
  
    protected CircuitoRC(double fem, double c, double r, double t) {
        this.fem = fem;
        this.c = c;
        this.r = r;
        this.t = t;
    }
    
    public abstract double  q();
    public abstract double i();
    
    
}
