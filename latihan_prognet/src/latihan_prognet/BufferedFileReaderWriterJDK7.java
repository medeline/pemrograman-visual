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
public class BufferedFileReaderWriterJDK7 {
    public static void main(String[] args) {
        String strFilename = "D:\\Prognet\\out.txt";
        String message = "Hello, world!\nHello, world again!\n"; 
        System.out.println(java.nio.charset.Charset.defaultCharset());
        try (BufferedWriter out = new BufferedWriter(new FileWriter(strFilename))) {
            out.write(message);
            out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try (BufferedReader in = new BufferedReader(new FileReader(strFilename))) {
            String inLine;
            while ((inLine = in.readLine()) != null) { // exclude newline
                System.out.println(inLine);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}