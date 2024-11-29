import javax.swing.JOptionPane;
public class Reservacion_Hotel {
    public static void main(String[] args) {
        // Definiendo variables
        String nombre;
        byte estadias;
        final var tarifa = 1500F;
        final var vista = false;
        int total;
        // Pedir datos
        nombre=JOptionPane.showInputDialog("Ingrese su nombre");
        estadias=Byte.parseByte(JOptionPane.showInputDialog("Ingrese sus dias de estadias"));
        // Operaciones
        total = (int) (estadias * tarifa);
        // Imprimir datos
        System.out.println("   ===> Tiket <===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Costo por dia: $" + tarifa);
        System.out.println("Dias de estadia: " + estadias);
        System.out.println("Vista al mar: " + vista);
        System.out.println("  ==> Pago total: $" + total + " <==");

        // Modificacion de datos
        // Pedir datos
        nombre=JOptionPane.showInputDialog("Ingrese su nombre");
        estadias=Byte.parseByte(JOptionPane.showInputDialog("Ingrese sus dias de estadias"));
        // Operaciones
        total = (int) (estadias * tarifa);
        // Imprimir datos
        System.out.println("   ===> Tiket <===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Costo por dia: $" + tarifa);
        System.out.println("Dias de estadia: " + estadias);
        System.out.println("Vista al mar: " + vista);
        System.out.println("  ==> Pago total: $" + total + " <==");
    }
}
