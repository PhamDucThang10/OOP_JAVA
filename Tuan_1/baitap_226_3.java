import javax.swing.JOptionPane;
 
public class baitap_226_3 {
    public static void main(String[] args) {
        String a, b, c;
        String strNotification = "You've just entered: ";

        a = JOptionPane.showInputDialog(null, "Nhap he so bac 2, a =  ",
                "Input your first number",
                JOptionPane.INFORMATION_MESSAGE);
        double numa = Double.parseDouble(a);

        b = JOptionPane.showInputDialog(null, "Nhap he so bac 1, b = ",
                "Input your first number",
                JOptionPane.INFORMATION_MESSAGE);
        double numb = Double.parseDouble(b);

        c = JOptionPane.showInputDialog(null, "Nhap he so tu do, c = ",
                "Input your first number",
                JOptionPane.INFORMATION_MESSAGE);
        double numc = Double.parseDouble(c);

        if (numa == 0) {
            if (numb == 0) {
                strNotification = "Phuong trinh vo nghiem!";
            } else {
                strNotification = "Phuong trinh co 1 nghiem: "
                + "x = " + (numc / numb);

            }
            return;
        }
        // tính delta
        double delta = numb*numb - 4*numa*numc;
        double x1;
        double x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (Double) ((-numb + Math.sqrt(delta)) / (2*numa));
            x2 = (Double) ((-numb - Math.sqrt(delta)) / (2*numa));
            strNotification = "Phuong trinh co 2 nghiem phan biet la: "
            + "x1 = " + x1 + " và x2 = " + x2;
        } else if (delta == 0) {
            x1 = (-numb / (2 * numa));
            strNotification = "Phuong trinh co nghiem kep: "
            + "x1 = x2 = " + x1;

        } else {
            strNotification = "Phuong trinh vo nghiem!";
        }
        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
}
