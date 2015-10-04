package org.santhoshkumar;

public class MaximumProductCutting {

    public static void main(String[] args) {
        int ropeLength = 10;
        MaximumProductCutting m = new MaximumProductCutting();
        //m.solve(ropeLength);
        m.maxProductCutting(10);
    }

    public void maxProductCutting(int n) {
        int[] MPC = new int[n + 1];
        MPC[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            int mp = Integer.MIN_VALUE;
            System.out.println("At index : "+i);
            for (int j = 1; j < i; j++) {
                System.out.println("Max 1: "+j * MPC[i - j]);
                System.out.println("Max 2: "+j * (i - j));
                mp = Math.max(mp, Math.max(j * MPC[i - j], j * (i - j)));
            }
            MPC[i] = mp;
        }

        for (int i = 1; i < n + 1; i++){
            System.out.println(i+" = "+MPC[i]);
        }

        System.out.println("Dynamic Programming: Maximum product cutting in " + n + " is " + MPC[n]);
    }
}
