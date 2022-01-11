import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] array1;
        double[] array2;
        double[] array3;
        int n;
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang thu nhat:");
        n = sc.nextInt();
        System.out.println("Nhap so luong phan tu mang thu hai:");
        m = sc.nextInt();
        array1 = new double[n];
        array2 = new double[m];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ":");
            array1[i] = sc.nextDouble();
        }
        for (int i = 0; i < m; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ":");
            array2[i] = sc.nextDouble();
        }
        array3 = new double[n + m];
        for (int i = 0; i < n; i++) {
            array3[i] = array1[i];
        }
        for (int i = n; i < n + m; i++) {
            array3[i] = array2[i - n];
        }
        for (int i = 0; i < n + m; i++) {
            System.out.println(array3[i]);
        }
    }
}