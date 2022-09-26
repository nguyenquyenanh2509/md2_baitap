import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b;
        System.out.println(" nhap vao so a");
        a = sc.nextFloat();
        System.out.println(" nhap vao so b");
        b = sc.nextFloat();
        float cong = a+b;
        System.out.println("phep cong la"+cong);
        float tru = a-b;
        System.out.println("phep tru la"+tru);
        float nhan = a*b;
        System.out.println("phep nhan la"+nhan);
        float chia = a/b;
        System.out.println("phep chia la"+chia);
    }
}
