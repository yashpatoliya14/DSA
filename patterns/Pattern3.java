/*
int n=5

1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
*/

public class Pattern3 {
    public static void main(String[] args) {
        int n=4;
        int temp = 1;
        for (int i = 0; i < n; i++) {
            int diff = n-1; //reset
            int sum = temp;
            for (int j = 0; j <= i; j++) {
                if(j==0){
                System.out.print(sum);

                }else{
                    sum+=diff;
                System.out.print(sum);
                    diff-=1;
                }
            }
            temp +=1;
            System.out.println();
        }
    }
}
