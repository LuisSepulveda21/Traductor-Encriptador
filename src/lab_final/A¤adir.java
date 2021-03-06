/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_final;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Luis Sepulveda
 */
public class Anadir extends javax.swing.JFrame {

    public Anadir() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Añadir");

        //FONDO
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icon_añadir.png")).getImage());
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/fondo.jpg"));

        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);

        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_añadir = new javax.swing.JLabel();
        label_español = new javax.swing.JLabel();
        label_ingles = new javax.swing.JLabel();
        unico = new javax.swing.JTextField();
        ingles = new javax.swing.JTextField();
        label_idioma1 = new javax.swing.JLabel();
        label_idioma2 = new javax.swing.JLabel();
        btton_cambio = new javax.swing.JButton();
        btton_salir = new javax.swing.JButton();
        btton_add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        label_añadir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_añadir.setForeground(new java.awt.Color(204, 204, 204));
        label_añadir.setText("Añadir palabras");

        label_español.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        label_español.setForeground(new java.awt.Color(204, 204, 204));
        label_español.setText("Español:");

        label_ingles.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        label_ingles.setForeground(new java.awt.Color(204, 204, 204));
        label_ingles.setText("Ingles:");

        unico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unicoActionPerformed(evt);
            }
        });
        unico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unicoKeyTyped(evt);
            }
        });

        ingles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inglesActionPerformed(evt);
            }
        });
        ingles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inglesKeyTyped(evt);
            }
        });

        label_idioma1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        label_idioma1.setForeground(new java.awt.Color(255, 255, 255));
        label_idioma1.setText("Idioma actual:");

        label_idioma2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        label_idioma2.setForeground(new java.awt.Color(204, 204, 204));
        label_idioma2.setText("Español");

        btton_cambio.setText("Cambiar idioma de traduccion");
        btton_cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btton_cambioActionPerformed(evt);
            }
        });

        btton_salir.setText("Salir");
        btton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btton_salirActionPerformed(evt);
            }
        });

        btton_add.setText("Agregar");
        btton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btton_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_español)
                            .addComponent(label_ingles))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ingles, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(unico)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(label_añadir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(label_idioma1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_idioma2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btton_cambio)
                        .addGap(26, 26, 26)
                        .addComponent(btton_salir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(btton_add)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_idioma1)
                    .addComponent(label_idioma2))
                .addGap(2, 2, 2)
                .addComponent(label_añadir)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_español)
                    .addComponent(unico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_ingles)
                    .addComponent(ingles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btton_salir)
                    .addComponent(btton_cambio)
                    .addComponent(btton_add))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void añadir(int i, String temp, int caso, String[] vectoraordenar) {
        int ver = 0;
        //string x viene a tomar la posicion del vector que se busca ordenar 
        int Posicion = i - 1;
        while ((vectoraordenar[Posicion].compareTo(temp)) > 0 && (Posicion > 0) && (ver == 0)) {
            vectoraordenar[Posicion + 1] = vectoraordenar[Posicion - 1];
            vectoraordenar[Posicion + 2] = vectoraordenar[Posicion];
           
                Posicion = Posicion - 2;
            if (Posicion < 1) {
                ver=1;
                Posicion=1;
            }
         

        }
        if (ver == 1) {
            Posicion--;
            vectoraordenar[Posicion] = Integer.toString(Lab_Final.contador);
            Posicion++;
            vectoraordenar[Posicion] = temp;
            // puesto que no aumenta si es uno y esto no es una computadora cuantica , no pueden haber 1 valor 
            //para dos casos (la condicion anterior iguala el caso de kko==1 y kko==3 ) 
        } else {
            Posicion++;
            vectoraordenar[Posicion] = Integer.toString(Lab_Final.contador);
            Posicion++;
            vectoraordenar[Posicion] = temp;
        }
        if (caso == 0) {
            // 0 para español y lo que sea para ingles 
            Lab_Final.españolper = vectoraordenar;
        } else {
            Lab_Final.inglesper = vectoraordenar;
        }

    }
    private void unicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unicoActionPerformed

    private void btton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btton_salirActionPerformed
        dispose();
    }//GEN-LAST:event_btton_salirActionPerformed

    private void btton_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btton_cambioActionPerformed
        int K = 0;
        if (label_idioma2.getText().equals("Español")) {
            label_idioma1.setText("Actual Language:");
            label_idioma2.setText("English");
            label_añadir.setText("Add Words");
            label_español.setText("English");
            label_ingles.setText("Spanish");
            btton_cambio.setText("Change language to translate");
            btton_salir.setText("Finish");
            btton_add.setText("Add");
            K = 1;
        }
        if (label_idioma2.getText().equals("English") && K == 0) {
            label_idioma1.setText("Idioma Actual:");
            label_idioma2.setText("Español");
            label_añadir.setText("Agregar Palabras");
            label_español.setText("Español");
            label_ingles.setText("Ingles");
            btton_cambio.setText("Cambiar idioma de traduccion");
            btton_salir.setText("Salir");
            btton_add.setText("Agregar");
        }

    }//GEN-LAST:event_btton_cambioActionPerformed

    private void btton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btton_addActionPerformed

        if (Lab_Final.contador == Lab_Final.limite) {
            Lab_Final.limpiartodo("Limite de Palabras Alcanzado");
        } else {
            int i = Lab_Final.progreso;

            int sw = 0;

            String temp = unico.getText().toLowerCase();
            String temp2 = ingles.getText().toLowerCase();

            for (int p = 1; p < i; p = p + 2) {
                if (temp.equals(Lab_Final.españolper[p]) || temp.equals(Lab_Final.inglesper[p])) {
                    sw = 1;
                }
                if (temp2.equals(Lab_Final.inglesper[p]) || temp2.equals(Lab_Final.españolper[p])) {
                    sw = 1;
                }
            }
            if (sw == 1) {
                Lab_Final.limpiartodo("Palabra ya existente");

            } else {
                Lab_Final.progreso = Lab_Final.progreso + 2;
                Lab_Final.contador = Lab_Final.contador + 1;
                añadir(i, temp, 0, Lab_Final.españolper);
                añadir(i, temp2, 1, Lab_Final.inglesper);
                Lab_Final.limpiartodo("Operacion Exitosa");
            }
            for (int t = 0; t < Lab_Final.progreso; t++) {
                System.out.println(Lab_Final.españolper[t]);
            }

        }
    }//GEN-LAST:event_btton_addActionPerformed

    private void inglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inglesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inglesActionPerformed

    private void unicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unicoKeyTyped
        char c = evt.getKeyChar();
        String p = "" + c;
        if (Character.isDigit(c) || p.equals(" ")) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_unicoKeyTyped

    private void inglesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inglesKeyTyped
        char c = evt.getKeyChar();
        String p = "" + c;
        if (Character.isDigit(c) || p.equals(" ")) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_inglesKeyTyped

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
            java.util.logging.Logger.getLogger(Anadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anadir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btton_add;
    private javax.swing.JButton btton_cambio;
    private javax.swing.JButton btton_salir;
    private javax.swing.JTextField ingles;
    private javax.swing.JLabel label_añadir;
    private javax.swing.JLabel label_español;
    private javax.swing.JLabel label_idioma1;
    private javax.swing.JLabel label_idioma2;
    private javax.swing.JLabel label_ingles;
    private javax.swing.JTextField unico;
    // End of variables declaration//GEN-END:variables
}
