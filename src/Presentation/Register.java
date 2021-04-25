/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import Logic.Users;
import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
import java.util.Random;
import javax.swing.UIManager;

/**
 *
 * @author Sara
 */
public class Register extends javax.swing.JFrame {

    String option_gen;
    int qual_user;
    LinkedList<Users> list_users = new LinkedList<>();
    Login login = new Login();

    public Register() {
        
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings(value = "unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        JB_before = new javax.swing.JButton();
        JB_registrarse = new javax.swing.JButton();
        jtext_phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtext_card = new javax.swing.JTextField();
        RB_o = new javax.swing.JRadioButton();
        RB_h = new javax.swing.JRadioButton();
        RB_m = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtext_age = new javax.swing.JTextField();
        jpassfield_pass = new javax.swing.JPasswordField();
        jtext_user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrarse");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JB_before.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        JB_before.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bt_regresar.png"))); // NOI18N
        JB_before.setText("Regresar");
        JB_before.setContentAreaFilled(false);
        JB_before.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JB_before.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bt_regresar2.png"))); // NOI18N
        JB_before.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JB_before.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_beforeActionPerformed(evt);
            }
        });
        getContentPane().add(JB_before, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 54));

        JB_registrarse.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        JB_registrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bt_register1.png"))); // NOI18N
        JB_registrarse.setContentAreaFilled(false);
        JB_registrarse.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bt_register2_m.png"))); // NOI18N
        JB_registrarse.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bt_register2_m.png"))); // NOI18N
        JB_registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_registrarseMouseClicked(evt);
            }
        });
        JB_registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_registrarseActionPerformed(evt);
            }
        });
        getContentPane().add(JB_registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));
        getContentPane().add(jtext_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 179, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel6.setText("Tel:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel3.setText("Tarjeta:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));
        getContentPane().add(jtext_card, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 179, -1));

        buttonGroup.add(RB_o);
        RB_o.setText("Otro");
        getContentPane().add(RB_o, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        buttonGroup.add(RB_h);
        RB_h.setText("Hombre");
        getContentPane().add(RB_h, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        buttonGroup.add(RB_m);
        RB_m.setText("Mujer");
        RB_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_mActionPerformed(evt);
            }
        });
        getContentPane().add(RB_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel4.setText("Edad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel5.setText("Genero:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));
        getContentPane().add(jtext_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 179, -1));

        jpassfield_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpassfield_passActionPerformed(evt);
            }
        });
        getContentPane().add(jpassfield_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 179, -1));
        getContentPane().add(jtext_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 179, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel7.setText("Contraseña:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo_register.png"))); // NOI18N
        getContentPane().add(jl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_registrarseActionPerformed
        add_users();
    }//GEN-LAST:event_JB_registrarseActionPerformed

    private void JB_registrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_registrarseMouseClicked

    }//GEN-LAST:event_JB_registrarseMouseClicked

    private void jpassfield_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpassfield_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpassfield_passActionPerformed

    private void JB_beforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_beforeActionPerformed
        Start before = new Start(list_users);
        before.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_JB_beforeActionPerformed

    private void RB_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_mActionPerformed

    }//GEN-LAST:event_RB_mActionPerformed

    private void add_users() {
        if (jtext_user.getText().equals("") || jpassfield_pass.getText().equals("") || jtext_age.getText().equals("") || jtext_card.getText().equals("") || jtext_phone.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingresar los datos solicitados");
        } else {
            option_gender();
            random_numbers_qual();
            //clear the options marked in the radio buttons
            buttonGroup.clearSelection();
            //save user in list
            Users prueba = new Users(jtext_user.getText(), jpassfield_pass.getText(), jtext_age.getText(), option_gen, jtext_card.getText(), jtext_phone.getText(), qual_user);
            list_users.add(prueba);
            cls();
            //prueba 2
            JOptionPane.showMessageDialog(null, "Usuario agregado");
        }
    }
//clean the screen
    public void cls() {
        jtext_user.setText("");
        jpassfield_pass.setText("");
        jtext_age.setText("");
        // jtext_gen.setText("");
        jtext_card.setText("");
        jtext_phone.setText("");
    }
//random numbers for user qualification
    private void random_numbers_qual() {
        Random r = new Random();
        qual_user = r.nextInt(5-3) + 1;
    }
//save radio button option in variable option_gen
    private void option_gender() {
        if (RB_m.isSelected()) {
            option_gen = "Mujer";
        } else if (RB_h.isSelected()) {
            option_gen = "Hombre";
        } else if (RB_o.isSelected()) {
            option_gen = "Otro";
        }

    }

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
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_before;
    private javax.swing.JButton JB_registrarse;
    private javax.swing.JRadioButton RB_h;
    private javax.swing.JRadioButton RB_m;
    private javax.swing.JRadioButton RB_o;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jl_fondo;
    private javax.swing.JPasswordField jpassfield_pass;
    private javax.swing.JTextField jtext_age;
    private javax.swing.JTextField jtext_card;
    private javax.swing.JTextField jtext_phone;
    private javax.swing.JTextField jtext_user;
    // End of variables declaration//GEN-END:variables
}
