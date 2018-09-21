package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class noneed {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        String star = "*";
        String em = " ";
        for(int i=0; i< num-1; i++) {
            for (int j = num - 2 - i; j >= 0; j--) {
                bw.write(" ");
            }
            bw.write(star);
            if(i >0) {
                bw.write(em);
                em += "  ";
                bw.write(star);
            }
            bw.newLine();
        }
        for(int i=0; i< num*2-1; i++)
            bw.write("*");
        bw.close();
    }
}
