import javax.swing.JOptionPane;
public class InformaEntre100E200 {
   public static void main (String [] args) {
      int contadorEntre100E200 = 0;
      for (int contador = 1; contador != 0; contador++) {
         int auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
         if (auxiliar == 0) {
            contador = -1;
            JOptionPane.showMessageDialog(null, "Foram digitados " + contadorEntre100E200 + " numeros entre 100 e 200.");
         }
         else {
            if (auxiliar >= 100 && auxiliar <= 200) {
               contadorEntre100E200++;
            }
         }
      }
   }
}