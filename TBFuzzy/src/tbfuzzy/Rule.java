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
public class Rule {
    private static double [] u_Produksi = new double[9];
    private static double [] z_Produksi = new double[9];
    private static double bobot;
    
    //rule
    public static void hitung_u(){
        u_Produksi[0]=Math.min(Permintaan.kecil(), Persediaan.sedikit());
        u_Produksi[1]=Math.min(Permintaan.kecil(), Persediaan.sedang());
        u_Produksi[2]=Math.min(Permintaan.kecil(), Persediaan.banyak());
        u_Produksi[3]=Math.min(Permintaan.sedang(), Persediaan.sedikit());
        u_Produksi[4]=Math.min(Permintaan.sedang(), Persediaan.sedang());
        u_Produksi[5]=Math.min(Permintaan.sedang(), Persediaan.sedang());
        u_Produksi[6]=Math.min(Permintaan.besar(), Persediaan.sedikit());
        u_Produksi[7]=Math.min(Permintaan.besar(), Persediaan.sedang());
        u_Produksi[8]=Math.min(Permintaan.besar(), Persediaan.banyak());
  
    }
    
    public static void hitung_z(){
        z_Produksi[0]=Produksi.sedikit(u_Produksi[0]);
        z_Produksi[1]=Produksi.sedikit(u_Produksi[1]);
        z_Produksi[2]=Produksi.sedikit(u_Produksi[2]);
        z_Produksi[3]=Produksi.sedikit(u_Produksi[3]);
        z_Produksi[4]=Produksi.sedang(u_Produksi[4]);
        z_Produksi[5]=Produksi.sedang(u_Produksi[5]);
        z_Produksi[6]=Produksi.sedikit(u_Produksi[6]);
        z_Produksi[7]=Produksi.sedang(u_Produksi[7]);
        z_Produksi[8]=Produksi.banyak(u_Produksi[8]);
    }
    //end of rule
    
    //cari nilai bobot (tsukamoto)
    public static double bobot(){
        double atas=0,bawah=0;
        for(int i=0;i<9;i++){
            System.out.println("z_ke-"+i+ " : " +z_Produksi[i]);
            System.out.println("u_ke-"+i+ " : " +u_Produksi[i]);
            atas+=(u_Produksi[i]*z_Produksi[i]);
            bawah+=u_Produksi[i];
        }
        System.out.println(atas/bawah);
        return (atas/bawah);
    }
}
