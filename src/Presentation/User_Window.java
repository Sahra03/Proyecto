/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.util.LinkedList;
import java.util.Random;
import Logic.Drive;
import Logic.GraphEdge;
import Logic.GraphVertex;
import Logic.Users;
import Logica.GrafoListaAdyacencia;
import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.UIManager;

/**
 *
 * @author Sara
 */
public class User_Window extends javax.swing.JFrame {

    //Save Drivers Users 
    private LinkedList<Drive> list_driver = new LinkedList<>();
    private LinkedList<Users> users_o;
    private LinkedList<GraphVertex> listGraphVertex = new LinkedList<>();
    private LinkedList<GraphEdge> listGraphEdge = new LinkedList<>();
    private GrafoListaAdyacencia graphListA = new GrafoListaAdyacencia();
    private GraphVertex start = null;
    private GraphVertex end;
    private Users user_info;

    /**
     * Creates new form User_Window
     */
    public User_Window() {

        initComponents();
        setLocationRelativeTo(null);
        add_drivers();
        change_driver();

    }

    public User_Window(Users user, LinkedList<Users> users_o, LinkedList<GraphVertex> listGraphVertex, LinkedList<GraphEdge> listGraphEdge, GrafoListaAdyacencia graphListA) {

        this.user_info = user;
        this.users_o = users_o;
        this.listGraphVertex = listGraphVertex;
        this.listGraphEdge = listGraphEdge;
        this.graphListA = graphListA;

        initComponents();
        setLocationRelativeTo(null);
        add_drivers();
        change_driver();
        repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_information_driver2 = new javax.swing.JPanel();
        JL_name_view2 = new javax.swing.JLabel();
        JL_car_view2 = new javax.swing.JLabel();
        JL_qual_view2 = new javax.swing.JLabel();
        JL_qual = new javax.swing.JLabel();
        JL_car = new javax.swing.JLabel();
        JL_name = new javax.swing.JLabel();
        img_driver = new javax.swing.JLabel();
        button_user = new javax.swing.JButton();
        panelCanvas = new javax.swing.JPanel();
        JB_cancel = new javax.swing.JButton();
        JL_wallpaper = new javax.swing.JLabel();
        JB_before = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(null);

        Panel_information_driver2.setBackground(new java.awt.Color(255, 255, 255));
        Panel_information_driver2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 102, 255), null));

        JL_name_view2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        JL_name_view2.setForeground(new java.awt.Color(150, 57, 238));
        JL_name_view2.setText("Nombre de conductor");

        JL_car_view2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        JL_car_view2.setForeground(new java.awt.Color(150, 57, 238));
        JL_car_view2.setText("Marca del carro");

        JL_qual_view2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        JL_qual_view2.setForeground(new java.awt.Color(150, 57, 238));
        JL_qual_view2.setText("Calificación");

        JL_qual.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        JL_qual.setForeground(new java.awt.Color(74, 0, 153));
        JL_qual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        JL_car.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        JL_car.setForeground(new java.awt.Color(73, 0, 153));
        JL_car.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        JL_name.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        JL_name.setForeground(new java.awt.Color(73, 0, 153));
        JL_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Panel_information_driver2Layout = new javax.swing.GroupLayout(Panel_information_driver2);
        Panel_information_driver2.setLayout(Panel_information_driver2Layout);
        Panel_information_driver2Layout.setHorizontalGroup(
            Panel_information_driver2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_information_driver2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_information_driver2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JL_name_view2)
                    .addComponent(JL_name, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Panel_information_driver2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_information_driver2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JL_car, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JL_qual, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(Panel_information_driver2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(JL_car_view2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JL_qual_view2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        Panel_information_driver2Layout.setVerticalGroup(
            Panel_information_driver2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_information_driver2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel_information_driver2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_name_view2)
                    .addComponent(JL_car_view2)
                    .addComponent(JL_qual_view2))
                .addGroup(Panel_information_driver2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JL_car, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_qual, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_name, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Panel_information_driver2);
        Panel_information_driver2.setBounds(140, 590, 481, 65);

        img_driver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_driver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/driver.png"))); // NOI18N
        getContentPane().add(img_driver);
        img_driver.setBounds(40, 570, 87, 77);

        button_user.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        button_user.setForeground(new java.awt.Color(73, 0, 153));
        button_user.setText("Usuario");
        button_user.setFocusable(false);
        button_user.setPreferredSize(new java.awt.Dimension(90, 31));
        button_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_userActionPerformed(evt);
            }
        });
        getContentPane().add(button_user);
        button_user.setBounds(0, 0, 90, 31);

        panelCanvas.setMaximumSize(new java.awt.Dimension(1000, 700));
        panelCanvas.setMinimumSize(new java.awt.Dimension(1000, 700));
        panelCanvas.setOpaque(false);
        panelCanvas.setPreferredSize(new java.awt.Dimension(1000, 700));
        panelCanvas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCanvasMouseClicked(evt);
            }
        });
        panelCanvas.setLayout(null);

        JB_cancel.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        JB_cancel.setText("Cancelar Viaje");
        JB_cancel.setPreferredSize(new java.awt.Dimension(200, 35));
        JB_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_cancelActionPerformed(evt);
            }
        });
        panelCanvas.add(JB_cancel);
        JB_cancel.setBounds(450, 500, 200, 32);

        JL_wallpaper.setForeground(new java.awt.Color(155, 0, 233));
        JL_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo_user.png"))); // NOI18N
        panelCanvas.add(JL_wallpaper);
        JL_wallpaper.setBounds(0, 0, 1000, 700);

        JB_before.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        JB_before.setForeground(new java.awt.Color(255, 255, 255));
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
        panelCanvas.add(JB_before);
        JB_before.setBounds(850, 600, 95, 63);

        getContentPane().add(panelCanvas);
        panelCanvas.setBounds(0, 0, 1000, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_userActionPerformed

        User_Information view_info = new User_Information(this.user_info);
        view_info.setVisible(true);

    }//GEN-LAST:event_button_userActionPerformed

    private void JB_beforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_beforeActionPerformed

        Login login = new Login(this.users_o, this.listGraphVertex, this.listGraphEdge, this.graphListA);
        login.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_JB_beforeActionPerformed

    private void panelCanvasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCanvasMouseClicked
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1 && evt.getClickCount() == 2) {

            for (GraphVertex vertex : listGraphVertex) {
                if (new Rectangle(vertex.getX() - vertex.diameter / 2, vertex.getY() - vertex.diameter / 2, vertex.diameter, vertex.diameter).contains(evt.getPoint())) {

                    if (this.start == null) {

                        this.start = vertex;
                        this.start.setSelected(true);
                        repaint();

                    } else {

                        this.end = vertex;
                        this.end.setSelected(true);
                        repaint();

                    }

                }
            }

        }
    }//GEN-LAST:event_panelCanvasMouseClicked

    private void JB_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_cancelActionPerformed

        try {

            this.start.setSelected(false);
            this.end.setSelected(false);
            repaint();

            this.start = null;
            this.end = null;

        } catch (Exception e) {
        }

    }//GEN-LAST:event_JB_cancelActionPerformed

    private void add_drivers() {

        Drive add_drive1 = new Drive("Eduardo", "Nissan Tiida", "4,9", "efectivo");
        Drive add_drive2 = new Drive("Mónica", "Chevrolet Spark", "5,0", "Tarjeta");
        Drive add_drive3 = new Drive("Ana", "Toyota Corolla", "4,78", "Tarjeta");

        list_driver.add(add_drive1);
        list_driver.add(add_drive2);
        list_driver.add(add_drive3);

    }

    private void change_driver() {

        Random r = new Random();
        int num_a = r.nextInt(3) + 1;

        for (int i = 0; i < num_a; i++) {
            JL_name.setText(list_driver.get(i).getName());
            JL_car.setText(list_driver.get(i).getCar());
            JL_qual.setText(list_driver.get(i).getQual());
        }

    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);

        for (GraphVertex graphVertex : listGraphVertex) {
            graphVertex.paint(g);
        }

        for (GraphEdge graphEdge : listGraphEdge) {
            graphEdge.paint(g);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_before;
    private javax.swing.JButton JB_cancel;
    private javax.swing.JLabel JL_car;
    private javax.swing.JLabel JL_car_view2;
    private javax.swing.JLabel JL_name;
    private javax.swing.JLabel JL_name_view2;
    private javax.swing.JLabel JL_qual;
    private javax.swing.JLabel JL_qual_view2;
    private javax.swing.JLabel JL_wallpaper;
    private javax.swing.JPanel Panel_information_driver2;
    private javax.swing.JButton button_user;
    private javax.swing.JLabel img_driver;
    private javax.swing.JPanel panelCanvas;
    // End of variables declaration//GEN-END:variables
}
