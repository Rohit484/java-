/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROHIT PANDEY
 */
class Solution4 {
   static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) 
   {
       // code here
       Collections.sort(arr);
       ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
       //HashSet<ArrayList<Integer>> hs=new HashSet<>();
       permute(arr,0,n-1,res);
       //System.out.println(hs.size()+"\n"+hs);
       //for(ArrayList<Integer> e:hs)
       //{
         //  res.add(e);
       //}
       Collections.sort(res, new Comparator<ArrayList<Integer>>() {    
       @Override
       public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
           //return o1.get(0).compareTo(o2.get(0));
           int k=0;
           while(o1.get(k)==o2.get(k))
           k++;
           return o1.get(k).compareTo(o2.get(k));
       }           
       });
       return res;
   }
   public static void permute(ArrayList<Integer> arr ,int cur,int n,ArrayList<ArrayList<Integer>> res)
   {
      // System.out.println(arr);
       if(cur==n)
       {
           //System.out.println(arr);
           ArrayList<Integer> temp=new ArrayList<>(arr);
           //hs.add(temp);
           res.add(temp);
           return;
       }
       HashSet<Integer> hset=new HashSet<>();
       for(int i=cur;i<=n;i++)
       {
           //System.out.print(i+" ");
           swap(arr,cur,i);
           //String str=Arrays.toString(arr.toArray());
           
           if(!hset.contains(arr.get(cur)))
           {
               hset.add(arr.get(cur));
               permute(arr,cur+1,n,res);
           }
           swap(arr,cur,i);
       }
       //System.out.println(hset+" HSET");
       hset.clear();
       return;
   }
   public static void swap(ArrayList<Integer> arr,int i,int j)
   {
       int temp=arr.get(i);
       arr.set(i,arr.get(j));
       arr.set(j,temp);
       return;
   }
};
