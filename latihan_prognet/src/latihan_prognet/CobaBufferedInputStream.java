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
public class CobaBufferedInputStream {
    public static void main(String[] args) {
        FileInputStream myFile = null;
        BufferedInputStream buff = null;
        try {
            myFile = new FileInputStream("D:\\prognet\\ketiga.txt"); 
            buff = new BufferedInputStream(myFile);
            boolean eof = false;
            while (!eof) {
                int byteValue = buff.read();
                System.out.print(byteValue + " ");
                if (byteValue == -1){
                    eof = true;
                }
            }
        } catch (IOException e){
            System.out.println("Tidak bisa membaca file" +e.toString());}
        finally {
            if (myFile !=null){
                try {
                    buff.close(); //menutup stream
                    myFile.close(); //menutup stream
                } catch (Exception e1){
                    e1.printStackTrace();
                }
            }
        }
    }
}

