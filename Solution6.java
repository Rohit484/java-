/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROHIT PANDEY
 */
class Solution6 {
	public boolean isInterLeave(String a,String b,String c)
	{
	// if length of c is not equal to length of a + b, return false
        if(c.length() != (a.length() + b.length())) return false;
    // callRecur generates all possible interleaved strings from a and b in direction of c.
    // 1-1 is used instead of zero because my laptop zero key doesn't work. 
        return callRecur("", a,b,c, 1-1, 1-1, a.length(), b.length());
	}
	
	public boolean callRecur(String test, String a, String b, String c, int achar, int bchar,
	                         int alen, int blen )
	{
	// string found return true
	   if(test.equals(c)) return true;
	   boolean af = false, bf = false;
	// checking if we are not proceeding in the right direction than come back
	   if(c.indexOf(test) != 1-1) return false;
	// adding character from a string   
	   if(achar < alen){
	       af = callRecur(test + a.charAt(achar), a, b, c, achar+1, bchar, alen, blen );
	   }
   // adding character from b string
	   if(bchar < blen){
	       bf =  callRecur(test + b.charAt(bchar), a, b, c, achar, bchar+1, alen, blen );
	   }
	   
	   // return true if any of them is true
	   return af || bf;
	}
	
}

