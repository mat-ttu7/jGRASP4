import javax.swing.JOptionPane;
public class MediaDeVariosNumeros {
   public static void main (String [] args) {
      int resultado = 0;
      for (int contador = 1; contador != 0; contador++) {
         int auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
         if (auxiliar < 0) {
            contador = -1;
            double media = (double)resultado/10;
            JOptionPane.showMessageDialog(null, "A média é " + media + ".");
         }
         else resultado += auxiliar;
      }
   }
}