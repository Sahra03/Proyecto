/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Logic.GraphEdge;
import Logic.GraphVertex;
import static Logic.StringCapitalize.Convert;
import Logic.Users;
import Logica.GrafoListaAdyacencia;
import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author JD101
 */
public class Admin_Window extends javax.swing.JFrame {

    private LinkedList<Users> users_o;
    private LinkedList<GraphVertex> listGraphVertex = new LinkedList<>();
    private LinkedList<GraphEdge> listGraphEdge = new LinkedList<>();
    private Point p1 = null;
    private Point p2;
    private GraphVertex moveVertex;
    private int iVertex;
    private GrafoListaAdyacencia graphListA = new GrafoListaAdyacencia();
    private String tempString = null;
    private GraphVertex tempVertex = null;

    /**
     * Creates new form Routes
     */
    public Admin_Window() {

        initComponents();
        setLocationRelativeTo(null);

    }
    
    public Admin_Window(LinkedList<Users> users_o, LinkedList<GraphVertex> listGraphVertex, LinkedList<GraphEdge> listGraphEdge, GrafoListaAdyacencia graphListA) {

        this.users_o = users_o;
        this.listGraphVertex = listGraphVertex;
        this.listGraphEdge = listGraphEdge;
        this.graphListA = graphListA;
        
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

        image = new javax.swing.JLabel();
        panelCanvas = new javax.swing.JPanel();
        JB_before = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setResizable(false);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo_admin.png"))); // NOI18N

        panelCanvas.setMaximumSize(new java.awt.Dimension(1000, 700));
        panelCanvas.setMinimumSize(new java.awt.Dimension(1000, 700));
        panelCanvas.setOpaque(false);
        panelCanvas.setPreferredSize(new java.awt.Dimension(1000, 700));
        panelCanvas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelCanvasMouseDragged(evt);
            }
        });
        panelCanvas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCanvasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelCanvasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelCanvasMouseReleased(evt);
            }
        });

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

        javax.swing.GroupLayout panelCanvasLayout = new javax.swing.GroupLayout(panelCanvas);
        panelCanvas.setLayout(panelCanvasLayout);
        panelCanvasLayout.setHorizontalGroup(
            panelCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCanvasLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(JB_before)
                .addContainerGap(837, Short.MAX_VALUE))
        );
        panelCanvasLayout.setVerticalGroup(
            panelCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCanvasLayout.createSequentialGroup()
                .addContainerGap(609, Short.MAX_VALUE)
                .addComponent(JB_before)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelCanvasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCanvasMousePressed

        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {

            int iV = 0;

            for (GraphVertex vertex : listGraphVertex) {

                if (new Rectangle(vertex.getX() - vertex.diameter / 2, vertex.getY() - vertex.diameter / 2, vertex.diameter, vertex.diameter).contains(evt.getPoint())) {

                    moveVertex = vertex;
                    iVertex = iV;
                    break;

                }

                iV++;

            }

        }

    }//GEN-LAST:event_panelCanvasMousePressed

    private void panelCanvasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCanvasMouseClicked

        if (evt.getClickCount() == 2) {

            if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {

                String name = JOptionPane.showInputDialog(this, "Ingrese el nombre del Vertice:");

                if (name != null) {

                    name = Convert(name);

                    this.listGraphVertex.add(new GraphVertex(evt.getX(), evt.getY(), name));
                    this.graphListA.addVertice(name);

                }

                repaint();

            }

            if (evt.getButton() == java.awt.event.MouseEvent.BUTTON3) {

                System.out.println("[ " + evt.getPoint() + " ]");

                for (GraphVertex vertex : listGraphVertex) {
                    if (new Rectangle(vertex.getX() - vertex.diameter / 2, vertex.getY() - vertex.diameter / 2, vertex.diameter, vertex.diameter).contains(evt.getPoint())) {

                        if (this.p1 == null) {

                            this.p1 = new Point(vertex.getX(), vertex.getY());
                            this.tempString = vertex.getName();
                            this.tempVertex = vertex;
                            System.out.println(this.p1.getX() + " " + this.p1.getY());
                            System.out.println(this.tempString);

                        } else {

                            this.p2 = new Point(vertex.getX(), vertex.getY());
                            System.out.println("\n--" + evt.getX() + " " + evt.getY() + "--\n");
                            boolean centinel = true;

                            while (centinel) {

                                try {

                                    String temp = JOptionPane.showInputDialog(this, "Ingrese la distancia entre los lugares:");

                                    if (temp == null) {
                                        break;
                                    }

                                    float weight = Float.parseFloat(temp);
                                    this.listGraphEdge.add(new GraphEdge(p1.x, p2.x, p1.y, p2.y, weight, this.tempVertex, vertex));
                                    this.graphListA.addEdgeNWeight(this.tempString, vertex.getName(), weight);
                                    repaint();

                                    this.p1 = null;
                                    this.p2 = null;
                                    this.tempString = null;
                                    this.tempVertex = null;
                                    centinel = false;

                                    System.out.println(this.graphListA.toString());

                                } catch (HeadlessException | NumberFormatException e) {
                                    JOptionPane.showMessageDialog(this, "Digite un número que represente la distancia.");
                                }

                            }

                        }

                    }
                }

            }

        }

    }//GEN-LAST:event_panelCanvasMouseClicked

    private void panelCanvasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCanvasMouseReleased

        moveVertex = null;
        iVertex = -1;

    }//GEN-LAST:event_panelCanvasMouseReleased

    private void panelCanvasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCanvasMouseDragged

        if (moveVertex != null) {

            this.listGraphVertex.set(iVertex, new GraphVertex(evt.getX(), evt.getY(), moveVertex.getName()));

            int iE = 0;

            for (GraphEdge edge : listGraphEdge) {

                if (new Rectangle(edge.getX1() - GraphVertex.diameter / 2, edge.getY1() - GraphVertex.diameter / 2, GraphVertex.diameter, GraphVertex.diameter).contains(evt.getPoint())) {
                    this.listGraphEdge.set(iE, new GraphEdge(evt.getX(), edge.getX2(), evt.getY(), edge.getY2(), edge.getWeight(), edge.getStart(), edge.getEnd()));
                } else if (new Rectangle(edge.getX2() - GraphVertex.diameter / 2, edge.getY2() - GraphVertex.diameter / 2, GraphVertex.diameter, GraphVertex.diameter).contains(evt.getPoint())) {
                    this.listGraphEdge.set(iE, new GraphEdge(edge.getX1(), evt.getX(), edge.getY1(), evt.getY(), edge.getWeight(), edge.getStart(), edge.getEnd()));
                }

                iE++;

            }

        }

        repaint();

    }//GEN-LAST:event_panelCanvasMouseDragged

    private void JB_beforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_beforeActionPerformed
        
        Login login = new Login(this.users_o, this.listGraphVertex, this.listGraphEdge, this.graphListA);
        login.setVisible(true);
        this.setVisible(false);
        this.dispose();
        this.listGraphVertex.getFirst().getName();
        
    }//GEN-LAST:event_JB_beforeActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_before;
    private javax.swing.JLabel image;
    private javax.swing.JPanel panelCanvas;
    // End of variables declaration//GEN-END:variables
}
