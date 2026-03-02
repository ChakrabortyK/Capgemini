public class Prims {
    public static void main(String[] args) {
        int[][] cost = {  // adjc matrix
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0}
        };

        int noOfNodes = 5;
        boolean boolVisited[] = new boolean[noOfNodes];
        boolVisited[0]=true;
        int edgesCreated = 0;
        int totalCost = 0;


        while (edgesCreated < noOfNodes-1) {
            int min = Integer.MAX_VALUE;
            int x = -1, y = -1;
            for (int i = 0; i < noOfNodes; i++) {
                if (boolVisited[i]) {
                    for (int j = 0; j < N; j++) {
                        if (!boolVisited[j] && cost[i][j] != 0 && cost[i][j] < min) {
                            min = cost[i][j];
                            x = i;
                            y = j;
                        }
                    }
                }
            }
        }
    
        
    
    }
}
