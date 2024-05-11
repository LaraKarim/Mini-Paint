/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lab7;

import java.awt.Color;
import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author ADMIN
 */
public class Application extends javax.swing.JFrame {

    /**
     * Creates new form Application
     */
    public Application() {
        initComponents();
    }
//    private int x, y, z, w, a, b;
    public int rec = 1, sq = 1, ln = 1, crc = 1, tri = 1;
    int userSelection;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        choice1 = new java.awt.Choice();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        drawingPanel1 = new com.mycompany.lab7.drawingPanel();
        jLabel1 = new javax.swing.JLabel();
        colorizeB = new javax.swing.JButton();
        deleteB = new javax.swing.JButton();
        circleB = new javax.swing.JButton();
        linesegmentB = new javax.swing.JButton();
        rectangleB = new javax.swing.JButton();
        drawingPanel = new com.mycompany.lab7.drawingPanel();
        shpickB = new javax.swing.JComboBox<>();
        triangleB = new javax.swing.JButton();
        CopyB = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        SaveOptn = new javax.swing.JMenuItem();
        LoadOptn = new javax.swing.JMenuItem();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        javax.swing.GroupLayout drawingPanel1Layout = new javax.swing.GroupLayout(drawingPanel1);
        drawingPanel1.setLayout(drawingPanel1Layout);
        drawingPanel1Layout.setHorizontalGroup(
            drawingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        drawingPanel1Layout.setVerticalGroup(
            drawingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vector Drawing Application");

        jLabel1.setText("Select Shape");

        colorizeB.setBackground(new java.awt.Color(0, 204, 204));
        colorizeB.setText("Colorize");
        colorizeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorizeBActionPerformed(evt);
            }
        });

        deleteB.setBackground(new java.awt.Color(0, 204, 204));
        deleteB.setText("Delete");
        deleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBActionPerformed(evt);
            }
        });

        circleB.setBackground(new java.awt.Color(0, 204, 204));
        circleB.setText("Oval");
        circleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleBActionPerformed(evt);
            }
        });

        linesegmentB.setBackground(new java.awt.Color(0, 204, 204));
        linesegmentB.setText("Line Segment");
        linesegmentB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linesegmentBActionPerformed(evt);
            }
        });

        rectangleB.setBackground(new java.awt.Color(0, 204, 204));
        rectangleB.setText("Rectangle");
        rectangleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleBActionPerformed(evt);
            }
        });

        drawingPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout drawingPanelLayout = new javax.swing.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        shpickB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shpickBActionPerformed(evt);
            }
        });

        triangleB.setBackground(new java.awt.Color(0, 204, 204));
        triangleB.setText("Triangle");
        triangleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangleBActionPerformed(evt);
            }
        });

        CopyB.setBackground(new java.awt.Color(0, 204, 204));
        CopyB.setText("Copy");
        CopyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyBActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        SaveOptn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        SaveOptn.setText("Save");
        SaveOptn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveOptnActionPerformed(evt);
            }
        });
        jMenu1.add(SaveOptn);

        LoadOptn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        LoadOptn.setText("Load");
        LoadOptn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadOptnActionPerformed(evt);
            }
        });
        jMenu1.add(LoadOptn);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(colorizeB)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deleteB))
                        .addComponent(jLabel1)
                        .addComponent(shpickB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(CopyB, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(circleB)
                        .addGap(31, 31, 31)
                        .addComponent(linesegmentB)
                        .addGap(32, 32, 32)
                        .addComponent(rectangleB)
                        .addGap(42, 42, 42)
                        .addComponent(triangleB))
                    .addComponent(drawingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(circleB)
                    .addComponent(linesegmentB)
                    .addComponent(rectangleB)
                    .addComponent(triangleB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(shpickB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(colorizeB)
                            .addComponent(deleteB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CopyB))
                    .addComponent(drawingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void colorizeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorizeBActionPerformed

        try {
            int selected = shpickB.getSelectedIndex();
            Shape shape1 = drawingPanel.shp.get(selected);
            String option = JOptionPane.showInputDialog("Enter 1 to color border or 2 to fill shape");
            int optn;
            if (option == null) {
                JOptionPane.showMessageDialog(null, "You should enter number to pick option!");
                return;
            }
            try {

                optn = Integer.parseInt(option);
                if (optn == 1) {
                    Color c = JColorChooser.showDialog(null, "Color Palette", Color.black);
                    shape1.setColor(c);
                    drawingPanel.repaint();
                } else if (optn == 2) {
                    Color c = JColorChooser.showDialog(null, "Color Palette", Color.black);
                    shape1.setFillColor(c);
                    drawingPanel.repaint();
                    if (shape1 instanceof lineSegment) {
                        shape1.setColor(c);
                        drawingPanel.repaint();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "wrong value !");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "wrong value !");
                return;
            }
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "No shape was selected !");
            return;
        }
    }//GEN-LAST:event_colorizeBActionPerformed

    private void circleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleBActionPerformed
        InputOval ci = new InputOval(this, drawingPanel, shpickB, crc);
        ci.setVisible(true);
        crc++;
        this.setVisible(false);

    }//GEN-LAST:event_circleBActionPerformed

    private void linesegmentBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linesegmentBActionPerformed
        InputLinesegment li = new InputLinesegment(this, drawingPanel, shpickB, ln);
        li.setVisible(true);
        ln++;
        this.setVisible(false);

    }//GEN-LAST:event_linesegmentBActionPerformed

    private void rectangleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleBActionPerformed
        RectanglleInput ri = new RectanglleInput(this, drawingPanel, shpickB, rec);
        ri.setVisible(true);
        rec++;
        this.setVisible(false);


    }//GEN-LAST:event_rectangleBActionPerformed

    private void deleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBActionPerformed
        // TODO add your handling code here:
        try {
            int i = shpickB.getSelectedIndex();
            shpickB.removeItemAt(i);
            drawingPanel.shp.remove(i);
            drawingPanel.repaint();
        }//negative validation aka nth chosen 
        catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "No shape was selected !");
        }
    }//GEN-LAST:event_deleteBActionPerformed

    private void shpickBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shpickBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shpickBActionPerformed

    private void triangleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangleBActionPerformed
        // TODO add your handling code here:
        TriangleInput ti = new TriangleInput(this, drawingPanel, shpickB, tri);
        ti.setVisible(true);
        tri++;
        this.setVisible(false);

    }//GEN-LAST:event_triangleBActionPerformed

    private void SaveOptnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveOptnActionPerformed
        // TODO add your handling code here:
//        System.out.println("Save");
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Pick a file to save");
        fc.setAcceptAllFileFilterUsed(false);// to accept json files bas 
        FileFilter ff = new FileNameExtensionFilter("json file", new String[]{"json"}); //to choose el type to work with fl next step 
        fc.setFileFilter(ff);
        int userSelection = fc.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) //pressed 3ala save keda 
        {
            File fileToSave = fc.getSelectedFile(); //sa7??
            try {
                saveMethod(fileToSave.getAbsolutePath());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_SaveOptnActionPerformed

    private void LoadOptnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadOptnActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Specify a file to load");
        fc.setAcceptAllFileFilterUsed(false);
        FileFilter filter = new FileNameExtensionFilter("json file", new String[]{"json"});
        fc.setFileFilter(filter);
        int userSelection = fc.showOpenDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fc.getSelectedFile();
            try {
                loadMethod(fileToSave.getAbsolutePath());
            } catch (IOException | ParseException ex) {
                Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex); //Change to output msg!!
            }
        }
    }//GEN-LAST:event_LoadOptnActionPerformed

    private void CopyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyBActionPerformed
        // TODO add your handling code here: GOWAH EHH??
        drawingPanel.copy();
    }//GEN-LAST:event_CopyBActionPerformed
    private void loadMethod(String absolutePath) throws FileNotFoundException, IOException, ParseException {
        drawingPanel.shp.clear();
        rec = 1;
        crc = 1;
        ln = 1;
        tri = 1;
        try {
            JSONParser p = new JSONParser();
            Object obj = p.parse(new FileReader(absolutePath));
            JSONArray shp = (JSONArray) obj;
            for (int i = 0; i < shp.size(); i++) {
                JSONObject jo = (JSONObject) shp.get(i);
                if (jo.get("shapetype").equals("Rectangle")) {
                    int x = Integer.parseInt(jo.get("x").toString());
                    int y = Integer.parseInt(jo.get("y").toString());
                    int w = Integer.parseInt(jo.get("width").toString());
                    int h = Integer.parseInt(jo.get("height").toString());
                    int rgb = Integer.parseInt(jo.get("rgb").toString());
                    int rgbf = Integer.parseInt(jo.get("rgbf").toString());
                    Rectangle r = new Rectangle(new Point(x, y), h, w);
                    r.setColor(new Color(rgb));
                    r.setFillColor(new Color(rgbf));
                    drawingPanel.shp.add(r);
                    shpickB.addItem("Rectangle" + rec);
                } else if (jo.get("shapetype").equals("lineSegment")) {
                    int x1 = Integer.parseInt(jo.get("x1").toString());
                    int y1 = Integer.parseInt(jo.get("y1").toString());
                    int x2 = Integer.parseInt(jo.get("x2").toString());
                    int y2 = Integer.parseInt(jo.get("y2").toString());
                    int rgb = Integer.parseInt(jo.get("rgb").toString());
                    lineSegment l = new lineSegment(new Point(x1, y1), new Point(x2, y2));
                    l.setColor(new Color(rgb));
                    drawingPanel.shp.add(l);
                    shpickB.addItem("lineSegment" + ln);
                } else if (jo.get("shapetype").equals("Oval")) {
                    int x = Integer.parseInt(jo.get("x").toString());
                    int y = Integer.parseInt(jo.get("y").toString());
                    int rh = Integer.parseInt(jo.get("radiush").toString());
                    int rv = Integer.parseInt(jo.get("radiusv").toString());
                    int rgb = Integer.parseInt(jo.get("rgb").toString());
                    int rgbf = Integer.parseInt(jo.get("rgbf").toString());
                    Oval c = new Oval(rh, rv, new Point(x, y));
                    c.setColor(new Color(rgb));
                    c.setFillColor(new Color(rgbf));
                    drawingPanel.shp.add(c);
                    shpickB.addItem("Oval" + crc);
                } else if (jo.get("shapetype").equals("Triangle")) {
                    int x1 = Integer.parseInt(jo.get("x1").toString());
                    int y1 = Integer.parseInt(jo.get("y1").toString());
                    int x2 = Integer.parseInt(jo.get("x2").toString());
                    int y2 = Integer.parseInt(jo.get("y2").toString());
                    int x3 = Integer.parseInt(jo.get("x3").toString());
                    int y3 = Integer.parseInt(jo.get("y3").toString());
                    int rgb = Integer.parseInt(jo.get("rgb").toString());
                    int rgbf = Integer.parseInt(jo.get("rgbf").toString());
                    Triangle t = new Triangle(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3));
                    t.setColor(new Color(rgb));
                    t.setFillColor(new Color(rgbf));
                    drawingPanel.shp.add(t);
                    shpickB.addItem("Triangle" + tri);
                }
            }
            drawingPanel.repaint();
        } catch (IOException | ParseException ex) {
            Logger.getLogger(Application.class
                    .getName()).log(Level.SEVERE, null, ex);

        }

    }

    public void saveMethod(String filename) throws FileNotFoundException {
        JSONArray shp = new JSONArray();

        for (abstractShape s : drawingPanel.shp) {
            JSONObject obj = new JSONObject();
            if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                obj.put("shapetype", "Rectangle"); //kol da extra wala ehh??
                obj.put("x", r.getPosition().x);
                obj.put("y", r.getPosition().y);
                obj.put("width", r.getWidth());
                obj.put("height", r.getHeight());
                obj.put("rgb", r.getColor().getRGB());
                obj.put("rgbf", r.getFillColor().getRGB());
            } else if (s instanceof lineSegment) {
                lineSegment l = (lineSegment) s;
                obj.put("shapetype", "lineSegment");
                obj.put("x1", l.getPosition().x);
                obj.put("y1", l.getPosition().y);
                obj.put("x2", l.getEndpt().x);
                obj.put("y2", l.getEndpt().y);
                obj.put("rgb", l.getColor().getRGB());
            } else if (s instanceof Oval) {
                Oval c = (Oval) s;
                obj.put("shapetype", "Oval");
                obj.put("x", c.getPosition().x);
                obj.put("y", c.getPosition().y);
                obj.put("radiush", c.getWidth());
                obj.put("radiusv", c.getHeight());//a3ml x2??
                obj.put("rgb", c.getColor().getRGB());
                obj.put("rgbf", c.getFillColor().getRGB());
            } else if (s instanceof Triangle) {
                Triangle t = (Triangle) s;
                obj.put("shapetype", "Triangle");
                obj.put("x1", t.getPosition().x);
                obj.put("y1", t.getPosition().y);
                obj.put("x2", t.getSecondPoint().x);
                obj.put("y2", t.getSecondPoint().y);
                obj.put("x3", t.getThirdPoint().x);
                obj.put("y3", t.getThirdPoint().y);
                obj.put("rgb", t.getColor().getRGB());
                obj.put("rgbf", t.getFillColor().getRGB());
            }
            shp.add(obj);
        }
        PrintWriter pw = new PrintWriter(new File(filename));
        pw.print(shp);

        pw.close();

    }

    void setComboBox(int i) {
        shpickB.setSelectedIndex(i);
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CopyB;
    private javax.swing.JMenuItem LoadOptn;
    private javax.swing.JMenuItem SaveOptn;
    private java.awt.Choice choice1;
    private javax.swing.JButton circleB;
    private javax.swing.JButton colorizeB;
    private javax.swing.JButton deleteB;
    private com.mycompany.lab7.drawingPanel drawingPanel;
    private com.mycompany.lab7.drawingPanel drawingPanel1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JButton linesegmentB;
    private javax.swing.JButton rectangleB;
    private javax.swing.JComboBox<String> shpickB;
    private javax.swing.JButton triangleB;
    // End of variables declaration//GEN-END:variables

    public void appendItem(String name, int index) {
        shpickB.addItem(name + index);
           index++;
    }
}