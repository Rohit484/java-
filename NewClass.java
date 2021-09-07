/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROHIT PANDEY
 */
import java.util.*;
import java.util.stream.IntStream;
import java.util.regex.Pattern;

//Wednesday, july 1, 2020
//Author magar sam

interface Reverseable
{
    void reverseList();
    void listIterator();
    void stackReverse();
    void reverseSort();
    void deque();
    void treeSet();
    void descendingIterator();
    void descendingSet();
    void swapping();
    void stringBuilder(); 
    void unicodeRLOcharacter();
    void reverseByXor();
    void streams();
    void codePointBefore();
    void forLoops(); 
    void classicalForLoop(); 
    void doWhileLoop();
    void simpleWhileLoop();
    void simpleRecursion();
    void reduce(); //by sushmita banik
    String recursiveReverse(String string);
} 


class Myclass  implements Reverseable
{
    public static int i;
    public static String string="reversable";
    public static String[] stringArray ={"r","e","v","e","r","s","a","b","l","e"};
    public static List<Integer> list=new ArrayList<Integer>();

    @Override
    public void reverseList()
    {
        // TODO: Implement this method
        List<String> reverseList=new ArrayList<String>();

        reverseList.addAll(Arrays.asList(stringArray));

        Collections.reverse(reverseList);

        for (String i:reverseList)
            System.out.print(i);
    }



    @Override
    public void listIterator()
    {
        // TODO: Implement this method
        List<String> list=new ArrayList<String>(Arrays.asList(stringArray));
        ListIterator<String> listiterator=list.listIterator(); 

        for (String i:list)
            listiterator.set(listiterator.next());

        while (listiterator.hasPrevious())
        {
            System.out.print(listiterator.previous());
        }

    }
    
    
    @Override
    public void stackReverse()
    {
        // TODO: Implement this method
        Stack<String> stack=new Stack<String>();

        for (String i:stringArray)
            stack.push(i);

        while (!stack.empty())
        {
            System.out.print(stack.pop());
        }
    }


    @Override
    public void reverseSort()
    {
        // TODO: Implement this method
        Integer [] array=list.toArray(new Integer[list.size()]);
        Integer [] arr= Arrays.copyOfRange(array, 0, string.length());

        Arrays.sort(arr, Collections.reverseOrder()); 

        for (Integer i:arr)
            System.out.print(string.charAt(i));
    }


    @Override
    public void deque()
    {
        // TODO: Implement this method
        String queue;
        Deque<String> list=new LinkedList<String>();

        list.addAll(Arrays.asList(stringArray));

        while (!list.isEmpty())
        {
            queue = list.getLast();
            System.out.print(queue);
            list.removeLast();
        }
    }


    @Override
    public void treeSet()
    {
        // TODO: Implement this method
        TreeSet<Integer> TreeSet=new TreeSet<Integer>(); 
        TreeSet.addAll(list.subList(0, string.length()));


        while (!TreeSet.isEmpty())
        {
            System.out.print(string.charAt(TreeSet.last()));
            TreeSet.remove(TreeSet.last());
        }
    }


    @Override
    public void descendingIterator()
    {
        // TODO: Implement this method
        Integer cout=0;
        TreeSet<Integer> set=new TreeSet<Integer>();
        for (int i=0;i < string.length();i++)
            set.add(i);
        Iterator<Integer> iterator=set.descendingIterator();

        while (iterator.hasNext())
        {
            cout = iterator.next();
            System.out.print((char)string.codePointAt(cout));
        }
    }


    @Override
    public void descendingSet()
    {
        // TODO: Implement this method 
        TreeSet<Integer> TreeSet=new TreeSet<Integer>(); 
        TreeSet.addAll(list.subList(0, string.length()));
        NavigableSet<Integer> NavigavibledescendingSet=TreeSet.descendingSet();

        for (Integer i:NavigavibledescendingSet)
            System.out.print(string.charAt(i));

    }

    @Override
    public void stringBuilder()
    {
        // TODO: Implement this method 
        StringBuilder stringbuilder=new StringBuilder(string); 
        System.out.print(stringbuilder.reverse().toString());
    }
    
    
    @Override
    public void unicodeRLOcharacter()
    {
        // TODO: Implement this method 
        System.out.print("\u202E" + string);
    }
    
    
    
    @Override
     public void reverseByXor()
     {
        // TODO: Implement this method
        int i=0;
        char [] charArray =string.toCharArray();
        int y=charArray.length-1;
        
           while(i<y){
            charArray[i]=(char) (charArray[i] ^ charArray[y]);
            charArray[y]=(char) (charArray[i] ^ charArray[y]);
            charArray[i]=(char) (charArray[i] ^ charArray[y]);
            i++; y--;
            
         }
        for(Character c:charArray)
            System.out.print(c);    
      }



    @Override
    public void streams()
    {
      // TODO: Implement this method
      char [] temp =string.toCharArray();
      IntStream.range(0,temp.length).
      mapToObj(i -> temp[(temp.length - 1) - i]).
      forEach(System.out::print);
    }
    
    
    @Override
    public void codePointBefore()
    {
     // TODO: Implement this method
    //codePointBefore(int index) will return Unicode code point at the location     that precedes that specified by index 
        System.out.print((char)string.codePointAt(string.length() - 1));

        for (int i=0;i <= string.length() - 2;i++)
         System.out.print((char)string.codePointBefore((string.length() - 1) - i));

    }


    @Override
    public void swapping()
    {
        // TODO: Implement this method 
        for (int i = 0, y = stringArray.length - 1; i < y; i++,
        y--)
        {
            String chars = stringArray[i];
            stringArray[i] = stringArray[y];
            stringArray[y] = chars;
        }

        for (String j:stringArray)
            System.out.print(j);

        //assigning stringArray to it's original forward state 
        for (int i=0;i <= string.length() - 1;i++)
            stringArray[i] = stringArray[(stringArray.length - 1) - i];

    }


    @Override
    public void forLoops()
    {
        // TODO: Implement this method  
        for (int i=0;i <= string.length() - 1;i++)
            System.out.print(string.charAt((string.length() - 1) - i));
    } 
    

    @Override
    public void classicalForLoop()
    {
        // TODO: Implement this method 
        for (int i=string.length() - 1;i >= 0;i--)
            System.out.print(string.charAt(i));
    } 
    

    @Override
    public void doWhileLoop()
    {
        // TODO: Implement this method
        int count=string.length();
        do{
            System.out.print(string.charAt(count -= 1));
        }while(count != 0);
    }


      @Override
       public void simpleWhileLoop()
     {
           // TODO: Implement this method
          int i=string.length();
           while (i != 0)
          {
            System.out.print(string.charAt(i -= 1));
          }
       }


    @Override
    public void simpleRecursion()
    {
        // TODO: Implement this method
        i += 1;
        System.out.print(string.charAt((string.length() - i)));

        if (string.length() == i)
            return ;

        simpleRecursion();
    } 
    
      @Override
    public void reduce()
    {
        // TODO: Implement this method
        
          System.out.print(
            Pattern.compile("").
            splitAsStream(
            string
            ).
            reduce((a, b) -> b + a).
            get()
        );
    }


    @Override
    public String recursiveReverse(String string)
    {
        // TODO: Implement this method 
        if (string.length() == 1)
            return string;

        return recursiveReverse(string.substring(1)) + string.charAt(0);
    } 

}


public class NewClass extends Myclass
{
  public static Myclass interfaceFunction;
  public static Integer [] intArray = new Integer[99];
    public static void main(String[] args)
    {
    interfaceFunction = new NewClass();
    
    Arrays.setAll(intArray,i -> i);
    
    list.addAll(Arrays.asList(intArray));


      System.out.println("Reverse Item = reverseable");
        printLine();
        printLine("Collection.reverse() method");
        interfaceFunction.reverseList();
        printLine();
        printLine("listIterator");
        interfaceFunction.listIterator();
        printLine();
        printLine("Stack");
        interfaceFunction.stackReverse();
        printLine();
        printLine("Collection.reverseOrder()");
        interfaceFunction.reverseSort();
        printLine();
        printLine("Deque");
        interfaceFunction.deque();
        printLine();
        printLine("TreeSet");
        interfaceFunction.treeSet();
        printLine();
        printLine("descendingIterator");
        interfaceFunction.descendingIterator();
        printLine();
        printLine("descendingSet");
        interfaceFunction.descendingSet();
        printLine();
        printLine("swapping");
        interfaceFunction.swapping();
        printLine();
        printLine("XOR oprator");
        interfaceFunction.reverseByXor();
        printLine();
        printLine("StringBuilder");
        interfaceFunction.stringBuilder();
        printLine();
        printLine("unicodeRLOcharacter");
        interfaceFunction.unicodeRLOcharacter();
        printLine();
        printLine("streams");
        interfaceFunction.streams();
        printLine();
        printLine("codePointBefore() method");
        interfaceFunction.codePointBefore();
        printLine();
        printLine("forLoops");
        interfaceFunction.forLoops();
        printLine();
        printLine("classicalForLoop");
        interfaceFunction.classicalForLoop();
        printLine();
        printLine("doWhileLoops");
        interfaceFunction.doWhileLoop();
        printLine();
        printLine("simpleWhileLoop");
        interfaceFunction.simpleWhileLoop();
        printLine();
        printLine("simpleRecursion");
        interfaceFunction.simpleRecursion();
        printLine();
        printLine("reduce");
        interfaceFunction.reduce();
        printLine();
        printLine("recursiveReverse");
        System.out.print(interfaceFunction.recursiveReverse(string));

    }
    
    public static void printLine(String str)
    {
        System.out.print("String Reverse Using " + str+"=> ");
    }
    
    public static void printLine()
    {
        System.out.println();
    }

}