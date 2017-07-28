package Formularios;

import entidades.Prestamo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ReportePrestamos extends javax.swing.JInternalFrame {

    public ReportePrestamos() {
        initComponents();
        for (int i = 0; i < RegistroUsuario.listaUsuarios.size(); i++) {
            cmbNombreUsuario.insertItemAt(RegistroUsuario.listaUsuarios.get(i).getNombres(), i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIDUsuario = new javax.swing.JTextField();
        btnBuscarPrestamosUsuario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbNombreUsuario = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("Busqueda");

        jLabel1.setText("ID:");

        txtIDUsuario.setFocusable(false);

        btnBuscarPrestamosUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar.gif"))); // NOI18N
        btnBuscarPrestamosUsuario.setText("Buscar");
        btnBuscarPrestamosUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPrestamosUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("USUARIO:");

        cmbNombreUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNombreUsuarioItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIDUsuario)
                    .addComponent(cmbNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarPrestamosUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnBuscarPrestamosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPrestamosUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPrestamosUsuarioActionPerformed
        ArrayList<Prestamo> listaPrestamosTemp = RegistroPrestamos.listaPrestamos.getLista();
        ArrayList<Prestamo> listaPrestamosTemp2 = new ArrayList<>();
        for (int i = 0; i < listaPrestamosTemp.size(); i++) {
            if ((txtIDUsuario.getText()).equals(listaPrestamosTemp.get(i).getUsuario().getId())) {
                listaPrestamosTemp2.add(listaPrestamosTemp.get(i));
            }
        }
        if (listaPrestamosTemp2.size() >= 0) {
            TablaReportePrestamos tpu = new TablaReportePrestamos();
            Main.dspFondo.add(tpu);
            tpu.setVisible(true);
            Main.centrar(tpu);
            JOptionPane.showMessageDialog(this, "EL usuario hizo " + listaPrestamosTemp2.size() + " prestamos", "", 1);
            for (int i = 0; i < listaPrestamosTemp2.size(); i++) {
                tpu.tblPrestamosUsuario.setValueAt(listaPrestamosTemp2.get(i).getEjemplar().getNombreLibro(), i, 0);
                tpu.tblPrestamosUsuario.setValueAt(listaPrestamosTemp2.get(i).getEjemplar().getNumero(), i, 1);
                tpu.tblPrestamosUsuario.setValueAt(listaPrestamosTemp2.get(i).getEjemplar().getEstado(), i, 2);
                tpu.tblPrestamosUsuario.setValueAt(listaPrestamosTemp2.get(i).getFechaInicio(), i, 3);
                tpu.tblPrestamosUsuario.setValueAt(listaPrestamosTemp2.get(i).getFechaFin(), i, 4);
            }

        } else {
            JOptionPane.showMessageDialog(this, "No hizo prestamos o ID incorrecto", "", 0);
        }
    }//GEN-LAST:event_btnBuscarPrestamosUsuarioActionPerformed

    private void cmbNombreUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNombreUsuarioItemStateChanged
        txtIDUsuario.setText(RegistroUsuario.listaUsuarios.getUsuarioxNombre((String) cmbNombreUsuario.getSelectedItem()).getId());
    }//GEN-LAST:event_cmbNombreUsuarioItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPrestamosUsuario;
    private javax.swing.JComboBox<String> cmbNombreUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtIDUsuario;
    // End of variables declaration//GEN-END:variables
}
