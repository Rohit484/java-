class product{
	private int pno,price;
	product(int no,int cost)
	{
		pno=no;
		price=cost;
	}
	void showprod()
	{
		System.out.println("Product No: "+pno);
		System.out.println("MRP: "+price);
	}
	void calc()
	{
		int dis=price*5/100;
		System.out.println("Discount "+dis);
	}
}
 class oops4 {
      public static void main(String[]args)
      {
    	  product p1=new product(1000,5000);
    	  
    	  p1.showprod();
    	  p1.calc();
      }
}
