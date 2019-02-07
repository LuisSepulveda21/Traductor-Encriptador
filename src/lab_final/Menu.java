package lab_final;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu extends javax.swing.JFrame {
    
    
void Traductor(int numero_validas,String[] Separador,int[] validas,String[] Origen,String[] Destino){
String busca_posicion="";
for (int i = 1; i <= numero_validas; i++) {
                for (int j = 1; j < Lab_Final.progreso; j=j+2) {

                    if (Separador[validas[i]].equals(Origen[j])) {
                        busca_posicion = Origen[j - 1];
                    }
                    System.out.println(Separador[validas[i]]);
                }
                for (int k = 0; k < Lab_Final.progreso; k=k+2) {

                    if (busca_posicion.equals(Destino[k])) {

                        if (i > numero_validas - 1) {
                            Traducido.setText(Traducido.getText() + Destino[k + 1]);

                        } else {
                            Traducido.setText(Traducido.getText() + Destino[k + 1] + ",");
                        }
                    }
                }
            }
}



    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Menu Principal");
        Traducido.setEditable(false);

        //FONDO
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconoDicc.png")).getImage());
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/plbVW3.gif"));

        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);

        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

    }

    void cambiazo1(String texto) {
        labelOrigen.setText("English");
        labelDestino.setText("Spanish");
        Añadir.setText("Add Words");
        accion.setText("Translate");
        labelname.setText("Dictionary");
        limite.setText("Limit");
        palabra.setText("Word");
        traduccion.setText("Translation");
        JOptionPane.showMessageDialog(null, texto, "Change", JOptionPane.INFORMATION_MESSAGE);
        Traducido.setText("");
        txtField_Atraducir.setText("");
    }

    void cambiazo2(String texto) {
        labelOrigen.setText("Español");
        labelDestino.setText("Ingles");
        Añadir.setText("Añadir Palabras");
        accion.setText("Traducir");
        labelname.setText("Diccionario");
        limite.setText("Limite");
        palabra.setText("Palabra");
        traduccion.setText("Traduccion");
        JOptionPane.showMessageDialog(null, texto, "Cambio", JOptionPane.INFORMATION_MESSAGE);
        Traducido.setText("");
        txtField_Atraducir.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        labelname = new javax.swing.JLabel();
        palabra = new javax.swing.JLabel();
        traduccion = new javax.swing.JLabel();
        txtField_Atraducir = new javax.swing.JTextField();
        Traducido = new javax.swing.JTextField();
        labelDestino = new javax.swing.JLabel();
        labelOrigen = new javax.swing.JLabel();
        accion = new javax.swing.JButton();
        cambiador = new javax.swing.JButton();
        limite = new javax.swing.JLabel();
        label_limite = new javax.swing.JLabel();
        Añadir = new javax.swing.JButton();
        Btton_Vigenere = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelname.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        labelname.setForeground(new java.awt.Color(255, 255, 255));
        labelname.setText("DICCIONARIO");

        palabra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        palabra.setForeground(new java.awt.Color(255, 255, 255));
        palabra.setText("Palabra: ");

        traduccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        traduccion.setForeground(new java.awt.Color(255, 255, 255));
        traduccion.setText("Traduccion: ");

        txtField_Atraducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField_AtraducirActionPerformed(evt);
            }
        });
        txtField_Atraducir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtField_AtraducirKeyTyped(evt);
            }
        });

        Traducido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TraducidoActionPerformed(evt);
            }
        });

        labelDestino.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        labelDestino.setForeground(new java.awt.Color(255, 255, 255));
        labelDestino.setText("Ingles");

        labelOrigen.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        labelOrigen.setForeground(new java.awt.Color(255, 255, 255));
        labelOrigen.setText("Español");

        accion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        accion.setText("Traducir");
        accion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accionActionPerformed(evt);
            }
        });

        cambiador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cambiador.setText("<—>");
        cambiador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiadorActionPerformed(evt);
            }
        });

        limite.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        limite.setForeground(new java.awt.Color(0, 255, 0));
        limite.setText("Limite:");

        label_limite.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_limite.setForeground(new java.awt.Color(204, 255, 0));
        label_limite.setText("keonda");

        Añadir.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Añadir.setText("Añadir Palabras");
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });

        Btton_Vigenere.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Btton_Vigenere.setText("Encriptacion");
        Btton_Vigenere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btton_VigenereActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(limite)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_limite)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Añadir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelname)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                                .addComponent(cambiador)
                                .addGap(101, 101, 101)
                                .addComponent(labelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(traduccion)
                            .addComponent(palabra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtField_Atraducir, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addComponent(Traducido, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(accion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Btton_Vigenere)
                        .addGap(229, 229, 229))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limite)
                    .addComponent(label_limite)
                    .addComponent(Añadir))
                .addGap(18, 18, 18)
                .addComponent(labelname)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOrigen)
                    .addComponent(cambiador)
                    .addComponent(labelDestino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(accion)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtField_Atraducir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(palabra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(traduccion)
                    .addComponent(Traducido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(Btton_Vigenere)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void txtField_AtraducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField_AtraducirActionPerformed


    }//GEN-LAST:event_txtField_AtraducirActionPerformed

    private void accionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accionActionPerformed

        Traducido.setText("");
        String[] Separador = new String[4];
        int pos_ini = 0;
        int numero_validas = 0, comprobador_validas = 0;
        int[] validas = new int[5];
        int comas = 0;
        String palabra = txtField_Atraducir.getText().toLowerCase();
        //contador de comas 
        for (int p = 0; p < palabra.length(); p++) {
            if (palabra.charAt(p) == ',') {
                comas++;
            }
        }
        if (comas > 3) {
            Lab_Final.limpiartodo("Limite de Palabras Superado (Maximo 4)");
        } else {
            comas = 0;
            // comas funciona tambien para ser  usado como indice
            // separador  de palabras
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == ',') {
                    Separador[comas] = palabra.substring(pos_ini, i);
                    pos_ini = i + 1;
                    comas++;
                }
            }
            if (comas == 0) {
                Separador[comas] = palabra.substring(comas, palabra.length());
            } else {
                Separador[comas] = palabra.substring(pos_ini, palabra.length());
            }

            for (int p = 0; p <= comas; p++) {
                for (int i = 1; i < Lab_Final.progreso; i = i + 2) {
                    if (Separador[p].equals(Lab_Final.españolper[i]) || Separador[p].equals(Lab_Final.inglesper[i])) {
                        numero_validas++;
                        validas[numero_validas] = p;

                    }
                    System.out.println(numero_validas);
                }
                comprobador_validas++;
                System.out.println(comprobador_validas);
                if (numero_validas != comprobador_validas) {
                    Lab_Final.limpiartodo("Palabra " + Separador[p] + " no Encontrada , puede añadirla en el diccionario");
                    comprobador_validas--;
                }

            }

        }

        
       
	if (labelDestino.getText().equals("Spanish")) {
        //English-Spanish
         Traductor(numero_validas,Separador,validas,Lab_Final.inglesper,Lab_Final.españolper);
          
         }else {
         //Español-Ingles
          Traductor(numero_validas,Separador,validas,Lab_Final.españolper,Lab_Final.inglesper);
         }


    }//GEN-LAST:event_accionActionPerformed

    int K = 1;
    private void cambiadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiadorActionPerformed
        int sw = 0;
        if (K == 2 && sw == 0) {
            cambiazo2("Idioma Cambiado");
            K = 1;
            sw++;
        }
        if (K == 1 && sw == 0) {
            cambiazo1("Language Changed");
            K = 2;
            sw++;
        }


    }//GEN-LAST:event_cambiadorActionPerformed

    private void TraducidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TraducidoActionPerformed

    }//GEN-LAST:event_TraducidoActionPerformed

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        if (Lab_Final.contador == Lab_Final.limite) {
            Lab_Final.limpiartodo("Usted Ya ha Alcanzado el Limite");
        } else {
            new Anadir().setVisible(true);
        }
    }//GEN-LAST:event_AñadirActionPerformed

    void limpiartodo(String texto) {
        JOptionPane.showMessageDialog(null, texto, "Error", JOptionPane.INFORMATION_MESSAGE);
    }


    private void Btton_VigenereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btton_VigenereActionPerformed
        if ("".equals(Traducido.getText())) {
            limpiartodo("No esta ingresando ninguna palabra a encriptar");
        } else {
            Lab_Final.tempvigeniere = Traducido.getText();
            new vigenere().setVisible(true);
        }
    }//GEN-LAST:event_Btton_VigenereActionPerformed

    private void txtField_AtraducirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField_AtraducirKeyTyped

        char c = evt.getKeyChar();
        String p = "" + c;
        if (Character.isDigit(c) || p.equals(" ")) {
            getToolkit().beep();

            evt.consume();

        }


    }//GEN-LAST:event_txtField_AtraducirKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Añadir;
    private javax.swing.JButton Btton_Vigenere;
    public static javax.swing.JTextField Traducido;
    private javax.swing.JButton accion;
    private javax.swing.JButton cambiador;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel labelDestino;
    private javax.swing.JLabel labelOrigen;
    public static javax.swing.JLabel label_limite;
    private javax.swing.JLabel labelname;
    private javax.swing.JLabel limite;
    private javax.swing.JLabel palabra;
    private javax.swing.JLabel traduccion;
    private javax.swing.JTextField txtField_Atraducir;
    // End of variables declaration//GEN-END:variables
}
