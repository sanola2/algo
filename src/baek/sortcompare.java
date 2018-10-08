package baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sortcompare {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] array = new int[num][2];

        for(int i=0; i< num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.valueOf(st.nextToken());
            array[i][1] = Integer.valueOf(st.nextToken());
        }
        Arrays.sort(array, (o1, o2) -> {
            if(o1[0] == o2[0])
                return Integer.compare(o1[1], o2[1]);
            return Integer.compare(o1[0], o2[0]);
        });
        for(int i=0; i< num; i++) {
            System.out.println(array[i][0] + " " + array[i][1]);
        }
    }
    static void sort(int[][] array) {
        for(int i=0; i< array.length-2; i++) {
            for(int j=0; j< array.length-1 -i; j++) {
                if(array[j][0] >= array[j+1][0]) {
                    if(array[j][0] == array[j+1][0]) {
                        if(array[j][1] < array[j+1][1])
                            continue;
                    }
                    for (int k = 0; k < 2; k++) {
                        int temp = array[j][k];
                        array[j][k] = array[j + 1][k];
                        array[j + 1][k] = temp;
                    }
                }
            }
        }
    }
}
