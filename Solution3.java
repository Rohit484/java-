/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROHIT PANDEY
 */
class Solution3
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        int eleCount=0,count=k;
        ArrayList<Integer> res=new ArrayList<>();
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(!mp.containsKey(A[i]))
            {
                mp.put(A[i],1);
                eleCount++;
            }
            else
            {
                if(mp.get(A[i])==0)
                    eleCount++;
                mp.put(A[i],mp.get(A[i])+1);
            }
            
            if(i== count-1)
            {
                res.add(eleCount);
                    if(mp.get(A[count-k])>=2)
                        mp.put(A[count-k],mp.get(A[count-k])-1);
                    else
                    {
                        eleCount--;
                        mp.put(A[count-k],0);
                    }
                count++;
            }
        }
        
       return res; 
    }
}

