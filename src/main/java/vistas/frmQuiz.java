package vistas;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import clases.*;
import javax.swing.JOptionPane;

public class frmQuiz extends javax.swing.JFrame {

    Latex latex = new Latex();
    NotacionCientifica nc = new NotacionCientifica();
    frmSeccionFormulas seccion = new frmSeccionFormulas();
    frmPrincipal principal = new frmPrincipal();

    //señala el tipo de ejercicio, carga o descarga
    boolean tipo;
    CircuitoRC obj;
    double ep;
    int epm;
    double O;
    int Om;
    double F;
    int Fm;
    double t;

    double[] r = new double[2];
    String[][] arr = new String[3][2];

    int correcto = 0; //contador de respuestas correctas
    int total = 0; //contador de respuestas 

    public frmQuiz() {
        initComponents();
        this.setLocationRelativeTo(this);
        txtPuntu.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        resetArr();
        gen();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPreg = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        txtPuntu = new javax.swing.JLabel();
        btnR1 = new javax.swing.JButton();
        btnR2 = new javax.swing.JButton();
        btnR3 = new javax.swing.JButton();
        lbImg = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPreg.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtPreg.setText("jLabel1");
        jPanel1.add(txtPreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 230, -1));

        a.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        a.setText("jLabel1");
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 410, 240));

        txtPuntu.setBackground(new java.awt.Color(255, 255, 255));
        txtPuntu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPuntu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPuntu.setText("jLabel1");
        jPanel1.add(txtPuntu, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 90, 68));

        btnR1.setBackground(new java.awt.Color(0, 102, 102));
        btnR1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnR1.setForeground(new java.awt.Color(255, 255, 255));
        btnR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnR1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 370, 56));

        btnR2.setBackground(new java.awt.Color(0, 102, 102));
        btnR2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnR2.setForeground(new java.awt.Color(255, 255, 255));
        btnR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnR2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 370, 56));

        btnR3.setBackground(new java.awt.Color(0, 102, 102));
        btnR3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnR3.setForeground(new java.awt.Color(255, 255, 255));
        btnR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnR3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnR3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 370, 56));

        lbImg.setToolTipText("");
        jPanel1.add(lbImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 300, 230));

        jMenuBar1.setPreferredSize(new java.awt.Dimension(47, 30));

        jMenu1.setText("Menú");

        jMenuItem1.setText("Inicio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Formulas RC");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        seccion.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnR1ActionPerformed
        funcBtn(0);
    }//GEN-LAST:event_btnR1ActionPerformed

    private void btnR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnR2ActionPerformed
        funcBtn(1);
    }//GEN-LAST:event_btnR2ActionPerformed

    private void btnR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnR3ActionPerformed
        funcBtn(2);
    }//GEN-LAST:event_btnR3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        principal.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    //método que calcula la respuesta al ejecutarse
    void resp() {
        double ep = inter(this.ep, inter(epm));
        double O = inter(this.O, inter(Om));
        double F = inter(this.F, inter(Fm));
        double t = this.t;
        if (tipo) {
            obj = new FormulasCarga(ep, F, O, t);
            r[0] = obj.i();
            r[1] = obj.q();
            System.out.println("I=" + obj.i());
            System.out.println("Q=" + obj.q());
        } else {
            obj = new FormulasDescarga(ep, F, O, t);
            r[0] = obj.i();
            r[1] = obj.q();
            System.out.println("I=" + obj.i());
            System.out.println("Q=" + obj.q());
        }
    }

    void img() {
        String cad;
        cad = "descarga";
        if (tipo) {
            cad = "carga";
        }
        ImageIcon img = new ImageIcon(getClass().getResource("/imagenes/" + cad + ".png"));
        Image imgsc = img.getImage().getScaledInstance(lbImg.getWidth(), lbImg.getHeight(), Image.SCALE_SMOOTH);
        lbImg.setIcon(new ImageIcon(imgsc));
    }

    void funcBtn(int j) {
        if (Double.parseDouble(arr[j][0]) == r[0] && Double.parseDouble(arr[j][1]) == r[1]) {
            correcto++;
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/bien.png"));
            JOptionPane.showMessageDialog(null, "<html><span color='green'>Respuesta correcta</span></html>", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
            resetArr();
            gen();
        } else {
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/mal.png"));
            JOptionPane.showMessageDialog(null, "<html><span color='red'>Respuesta incorrecta</span></html>", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
            resetArr();
            gen();
        }
    }

    void asigR() {
        int val = (int) ((Math.random() * (3 - 0)) + 0);
        System.out.println("Indice=" + val);
        double o = 0.9;
        double p = 1.1;
        arr[val][0] = r[0] + "";
        arr[val][1] = r[1] + "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (arr[i][j].equals("x")) {
                    if (Math.random() < 0.5) {
                        arr[i][j] = (r[j] * o) + "";
                        o = o - .1;
                    } else {
                        arr[i][j] = (r[j] * p) + "";
                        p = p + .1;
                    }
                }
            }
        }
    }

    private void resetArr() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = "x";
            }
        }
    }

    private String inter(int ext) {
        switch (ext) {
            case 0 -> {
                return "k";
            }
            case 1 -> {
                return "";
            }
            case 2 -> {
                return "m";
            }
            case 3 -> {
                return "μ";
            }
        }
        return "";
    }

    //val*10^ext
    private double inter(double val, String ext) {
        switch (ext) {
            case "k" -> {
                return val * Math.pow(10, 3);
            }
            case "m" -> {
                return val * Math.pow(10, -3);
            }
            case "μ" -> {
                return val * Math.pow(10, -6);
            }
            default -> {
                return val * 1;
            }
        }
    }

    //Método que genera los problemas.
    private void gen() {
        total++;
        if (total > 5) {

            if (correcto >= 3) {
                ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/happy.png"));
                JOptionPane.showMessageDialog(null, "Respuestas correctas: " + correcto + "/5", "Aprobastes!!", JOptionPane.PLAIN_MESSAGE, icono);
                total = 1;
                correcto = 0;
            } else {
                ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/sad.png"));
                JOptionPane.showMessageDialog(null, "Respuestas correctas: " + correcto + "/5","Desaprobastes", JOptionPane.PLAIN_MESSAGE, icono);
                total = 1;
                correcto = 0;
            }
        }
        txtPreg.setText("Pregunta N°" + total + ":");
        txtPuntu.setText("<html><center>Puntuación:<br>" + correcto + "/5</center></html>");
        tipo = (Math.random() < 0.5);
        img();
        ep = (int) ((Math.random() * (101 - 1)) + 1);
        epm = (int) ((Math.random() * (2 - 0)) + 0);
        O = (int) ((Math.random() * (101 - 1)) + 1);
        Om = (int) ((Math.random() * (3 - 0)) + 0);
        F = (int) ((Math.random() * (101 - 1)) + 1);
        Fm = (int) ((Math.random() * (2 - 0)) + 0);
        t = (int) ((Math.random() * (4 - 1)) + 1); //Tiempo máximo 5 s.
        a.setText(asig(1));
        resp();
        asigR();
        btnR1.setIcon(latex.conversionLaTex("\\text {a) }  Q=" + nc.NotacionLatex(Double.parseDouble(arr[0][1])) + ", I=" + nc.NotacionLatex(Double.parseDouble(arr[0][0])), 20));
        btnR2.setIcon(latex.conversionLaTex("\\text {b) }  Q=" + nc.NotacionLatex(Double.parseDouble(arr[1][1])) + ", I=" + nc.NotacionLatex(Double.parseDouble(arr[1][0])), 20));
        btnR3.setIcon(latex.conversionLaTex("\\text {c) }  Q=" + nc.NotacionLatex(Double.parseDouble(arr[2][1])) + ", I=" + nc.NotacionLatex(Double.parseDouble(arr[2][0])), 20));
    }

    private String asig(int val) {
        String txt1 = "<html><p style=\"text-align: justify;\">Para el circuito mostrado. Determinar el valor de la carga y la intensidad de corriente para <span color='red'><b>t="
                + t + "s</b></span> con los siguientes valores:</p><br>"
                + "C = " + F + " " + inter(Fm) + "F<br>"
                + "R = " + O + " " + inter(Om) + "Ω<br>"
                + "ε = " + ep + " " + inter(epm) + "V<br>"
                + "</html>";
        switch (val) {
            default -> {
                return txt1;
            }
        }
    }

    private String lector(double val) {
        if (val == 0) {
            return "0";
        } else if (val < 0.01) {
            return String.format("%.2e", val);
        }
        return String.format("%.2f", val);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JButton btnR1;
    private javax.swing.JButton btnR2;
    private javax.swing.JButton btnR3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbImg;
    private javax.swing.JLabel txtPreg;
    private javax.swing.JLabel txtPuntu;
    // End of variables declaration//GEN-END:variables
}
