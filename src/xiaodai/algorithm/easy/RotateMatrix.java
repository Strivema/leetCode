package xiaodai.algorithm.easy;

import java.util.Arrays;

/**
 * @athour Marie
 * @date 2018/10/24 3:36 PM
 **/
public class RotateMatrix {
    // 旋转矩阵
    public static void rotate(int [][]matrix){
        if(matrix == null){
            return;
        }
        int n = matrix.length;
        for(int i=0; i<n/2; i++){
            for(int j=i; j<n-1-i; j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[n-1-j][i];
                matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
                matrix[j][n-1-i]=temp;
            }
        }
    }
    public static void main(String []args){
        int [][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for(int i = 0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

    }

}
