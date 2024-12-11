import javax.swing.JOptionPane;
public class Califica_Array {
       public static void main(String args[]) {
              String[] materias = {"MateDisc", "CalcDife", "FundProg", "Quimica ", "FundInve", "DesaSust"};
              String[] unidades = {"U1", "U2", "U3", "U4"};
              int[][] calificaciones = new int[6][5];
              double suma = 0, total = 0, promedio = 0, promTotal = 0;
              System.out.println("Calificaciones:");
              System.out.println("Asignatura" + "\t" + "U1" + "\t" + "U2" + "\t" + "U3" + "\t" + "U4" + "\t" + "Final");
              for (int i = 0; i < materias.length; i++) {
                     System.out.print(materias[i] + "\t");
                     suma = 0;
              for (int j = 0; j < unidades.length; j  ++) {
                     calificaciones[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Calificacion " + materias[i] + " " + unidades[j]));
                     System.out.print(calificaciones[i][j] + "\t");
                     suma += calificaciones[i][j];
                     }
              promedio = suma / unidades.length;
              System.out.println(promedio);
              total += promedio;
              promTotal = total / 6;
              }
              System.out.println("Promedio total: " + promTotal);
       }
}
