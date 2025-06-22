import java.util.*;
public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner pencil = new Scanner(System.in);
        System.out.println("How many rows of Pascal's Triangle would you like to print out?");
        int a = pencil.nextInt();
        pencil.nextLine();
        //if the user enters 0 rows of pascal's triangle
        if (a == 0){
            System.out.println(" ");
        }
        //if they ask for rows
        else {
            //uses 2D array
            int[][] arr = new int[a][a];
            //sets first row to 1, so following can be based on before
            arr[0][0] = 1;
            for (int i = 1; i < a; i++){
                int row = i;
                arr = rowfinder(arr, row, a);
                //sends the array into the method until it comes out "a" times
            }
            //prints out the array for all values not equal to 0
            for (int i = 0; i < a; i++){
                for (int j = 0; j < a; j++){
                    if (arr[i][j] != 0){
                        System.out.print(arr[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static int[][] rowfinder(int[][] arr, int row, int a){
        for (int i = 1; i <= row; i++){
            //starts at one, because everything in the first row is always 1
            arr[row][i] = arr[row - 1][i] + arr[row - 1][i - 1];
            //adds the value of the number above and to the left/above to put into the array
        }
        //sets all the first numbers equal to 1
        arr[row][0] = 1;
        return arr;
    }
}