package Formularios;

import entidades.Usuario;
import javax.swing.JOptionPane;

public class ReporteUsuarios extends javax.swing.JInternalFrame {

    public ReporteUsuarios() {
        initComponents();
        for (int i = 0; i < RegistroUsuario.listaUsuarios.size(); i++) {
            tblUsuarios.setValueAt(RegistroUsuario.listaUsuarios.get(i).getId(), i, 0);
            tblUsuarios.setValueAt(RegistroUsuario.listaUsuarios.get(i).getNombres(), i, 1);
            tblUsuarios.setValueAt(RegistroUsuario.listaUsuarios.get(i).getEscuela(), i, 2);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNombreUsuarioBuscar = new javax.swing.JTextField();
        btnBuscarUsuario = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Reporte de usuarios");
        setToolTipText("");

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Escuela"
            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        jLabel1.setText("ID usuario:");

        btnBuscarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar2.gif"))); // NOI18N
        btnBuscarUsuario.setText("Buscar");
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreUsuarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarUsuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreUsuarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
        Usuario us = RegistroUsuario.listaUsuarios.getUsuarioxID(txtNombreUsuarioBuscar.getText());
        if (us != null) {
            JOptionPane.showMessageDialog(this, "Se encontró usuario\nID="
                    + us.getId() + "\nNombre=" + us.getNombres() + "\nEscuela=" + us.getEscuela(), "Informacion", 1);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontro usuario", ":c", 0);
        }
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtNombreUsuarioBuscar;
    // End of variables declaration//GEN-END:variables
}
