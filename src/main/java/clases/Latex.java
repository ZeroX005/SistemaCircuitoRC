package clases;

import org.scilab.forge.jlatexmath.ParseException;
import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;

public class Latex {

    private TeXFormula formula;
    private TeXIcon icon;
    private String math;

    public TeXIcon conversionLaTex(String math, int valor) {
        try {
            this.math = math;
            this.formula = new TeXFormula(this.math);
            this.icon = this.formula.new TeXIconBuilder().setStyle(TeXConstants.STYLE_DISPLAY)
                    .setSize(valor)
                    .setWidth(TeXConstants.UNIT_PIXEL, 1000, TeXConstants.ALIGN_LEFT)
                    .setIsMaxWidth(true)
                    .setInterLineSpacing(TeXConstants.UNIT_PIXEL, 20).build();
            return this.icon;

        } catch (ParseException e) {
            System.err.println("Error: " + e.getMessage());
            return this.icon = null;
        }

    }

}
