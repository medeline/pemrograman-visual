/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_prognet;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Melin
 */
import java.io.*;
public class CobaFileInputStream {
    public static void main(String[] args) {
        FileInputStream myFile = null;
        try {
            myFile = new FileInputStream("D:\\prognet\\pertama.txt");
            boolean eof = false;
            while (!eof) {
                int byteValue = myFile.read();
                System.out.print(byteValue + " ");
                if (byteValue == -1){ //akhir dari file di
                    eof = true;
                }
            }
        } catch (IOException e) {
            System.out.println("Tidak bisa membaca file" + e.toString());
        }finally {
            if (myFile != null){
                try {
                    myFile.close();
                }catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}
