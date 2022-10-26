import javax.swing.JOptionPane;

public class baitap_226_2 {
    public static void main(String[] args) {
        String a1, b1, c1;
        String a2, b2, c2;
        String strNotification = "You've just entered: ";

        a1 = JOptionPane.showInputDialog(null, "Nhap he so a1: ",
                "Input your first number",
                JOptionPane.INFORMATION_MESSAGE);
        double numa1 = Double.parseDouble(a1);

        b1 = JOptionPane.showInputDialog(null, "Nhap he so b1: ",
                "Input your first number",
                JOptionPane.INFORMATION_MESSAGE);
        double numb1 = Double.parseDouble(b1);

        c1 = JOptionPane.showInputDialog(null, "Nhap he so c1: ",
                "Input your first number",
                JOptionPane.INFORMATION_MESSAGE);
        double numc1 = Double.parseDouble(c1);
        /////
        a2 = JOptionPane.showInputDialog(null, "Nhap he so a2: ",
                "Input your first number",
                JOptionPane.INFORMATION_MESSAGE);
        double numa2 = Double.parseDouble(a2);

        b2 = JOptionPane.showInputDialog(null, "Nhap he so b2: ",
                "Input your first number",
                JOptionPane.INFORMATION_MESSAGE);
        double numb2 = Double.parseDouble(b2);

        c2 = JOptionPane.showInputDialog(null, "Nhap he so c2: ",
                "Input your first number",
                JOptionPane.INFORMATION_MESSAGE);
        double numc2 = Double.parseDouble(c2);

        double D = numa1 * numb2 - numa2 * numb1;
        double D1 = numc1 * numb2 - numc2 * numb1;
        double D2 = numa1 * numc2 - numa2 * numc1;
        strNotification = "He phuong trinh co nghiem: \n" + "x1 = " + (D1 / D) + "\n" +
                "x2 = " + (D2 / D);

        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
}
