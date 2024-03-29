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
import Logic.GraphEdge;
import Logic.GraphVertex;
import Logic.Users;
import Logica.GrafoListaAdyacencia;
import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
import java.util.LinkedList;
import javax.swing.UIManager;

public class Start extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    private LinkedList<Users> users_o;
    private LinkedList<GraphVertex> listGraphVertex = new LinkedList<>();
    private LinkedList<GraphEdge> listGraphEdge = new LinkedList<>();
    private GrafoListaAdyacencia graphListA = new GrafoListaAdyacencia();

    public Start() {
        
        this.users_o = new LinkedList<>();
        
        initComponents();
        setLocationRelativeTo(null);
        jl_fondo.requestFocus();
        
    }

    public Start(LinkedList<Users> users_o, LinkedList<GraphVertex> listGraphVertex, LinkedList<GraphEdge> listGraphEdge, GrafoListaAdyacencia graphListA) {
        
        this.users_o = users_o;
        this.listGraphVertex = listGraphVertex;
        this.listGraphEdge = listGraphEdge;
        this.graphListA = graphListA;
        
        initComponents();
        setLocationRelativeTo(null);
        jl_fondo.requestFocus();
        
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
        JB_checkIn = new javax.swing.JButton();
        JB_login = new javax.swing.JButton();
        jl_fondo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(396, 522));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JB_checkIn.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        JB_checkIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bt_morado.png"))); // NOI18N
        JB_checkIn.setText("    REGISTRARSE      ");
        JB_checkIn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bt_naranja.png"))); // NOI18N
        JB_checkIn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bt_verde.png"))); // NOI18N
        JB_checkIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_checkInActionPerformed(evt);
            }
        });
        getContentPane().add(JB_checkIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 290, 80));

        JB_login.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        JB_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bt_morado.png"))); // NOI18N
        JB_login.setText("INICIO DE SESIÓN");
        JB_login.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bt_naranja.png"))); // NOI18N
        JB_login.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bt_verde.png"))); // NOI18N
        JB_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_loginActionPerformed(evt);
            }
        });
        getContentPane().add(JB_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 290, 80));

        jl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo4.png"))); // NOI18N
        getContentPane().add(jl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_checkInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_checkInActionPerformed

        Register register = new Register(this.users_o, this.listGraphVertex, this.listGraphEdge, this.graphListA);
        register.setVisible(true);
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_JB_checkInActionPerformed

    private void JB_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_loginActionPerformed

        Login login = new Login(this.users_o, this.listGraphVertex, this.listGraphEdge, this.graphListA);
        login.setVisible(true);
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_JB_loginActionPerformed

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
    private javax.swing.JButton JB_checkIn;
    private javax.swing.JButton JB_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jl_fondo;
    // End of variables declaration//GEN-END:variables
}
