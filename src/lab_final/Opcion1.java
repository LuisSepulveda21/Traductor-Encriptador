
package lab_final;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Opcion1 extends javax.swing.JFrame {

    public Opcion1() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Opcion 1");
        
         //FONDO
     
    setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
    ((JPanel)getContentPane()).setOpaque(false);
    ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/fondo.jpg"));
    
    JLabel fondo= new JLabel(); fondo.setIcon(uno); 
    getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER); 
    
    fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
    }
    
    
 void limpiartodo(String texto){
TxtOp.setText("");
JOptionPane.showMessageDialog(null,texto,"Error", JOptionPane.INFORMATION_MESSAGE);
}




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtOp = new javax.swing.JTextField();
        Option = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Por favor introduzca el nuevo limite");

        TxtOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOpActionPerformed(evt);
            }
        });

        Option.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Option.setText("Continuar");
        Option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(TxtOp, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(Option)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(TxtOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Option)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionActionPerformed
  
        Lab_Final.limite= Integer.parseInt(TxtOp.getText()); 
        System.out.println(Lab_Final.limite);
        if (Lab_Final.limite<10 || Lab_Final.limite>100) {
            limpiartodo("El limite establecido no es posible");
        }
        else{
        new Menu().setVisible(true);
        Menu.label_limite.setText(String.valueOf(Lab_Final.limite));
        dispose();
        }
    }//GEN-LAST:event_OptionActionPerformed

    private void TxtOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOpActionPerformed
      
    }//GEN-LAST:event_TxtOpActionPerformed

    
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opcion1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Option;
    private javax.swing.JTextField TxtOp;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
