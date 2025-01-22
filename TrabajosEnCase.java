import javax.swing.JOptionPane;

public class TrabajosEnCase {
    public static void main(String[] arm) {
        int x, seleccion, n1, a = 0, b, c = 0, d = 0, z, n;

        seleccion= Integer.parseInt(JOptionPane.showInputDialog("""
                Selcion de operacion:
                1. Factorial
                2. Serie fibonasci
                3. Pitagoras
                4. Orden mayor a menor
                5. Tabla de multiplicar
                """));
        switch (seleccion) {
            case 1:
                System.out.println("Factorial");
                x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                a = 1;
                b = 1;
                while (a <= x) {
                    n1 = b * a;
                    System.out.println(b + " * " + a + " = " + n1);
                    a++;
                    b = n1;
                }
                break;
            case 2:
                System.out.println("Serie Fibonaci");
                x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                b = 1;
                while (x >= d) {
                    System.out.println(d + " | " + c);
                    d ++;
                    c = b;
                    b = a + b;
                    a = c;
                }
                break;
            case 3:
                System.out.println("Pitagoras");
                x=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
                z = 1;
                while (z <= x) {
                    a = 1;
                    while (a <= z) {
                        n = 1;
                        while (n <= z) {
                            if ((Math.pow(2, x) + Math.pow(2, n)) == Math.pow(2, z)) {
                                System.out.println("Resultado = " + a + "^2 + " + n + "^2 = " + z + "^2");
                            }
                            n ++;
                        }
                        a ++;
                    }
                    z ++;
                }
                break;
            case 4:
                
                break;
        }
    }
}
