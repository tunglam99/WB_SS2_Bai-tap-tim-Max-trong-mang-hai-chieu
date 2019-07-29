package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so hang: ");
        int row = scanner.nextInt();
        System.out.println("nhap so cot: ");
        int col =scanner.nextInt();

        int[][] arr = new int[row][col];
        for (int i = 0; i< row; i++) {
            for (int j = 0; j<col; j++) {
                System.out.println("Nhap vao phan tu arr [" + i+"," +j+ "]=");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i< row; i++) {
            for (int j = 0; j<col; j++) {
                System.out.println(arr[i][j] + " ");
            }
        }

        int max = arr[0][0];
        int indexRow =0;
        int indexColumn =0;
        for (int i=0; i< row; i++) {
            for (int j=0;j< col; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    indexRow =i;
                    indexColumn = j;
                }
            }
        }
        System.out.println("Gia tri lo nhat la: "+ max+ " o hang " +indexRow+ " cot " + indexColumn);
    }
}
