
class triangle
{        int s1,s2,s3,perimeter;
            void perimeter(int a,int b,int c )
            {    s1=a;
                 s2=b;
                s3= c;    
              perimeter= s1+s2+s3;


             }
              void show( )
             {
                System.out.println("perimeter of triangle " + perimeter );
              }
         
}
class demo4
{       public static void main(String [ ]args)
                   {  triangle t1= new triangle( );    
                      t1.perimeter(3,4,5);
                      t1.show( );

                   }
}
