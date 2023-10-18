public class Solution {

    public static  boolean isSafe(int node, int[] color, int[][] graph,int n, int col) {
        for(int k = 0; k < n; k++) {
            if(k!=node && graph[k][node] == 1 && color[k] == col)
                return false;
        }
        return true;
    }

    public static boolean solve(int node, int[] color, int m, int N, int[][] graph) {
        if(node == N)
            return true;
        
        for(int i = 1; i<=m;i++) {
            System.out.println("check "+i+" "+node);
            if(isSafe(node, color, graph, N, i)){
                color[node] = i;
                System.out.println("node "+node+" i "+ i);
                String coloring = "";
                for(int ikea = 0;ikea<color.length;ikea++) {
                    coloring+=color[ikea]+" ";
                }
                System.out.println("coloring "+coloring);
                if(solve(node+1, color, m, N, graph))
                    return true;
                color[node]=0;
            }
        }
        return false;
    }

    
    public static String graphColoring(int [][]mat, int m) {
        // Write your code here
        int[] color = new int[mat.length];
        if(solve(0,color, m, mat.length, mat))
            return "YES";
        else 
            return "NO";

    }

    public static void main(String[] args) {
        int N = 4, M = 3;
        int[][] graph = new int[4][4];

        graph[0][1] = 1; graph[1][0] = 1;
        graph[1][2] = 1; graph[2][1] = 1;
        graph[2][3] = 1; graph[3][2] = 1;
        graph[3][0] = 1; graph[0][3] = 1;
        graph[0][2] = 1; graph[2][0] = 1;

        // String rowdata = "";
        // for(int i = 0;i< graph.length; i++) {
        //     for(int j = 0; j< graph[i].length; j++ ){
        //         rowdata+=graph[i][j]+" ";
        //     }
        //     rowdata+="\n";
        // }
        // System.out.println(rowdata);
        System.out.println(graphColoring(graph, M));
     }


}