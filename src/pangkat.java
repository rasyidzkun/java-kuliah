import javax.swing.JOptionPane;

public class pangkat {
    public static void main(String[] args) {
        String bilangan1 = JOptionPane.showInputDialog("Masukkan bilangan\t: ");
        double x1 = Double.parseDouble(bilangan1);

        String bilangan2 = JOptionPane.showInputDialog("Masukkan pangkat\t : ");
        double y1 = Double.parseDouble(bilangan2);

        int pangkat = (int) Math.pow(x1, y1);
        JOptionPane.showMessageDialog(null, pangkat);
    }
}
