/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin26;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;
import javax.swing.JOptionPane;


/**
 *
 * @author ped90
 */
public class Ventana1 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana1
     */
    public Ventana1() {
        initComponents();   
    }
    private int contador=0;
    private int aciertos=0;
    private int[]numeros ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
        21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49};
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablanumeroscpu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botongenum = new javax.swing.JButton();
        botoncomprobar = new javax.swing.JButton();
        numerosjug = new javax.swing.JTextField();
        añadirnumtab = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablanumerosjug = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablanumeroscpu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "1", "2", "3", "4", "5", "6"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablanumeroscpu);

        jLabel1.setText("BONOLOTO ");

        jLabel2.setText("Números");

        jLabel3.setText("Apunta tus números");

        botongenum.setText("Generar numeros");
        botongenum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botongenumMouseClicked(evt);
            }
        });

        botoncomprobar.setText("Comprobar");
        botoncomprobar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botoncomprobarMouseClicked(evt);
            }
        });

        numerosjug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerosjugActionPerformed(evt);
            }
        });

        añadirnumtab.setText("Añadir");
        añadirnumtab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añadirnumtabMouseClicked(evt);
            }
        });

        tablanumerosjug.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "1", "2", "3", "4", "5", "6"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablanumerosjug);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(botongenum)
                                        .addGap(125, 125, 125)
                                        .addComponent(botoncomprobar))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(numerosjug, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(añadirnumtab)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerosjug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añadirnumtab))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botongenum)
                    .addComponent(botoncomprobar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botongenumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botongenumMouseClicked
        // TODO add your handling code here:
        Random rnd = new Random();
        int num1,num2,num3,num4,num5,num6;
        
        IntStream intStream = rnd.ints(6,1,50);//que de 6 numeros comprendidos entre 1 y 50 (el 50 no lo cuenta)
        Iterator iterator = intStream.iterator();
        while(iterator.hasNext()){
        num1=(int)iterator.next();
        num2=(int)iterator.next();
        num3=(int)iterator.next();
        num4=(int)iterator.next();
        num5=(int)iterator.next();
        num6=(int)iterator.next();
        //añade los números aleatorios en las celdas 
        tablanumeroscpu.setValueAt(num1,0,0);
        tablanumeroscpu.setValueAt(num2,0,1);
        tablanumeroscpu.setValueAt(num3,0,2);
        tablanumeroscpu.setValueAt(num4,0,3);
        tablanumeroscpu.setValueAt(num5,0,4);
        tablanumeroscpu.setValueAt(num6,0,5);
        }
        
    }//GEN-LAST:event_botongenumMouseClicked

    private void botoncomprobarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoncomprobarMouseClicked

        // TODO add your handling code here:
        
        for (int j=0;j<contador;j++){
            for(int k=1;k<contador;k++){
                if(tablanumeroscpu.get(j).getText().compareTo(tablanumerosjug.get(k).getText())==0)
                    aciertos++;
                
            }
        }
       
    }//GEN-LAST:event_botoncomprobarMouseClicked

    private void numerosjugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerosjugActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_numerosjugActionPerformed

    private void añadirnumtabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirnumtabMouseClicked
        // TODO add your handling code here:
        if(contador==6){
            JOptionPane.showMessageDialog(null,"No se pueden añadir más números");
        }
        else if(Integer.parseInt(numerosjug.getText())>49){
            JOptionPane.showMessageDialog(null, "Número excedido, recuerda solo números del 1 al 49");   
        }else if(Integer.parseInt(numerosjug.getText())>=0 || Integer.parseInt(numerosjug.getText())<49){
        tablanumerosjug.setValueAt(numerosjug.getText(),0,contador);
        contador++;
        }
    
    }//GEN-LAST:event_añadirnumtabMouseClicked
    
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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirnumtab;
    private javax.swing.JButton botoncomprobar;
    private javax.swing.JButton botongenum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField numerosjug;
    private javax.swing.JTable tablanumeroscpu;
    private javax.swing.JTable tablanumerosjug;
    // End of variables declaration//GEN-END:variables
}
