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
public class FileCopyBuffered {
    public static void main(String[] args) {
        String inFileStr = "D:\\ProgNet\\1.jpg";
        String outFileStr = "D:\\ProgNet\\out2.jpg";
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        long startTime, elapsedTime; // untuk melihat waktu pemrosesan
        File fileIn = new File(inFileStr);
        System.out.println("File size is " + fileIn.length() + " bytes");
        try {
            in = new BufferedInputStream(new FileInputStream(inFileStr));
            out = new BufferedOutputStream(new FileOutputStream(outFileStr));
            startTime = System.nanoTime();
            int byteRead;
            while ((byteRead = in.read()) != -1) { // Membaca byte-by-byte dari
                out.write(byteRead);
            }
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + "msec");
        } catch (IOException ex) {
            ex.printStackTrace();} 
        finally { // menutup stream
            try {
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (IOException ex) { ex.printStackTrace(); }
        }
    }
}
