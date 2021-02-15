/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoescare;

/**
 *
 * @author Melin
 */
public class ShoesCare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Splash s = new Splash();
        s.setVisible(true);
        Login l = new Login();
        try{
            for(int i = 0; i<=100; i++){
                Thread.sleep(20);
                s.itung.setText(Integer.toString(i)+"%");
                s.barJalan.setValue(i);
                if(i==100){
                    s.setVisible(false);
                    l.setVisible(true);
                }
            }
        }catch(Exception e){
        
        }
    }
    
}
