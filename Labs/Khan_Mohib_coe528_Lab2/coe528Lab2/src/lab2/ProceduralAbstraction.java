/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author mohib
 */
public class ProceduralAbstraction {
    
    //Requires: None
    //Modifies: None
    //Effects: Returns the smallest positive integer n for which n!
    //         (i.e. 1*2*3*...*n) is greater than or equal to x, for positive 
    //         integer x. Otherwise returns 1.
    
    public static int reverseFactorial(int x) {
        if (x <= 0) {
            return 1;
        }
        else {
            int n;
            int factor = 1;
            for (n=1;factor<x;n++) {
                factor = factor*n;
            }
            return n-1;
        }
    }
    
    //Requires: None
    //Modifies: None
    //Effects: If the matrix arr satisfies Nice property, prints the sum and 
    //         returns true. Otherwise returns false.
    
    public static boolean isMatrixNice(int[][] arr) {
        if (arr.length != arr[0].length) {
            return false;
        }
        int row=0;
        int i;
        for (i=0;i<arr.length;i++) {
            row = row + arr[i][0];
        }
        int a;
        // Checks every row
        for (a=1;a<arr[0].length;a++) {
            int x = 0;
            for (i=0;i<arr.length;i++) {
            x = x + arr[i][a];
        }
            if (x != row) {
                return false;
            }
        }
        // Check every column
        for (a=0;a<arr.length;a++) {
            int x = 0;
            for (i=0;i<arr[0].length;i++) {
            x = x + arr[a][i];
        }
            if (x != row) {
                return false;
            }
        }
        // Checks first diagonal
        int diag=0;
        for (i=0;i<arr.length;i++) {
            diag = diag + arr[i][i];
        }
        if (diag != row) {
            return false;
        }
        //Checks second diagonal
        int diag2=0;
        for (i=0;i<arr[0].length;i++) {
            diag2 = diag2 + arr[i][arr.length-1-i];
        }
        if (diag2 != row) {
            return false;
        }
        // Ouputs sum
        int sum = 0;
        int j;
        for (i=0;i<arr.length;i++){
           for (j=0;j<arr[0].length;j++){
             sum = sum + arr[i][j];
        }
    }
    System.out.println("The sum of the matrix is " + sum);
        return true;
    }
    
    public static void main(String [] args) {
        int x = reverseFactorial(24);
        System.out.println("The reverse factorial is " + x);
        int[][] arr = new int[3][3];
        arr[0][0] = 2;
        arr[0][1] = 9;
        arr[0][2] = 4;
        arr[1][0] = 7;
        arr[1][1] = 5;
        arr[1][2] = 3;
        arr[2][0] = 6;
        arr[2][1] = 1;
        arr[2][2] = 8;
        boolean Nice = isMatrixNice(arr);
        System.out.println(Nice);
    }
}
