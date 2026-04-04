/*
 * 3 3 3 3 3
 * 3 2 2 2 3
 * 3 2 1 2 3
 * 3 2 2 2 3 
 * 3 3 3 3 3
 * 
 */




public class Pattern2 {
    public static void main(String[] args) {
        int sR = 0; 
        int sC = 0; 
        
        int c = 5;
        int[][] ans = new int[c*2-1][c*2-1];
        int eC = c*2-2; 
        int eR = c*2-2; 
        int backup = eC; 
        while(sR<eR && sC<eC){
            for (int i = sC; i <= eC; i++) {
                ans[sR][i] = c;
            }
            for (int i = sC+1; i <= eC; i++) {
                ans[i][eC] = c;

            }
            for (int i = eR; i >= sR; i--) {
                ans[eR][i] =c;
            }
            for (int i = eC; i >= sR; i--) {
                ans[i][sC] = c;
            }
            sR++;
            sC++;
            eR--;
            eC--;
            c--;
        }

        if(backup%2==0){
            ans[backup/2][backup/2] = c;
        }
        for (int[] is : ans) {
            for (int is2 : is) {
                System.out.print(is2);
            }
            System.out.println();
        }
    }
}
