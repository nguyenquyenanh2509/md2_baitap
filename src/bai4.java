import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien");
        String studentId = scanner.nextLine();

        System.out.println("Nhap ten sinh vien");
        String studentName = scanner.nextLine();

        System.out.println("Nhap vao gioi tinh");
        boolean sex = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(" Nhap tuoi sinh vien");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap vao dia chi sv");
        String address = scanner.nextLine();

        System.out.printf("Ma sv: %s - Ten sv: %s - Gioitinh: %b\n  Dia chi: %s", studentId,studentName,sex,address);
    }
}


