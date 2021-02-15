/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_prognet;

/**
 *
 * @author Melin
 */
import java.io.*;
public class CobaBufferedOutput {
    public static void main(String[] args) {
        int someData[] = {73,110,105,32,97,100,97,108,97,104,32,102,105,108,101,32,112,101};
        FileOutputStream myFile = null;
        BufferedOutputStream buff = null;
        try {
            myFile = new FileOutputStream ("D:\\ProgNet\\keempat.txt");
            buff = new BufferedOutputStream (myFile);
            for (int i = 0;i < someData.length; i++){
                buff.write(someData[i]);
            }
        }catch (IOException e){
            System.out.println("Tidak bisa menulis pada file" + e.toString());} 
        finally {
            if (myFile !=null){
                try {
                    buff.flush(); //memflush stream
                    buff.close(); //menutup stream
                    myFile.close(); //menutup stream
                } catch (Exception e1){
                    e1.printStackTrace();
                }
            }
        }
    }
}
