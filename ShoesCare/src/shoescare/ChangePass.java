/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoescare;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Melin
 */
public class ChangePass extends javax.swing.JFrame {
    Koneksi koneksi;
    Statement st;
    ResultSet rs;
  

    /**
     * Creates new form ChangePass
     */
    public ChangePass() {
        initComponents();
        setLocationRelativeTo(this);
        koneksi = new Koneksi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kmbali = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        usernm = new javax.swing.JTextField();
        app = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kmbali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoescare/back2.png"))); // NOI18N
        kmbali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmbaliMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kmbaliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kmbaliMouseExited(evt);
            }
        });
        getContentPane().add(kmbali, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        cancel.setBackground(new java.awt.Color(255, 102, 0));
        cancel.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));
        getContentPane().add(usernm, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 160, 30));

        app.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        app.setText("Username");
        getContentPane().add(app, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 255, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton2.setText("SAVE");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 160, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoescare/bcfix.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        usernm.setText(null);
         pass.setText(null);
    }//GEN-LAST:event_cancelActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
        String n = usernm.getText();
        String op = String.valueOf(pass.getPassword());

        String sql = "insert into login values('"+n+"','"+op+"')";
            java.sql.PreparedStatement pstm = koneksi.con.prepareStatement(sql);
            pstm.execute();
        new Login().setVisible(true);
        dispose(); 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error : "+e.getMessage());
        }              // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void kmbaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmbaliMouseClicked
        new Login().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_kmbaliMouseClicked

    private void kmbaliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmbaliMouseEntered
        ImageIcon m = new ImageIcon(getClass().getResource("backblur.png"));
        kmbali.setIcon(m);          // TODO add your handling code here:
    }//GEN-LAST:event_kmbaliMouseEntered

    private void kmbaliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmbaliMouseExited
        ImageIcon m = new ImageIcon(getClass().getResource("back2.png"));
        kmbali.setIcon(m);          // TODO add your handling code here:
    }//GEN-LAST:event_kmbaliMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel app;
    private javax.swing.JButton cancel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel kmbali;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField usernm;
    // End of variables declaration//GEN-END:variables
}
