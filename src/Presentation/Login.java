/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Logic.GraphEdge;
import Logic.GraphVertex;
import Logic.Users;
import Logica.GrafoListaAdyacencia;
import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Sara
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    //Attributes
    private LinkedList<Users> users_o;
    private LinkedList<GraphVertex> listGraphVertex = new LinkedList<>();
    private LinkedList<GraphEdge> listGraphEdge = new LinkedList<>();
    private GrafoListaAdyacencia graphListA = new GrafoListaAdyacencia();

    //Constructor
    public Login() {
        initComponents();
        setLocationRelativeTo(null);

    }

    public Login(LinkedList<Users> users_o, LinkedList<GraphVertex> listGraphVertex, LinkedList<GraphEdge> listGraphEdge, GrafoListaAdyacencia graphListA) {
        
        this.users_o = users_o;
        this.listGraphVertex = listGraphVertex;
        this.listGraphEdge = listGraphEdge;
        this.graphListA = graphListA;
        
        this.users_o = users_o;
        initComponents();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JB_login = new javax.swing.JButton();
        jpassfield_pass = new javax.swing.JPasswordField();
        jtext_user = new javax.swing.JTextField();
        jl_name = new javax.swing.JLabel();
        jl_pass = new javax.swing.JLabel();
        JB_before = new javax.swing.JButton();
        fl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JB_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bt_ingresar1.png"))); // NOI18N
        JB_login.setContentAreaFilled(false);
        JB_login.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bt_ingresar2.png"))); // NOI18N
        JB_login.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bt_ingresar2.png"))); // NOI18N
        JB_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_loginActionPerformed(evt);
            }
        });
        getContentPane().add(JB_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 136, 75));
        getContentPane().add(jpassfield_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 121, -1));
        getContentPane().add(jtext_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 121, -1));

        jl_name.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jl_name.setText("Usuario");
        getContentPane().add(jl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jl_pass.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jl_pass.setText("Contraseña");
        getContentPane().add(jl_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

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
        getContentPane().add(JB_before, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        fl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo_login.png"))); // NOI18N
        getContentPane().add(fl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_loginActionPerformed
        enter();
    }//GEN-LAST:event_JB_loginActionPerformed

    private void JB_beforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_beforeActionPerformed

        Start before = new Start(this.users_o, this.listGraphVertex, this.listGraphEdge, this.graphListA);
        before.setVisible(true);
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_JB_beforeActionPerformed

    private void enter() {
        //Usuario administrado
        try {
            if (jtext_user.getText().equals("admin") && jpassfield_pass.getText().equals("098")) {

                Admin_Window enter = new Admin_Window(this.users_o, this.listGraphVertex, this.listGraphEdge, this.graphListA);
                enter.setVisible(true);
                this.setVisible(false);

            } else if (jtext_user.getText().equals("") || jpassfield_pass.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingresar los datos solicitados");
            } //Usuario cliente
            else {

                boolean sentinel = false;
                Users user_temp = null;

                for (int i = 0; i < this.users_o.size(); i++) {

                    if (jtext_user.getText().equals(this.users_o.get(i).getUser()) && jpassfield_pass.getText().equals(this.users_o.get(i).getPass())) {
                        
                        sentinel = true;
                        user_temp = this.users_o.get(i);
                        break;
                        
                    }

                }

                if (sentinel) {

                    User_Window enter = new User_Window(user_temp, this.users_o, this.listGraphVertex, this.listGraphEdge, this.graphListA);
                    enter.setVisible(true);
                    this.setVisible(false);
                    this.dispose();

                } else {

                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
                    cls();

                }

            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No existen usuarios registrados");
            cls();
        }
    }

    //clean the screen
    private void cls() {
        jtext_user.setText("");
        jpassfield_pass.setText("");
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
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_before;
    private javax.swing.JButton JB_login;
    private javax.swing.JLabel fl_fondo;
    private javax.swing.JLabel jl_name;
    private javax.swing.JLabel jl_pass;
    public static javax.swing.JPasswordField jpassfield_pass;
    public static javax.swing.JTextField jtext_user;
    // End of variables declaration//GEN-END:variables
}
