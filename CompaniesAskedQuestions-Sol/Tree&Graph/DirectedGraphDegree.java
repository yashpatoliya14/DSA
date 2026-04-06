import java.util.*;

public class DirectedGraphDegree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        int[] inDegree = new int[V];
        int[] outDegree = new int[V];

        System.out.println("Enter edges (u v). Enter -1 to stop:");

        while (true) {
            int u = sc.nextInt();

            if (u == -1) break;

            int v = sc.nextInt();

            // Update degrees
            outDegree[u]++;
            inDegree[v]++;
        }

        System.out.println("\nVertex\tIn-Degree\tOut-Degree");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t" + inDegree[i] + "\t\t" + outDegree[i]);
        }

        sc.close();
    }
}
