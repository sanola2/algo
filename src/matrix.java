public class matrix {
    public static void main(String[] args) {
        int[][] arr1 = {{1,4},{3,2},{4,1}}, arr2 = {{3,3}, {3,3}};
        int x = arr1.length;
        int y = arr2[0].length;
        int c = arr1[0].length;
        int[][] answer = new int[x][y];

        for(int i=0; i< x; i++) {
            for(int j=0; j< y; j++) {
                for(int k=0; k< c; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println(answer[2][0]);
    }
}
