import buoi5.Array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // cau 3
    public static void main(String[] args) {
        int a[] = new int[4];
        nhapMang(a);
        maxMin(a);
        daoNguocMang(a);
        themDau_XoaDau(a);
        themCuoi_XoaCuoi(a);
        themGiua_XoaGiua(a);
        count(a);
    }

    public static void nhapMang(int a[]) {
        System.out.println("Mời nhập giá tri từng phần tử");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
    }

    public static void xuatMang(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }

    public static void maxMin(int a[]) {
        int max, min;
        max = a[0];
        min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        System.out.println("Gia Tri Lon Nhat la " + max);
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        System.out.println("Gia Tri nho nhat la " + min);
    }

    public static void daoNguocMang(int a[]) {
        int swap = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                swap = a[i];
                a[i] = a[j];
                a[j] = swap;
            }
        }
        System.out.println("Mang Dao Nguoc" + Arrays.toString(a));

    }

    public static void themDau_XoaDau(int a[]) {
        int add;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPhan Tu Dau can them");
        add = sc.nextInt();
        int b[] = new int[a.length + 1];
        for (int j = 0; j < a.length; j++) {
            b[j + 1] = a[j];
        }
        b[0] = add;
        System.out.println("Mang Vua Chen Phan Tu Dau : " + Arrays.toString(b));
        int d[] = new int[b.length - 1];
        for (int i = 0; i < b.length - 1; i++) {
            d[i] = b[i + 1];
        }
        System.out.println("Xoa Phan Tu Dau Tien :" + Arrays.toString(d));
    }

    public static void themCuoi_XoaCuoi(int a[]) {
        int addCuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Phan Tu cuoi can them");
        addCuoi = sc.nextInt();
        int b[] = new int[a.length + 1];
        for (int j = 0; j < a.length; j++) {
            b[j] = a[j];
        }
        b[b.length - 1] = addCuoi;
        System.out.println("Mang Vua Chen Phan Tu cuoi : " + Arrays.toString(b));
        int d[] = new int[b.length - 1];
        for (int i = 0; i < b.length - 1; i++) {
            d[i] = b[i];
        }
        System.out.println("Xoa Phan Tu Cuoi :" + Arrays.toString(d));
    }

    public static void themGiua_XoaGiua(int a[]) {
        int  i, j, viTri,vt, add;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Vi Tri Can them");
        viTri = sc.nextInt();
        System.out.println("Phan Tu can them");
        add = sc.nextInt();
        int b[] = new int[a.length + 1];
        for (j = 0; j < a.length; j++) {
            b[j] = a[j];
        }
        for (j = a.length; j >= viTri; j--)
            b[j] = b[j - 1];
        b[viTri] = add;
        System.out.println("Mang Vua Chen Phan Tu : " + Arrays.toString(b));
        int d[] = new int[b.length - 1];
        System.out.println("Nhap Vi tri Can Xoa :");
        vt=sc.nextInt();
        for (j = 0; j < b.length-1; j++) {
            d[j] = b[j];
        }
        for (i = vt; i < b.length - 1; i++) {
            d[i] = b[i + 1];
        }
        System.out.println("Mang Vua Xoa"+Arrays.toString(d));
    }
    public static void count(int a[])
    {
        int so,dem=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số cần đếm :");
        so=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(so==a[i])
                dem++;
        }
        System.out.println("Số "+so+" Được lặp lại trong mảng "+dem+" lần");
    }
}


