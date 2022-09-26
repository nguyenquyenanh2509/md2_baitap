import java.util.Scanner;
public class bai6 {
  public static boolean checkY(int nam){
 return (nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, y;
        System.out.println("nhap vao thang");
        m = sc.nextInt();
        System.out.println("nhap vao nam");
        y = sc.nextInt();
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) ;
        switch (m) {

            case 1:

            case 3:

            case 5:

            case 7:

            case 8:

            case 10:

            case 12:

                System.out.println("31");
                break;

            case 4:

            case 6:

            case 9:

            case 11:

                System.out.println("30");
                break;

            case 2:

                if (checkY(y)) {

                        System.out.println("29");

                    }else{
                        System.out.println("28");
                    }
                    break;
                    default:
                        System.out.println("!!!!!");

                }
        }

    }
