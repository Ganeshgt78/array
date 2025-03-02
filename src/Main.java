//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int arr1[][]=new int[3][2];
        int arr2[][]=new int[3][2];
        int arr3[][]=new int[3][2];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the arr1");
        for (int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                arr1[i][j]=sc.nextInt();

            }
        }
        System.out.println("enter the arr2");
        for (int l=0;l<3;l++) {
            for (int m = 0; m < 2; m++) {
                arr2[l][m] = sc.nextInt();

            }
        }
        System.out.println("enter the arr3");
        for (int l=0;l<3;l++) {
            for (int m =0; m <2; m++) {
                arr3[l][m] = arr1[l][m] + arr2[l][m];
                System.out.println(arr3[l][m]+" ");
            }
            System.out.println();
        }
    }

        }
