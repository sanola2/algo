public class prime {
    public static void main(String[] args) {
        int n = 20;

        n = n+1;
        boolean prime[] = new boolean[n];
        for(int i=0; i < prime.length; i++)
            prime[i] = true;

        for(int i=2; i<= Math.sqrt(n); i++) {
            if(!prime[i]) continue;
            for(int j=2; i*j<n; j++) {
                if(prime[i*j]) {
                    prime[i*j] = false;
                }
            }
        }
        prime[0]= false;
        prime[1]= false;

        int answer = 0;
        for(int i=0; i< prime.length; i++) {
            if(prime[i])
                answer++;
        }
        System.out.println(answer);
    }
}
