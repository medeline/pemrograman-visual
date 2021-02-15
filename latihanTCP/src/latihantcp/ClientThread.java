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
class ClientThread extends Thread
{
 private Socket socket;
 private BufferedReader reader;
 private BufferedOutputStream out;
 private BufferedInputStream fileReader;

 public ClientThread(Socket socket)
 {
 this.socket = socket;
 }

//    ClientThread(Socket clientSocket) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

 public void run()
 {
 try
 {
 //membuat buffered reader
 reader = new BufferedReader(new
InputStreamReader(socket.getInputStream()));
 //membuat output buffered reader
 out = new BufferedOutputStream(socket.getOutputStream());

 //membaca nama file
 String fileName = reader.readLine();
 System.out.println("Nama file : " + fileName + " telah direquest "
+ socket.getInetAddress().getHostAddress());
 File file = new File(fileName);
 //String rootDirectory = "D:\\rootDirectory";
 //File file = new File(rootDirectory + "" +file);
 //memverifikasi bahwa file ada
 if(!file.exists())
 {
 //jika file tidak ada akan mengirim code 0 dan menutup koneksi
 byte code = (byte)0;
 out.write(code);
closeConnection();
 }
 else
 {
 //jika file ada, mengirim code 1 dan mengirim file
out.write((byte)1);
 //membuat sebuah variabel buffered input stream
 fileReader = new BufferedInputStream(new
FileInputStream(file));
 //menentukan ukuran buffer
 byte[] buffer = new byte[1024];
//integer ini menyimpan hasil pembacaan buffer
 int bytesRead = 0;
 while ((bytesRead = fileReader.read(buffer)) != -1) {
 out.write(buffer, 0, bytesRead);
 out.flush();
 }
 //menutup koneksi setelah download berhasil
 closeConnection();
 }
 }
 catch(Exception e)
 {
 System.out.println(e.toString());
 }
 }

public void closeConnection()
 {
 try
 {
 if(out!=null)
 {
 out.close();
 }
 if(reader!=null)
 {
 reader.close();
 }
 if(fileReader!=null)
 {
 fileReader.close();
 }
 if(out!=null)
 {
 socket.close();
 }
 }
 catch(Exception e)
 {
 System.out.println(e.toString());
 }
 }


}
