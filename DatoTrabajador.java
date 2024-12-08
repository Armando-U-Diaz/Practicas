import javax.swing.JOptionPane;

public class DatoTrabajador {
    public static void main(String[] armu) {
        String nombre, direccion, puesto;
        int sueldo, diasT, horaEx;
        float pagoDia, pagoHora, pagoHoraEx, pagoDiasT, sueldoBruto;
        byte hora9, horasDobles, horasTriple;
        double LISR, IMSS, cuota, totalNeto;

        nombre=JOptionPane.showInputDialog("Ingrese su nombre");
        System.out.println("nombre = " + nombre);
        direccion=JOptionPane.showInputDialog("Ingrese su dirreccion");
        System.out.println("direccion = " + direccion);
        puesto=JOptionPane.showInputDialog("Ingrese su puesto");
        System.out.println("puesto = " + puesto);
        sueldo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su sueldo"));
        System.out.println("sueldo = $" + sueldo);
        diasT=Integer.parseInt(JOptionPane.showInputDialog("Ingrese dias trabajados"));
        System.out.println("diasT = " + diasT);

        if (diasT >= 0 && diasT < 6) {
            horaEx=Integer.parseInt(JOptionPane.showInputDialog("Ingrese horasextras"));
            System.out.println("hora Ex = " + horaEx);

            pagoDia = (float) sueldo / 5;
            System.out.println("pago por Dia = $" + pagoDia);
            pagoHora = pagoDia / 8;
            System.out.println("pago por Hora = $" + pagoHora);

            if (horaEx <= 8) {
                pagoHoraEx = (pagoHora * 2) * horaEx;
            }
            else {
                hora9 = (byte) (horaEx - 8);
                horasDobles = (byte) ( (pagoHora * 2) * 8 );
                horasTriple = (byte) ( (pagoHora * 3) * hora9 );
                pagoHoraEx = (byte) ( horasDobles + horasTriple );
            }
            System.out.println("  ===> PAGOS TOTALES <===");
            pagoDiasT = diasT * pagoDia;
            System.out.println("pago Dias Trabajados = $" + pagoDiasT);
            System.out.println("pago Hora Extras = $" + pagoHoraEx);
            sueldoBruto = pagoDiasT + pagoHoraEx;
            System.out.println("sueldo Bruto = $" + sueldoBruto);


            System.out.println("  ===> DESCUENTOS <===");
            if (sueldoBruto <= 3000) {
                LISR = sueldoBruto * 0.05;
            }
            else {
                LISR = sueldoBruto * 0.06;
            }
            System.out.println("LISR = $" + LISR);

            if (sueldoBruto <= 3500) {
                IMSS = sueldoBruto * 0.03;
            }
            else {
                IMSS = sueldoBruto * 0.04;
            }
            System.out.println("IMSS = $" + IMSS);

            cuota = sueldoBruto * 0.03;
            System.out.println("cuota = $" + cuota);

            System.out.println("  ===> TOTAL CON DESCUENTOS <===");
            totalNeto = sueldoBruto - LISR - IMSS - cuota;
            System.out.println("totalNeto = $" + totalNeto);

        }
        else {
            System.out.println("LA EMPRESA TE ESTA EXPLOTANDO DEBES HACER UNA DEMANDA");
        }
    }
}
