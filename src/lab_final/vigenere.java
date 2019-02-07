package lab_final;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class vigenere extends javax.swing.JFrame {

    public vigenere() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Vigenere");
        //FONDO
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/fondo.jpg"));

        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);

        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
        texto.setText(String.valueOf(Lab_Final.tempvigeniere));
        texto.setEditable(false);
        ClaveVigenere.setEditable(false);
        Ascii.setEditable(false);
        Binario.setEditable(false);
        EncripEnig.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        texto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        clave = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ClaveVigenere = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        desencriptar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Encriptar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Ascii = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Binario = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        Clavenigma = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        EncripEnig = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("---------------------Encriptacion---------------------- ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Texto:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("ClaveVigenere:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("EncriptadoVigenere:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Ascii:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Binario:");

        desencriptar.setText("Desencriptacion");
        desencriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desencriptarActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Encriptar.setText("Encriptar");
        Encriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncriptarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(Ascii);

        jScrollPane1.setViewportView(Binario);

        jLabel7.setBackground(new java.awt.Color(204, 204, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setText("ClaveEnigmatica:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 255));
        jLabel8.setText("EncriptadoEnigmatica: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ClaveVigenere, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(texto, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(clave, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Clavenigma, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(desencriptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Encriptar)
                        .addGap(65, 65, 65)
                        .addComponent(jButton2)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EncripEnig, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Clavenigma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(EncripEnig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClaveVigenere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(54, 54, 54)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(65, 65, 65)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Encriptar)
                    .addComponent(jButton2)
                    .addComponent(desencriptar))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncriptarActionPerformed

        String clave1;
        String clave2;
        String palabra;
        String result = "";
        String result2 = "";
        String result3 = "";
        String result0 = "";

        if (clave.getText().equals("") || Clavenigma.getText().equals("") || Clavenigma.getText().length() != 3) {
            limpiartodo("Ingrese una clave valida ");
        } else {

            palabra = texto.getText();
            clave1 = Clavenigma.getText();
            clave2 = clave.getText();

            result0 = Enigmatica(clave1, palabra);
            result = cifrado(clave2, result0);
            result2 = ascii(result);
            result3 = binario(result2);
            Binario.setText(result3);

            limpiartodo(result0);
            limpiartodo(result);
            limpiartodo(result2);

            texto.setText("");
            clave.setText("");
            ClaveVigenere.setText("");
            Clavenigma.setText("");
            Binario.setEditable(true);
        }

    }//GEN-LAST:event_EncriptarActionPerformed

    void limpiartodo(String text) {
        JOptionPane.showMessageDialog(null, text, "Encriptacion Realizada", JOptionPane.INFORMATION_MESSAGE);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static String Enigmatica(String clave, String palabra) {

        String[] vlave = new String[3];
        int contador = 0;

        char MensajeCifrado[] = new char[100];

        String Resultado = "";

        String abecedario = "abcdefghijklmnñopqrstuvwxyz";

        int pos1 = 0;
        int pos2 = 0;

        int posuno = 0;

        for (int i = 0; i < 3; i++) {
            vlave[i] = "" + clave.charAt(i);
        }
        

        for (int i = 0; i < palabra.length(); i++) {


            if (palabra.charAt(i) == ',') {

                MensajeCifrado[contador] = ',';

                contador++;
            } else {

                for (int j = 0; j < abecedario.length(); j++) {
                    if (abecedario.charAt(j) == palabra.charAt(i)) {
                        pos1 = j;
                    }
                } 
                pos2=0;
                for (int j = 0; j < 3; j++) {
                    int sw = 0;
                    for (int k = 0; k < abecedario.length(); k++) {
                        if (abecedario.charAt(k) == clave.charAt(j) && sw == 0) {
                            pos2 = pos2 + k;
                            sw = 1;

                        }
                    }
                }
                System.out.println("essta es"+pos2);
                int val = pos2 % 3;
                System.out.println(val);
                switch (val) {
                    case 0:
                        for (int j = 0; j < abecedario.length(); j++) {
                            if (abecedario.charAt(j) == clave.charAt(0)) {
                                posuno = j + 1;
                            }
                        }
                      
                        vlave[0] = "" + abecedario.charAt((posuno) % abecedario.length());
                         System.out.println("mueve 0 "+posuno);
                         System.out.println(vlave[0]);
                        break;
                    case 1:
                        for (int j = 0; j < abecedario.length(); j++) {
                            if (abecedario.charAt(j) == clave.charAt(1)) {
                                posuno = j + 1;
                            }
                        }
                        vlave[1] = "" + abecedario.charAt((posuno) % abecedario.length());
                        System.out.println("mueve 1 "+posuno);
                         System.out.println(vlave[1]);
                        break;
                    case 2:
                        for (int j = 0; j < abecedario.length(); j++) {
                            if (abecedario.charAt(j) == clave.charAt(2)) {
                                posuno = j + 1;
                            }
                        }
                        vlave[2] = "" + abecedario.charAt((posuno) % abecedario.length());
                        System.out.println("mueve 0 "+posuno);
                         System.out.println(vlave[0]);
                        break;
                    default:
                        throw new AssertionError();
                }
               

                MensajeCifrado[contador] = abecedario.charAt((pos1 + pos2) % abecedario.length());
                clave = vlave[0] + vlave[1] + vlave[2];
               

                contador++;

            }

        }
        for (int i = 0; i < contador; i++) {
            Resultado = Resultado + MensajeCifrado[i];
        }

        return Resultado;

    }

    public static String DesEnigmatica(String clave, String palabra) {
        String[] vlave = new String[3];
        int contador = 0;

        char MensajeCifrado[] = new char[100];

        String Resultado = "";

        String abecedario = "abcdefghijklmnñopqrstuvwxyz";

        int pos1 = 0;
        int pos2 = 0;

        int posuno = 0;

        for (int i = 0; i < 3; i++) {
            vlave[i] = "" + clave.charAt(i);
        }
        

        for (int i = 0; i < palabra.length(); i++) {


            if (palabra.charAt(i) == ',') {

                MensajeCifrado[contador] = ',';

                contador++;
            } else {

                for (int j = 0; j < abecedario.length(); j++) {
                    if (abecedario.charAt(j) == palabra.charAt(i)) {
                        pos1 = j;
                    }
                } 
                pos2=0;
                for (int j = 0; j < 3; j++) {
                    int sw = 0;
                    for (int k = 0; k < abecedario.length(); k++) {
                        if (abecedario.charAt(k) == clave.charAt(j) && sw == 0) {
                            pos2 = pos2 + k;
                            sw = 1;

                        }
                    }
                }
                System.out.println("essta es"+pos2);
                int val = pos2 % 3;
                System.out.println(val);
                switch (val) {
                    case 0:
                        for (int j = 0; j < abecedario.length(); j++) {
                            if (abecedario.charAt(j) == clave.charAt(0)) {
                                posuno = j + 1;
                            }
                        }
                      
                        vlave[0] = "" + abecedario.charAt((posuno) % abecedario.length());
                         System.out.println("mueve 0 "+posuno);
                         System.out.println(vlave[0]);
                        break;
                    case 1:
                        for (int j = 0; j < abecedario.length(); j++) {
                            if (abecedario.charAt(j) == clave.charAt(1)) {
                                posuno = j + 1;
                            }
                        }
                        vlave[1] = "" + abecedario.charAt((posuno) % abecedario.length());
                        System.out.println("mueve 1 "+posuno);
                         System.out.println(vlave[1]);
                        break;
                    case 2:
                        for (int j = 0; j < abecedario.length(); j++) {
                            if (abecedario.charAt(j) == clave.charAt(2)) {
                                posuno = j + 1;
                            }
                        }
                        vlave[2] = "" + abecedario.charAt((posuno) % abecedario.length());
                        System.out.println("mueve 0 "+posuno);
                         System.out.println(vlave[0]);
                        break;
                    default:
                        throw new AssertionError();
                }
                int repuesto=pos1-pos2;
                if (repuesto<0) {
                 repuesto=repuesto+3*abecedario.length();   
                }

                MensajeCifrado[contador] = abecedario.charAt((repuesto) % abecedario.length());
                clave = vlave[0] + vlave[1] + vlave[2];
               

                contador++;

            }

        }
        for (int i = 0; i < contador; i++) {
            Resultado = Resultado + MensajeCifrado[i];
        }

        return Resultado;


    }


    private void desencriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desencriptarActionPerformed
        String clave1;
        String clave2;
        String result0="";
        String result = "";
        String result3 = "";
        String result2 = "";

         if (clave.getText().equals("") || Clavenigma.getText().equals("") || Clavenigma.getText().length() != 3) {
            limpiartodo("Ingrese una clave valida "); 
         } else {

            clave1 = clave.getText();
            clave2=Clavenigma.getText();

            result3 = desbinario(Binario.getText());
            Ascii.setText(result3);

            result2 = desascii(result3);
            ClaveVigenere.setText(result2);

            result = descifrado(clave1, result2);
            EncripEnig.setText(result);

            result0=DesEnigmatica(clave2,result);
            texto.setText(result0);

        }


    }//GEN-LAST:event_desencriptarActionPerformed

    public static String ascii(String palabra) {
        String result2 = "";
        int K = 0;
        String abecedario = ",abcdefghijklmnñopqrstuvwxyz";
        int ResultAscii[] = new int[10000];

        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < 28; j++) {
                if (palabra.charAt(i) == abecedario.charAt(j)) {
                    ResultAscii[K] = Lab_Final.ASCII[j];
                    K = K + 1;
                }
            }
        }

        for (int i = 0; i < K; i++) {
            result2 = result2 + String.valueOf(ResultAscii[i]);
        }
        return result2;
    }

    public static String desascii(String ascii) {
        String result2 = "";
        int K = 0;
        String abecedario = ",abcdefghijklmnñopqrstuvwxyz";

        String ResultVigenere[] = new String[10000];

        String temp[] = new String[10000];

        String aux = "";

        int cont = 0;

        int w;

        int r = 0;

        int z;

        while (r < ascii.length() - 2) {
            w = 0;
            z = 0;
            while (z < 3) {
                if (ascii.charAt(r) != '1') {
                    if (ascii.charAt(r) == '4') {
                        temp[cont] = "44";
                    } else {
                        if (ascii.charAt(r + 1) == '7') {
                            temp[cont] = "97";
                        }
                        if (ascii.charAt(r + 1) == '8') {
                            temp[cont] = "98";
                        }
                        if (ascii.charAt(r + 1) == '9') {
                            temp[cont] = "99";
                        }

                    }
                    cont = cont + 1;
                    z = 2;
                    w = 1;
                } else {
                    aux = aux + ascii.charAt(r + z);
                    if (z == 2) {
                        if (w == 1) {
                            aux = String.valueOf(ascii.charAt(r));
                        } else {
                            temp[cont] = aux;
                            cont = cont + 1;
                            aux = "";
                        }
                    }

                }
                z++;
            }
            if (w == 1) {
                r = r + 2;
            } else {
                r = r + 3;
            }
        }

        for (int i = 0; i < cont; i++) {
            System.out.println(temp[i]);
        }

        for (int i = 0; i < cont; i++) {
            for (int j = 0; j < 28; j++) {
                if (temp[i].equals(String.valueOf(Lab_Final.ASCII[j]))) {
                    ResultVigenere[K] = String.valueOf(abecedario.charAt(j));
                    K = K + 1;
                }
            }
        }

        for (int i = 0; i < K; i++) {
            result2 = result2 + ResultVigenere[i];
        }
        System.out.println(result2);
        return result2;
    }

    public static String binario(String ascii) {
        String result3 = "";
        int K = 0;

        String resultBinario[] = new String[100000];

        char Asciip[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        for (int i = 0; i < ascii.length(); i++) {
            for (int j = 0; j < 10; j++) {
                if (ascii.charAt(i) == Asciip[j]) {
                    resultBinario[K] = Lab_Final.BINARIO[j];
                    K = K + 1;
                }
            }
        }

        result3 = resultBinario[0];

        for (int i = 1; i < K; i++) {
            result3 = result3 + " " + resultBinario[i];
        }
        return result3;
    }

    public static String desbinario(String binario) {
        String result3 = "";
        int K = 0;
        String Asciip[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        String temp[] = new String[100];
        String resultAscii[] = new String[100000];
        int cont = 0;
        String aux = "";

        for (int i = 0; i < binario.length(); i++) {

            if (binario.charAt(i) == ' ') {
                temp[cont] = aux;
                aux = "";
                cont = cont + 1;
            } else {
                aux = aux + binario.charAt(i);
            }
            if (i == binario.length() - 1) {
                temp[cont] = aux;
                cont = cont + 1;
            }
        }

        for (int i = 0; i < cont; i++) {
            for (int j = 0; j < 10; j++) {
                if (temp[i].equals(Lab_Final.BINARIO[j])) {
                    resultAscii[K] = Asciip[j];
                    System.out.println(resultAscii[K]);
                    K = K + 1;
                }
            }
        }

        for (int i = 0; i < K; i++) {
            result3 = result3 + resultAscii[i];
        }
        return result3;
    }

    public static String cifrado(String clave, String palabra) {

        int contador = 0;

        int cont2 = 0;

        int pos1 = 0;
        int pos2 = 0;

        char MensajeCifrado[] = new char[100];

        String Resultado = "";

        String abecedario = "abcdefghijklmnñopqrstuvwxyz";

        for (int i = 0; i < palabra.length(); i++) {

            if (cont2 == clave.length()) {
                cont2 = 0;
            }

            if (palabra.charAt(i) == ',') {

                MensajeCifrado[contador] = ',';

                contador++;
            } else {

                for (int j = 0; j < abecedario.length(); j++) {
                    if (abecedario.charAt(j) == palabra.charAt(i)) {
                        pos1 = j;
                    }
                }

                for (int k = 0; k < abecedario.length(); k++) {
                    if (abecedario.charAt(k) == clave.charAt(cont2)) {
                        pos2 = k;
                    }
                }

                MensajeCifrado[contador] = abecedario.charAt((pos1 + pos2) % abecedario.length());

                cont2++;

                contador++;

            }

        }
        for (int i = 0; i < contador; i++) {
            Resultado = Resultado + MensajeCifrado[i];
        }

        return Resultado;

    }

    public static String descifrado(String clave, String palabra) {
        int contador = 0;

        int cont2 = 0;

        int char1 = 0;
        int char2 = 0;

        char MensajeCifrado[] = new char[100];

        String Resultado = "";

        String abecedario = "abcdefghijklmnñopqrstuvwxyz";

        for (int i = 0; i < palabra.length(); i++) {

            if (cont2 == clave.length()) {
                cont2 = 0;
            }

            if (palabra.charAt(i) == ',') {

                MensajeCifrado[contador] = ',';

                contador++;
            } else {

                for (int j = 0; j < abecedario.length(); j++) {
                    if (abecedario.charAt(j) == palabra.charAt(i)) {
                        char1 = j;
                    }
                }

                for (int k = 0; k < abecedario.length(); k++) {
                    if (abecedario.charAt(k) == clave.charAt(cont2)) {
                        char2 = k;
                    }
                }

                if ((char1 - char2) >= 0) {
                    MensajeCifrado[contador] = abecedario.charAt((char1 - char2) % abecedario.length());
                }
                if ((char1 - char2) < 0) {
                    MensajeCifrado[contador] = abecedario.charAt(((char1 - char2) + abecedario.length()) % abecedario.length());
                }

                cont2++;

                contador++;

            }

        }
        for (int i = 0; i < contador; i++) {
            Resultado = Resultado + MensajeCifrado[i];
        }

        return Resultado;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vigenere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane Ascii;
    private javax.swing.JTextPane Binario;
    private javax.swing.JTextField ClaveVigenere;
    private javax.swing.JTextField Clavenigma;
    private javax.swing.JTextField EncripEnig;
    private javax.swing.JButton Encriptar;
    private javax.swing.JTextField clave;
    private javax.swing.JButton desencriptar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField texto;
    // End of variables declaration//GEN-END:variables
}
