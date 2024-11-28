import javax.swing.JOptionPane;
public class CASE_calculadora {
    public static void main(String args[]) {
        byte tipo;
        int n1, n2;
        float r = 0;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu otro numero"));
        tipo=Byte.parseByte(JOptionPane.showInputDialog("""
                                      ¿Que operacion deseas realizar, elija un numero?
                                      Menu:
                                      1.-Suma
                                      2.-Resta
                                      3.-Multiplicacion
                                      4.-Division"""));
        switch (tipo) {
            case 1 -> {
                System.out.println("SUMA:");
                r = n1 + n2;
            }
            case 2 -> {
                System.out.println("RESTA:");
                r = n1 - n2;
            }
            case 3 -> {
                System.out.println("MULTIPLICACION:");
                r = n1 * n2;
            }
            case 4 -> {
                System.out.println("DIVISION:");
                r = n1 / n2;
            }
        }
        
        System.out.println("Respuenta: " + r);
    }
}
