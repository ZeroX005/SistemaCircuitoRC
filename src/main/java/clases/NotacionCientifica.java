package clases;

import java.math.BigDecimal;

public class NotacionCientifica {

    public double datos(double numero, double cantDec) {

        double nro = numero * Math.pow(10, cantDec);
        nro += 0.50;
        if (Math.floor(nro) == nro && nro % 2 != 0) {
            nro = Math.floor(nro);
            nro = nro - 1;
        } else {
            nro = Math.floor(nro);
        }
        return nro / Math.pow(10, cantDec);
    }

    public String NotacionLatex(Double n) {

        if (n == 0) {
            return "0";
        } else {
            int exponente = (int) Math.floor(Math.log(Math.abs(n)) / Math.log(10));
            n /= Math.pow(10, exponente + 1);
            n = datos(n, 3) * 10;
            BigDecimal nBgD = new BigDecimal(n);
            nBgD = nBgD.setScale(2, BigDecimal.ROUND_HALF_UP);
            String exp;
            if (exponente == 0) {
                exp = "";
            } else {
                exp = "\\times10^{" + exponente + "}";
            }
            return nBgD + exp;
        }

    }

    
}
