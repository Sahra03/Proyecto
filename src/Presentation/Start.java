/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

/**
 *
 * @author Sara
 */
import Logic.Users;
import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
import java.util.LinkedList;
import javax.swing.UIManager;

public class Start extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    private LinkedList<Users> Users_o;

    public Start() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public Start(LinkedList<Users> listUsers) {
        initComponents();
        setLocationRelativeTo(null);
        this.Users_o = listUsers;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JB_REGISTRAR = new javax.swing.JButton();
        JB_LOGIN = new javax.swing.JButton();
        jl_fondo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(396, 522));
        setMinimumSize(new java.awt.Dimension(396, 522));
        setPreferredSize(new java.awt.Dimension(396, 522));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JB_REGISTRAR.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        JB_REGISTRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bt_morado.png"))); // NOI18N
        JB_REGISTRAR.setText("    REGISTRARSE      ");
        JB_REGISTRAR.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bt_naranja.png"))); // NOI18N
        JB_REGISTRAR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bt_verde.png"))); // NOI18N
        JB_REGISTRAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_REGISTRARMouseClicked(evt);
            }
        });
        JB_REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_REGISTRARActionPerformed(evt);
            }
        });
        getContentPane().add(JB_REGISTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 290, 80));

        JB_LOGIN.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        JB_LOGIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bt_morado.png"))); // NOI18N
        JB_LOGIN.setText("INICIO DE SESIÓN");
        JB_LOGIN.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bt_naranja.png"))); // NOI18N
        JB_LOGIN.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bt_verde.png"))); // NOI18N
        JB_LOGIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_LOGINMouseClicked(evt);
            }
        });
        JB_LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_LOGINActionPerformed(evt);
            }
        });
        getContentPane().add(JB_LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 290, 80));

        jl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo4.png"))); // NOI18N
        getContentPane().add(jl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_REGISTRARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_REGISTRARMouseClicked
        Register register = new Register();
        register.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JB_REGISTRARMouseClicked

    private void JB_REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_REGISTRARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JB_REGISTRARActionPerformed

    private void JB_LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_LOGINActionPerformed
        Login register = new Login(Users_o);
        register.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JB_LOGINActionPerformed

    private void JB_LOGINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_LOGINMouseClicked

    }//GEN-LAST:event_JB_LOGINMouseClicked

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

            UIManager.setLookAndFeel(new FlatCyanLightIJTheme());

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_LOGIN;
    private javax.swing.JButton JB_REGISTRAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jl_fondo;
    // End of variables declaration//GEN-END:variables
}
