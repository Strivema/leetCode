package xiaodai.algorithm.easy;

/**
 * @athour Marie
 * @date 2018/10/25 3:03 PM
 **/

public class CountPrimes {
    public static int countPrimes(int n){
        boolean []flag = new boolean[n+1];
        int count =0;
        for(int i = 2;i<Math.sqrt(n);i++){
            if (!flag[i]){
                for(int j = i*i;j<n;j+=i){
                    flag[j] =true;
                }
            }
        }
        for(int i = 2;i<n;i++){
            if(!flag[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String []args){
        int i = countPrimes(10);
        System.out.println(i);
    }

}
