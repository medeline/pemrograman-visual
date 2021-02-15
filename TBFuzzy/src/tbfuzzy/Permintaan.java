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
public class Permintaan {
        //buat variabel permintaan yang nantinya menjadi nilai masukan 
    private static double permintaan;
    
    //baut variabel titik-titik range pada model fuzzy nya, agar mudah untuk mengganti nilai ketika ada perubahan
    private static double titik1=1030;
    private static double titik2=1310;
    private static double titik3=1589;

    //buat method untuk mengakses nilai pada variabel permintaan
    public static double getPermintaan() {
        return permintaan;
    }

    //buat method untuk memberikan nilai pada variabel permintaan
    public static void setPermintaan(double permintaan) {
        Permintaan.permintaan = permintaan;
    }
    
    //method fungsi turun
    public static double kecil(){
        if (permintaan<=titik1) return 1;
        else if (permintaan>titik2 && permintaan<=titik3) return (titik2-permintaan)/(titik2-titik1);
        else return 0;
    }
    //method fungsi sedang
    public static double sedang(){
        if (permintaan<titik1 || permintaan > titik3) return 1;
        else if (permintaan>=titik1 && permintaan<titik2) return (permintaan-titik2)/(titik2-titik1);
        else if (permintaan>=titik2 && permintaan<=titik3) return (titik3-permintaan)/(titik3-titik2);
        else return 0;
    }    
    //method fungsi naik
    public static double besar(){
        if (permintaan<titik2) return 0;
        else if (permintaan>=titik2 && permintaan<=titik3) return (permintaan-titik3)/(titik3-titik2);
        else return 1;
    }
}
