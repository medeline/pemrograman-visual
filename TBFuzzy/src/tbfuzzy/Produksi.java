/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbfuzzy;

/**
 *
 * @author Melin
 */
public class Produksi {
       //buat variabel produksi yang nantinya menjadi nilai masukan
    private static double produksi;
    //baut variabel titik-titik range pada model fuzzy nya, agar mudah untuk mengganti nilai ketika ada perubahan
    private static double titik1=1996;
    private static double titik2=2275;
    private static double titik3=2579;
    //buat method untuk mengakses nilai pada variabel produksi
    public static double getProduksi() {
        return produksi;
    }
    //buat method untuk memberikan nilai pada variabel produksi
    public static void setProduksi(double produksi) {
        Produksi.produksi = produksi;
    }    
    //method fungsi berkurang
    public static double sedikit(){
        if (produksi<=titik1 || produksi<titik2) return 1;
        else if (produksi>=titik1 && produksi<=titik2) return (titik3-produksi)/(titik2-titik1);
        else return 0;
    }   
    //method fungsi bertambah
    public static double sedang(){
        if (produksi<=titik3 || produksi>titik3) return 0;
        else if (produksi<=titik1 && produksi<titik2) return (produksi-titik2)/(titik3-titik2);
        else if (produksi<=titik2 && produksi<=titik3) return (titik3-produksi)/(titik3-titik2);
        else return 0;
    }
    public static double banyak(){
        if (produksi<=titik2) return 0;
        else if (produksi>=titik2 && produksi<=titik3) return (produksi-titik3)/(titik3-titik2);
        else if (produksi>titik3) return 1;
        else return 0;
    }      
    public static double sedikit(double in){
        return (titik2-(in*(titik2-titik1)));
    }
    public static double sedang(double in){
        return (titik3+(in*(titik3-titik2)));
    }    
    public static double banyak(double in){
        return (titik3+(in*(titik3-titik2)));
    }
}
