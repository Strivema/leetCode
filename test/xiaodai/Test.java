package xiaodai;

/**
 * @author Marie
 * @date 2018/10/23 8:23 PM
 **/
public class Test {
    public static void main(String[] args) {

        int a[][] = {{1,2,3,4},{3,4,5,6},{7,7,8,9}};
        for (int i =0;i<a.length;i++){
            int max = a[i][0];
            for (int j = 0;j<a[i].length;j++){
                if(a[i][j]>max){
                    max = a[i][j];
                }
            }
            System.out.print(max);
        }
    }

}
