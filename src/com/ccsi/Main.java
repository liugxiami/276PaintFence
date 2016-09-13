package com.ccsi;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    //There is a fence with n posts,each post can be painted with one of the k colors
    //You have to paint all the posts such that no more than two adjacent fence posts
    //have the same color.
    //Return the total number of ways you can paint the fence.
    public static int numWays(int n,int k){
        if(n==0||k==0)return 0;
        if(n==1)return k;
        int[] cache=new int[n+1];
        cache[1]=k;
        cache[2]=k*k;
        for (int i = 3; i <=n ; i++) {
            cache[n]=(cache[n-1]+cache[n-2])*(k-1);             //没完全明白？？？？
        }
        return cache[n];
    }
}
