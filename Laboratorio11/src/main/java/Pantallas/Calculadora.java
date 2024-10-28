package Pantallas;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_cerrar = new javax.swing.JButton();
        lbl_resultado = new javax.swing.JLabel();
        btn_porcentaje = new javax.swing.JLabel();
        btn_division = new javax.swing.JLabel();
        lbl_7 = new javax.swing.JLabel();
        lbl_8 = new javax.swing.JLabel();
        lbl_9 = new javax.swing.JLabel();
        btn_multiplicar = new javax.swing.JLabel();
        lbl_4 = new javax.swing.JLabel();
        lbl_5 = new javax.swing.JLabel();
        lbl_6 = new javax.swing.JLabel();
        btn_resta = new javax.swing.JLabel();
        btn_1 = new javax.swing.JLabel();
        lbl_2 = new javax.swing.JLabel();
        lbl_3 = new javax.swing.JLabel();
        btn_suma = new javax.swing.JLabel();
        lbl_0 = new javax.swing.JLabel();
        lbl_punto = new javax.swing.JLabel();
        btn_igual = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_cerrar.setText("x");
        lbl_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(lbl_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        lbl_resultado.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel1.add(lbl_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 210, 80));

        btn_porcentaje.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanchez Mesia\\OneDrive\\Documentos\\NetBeansProjects\\Grupo3-TPOO-11767\\Laboratorio11\\src\\main\\java\\Pantallas\\Button_porcentaje.png")); // NOI18N
        btn_porcentaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_porcentajeMouseClicked(evt);
            }
        });
        jPanel1.add(btn_porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 60, 50));

        btn_division.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanchez Mesia\\OneDrive\\Documentos\\NetBeansProjects\\Grupo3-TPOO-11767\\Laboratorio11\\src\\main\\java\\Pantallas\\Button_division.png")); // NOI18N
        btn_division.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_divisionMouseClicked(evt);
            }
        });
        jPanel1.add(btn_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 70, 50));

        lbl_7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanchez Mesia\\OneDrive\\Documentos\\NetBeansProjects\\Grupo3-TPOO-11767\\Laboratorio11\\src\\main\\java\\Pantallas\\Button_7.png")); // NOI18N
        lbl_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_7MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 50, 40));

        lbl_8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanchez Mesia\\OneDrive\\Documentos\\NetBeansProjects\\Grupo3-TPOO-11767\\Laboratorio11\\src\\main\\java\\Pantallas\\Button_8.png")); // NOI18N
        lbl_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_8MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 50, 60));

        lbl_9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanchez Mesia\\OneDrive\\Documentos\\NetBeansProjects\\Grupo3-TPOO-11767\\Laboratorio11\\src\\main\\java\\Pantallas\\Button_9.png")); // NOI18N
        lbl_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_9MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 50, 60));

        btn_multiplicar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanchez Mesia\\OneDrive\\Documentos\\NetBeansProjects\\Grupo3-TPOO-11767\\Laboratorio11\\src\\main\\java\\Pantallas\\Button_multiplicacion.png")); // NOI18N
        btn_multiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_multiplicarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 50, 50));

        lbl_4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanchez Mesia\\OneDrive\\Documentos\\NetBeansProjects\\Grupo3-TPOO-11767\\Laboratorio11\\src\\main\\java\\Pantallas\\Button_4.png")); // NOI18N
        lbl_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_4MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 50, 60));

        lbl_5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanchez Mesia\\OneDrive\\Documentos\\NetBeansProjects\\Grupo3-TPOO-11767\\Laboratorio11\\src\\main\\java\\Pantallas\\Button_5.png")); // NOI18N
        lbl_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_5MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 50, 60));

        lbl_6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanchez Mesia\\OneDrive\\Documentos\\NetBeansProjects\\Grupo3-TPOO-11767\\Laboratorio11\\src\\main\\java\\Pantallas\\Button_6.png")); // NOI18N
        lbl_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_6MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 50, 60));

        btn_resta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanchez Mesia\\OneDrive\\Documentos\\NetBeansProjects\\Grupo3-TPOO-11767\\Laboratorio11\\src\\main\\java\\Pantallas\\Button_resta.png")); // NOI18N
        btn_resta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_restaMouseClicked(evt);
            }
        });
        jPanel1.add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 50, 60));

        btn_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanchez Mesia\\OneDrive\\Documentos\\NetBeansProjects\\Grupo3-TPOO-11767\\Laboratorio11\\src\\main\\java\\Pantallas\\Button_1.png")); // NOI18N
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_1MouseClicked(evt);
            }
        });
        jPanel1.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 50, 70));

        lbl_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanchez Mesia\\OneDrive\\Documentos\\NetBeansProjects\\Grupo3-TPOO-11767\\Laboratorio11\\src\\main\\java\\Pantallas\\Button_2.png")); // NOI18N
        lbl_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_2MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 50, 70));

        lbl_3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanchez Mesia\\OneDrive\\Documentos\\NetBeansProjects\\Grupo3-TPOO-11767\\Laboratorio11\\src\\main\\java\\Pantallas\\Button_3.png")); // NOI18N
        lbl_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_3MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 50, 70));

        btn_suma.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanchez Mesia\\OneDrive\\Documentos\\NetBeansProjects\\Grupo3-TPOO-11767\\Laboratorio11\\src\\main\\java\\Pantallas\\Button_suma.png")); // NOI18N
        btn_suma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sumaMouseClicked(evt);
            }
        });
        jPanel1.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 50, 60));

        lbl_0.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanchez Mesia\\OneDrive\\Documentos\\NetBeansProjects\\Grupo3-TPOO-11767\\Laboratorio11\\src\\main\\java\\Pantallas\\Button_0.png")); // NOI18N
        lbl_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_0MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, 50));

        lbl_punto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanchez Mesia\\OneDrive\\Documentos\\NetBeansProjects\\Grupo3-TPOO-11767\\Laboratorio11\\src\\main\\java\\Pantallas\\Button_punto.png")); // NOI18N
        lbl_punto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_puntoMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 50, 50));

        btn_igual.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanchez Mesia\\OneDrive\\Documentos\\NetBeansProjects\\Grupo3-TPOO-11767\\Laboratorio11\\src\\main\\java\\Pantallas\\Button_igual.png")); // NOI18N
        btn_igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_igualMouseClicked(evt);
            }
        });
        jPanel1.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 50, 50));

        btn_limpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanchez Mesia\\OneDrive\\Documentos\\NetBeansProjects\\Grupo3-TPOO-11767\\Laboratorio11\\src\\main\\java\\Pantallas\\Button.png")); // NOI18N
        btn_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_limpiarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseClicked
        lbl_resultado.setText("");
        lbl_resultado.setText("");
        op="";
        n1="";
        n2="";
    }//GEN-LAST:event_btn_limpiarMouseClicked

    private void btn_igualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_igualMouseClicked
        if (op != ""){
            n2 = lbl_resultado.getText();
            switch(op){
                case "+":
                lbl_resultado.setText(oper.suma(Integer.parseInt(n1), Integer.parseInt(n2)));
                break;
                case "-":
                lbl_resultado.setText(oper.resta(Integer.parseInt(n1), Integer.parseInt(n2)));
                break;
                case "/":
                lbl_resultado.setText(oper.division(Integer.parseInt(n1), Integer.parseInt(n2)));
                break;
                case "*":
                lbl_resultado.setText(oper.multiplicacion(Integer.parseInt(n1), Integer.parseInt(n2)).toString());
                break;
                case "%":
                    int num = Integer.parseInt(n1) * Integer.parseInt(n2) / 100;
                lbl_resultado.setText(num + "");
                break;
            }
            n1 = "";
            n2 = "";
            op="";
        }
    }//GEN-LAST:event_btn_igualMouseClicked

    private void lbl_puntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_puntoMouseClicked
        if (!lbl_resultado.getText().contains("."))
        {
            lbl_resultado.setText(lbl_resultado.getText() + ".");
        }
    }//GEN-LAST:event_lbl_puntoMouseClicked

    private void lbl_0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_0MouseClicked
        lbl_resultado.setText(lbl_resultado.getText() + "0");
    }//GEN-LAST:event_lbl_0MouseClicked

    private void btn_sumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sumaMouseClicked
        op = "+";
        n1 = lbl_resultado.getText();
        lbl_resultado.setText("");
    }//GEN-LAST:event_btn_sumaMouseClicked

    private void lbl_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_3MouseClicked
        lbl_resultado.setText(lbl_resultado.getText() + "3");
    }//GEN-LAST:event_lbl_3MouseClicked

    private void lbl_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_2MouseClicked
        lbl_resultado.setText(lbl_resultado.getText() + "2");
    }//GEN-LAST:event_lbl_2MouseClicked

    private void btn_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseClicked
        lbl_resultado.setText(lbl_resultado.getText() + "1");
    }//GEN-LAST:event_btn_1MouseClicked

    private void btn_restaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_restaMouseClicked
        op = "-";
        n1 = lbl_resultado.getText();
        lbl_resultado.setText("");
    }//GEN-LAST:event_btn_restaMouseClicked

    private void lbl_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_6MouseClicked
        lbl_resultado.setText(lbl_resultado.getText() + "6");
    }//GEN-LAST:event_lbl_6MouseClicked

    private void lbl_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_5MouseClicked
        lbl_resultado.setText(lbl_resultado.getText() + "5");
    }//GEN-LAST:event_lbl_5MouseClicked

    private void lbl_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_4MouseClicked
        lbl_resultado.setText(lbl_resultado.getText() + "4");
    }//GEN-LAST:event_lbl_4MouseClicked

    private void btn_multiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_multiplicarMouseClicked
        op = "*";
        n1 = lbl_resultado.getText();
        lbl_resultado.setText("");
    }//GEN-LAST:event_btn_multiplicarMouseClicked

    private void lbl_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_9MouseClicked
        lbl_resultado.setText(lbl_resultado.getText() + "9");
    }//GEN-LAST:event_lbl_9MouseClicked

    private void lbl_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_8MouseClicked
        lbl_resultado.setText(lbl_resultado.getText() + "8");
    }//GEN-LAST:event_lbl_8MouseClicked

    private void lbl_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_7MouseClicked
        lbl_resultado.setText(lbl_resultado.getText() + "7");
    }//GEN-LAST:event_lbl_7MouseClicked

    private void btn_divisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_divisionMouseClicked
        op = "/";
        n1 = lbl_resultado.getText();
        lbl_resultado.setText("");
    }//GEN-LAST:event_btn_divisionMouseClicked

    private void btn_porcentajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_porcentajeMouseClicked
        op = "%";
        n1 = lbl_resultado.getText();
        lbl_resultado.setText("");
    }//GEN-LAST:event_btn_porcentajeMouseClicked

    private void lbl_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_lbl_cerrarActionPerformed
    String op;
    String n1="";
    String n2="";
    Operaciones oper = new Operaciones();
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_1;
    private javax.swing.JLabel btn_division;
    private javax.swing.JLabel btn_igual;
    private javax.swing.JLabel btn_limpiar;
    private javax.swing.JLabel btn_multiplicar;
    private javax.swing.JLabel btn_porcentaje;
    private javax.swing.JLabel btn_resta;
    private javax.swing.JLabel btn_suma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_0;
    private javax.swing.JLabel lbl_2;
    private javax.swing.JLabel lbl_3;
    private javax.swing.JLabel lbl_4;
    private javax.swing.JLabel lbl_5;
    private javax.swing.JLabel lbl_6;
    private javax.swing.JLabel lbl_7;
    private javax.swing.JLabel lbl_8;
    private javax.swing.JLabel lbl_9;
    private javax.swing.JButton lbl_cerrar;
    private javax.swing.JLabel lbl_punto;
    private javax.swing.JLabel lbl_resultado;
    // End of variables declaration//GEN-END:variables
}
