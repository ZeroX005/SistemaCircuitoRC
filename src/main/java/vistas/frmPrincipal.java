package vistas;

import clases.*;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.util.*;
import javax.swing.JOptionPane;

public class frmPrincipal extends javax.swing.JFrame {

    CircuitoRC pru;
    NotacionCientifica nc = new NotacionCientifica();
    frmMostProc mostProc = new frmMostProc();
    frmSeccionFormulas seccion = new frmSeccionFormulas();

    Latex latex = new Latex();

    public frmPrincipal() {
        initComponents();
        Imagenes();
        imgRC("carga");

        btnProced.setEnabled(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpMod = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtT = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        cmbC = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtR = new javax.swing.JTextField();
        cmbR = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEpsilon = new javax.swing.JTextField();
        cmbEpsilon = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbImg = new javax.swing.JLabel();
        rbtnCar = new javax.swing.JRadioButton();
        rbtnDesc = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtQ = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtl = new javax.swing.JLabel();
        btnSolucionar = new javax.swing.JButton();
        btnProced = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Circuito RC - Carga y Descarga");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("t= ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        txtT.setColumns(4);
        txtT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtT.setToolTipText("");
        txtT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTActionPerformed(evt);
            }
        });
        txtT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTKeyTyped(evt);
            }
        });
        jPanel1.add(txtT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText(" s");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 20, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("C=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, 30));

        txtC.setColumns(4);
        txtC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCKeyTyped(evt);
            }
        });
        jPanel1.add(txtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, 30));

        cmbC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "k", "m", "μ" }));
        cmbC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCActionPerformed(evt);
            }
        });
        jPanel1.add(cmbC, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 50, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText(" F");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("R=");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, 30));

        txtR.setColumns(4);
        txtR.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRKeyTyped(evt);
            }
        });
        jPanel1.add(txtR, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, 30));

        cmbR.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "k", "m", "μ" }));
        jPanel1.add(cmbR, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 50, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText(" Ω");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("ε=");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, 30));

        txtEpsilon.setColumns(4);
        txtEpsilon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEpsilon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEpsilonKeyTyped(evt);
            }
        });
        jPanel1.add(txtEpsilon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, 30));

        cmbEpsilon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbEpsilon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "k", "m", "μ" }));
        jPanel1.add(cmbEpsilon, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 50, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText(" V");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel1.setText("I: Intensidad de corriente (A)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel7.setText("R: Resistencia (Ω)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel8.setText("q: Carga (C)");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel9.setText("t: Tiempo (s)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel12.setText("ε: Fuente de fem (V)");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel13.setText("C: Capacitancia (F)");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        jPanel1.add(lbImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 301, 242));

        grpMod.add(rbtnCar);
        rbtnCar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtnCar.setSelected(true);
        rbtnCar.setText("Capacitor en carga");
        rbtnCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCarActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 180, 50));

        grpMod.add(rbtnDesc);
        rbtnDesc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtnDesc.setText("Capacitor en descarga");
        rbtnDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDescActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 210, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("q =");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 448, 30, 30));

        txtQ.setBackground(new java.awt.Color(153, 255, 153));
        txtQ.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtQ.setOpaque(true);
        jPanel1.add(txtQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 110, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText(" I =");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 488, 30, 30));

        txtl.setBackground(new java.awt.Color(153, 255, 153));
        txtl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtl.setOpaque(true);
        jPanel1.add(txtl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 110, 30));

        btnSolucionar.setBackground(new java.awt.Color(51, 102, 255));
        btnSolucionar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSolucionar.setForeground(new java.awt.Color(255, 255, 255));
        btnSolucionar.setText("SOLUCIONAR");
        btnSolucionar.setBorder(null);
        btnSolucionar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSolucionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolucionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSolucionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 220, 50));

        btnProced.setBackground(new java.awt.Color(204, 0, 0));
        btnProced.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnProced.setForeground(new java.awt.Color(255, 255, 255));
        btnProced.setText("Mostrar procedimiento");
        btnProced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcedActionPerformed(evt);
            }
        });
        jPanel1.add(btnProced, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 220, -1));

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 100, 80));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(45, 30));

        jMenu1.setText("Menú");

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem3.setText("Modo quiz");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem4.setText("Formulas RC");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private double inter(double val, int ind) {

        switch (ind) {
            case 0 -> {
                return val;
            }
            case 1 -> {
                return val * Math.pow(10, 3);
            }
            case 2 -> {
                return val * Math.pow(10, -3);
            }
            case 3 -> {
                return val * Math.pow(10, -6);
            }
        }
        return 0;
    }

    public void imgRC(String cad) {
        ImageIcon img = new ImageIcon(getClass().getResource("/imagenes/" + cad + ".png"));
        Image imgsc = img.getImage().getScaledInstance(lbImg.getWidth(), lbImg.getHeight(), Image.SCALE_SMOOTH);
        lbImg.setIcon(new ImageIcon(imgsc));
    }

    public void Imagenes() {
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/imagenes/pizarra.png"));
        Image img1 = icon1.getImage();
        Image imgScale1 = img1.getScaledInstance(frmMostProc.fondo2.getWidth(), frmMostProc.fondo2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ajustarimg1 = new ImageIcon(imgScale1);
        frmMostProc.fondo2.setIcon(ajustarimg1);

        ImageIcon icon2 = new ImageIcon(getClass().getResource("/imagenes/limpiarOff.png"));
        btnLimpiar.setIcon(icon2);

    }

    public void personaje(String x) {
        ImageIcon img2 = new ImageIcon(getClass().getResource("/imagenes/" + x + ".png"));
        Image imgsc2 = img2.getImage().getScaledInstance(frmMostProc.prof.getWidth(), frmMostProc.prof.getHeight(), Image.SCALE_SMOOTH);
        frmMostProc.prof.setIcon(new ImageIcon(imgsc2));

    }


    private void rbtnCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCarActionPerformed
        imgRC("carga");
    }//GEN-LAST:event_rbtnCarActionPerformed

    private void rbtnDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDescActionPerformed
        imgRC("descarga");
    }//GEN-LAST:event_rbtnDescActionPerformed

    private void btnSolucionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolucionarActionPerformed
        if (txtT.getText().equals("0") || txtC.getText().equals("0") || txtR.getText().equals("0") || txtEpsilon.getText().equals("0")) {
            JOptionPane.showMessageDialog(null, "El número no puede ser 0");
        } else {
            try {
                double ep = inter(Double.parseDouble(txtEpsilon.getText()), cmbEpsilon.getSelectedIndex());
                double c = inter(Double.parseDouble(txtC.getText()), cmbC.getSelectedIndex());
                double r = inter(Double.parseDouble(txtR.getText()), cmbR.getSelectedIndex());
                double t = Double.parseDouble(txtT.getText());
                String notCQ, notCI;
                String ncC, ncR, ncEP, ncT;
                ncEP = nc.NotacionLatex(ep);
                ncC = nc.NotacionLatex(c);
                ncR = nc.NotacionLatex(r);
                ncT = nc.NotacionLatex(t);
                String linea1_A = "{q = (" + ncEP + ")(" + ncC + ")[1-e^{-\\frac{" + ncT + "}{(" + ncR + ")(" + ncC + ")}}]";
                String linea1_B = "{I = \\frac{" + ncEP + "}{" + ncR + "}e^{-\\frac{" + ncT + "}{(" + ncR + ")(" + ncC + ")}}";
                frmMostProc.line1a.setIcon(latex.conversionLaTex(linea1_A, 25));
                frmMostProc.line1b.setIcon(latex.conversionLaTex(linea1_B, 25));

                if (rbtnCar.isSelected()) {
                    pru = new FormulasCarga(ep, c, r, t);
                    notCQ = nc.NotacionLatex(pru.q());
                    notCI = nc.NotacionLatex(pru.i());
                    txtQ.setIcon(latex.conversionLaTex(notCQ + "C", 15));
                    txtl.setIcon(latex.conversionLaTex(notCI + "A", 15));

                    frmMostProc.formulaQ.setIcon(latex.conversionLaTex("\\fcolorbox{F02727}{F0AA27}{q = ɛC(1-e^{-t/RC})}", 22));
                    frmMostProc.formulaI.setIcon(latex.conversionLaTex("\\fcolorbox{F02727}{F0AA27}{I = \\frac{ɛ}{R}e^{-t/RC}}", 22));
                    frmMostProc.line2a.setIcon(latex.conversionLaTex("\\fcolorbox{ed7d31}{fbe5d6}{q = " + notCQ + "C}", 19));
                    frmMostProc.line2b.setIcon(latex.conversionLaTex("\\fcolorbox{70ad47}{e2f0d9}{I = " + notCI + "A}", 19));

                    frmMostProc.tituloMP.setText("CAPACITOR EN CARGA");

                } else {
                    pru = new FormulasDescarga(ep, c, r, t);
                    notCQ = nc.NotacionLatex(pru.q());
                    notCI = nc.NotacionLatex(pru.i());
                    txtQ.setIcon(latex.conversionLaTex(notCQ + "C", 15));
                    txtl.setIcon(latex.conversionLaTex(notCI + "A", 15));

                    frmMostProc.formulaQ.setIcon(latex.conversionLaTex("\\fcolorbox{F02727}{F0AA27}{q = ɛCe^{-t/RC}", 22));
                    frmMostProc.formulaI.setIcon(latex.conversionLaTex("\\fcolorbox{F02727}{F0AA27}{I = -\\frac{ɛ}{R}e^{-t/RC}", 22));
                    frmMostProc.line2a.setIcon(latex.conversionLaTex("\\fcolorbox{ed7d31}{fbe5d6}{q = " + notCQ + "C}", 19));
                    frmMostProc.line2b.setIcon(latex.conversionLaTex("\\fcolorbox{70ad47}{e2f0d9}{I = " + notCI + "A}", 19));

                    frmMostProc.tituloMP.setText("CAPACITOR EN DESCARGA");
                }

                frmMostProc.jLabel17.setText("Reemplazamos los datos:");
                frmMostProc.jLabel18.setText("Reemplazamos los datos:");
                personaje("profesora");
                btnProced.setEnabled(true);
                mostProc.setVisible(false);
            } catch (Exception e) {
                if (txtT.getText().equals("") || txtC.getText().equals("") || txtR.getText().equals("") || txtEpsilon.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Complete todos los campos");
                } else {
                    JOptionPane.showMessageDialog(null, "Hay datos incorrectos");
                }
            }
        }
    }//GEN-LAST:event_btnSolucionarActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        frmQuiz frm = new frmQuiz();
        this.setVisible(false);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void cmbCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCActionPerformed

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        btnLimpiar.setText("Limpiar");
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/imagenes/limpiarOn.png"));
        btnLimpiar.setIcon(icon2);
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setText("");
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/imagenes/limpiarOff.png"));
        btnLimpiar.setIcon(icon2);
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnProcedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcedActionPerformed
        mostProc.setVisible(true);
    }//GEN-LAST:event_btnProcedActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        btnProced.setEnabled(false);
        txtT.setText("");
        txtC.setText("");
        txtR.setText("");
        txtEpsilon.setText("");
        txtQ.setIcon(latex.conversionLaTex("", 15));
        txtl.setIcon(latex.conversionLaTex("", 15));
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        seccion.setVisible(true);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void txtTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTActionPerformed

    }//GEN-LAST:event_txtTActionPerformed

    private void txtTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTKeyTyped

        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        }

        if (evt.getKeyChar() == '.' && txtT.getText().contains(".")) {
            evt.consume();
        }

        if (txtT.getText().length() >= 7) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }

    }//GEN-LAST:event_txtTKeyTyped

    private void txtCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCKeyTyped

        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        }

        if (evt.getKeyChar() == '.' && txtC.getText().contains(".")) {
            evt.consume();
        }

        if (txtC.getText().length() >= 7) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }


    }//GEN-LAST:event_txtCKeyTyped

    private void txtRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRKeyTyped

        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        }

        if (evt.getKeyChar() == '.' && txtR.getText().contains(".")) {
            evt.consume();
        }

        if (txtR.getText().length() >= 7) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }

    }//GEN-LAST:event_txtRKeyTyped

    private void txtEpsilonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEpsilonKeyTyped

        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        }

        if (evt.getKeyChar() == '.' && txtEpsilon.getText().contains(".")) {
            evt.consume();
        }

        if (txtEpsilon.getText().length() >= 7) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }

    }//GEN-LAST:event_txtEpsilonKeyTyped

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProced;
    private javax.swing.JButton btnSolucionar;
    protected static javax.swing.JComboBox<String> cmbC;
    protected static javax.swing.JComboBox<String> cmbEpsilon;
    protected static javax.swing.JComboBox<String> cmbR;
    private javax.swing.ButtonGroup grpMod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lbImg;
    private javax.swing.JRadioButton rbtnCar;
    private javax.swing.JRadioButton rbtnDesc;
    protected static javax.swing.JTextField txtC;
    protected static javax.swing.JTextField txtEpsilon;
    protected static javax.swing.JLabel txtQ;
    protected static javax.swing.JTextField txtR;
    protected static javax.swing.JTextField txtT;
    protected static javax.swing.JLabel txtl;
    // End of variables declaration//GEN-END:variables
}
