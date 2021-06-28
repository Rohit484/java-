/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROHIT PANDEY
 */
import java.io.*;
public class class12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            FileWriter fw=new FileWriter("D:/JAVA CLASSES/JAVA_Programs/FileWork");
            fw.write("Hello Rohit Here you are learning new file ");
            fw.close();
        }
        catch(IOException e)
        {
           System.out.println("Error "+e);
        }
       
    }
    
}
