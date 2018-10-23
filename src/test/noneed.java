package test;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class noneed {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int studentNum = Integer.parseInt(st.nextToken());
        Student[] students = new Student[studentNum];

        for(int i=0; i< studentNum; i++) {
            st = new StringTokenizer(br.readLine());
            students[i] = new Student(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(students);
        for(int i=0; i< studentNum; i++)
            sb.append(students[i] + "\n");

        System.out.println(sb);
    }

    static int stringSort(String a, String b) {
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();

        for(int i=0; i< 10; i++) {
            if(a1[i] > b1[i])
                return 1;
            else if(a1[i] < b1[i])
                return -1;
        }
        return 0;
    }

    static class Student implements Comparable<Student> {
        String name;
        int kor;
        int eng;
        int math;

        public Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        @Override
        public String toString() {
            return this.name;
        }

        @Override
        public int compareTo(Student student) {
            if(this.kor < student.kor) {
                return 1;
            } else if(this.kor == student.kor) {
                if(this.eng > student.eng) {
                    return 1;
                } else if(this.eng == student.eng) {
                    if(this.math < student.math) {
                        return 1;
                    } else if(this.math == student.math) {
                        return stringSort(this.name, student.name);
                    }
                }
            }
            return -1;
        }
    }
}