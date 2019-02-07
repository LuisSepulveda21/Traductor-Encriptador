package lab_final;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Opciones extends javax.swing.JFrame {

    public Opciones() {

        initComponents();

        setLocationRelativeTo(null);

        setResizable(false);

        setTitle("Opciones");

        //FONDO
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/fondo.jpg"));

        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);

        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Opc1 = new javax.swing.JButton();
        Opc2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LIMITE POR DEFECTO: (100)");

        Opc1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Opc1.setText("Usar limite por defecto");
        Opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opc1ActionPerformed(evt);
            }
        });

        Opc2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Opc2.setText("Cambiar limite");
        Opc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opc2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Opc1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Opc2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Opc1)
                .addGap(18, 18, 18)
                .addComponent(Opc2)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opc1ActionPerformed

        new Menu().setVisible(true);
        Menu.label_limite.setText("100");
        Lab_Final.limite = 100;
        System.out.println(Lab_Final.limite);
        dispose();
        
    }//GEN-LAST:event_Opc1ActionPerformed

    private void Opc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opc2ActionPerformed
        new Opcion1().setVisible(true);
        dispose();

    }//GEN-LAST:event_Opc2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Opc1;
    private javax.swing.JButton Opc2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
