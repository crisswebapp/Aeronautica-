/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import static Datos.Datos.seleccionvuelo;
import static Datos.Datos.metodosdb;
import static Datos.Datos.seleccion;
import static Datos.Datos.seleccioncompañia;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author criss
 */
public class ListaPasajerosForm extends javax.swing.JFrame {

    /**
     * Creates new form ListaVuelosForm
     */
    public ListaPasajerosForm(int indexAero) {
        this.indexAA=indexAero;
        initComponents();
        jbotoneliminar.setEnabled(false);
        
    }
    public ListaPasajerosForm(){
        
    }
    int indexAA;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlabelcompañia = new javax.swing.JLabel();
        jlabelidentificador = new javax.swing.JLabel();
        jlabelnummaxpasajeros = new javax.swing.JLabel();
        jlabelnumactualpasajeros = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlabelorigen = new javax.swing.JLabel();
        jlabeldestino = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablepasajeros = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jbotoneliminar = new javax.swing.JButton();
        CmdSalir = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Compañia del vuelo: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Identidicador de vuelo: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("N° Máximo de pasajeros: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("N° Actual de pasajeros: ");

        jlabelcompañia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlabelcompañia.setText("Compañia");

        jlabelidentificador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlabelidentificador.setText("Identidicador");

        jlabelnummaxpasajeros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlabelnummaxpasajeros.setText("numMaxPasajeros");

        jlabelnumactualpasajeros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlabelnumactualpasajeros.setText("numActualPasajeros");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Origen de Vuelo: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Destino de Vuelo: ");

        jlabelorigen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlabelorigen.setText("origen");

        jlabeldestino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlabeldestino.setText("destino");

        jtablepasajeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Pasajero", "Nombres", "Apellidos", "Pasaporte", "Nacionalidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtablepasajeros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablepasajerosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtablepasajeros);
        if (jtablepasajeros.getColumnModel().getColumnCount() > 0) {
            jtablepasajeros.getColumnModel().getColumn(0).setMinWidth(0);
            jtablepasajeros.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Listado de Pasajeros:");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Agregar Pasajero");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jbotoneliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbotoneliminar.setText("Eliminar Pasajero");
        jbotoneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotoneliminarActionPerformed(evt);
            }
        });

        CmdSalir.setBackground(new java.awt.Color(204, 0, 0));
        CmdSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CmdSalir.setForeground(new java.awt.Color(255, 255, 255));
        CmdSalir.setText("X");
        CmdSalir.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        CmdSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CmdSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlabelnummaxpasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlabelorigen)
                                            .addComponent(jlabelcompañia)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(182, 182, 182)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jlabelnumactualpasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(34, 34, 34)
                                                .addComponent(jlabeldestino))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jlabelidentificador)))))
                                .addGap(177, 177, 177))
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbotoneliminar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CmdSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jlabelcompañia)
                    .addComponent(jLabel2)
                    .addComponent(jlabelidentificador))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jlabeldestino)
                    .addComponent(jLabel5)
                    .addComponent(jlabelorigen))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlabelnummaxpasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jlabelnumactualpasajeros))
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jbotoneliminar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(indexAA==0){
            AeropuertoPublicoForm form = new AeropuertoPublicoForm();
            form.setVisible(true);
            this.dispose();
            
        }else{
            AeropuertoPrivadoForm form = new AeropuertoPrivadoForm();
            form.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    
        
        
        
    }//GEN-LAST:event_formWindowActivated

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        PasajeroForm form = new PasajeroForm(indexAA);
        form.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        int index = seleccion.getSelecion();
        int indexV = seleccionvuelo.getSelecion();
        int indexC = seleccioncompañia.getSelecion();
        String registros[] = metodosdb.getVueloInfo(indexC,indexV);
        jlabelcompañia.setText(registros[0]);
        jlabelidentificador.setText(registros[1]);
        jlabelorigen.setText(registros[2]);
        jlabeldestino.setText(registros[3]);
        jlabelnummaxpasajeros.setText(registros[4]);
        jlabelnumactualpasajeros.setText(registros[5]);
        metodosdb.getPasajeros(jtablepasajeros,index,indexC,indexV,indexAA);
        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void jbotoneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotoneliminarActionPerformed
        // TODO add your handling code here:
        int index = seleccion.getSelecion();
        int indexC = seleccioncompañia.getSelecion();
        int indexV = seleccionvuelo.getSelecion();
        String registros[] = metodosdb.getVueloInfo(indexC,indexV);
        int num =Integer.parseInt(registros[5]);
        num--;
        int row = jtablepasajeros.getSelectedRow();
        metodosdb.EliminarPasajero(jtablepasajeros, row,indexV, num);
        jbotoneliminar.setEnabled(false);
        jlabelnumactualpasajeros.setText(String.valueOf(num));
        
    }//GEN-LAST:event_jbotoneliminarActionPerformed

    private void jtablepasajerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablepasajerosMouseClicked
        // TODO add your handling code here:
        JTable table = (JTable)evt.getSource();
        
        if (evt.getClickCount()== 1){
            jbotoneliminar.setEnabled(true);
            
        }
        
        
    }//GEN-LAST:event_jtablepasajerosMouseClicked

    private void CmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdSalirActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_CmdSalirActionPerformed

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
            java.util.logging.Logger.getLogger(ListaPasajerosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaPasajerosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaPasajerosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaPasajerosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaPasajerosForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbotoneliminar;
    private javax.swing.JLabel jlabelcompañia;
    private javax.swing.JLabel jlabeldestino;
    private javax.swing.JLabel jlabelidentificador;
    public static javax.swing.JLabel jlabelnumactualpasajeros;
    private javax.swing.JLabel jlabelnummaxpasajeros;
    private javax.swing.JLabel jlabelorigen;
    public static javax.swing.JTable jtablepasajeros;
    // End of variables declaration//GEN-END:variables
}
