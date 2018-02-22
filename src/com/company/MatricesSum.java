package com.company;
import java.util.Scanner;

public class MatricesSum {
    public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter size of both arrays");
	int n = sc.nextInt();

	double [] matrix1 = new double[n];
	double []matrix2 = new double[n];
	double [] matrixSum = new double[n];

	//Creation of both matrices
	System.out.println("Enter "+n+" numbers for matrix one");
		for(int i=0; i<matrix1.length; i++){
			matrix1 [i] = sc.nextInt();
    }
    System.out.println("Enter "+n+" numbers for matrix two");
		for(int i=0; i<matrix2.length; i++){
			matrix2 [i] = sc.nextInt();
		}
	//Sum of matrices
	for(int i=0; i<matrixSum.length; i++){
		matrixSum[i] = matrix1[i]+matrix2[i];
		System.out.print(matrixSum[i]+" ");
	}

    }
}
