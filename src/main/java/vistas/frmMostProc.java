package vistas;

public class frmMostProc extends javax.swing.JFrame {

    public frmMostProc() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        formulaI = new javax.swing.JLabel();
        formulaQ = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        line1a = new javax.swing.JLabel();
        line2a = new javax.swing.JLabel();
        line1b = new javax.swing.JLabel();
        line2b = new javax.swing.JLabel();
        prof = new javax.swing.JLabel();
        tituloMP = new javax.swing.JLabel();
        fondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Procedimiento");
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formulaI.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jPanel2.add(formulaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 230, 70));

        formulaQ.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jPanel2.add(formulaQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, 60));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        line1a.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        line1a.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(line1a, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 600, 48));

        line2a.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jPanel2.add(line2a, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 200, 60));

        line1b.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        line1b.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(line1b, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 600, 60));

        line2b.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jPanel2.add(line2b, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 200, 60));
        jPanel2.add(prof, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 360, 310));

        tituloMP.setFont(new java.awt.Font("Segoe UI Black", 1, 28)); // NOI18N
        tituloMP.setForeground(new java.awt.Color(255, 236, 15));
        tituloMP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tituloMP.setToolTipText("");
        jPanel2.add(tituloMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 410, 40));
        jPanel2.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMostProc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel fondo2;
    public static javax.swing.JLabel formulaI;
    public static javax.swing.JLabel formulaQ;
    public static javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel line1a;
    public static javax.swing.JLabel line1b;
    public static javax.swing.JLabel line2a;
    public static javax.swing.JLabel line2b;
    public static javax.swing.JLabel prof;
    public static javax.swing.JLabel tituloMP;
    // End of variables declaration//GEN-END:variables
}
