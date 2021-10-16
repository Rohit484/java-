/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROHIT PANDEY
 */
class Solution5
{
    //Function to swap odd and even bits.
    public static int swapBits(long n) 
    {
        long ans = 0;
        for(int i=0;i<32;i+=2) {
            ans |= ((1<<(i+1))&n)>>1;
            ans |= ((1<<i)&n)<<1;
        }
        return (int) ans;
	}
    
}
