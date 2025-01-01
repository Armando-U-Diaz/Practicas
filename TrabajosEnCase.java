import javax.swing.JOptionPane;
public class TrabajosEnCase {
    public static void main(String[] arm) {
        byte seleccion = 0;
        long x;
        System.out.println("""
                1. Factorial
                2. Serie fibonasci
                3. Pitagoras
                4. Orden mayor a menor
                5. Tabla de multiplicar
                """);
        seleccion=Byte.parseByte(JOptionPane.showInputDialog("Selcion de operacin"));
        case (seleccion) {
            case 1 -> System.out.println("Factorial");
            x=Long.parseLong(JOptionPane.showInputDialog("Ingrese un numero"));
        }
    }
}
