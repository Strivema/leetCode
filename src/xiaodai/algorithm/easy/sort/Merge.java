package xiaodai.algorithm.easy.sort;

/**
 * @athour Marie
 * @date 2018/10/31 8:07 PM
 **/
public class Merge {
    public static  void merge(int []num1,int m,int []num2,int n){
        int len1 = m-1, len2 = n-1;
        int lenth = m+n-1;
        while (len2>=0){
            num1[lenth--] = (len1>=0&&num1[len1]>num2[len2])?num1[len1--]:num2[len2--];
        }
    }

}
