/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihantcp;

/**
 *
 * @author Melin
 */
import java.net.*;
import java.io.*;
import org.apache.commons.validator.routines.InetAddressValidator;
public class Client {
 public static void main(String[] args) {
 try {
 InputStreamReader in = new InputStreamReader (System.in);
 BufferedReader reader = new BufferedReader(in);

 String ipAddress = "";
 String fileName = "";

 boolean isValid = false;

 while(!isValid){
 System.out.println("Masukkan ip addres yang valid :");
 //membaca ip address yang dimasukkan
ipAddress = reader.readLine();
 InetAddressValidator validator = new InetAddressValidator();
 isValid = validator.isValid(ipAddress);
 }

 System.out.println("Masukkan nama file yang akan didownload :");
 fileName = reader.readLine();

 Socket socket = new Socket(ipAddress,9090);
 InputStream inputByte = socket.getInputStream();
 BufferedInputStream input = new BufferedInputStream(inputByte);
 PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

 //mengirim nama file yang diminta
 out.println(fileName);
 //menerima code dari server
 int code = input.read();
 //jika code = 1 maka lakukan proses download
 if (code == 1) {
 BufferedOutputStream outputFile = new BufferedOutputStream(new
FileOutputStream("D:\\download\\" + fileName));
 byte[] buffer = new byte[1024];
 int bytesRead = 0;
while ((bytesRead = input.read(buffer))!= -1) {
 System.out.println("."); //sebagai indikator download
outputFile.write(buffer,0,bytesRead);
outputFile.flush();
 }
System.out.println();
 System.out.println("File : " + fileName + " telah berhasil didownload");
 }
 else {
 System.out.println("File tidak ada di server!!");
 }
 }
 catch (Exception e){
 System.out.println(e.toString());
 }
 }
}

