package vistas;

import clases.Latex;

public class frmSeccionFormulas extends javax.swing.JFrame {

    Latex latex = new Latex();

    public frmSeccionFormulas() {
        initComponents();
        Formulas();

        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtQC = new javax.swing.JLabel();
        txtIC = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtQD = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulas");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulas Circuito RC");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 260, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Capacitor en carga");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 260, -1));

        txtQC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtQC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtQC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 260, 50));

        txtIC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 260, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Intensidad de Corriente (I)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 260, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Carga (q)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 260, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Capacitor en descarga");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 260, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Carga (q)");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 260, -1));

        txtQD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtQD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtQD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 260, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Intensidad de Corriente (I)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 260, -1));

        txtID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 260, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Formulas() {
        int tamaño = 18;
        txtQC.setIcon(latex.conversionLaTex("\\fcolorbox{F02727}{F0AA27}{q = ɛC(1-e^{-t/RC})}", tamaño));
        txtIC.setIcon(latex.conversionLaTex("\\fcolorbox{F02727}{F0AA27}{I = \\frac{ɛ}{R}e^{-t/RC}}", tamaño));
        txtQD.setIcon(latex.conversionLaTex("\\fcolorbox{F02727}{F0AA27}{q = ɛCe^{-t/RC}", tamaño));
        txtID.setIcon(latex.conversionLaTex("\\fcolorbox{F02727}{F0AA27}{I = -\\frac{ɛ}{R}e^{-t/RC}", tamaño));

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSeccionFormulas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtIC;
    private javax.swing.JLabel txtID;
    private javax.swing.JLabel txtQC;
    private javax.swing.JLabel txtQD;
    // End of variables declaration//GEN-END:variables
}
