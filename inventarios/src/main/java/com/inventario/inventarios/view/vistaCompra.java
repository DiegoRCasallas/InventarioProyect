/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.inventario.inventarios.view;

/**
 *
 * @author Labing-PC
 */
public class vistaCompra extends javax.swing.JFrame {

    /**
     * Creates new form vistaCompra
     */
    public vistaCompra() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        txtIdProveedorCompra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreProveedorCompra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFechaDeCompra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIdCompra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombreProductoCompra = new javax.swing.JTextField();
        btonBuscarProveedorCompra = new javax.swing.JButton();
        btonBuscarProductoCompra = new javax.swing.JButton();
        txtCodigoProductoCompra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCategoriaProductoCompra = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDescripcionProductoCompra = new javax.swing.JTextField();
        btonBuscarTodoCompra = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btonAgregarCompra = new javax.swing.JButton();
        txtCantidadCompra = new javax.swing.JTextField();
        txtStockProductoCompra = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCompra = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtSubtotalCompra = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtIvaCompra = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtTotalCompra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Compra");

        jLabel2.setText("Id. Proveedor");

        txtIdProveedorCompra.setForeground(new java.awt.Color(0, 0, 0));
        txtIdProveedorCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProveedorCompraActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        txtNombreProveedorCompra.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setText("Fecha");

        txtFechaDeCompra.setEditable(false);

        jLabel5.setText("Factura");

        txtIdCompra.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setText("Resgitro de compra");

        jLabel7.setText("Codigo del producto");

        txtNombreProductoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoCompraActionPerformed(evt);
            }
        });

        btonBuscarProveedorCompra.setBackground(new java.awt.Color(204, 204, 204));
        btonBuscarProveedorCompra.setForeground(new java.awt.Color(0, 0, 0));
        btonBuscarProveedorCompra.setText("Buscar");
        btonBuscarProveedorCompra.setToolTipText("");
        btonBuscarProveedorCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btonBuscarProveedorCompraMouseClicked(evt);
            }
        });
        btonBuscarProveedorCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonBuscarProveedorCompraActionPerformed(evt);
            }
        });

        btonBuscarProductoCompra.setBackground(new java.awt.Color(204, 204, 204));
        btonBuscarProductoCompra.setForeground(new java.awt.Color(0, 0, 0));
        btonBuscarProductoCompra.setText("Buscar");
        btonBuscarProductoCompra.setToolTipText("");

        txtCodigoProductoCompra.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigoProductoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoCompraActionPerformed(evt);
            }
        });

        jLabel9.setText("Descirpción ");

        txtCategoriaProductoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaProductoCompraActionPerformed(evt);
            }
        });

        jLabel10.setText("Nombre ");

        btonBuscarTodoCompra.setText("Buscar todos");

        jLabel11.setText("Categoria");

        jLabel12.setText("Cantidad");

        btonAgregarCompra.setBackground(new java.awt.Color(204, 204, 204));
        btonAgregarCompra.setForeground(new java.awt.Color(0, 0, 0));
        btonAgregarCompra.setText("Agregar");
        btonAgregarCompra.setToolTipText("");

        txtCantidadCompra.setForeground(new java.awt.Color(204, 204, 204));
        txtCantidadCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadCompraActionPerformed(evt);
            }
        });

        txtStockProductoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockProductoCompraActionPerformed(evt);
            }
        });

        jLabel13.setText("Stock");

        tablaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Factura", "Proveedor", "Codigo Prod", "Nombre", "Stock", "Iva", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaCompra);

        jLabel14.setText("Subtotal");

        txtSubtotalCompra.setForeground(new java.awt.Color(204, 204, 204));
        txtSubtotalCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubtotalCompraActionPerformed(evt);
            }
        });

        jLabel15.setText("Iva");

        txtIvaCompra.setForeground(new java.awt.Color(204, 204, 204));
        txtIvaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIvaCompraActionPerformed(evt);
            }
        });

        jLabel16.setText("Total");

        txtTotalCompra.setForeground(new java.awt.Color(204, 204, 204));
        txtTotalCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreProveedorCompra)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtIdProveedorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(btonBuscarProveedorCompra))))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtFechaDeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdCompra)))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel6)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel9))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(txtCodigoProductoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(37, 37, 37)
                                                            .addComponent(btonBuscarProductoCompra))
                                                        .addComponent(txtDescripcionProductoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(129, 129, 129)
                                                .addComponent(txtCantidadCompra)
                                                .addGap(18, 18, 18)
                                                .addComponent(btonAgregarCompra))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(256, 256, 256)
                                                        .addComponent(jLabel15)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtIvaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(126, 126, 126)
                                                        .addComponent(txtSubtotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel14))))
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCategoriaProductoCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                            .addComponent(txtNombreProductoCompra)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel16)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtStockProductoCompra)
                                            .addComponent(txtTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(btonBuscarTodoCompra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdProveedorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btonBuscarProveedorCompra)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaDeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreProveedorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(48, 48, 48)
                .addComponent(jLabel6)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtCodigoProductoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btonBuscarProductoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNombreProductoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCategoriaProductoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtDescripcionProductoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel11))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtStockProductoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtSubtotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIvaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel12)
                    .addComponent(txtCantidadCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btonAgregarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btonBuscarTodoCompra)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdProveedorCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProveedorCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProveedorCompraActionPerformed

    private void txtCodigoProductoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProductoCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProductoCompraActionPerformed

    private void txtCategoriaProductoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaProductoCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaProductoCompraActionPerformed

    private void btonBuscarProveedorCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonBuscarProveedorCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btonBuscarProveedorCompraActionPerformed

    private void btonBuscarProveedorCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btonBuscarProveedorCompraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btonBuscarProveedorCompraMouseClicked

    private void txtNombreProductoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoCompraActionPerformed

    private void txtCantidadCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadCompraActionPerformed

    private void txtStockProductoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockProductoCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockProductoCompraActionPerformed

    private void txtSubtotalCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubtotalCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtotalCompraActionPerformed

    private void txtIvaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIvaCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIvaCompraActionPerformed

    private void txtTotalCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalCompraActionPerformed

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
            java.util.logging.Logger.getLogger(vistaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btonAgregarCompra;
    public javax.swing.JButton btonBuscarProductoCompra;
    public javax.swing.JButton btonBuscarProveedorCompra;
    public javax.swing.JButton btonBuscarTodoCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tablaCompra;
    public javax.swing.JTextField txtCantidadCompra;
    public javax.swing.JTextField txtCategoriaProductoCompra;
    public javax.swing.JTextField txtCodigoProductoCompra;
    public javax.swing.JTextField txtDescripcionProductoCompra;
    public javax.swing.JTextField txtFechaDeCompra;
    public javax.swing.JTextField txtIdCompra;
    public javax.swing.JTextField txtIdProveedorCompra;
    public javax.swing.JTextField txtIvaCompra;
    public javax.swing.JTextField txtNombreProductoCompra;
    public javax.swing.JTextField txtNombreProveedorCompra;
    public javax.swing.JTextField txtStockProductoCompra;
    public javax.swing.JTextField txtSubtotalCompra;
    public javax.swing.JTextField txtTotalCompra;
    // End of variables declaration//GEN-END:variables
}
