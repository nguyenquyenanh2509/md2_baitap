import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b;
        System.out.println("nhap vao canh a");
        a = sc.nextFloat();
        System.out.println("nhap vao canh b");
        b = sc.nextFloat();
        float s = a*b;
        System.out.println("s hinh chu nhat nha"+s);
        float c = (a+b)*2;
        System.out.println("c hinh chu nhat la"+c);
    }
}
