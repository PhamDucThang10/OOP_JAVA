import javax.swing.JOptionPane;

public class baitap_226_1 {
    public static void main(String[] args) {
        String str_a, str_b;
        String strNotification = "You've just entered: ";
        double a;
        do {
            str_a = JOptionPane.showInputDialog(null, "Nhap he so a: ",
                    "Input your first number",
                    JOptionPane.INFORMATION_MESSAGE);
            a = Double.parseDouble(str_a);
        } while (a == 0);

        str_b = JOptionPane.showInputDialog(null, "Nhap he so b: ",
                "Input your first number",
                JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(str_b);
        double result = 0 - b / a;
        strNotification = "Nghiem cua phuong trinh la: " + result;

        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
}
