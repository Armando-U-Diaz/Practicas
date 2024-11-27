import javax.swing.JOptionPane;
public class HolaJava {
  public static void main(String args[]) {
    int n1, n2, r;
    System.out.println("Esto son sumas");
    n1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero 1"));
    n2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero 2"));
    r = n1 + n2;
    System.out.println("R= " + r);
  }
}
