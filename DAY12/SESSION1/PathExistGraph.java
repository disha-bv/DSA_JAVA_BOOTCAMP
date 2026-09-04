package DAY12.SESSION1;

import java.util.ArrayList;

public class PathExistGraph {
    public boolean checkPath(int n , int[][] edges , int src , int des){
        ArrayList<ArrayList<Integer>>graph = new ArrayList<>();

        for(int i=0 ; i<n ; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] i :edges){
            int src_edge = i[0];
            int des_edge = i[1];
            graph.get(src_edge).add(des_edge);
            graph.get(des_edge).add(src_edge);
        }
        boolean[] visited = new boolean[n];

    }
    public static void main(String[] args){
        int n=3;
        int[][] edges = {
            {}
        }
    }
    
}
