import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ngTo();
        hinhThoi();
        tamGiacCan();
        kiemTra();
    }

    public static int kt(int n) {
        int i;
        for (i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }
    public static void ngTo() {
        int n = 2, dem = 0;
        System.out.println("Các số nguyên tố là ");
        do {
            if (kt(n) == 1) {
                System.out.print(" " + n);
                dem++;
            }
            n++;
        }
        while (dem < 20);
    }

    public static void kiemTra() {
        int nam, theKi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời Nhập Năm :");
        nam = sc.nextInt();
        theKi = (nam / 100) + 1;
        System.out.println("Năm " + nam + " Là thế Kỉ thứ " + theKi);
    }

    public static void tamGiacCan() {
        int n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nMời Nhập N ");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j <= n - i; j++)
                System.out.print(" ");
            for (j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void hinhThoi() {
        int n = 4, i, j;
        System.out.println();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
        for (i = 2; i <= n; i++) {
            for (j = 3; j > n - i; j--)
                System.out.print(" ");
            for (j = n; j >= i; j--)
                System.out.print("* ");
            System.out.println();
        }
    }
}

