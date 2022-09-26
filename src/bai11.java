import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c, m;
        System.out.printf(" nhap vao so cu");
        c = sc.nextFloat();
        System.out.printf(" nhap vao so moi");
        m = sc.nextFloat();
        double sotienphaitra = 0;
        double sodiensudung = m - c;
        double tienThue = 10000;
        if (sodiensudung < 50) {
            sotienphaitra = sodiensudung * 700 + tienThue;
            System.out.printf("so tin phai tra",+sotienphaitra);
        }
        if (sodiensudung < 100) {
            sotienphaitra = sodiensudung * 900 + tienThue;
            System.out.printf("so tin phai tra",+sotienphaitra);
        } else if (sodiensudung < 150) ;
        sotienphaitra = sodiensudung * 1100 + tienThue;
        System.out.printf("so tin phai tra",+sotienphaitra);

    }

}


