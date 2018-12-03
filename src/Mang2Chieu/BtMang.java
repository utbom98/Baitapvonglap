package Mang2Chieu;
import java.util.Random;
import java.util.Scanner;

public class BtMang {
    public static void main(String args[]) {
        int[][] arr = new int[4][4];
       // nhapMang(arr);
        ranDomMang(arr);
        xuatMang(arr);
        tinhTong(arr);
        tinhTongCot(arr);
        System.out.println("Dòng Có Tổng lớn nhất là " + soSanhDong(arr));
        daoNguocMang(arr);
    }

    public static void nhapMang(int a[][]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Hàng Thứ " + i);
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("Nhập Phần tử thứ " + j);
                a[i][j] = sc.nextInt();
            }
        }
    }
    public static void ranDomMang(int a[][]) {
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = rd.nextInt(9);
            }
        }
    }

    public static void xuatMang(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    public static void tinhTong(int a[][]) {
        int tong = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                tong = tong + a[i][j];
            }
        }
        System.out.println("Tổng mảng 2 chiều là " + tong);
    }

    public static void tinhTongCot(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            int tongCot = 0;
            for (int j = 0; j < a[0].length; j++) {
                tongCot = tongCot + a[j][i];
            }
            System.out.println(" Tổng Cột Thứ " + i + " là " + tongCot);
        }
    }

    public static int soSanhDong(int a[][]) {
        int max = 0, d = 0;
        for (int i = 0; i < a.length; i++) {
            int tongHang = 0;
            for (int j = 0; j < a[0].length; j++) {
                tongHang = tongHang + a[i][j];
            }
            System.out.println("Tổng Hàng Thứ " + i + " Là " + tongHang);
            if (max < tongHang) {
                max = tongHang;
                d = i;
            }
        }
        return d;
    }

    public static void daoNguocMang(int a[][]) {
        System.out.println("Mảng sau khi đảo ngược !!");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[j][i]);
            }
            System.out.println();
        }
    }

}