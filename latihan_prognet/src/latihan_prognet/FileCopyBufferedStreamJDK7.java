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
public class FileCopyBufferedStreamJDK7 {
    public static void main(String[] args) {
        String inFileStr = "D:\\Prognet\\1.jpg";
        String outFileStr = "D:\\Prognet\\out.jpg";
        long startTime, elapsedTime;
        File fileIn = new File(inFileStr);
        System.out.println("File size is " + fileIn.length() + " bytes");
        try (BufferedInputStream in = new BufferedInputStream(new
        FileInputStream(inFileStr));
                BufferedOutputStream out = new BufferedOutputStream(new
        FileOutputStream(outFileStr))) {
            startTime = System.nanoTime();
            int byteRead;
            while ((byteRead = in.read()) != -1) {
                out.write(byteRead);
            }
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + "msec");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}