import java.util.Scanner;

public class baitap_63 {
    public static void main(String[] args) {

        int n, i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so N: ");
        n = scanner.nextInt();
        for(i=1;i<=n;i++)
        {
            // vong for dieu khien cac khoang trong
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            // vong for de in dau sao
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }        
            System.out.print("\n");
        }

}
}
