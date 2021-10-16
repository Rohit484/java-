/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROHIT PANDEY
 */
class Solution7
{
    long countTriplets(long arr[], int n,int sum)
    {
        Arrays.sort(arr);
        long res = 0;
        for(int i = 0; i < n-2; i++){
            int j = i+1;
            int k = n-1;
            while(j < k){
                if(arr[i] + arr[j] + arr[k] < sum){
                    res += (k - j);
                    j = j + 1;
                }
                else if(arr[i] + arr[j] + arr[k] >= sum){
                    k--;
                }
            }
        }
        return res;
    }
}
