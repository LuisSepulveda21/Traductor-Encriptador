
package lab_final;

import static java.time.Clock.system;
import javax.swing.JOptionPane;

public class Lab_Final {
  static String[] españolpred={"1","avion","2","barco","3","ganar","4","gato",
      "5","guerra","6","hola","7","negro","8","perder","10","perro","9","todo"};
  
  static String[] inglespred={"9","all","7","black","4","cat","10","dog",
      "6","hello","8","loose","1","plane","2","ship","5","war","3","win"};
 
  static int [] ASCII={44,97,98,99,100,101,102,103,104,105,106,107,108,109,110,164,
 111,112,113,114,115,116,117,118,119,120,121,122};
 
  static String[] BINARIO={"00110000","00110001","00110010","00110011","00110100"
 ,"00110101","00110110","00110111","00111000","00111001"};
  
  
  
  static String[] españolper=new String[200];
  static String[] inglesper=new String[200]; 
  static int limite;
  static String tempvigeniere;
  static int contador=10;
  static int progreso=20;

    public static void main(String[] args) {
     new Opciones().setVisible(true);
     System.arraycopy(españolpred,0,españolper,0,españolpred.length);
     System.arraycopy(inglespred,0,inglesper,0,inglespred.length);
     System.out.println(limite);
    
        
    }
    
    
static void limpiartodo(String texto){
JOptionPane.showMessageDialog(null,texto,"Aviso", JOptionPane.INFORMATION_MESSAGE);
}
}
       
