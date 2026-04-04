/*
 *  1 2 3 4 5
 * 10 9 8 7 6
 * so on...
 */

public class Pattern1{
    public static void main(String[] args) {
        int c = 1;
        for (int i = 1; i < 5; i++) {
            if(i%2!=0){
                for (int j = 1; j <= 5; j++) {
                    System.out.print(c);
                    System.out.print(" ");
                    c++;
                }
                c=c+4;
            }else{
                for (int j = 1; j <= 5; j++) {
                    System.out.print(c);
                    System.out.print(" ");
                    c--;
                }
                c=c+6;
            }
            System.out.println();
        }
    }
}