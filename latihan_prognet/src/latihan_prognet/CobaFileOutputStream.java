/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_prognet;

import java.io.*;

/**
 *
 * @author Melin
 */
public class CobaFileOutputStream {
    public static void main(String[]args){
        int someData[] = {73,110,105,32,97,100,97,108,97,104,32,102,105,108,101,32,112,101,122,104,57,60};
        FileOutputStream myFile = null;
        try{
            myFile = new FileOutputStream("D:\\prognet\\kedua.txt");
            for (int i = 0; i < someData.length; i++){
                myFile.write(someData[i]);}
        }catch(IOException e){
            System.out.println("Tidak bisa menulis pada file" + e.toString());} 
        finally {
            if (myFile !=null){
                try{
                    myFile.close();
                }catch (Exception e1){
                    e1.printStackTrace();
                }
            }
        }
    }
}
