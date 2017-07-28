package Formularios;

import entidades.Ejemplar;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ReporteEjemplares extends javax.swing.JInternalFrame {

    public ReporteEjemplares() {
        initComponents();
        for (int i = 0; i < RegistroLibro.listaEjemplares.size(); i++) {
            tblEjemplares.setValueAt(RegistroLibro.listaEjemplares.get(i).getNombreLibro(), i, 0);
            tblEjemplares.setValueAt(RegistroLibro.listaEjemplares.get(i).getNumero(), i, 1);
            tblEjemplares.setValueAt(RegistroLibro.listaEjemplares.get(i).getEstado(), i, 2);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEjemplares = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTituloLibroBuscar = new javax.swing.JTextField();
        btnBuscarEjemplares = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Reporte de ejemplares");

        tblEjemplares.setModel(new javax.swing.table.DefaultTableModel(
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
                "Libro", "Codigo", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tblEjemplares);

        jLabel1.setText("Titulo del Libro:");

        btnBuscarEjemplares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar2.gif"))); // NOI18N
        btnBuscarEjemplares.setText("Buscar");
        btnBuscarEjemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEjemplaresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTituloLibroBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarEjemplares)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTituloLibroBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarEjemplares))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarEjemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEjemplaresActionPerformed
        ArrayList<Ejemplar> listaEjemplaresTemp = RegistroLibro.listaEjemplares.getLista();
        ArrayList<Ejemplar> listaEjemplaresTemp2 = new ArrayList<>();
        for (int i = 0; i < listaEjemplaresTemp.size(); i++) {
            if ((txtTituloLibroBuscar.getText()).equals(listaEjemplaresTemp.get(i).getNombreLibro())) {
                listaEjemplaresTemp2.add(listaEjemplaresTemp.get(i));
            }
        }
        if (listaEjemplaresTemp2.size() > 0) {
            for (int i = 0; i < tblEjemplares.getRowCount(); i++) {
                tblEjemplares.setValueAt(null, i, 0);
                tblEjemplares.setValueAt(null, i, 1);
                tblEjemplares.setValueAt(null, i, 2);
            }
            JOptionPane.showMessageDialog(this, "Se encontraron " + listaEjemplaresTemp2.size() + " ejemplares", "Informacion", 1);
            for (int i = 0; i < listaEjemplaresTemp2.size(); i++) {
                tblEjemplares.setValueAt(listaEjemplaresTemp2.get(i).getNombreLibro(), i, 0);
                tblEjemplares.setValueAt(listaEjemplaresTemp2.get(i).getNumero(), i, 1);
                tblEjemplares.setValueAt(listaEjemplaresTemp2.get(i).getEstado(), i, 2);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay ejemplares para este libro", ":c", 0);
            for (int i = 0; i < RegistroLibro.listaEjemplares.size(); i++) {
                tblEjemplares.setValueAt(RegistroLibro.listaEjemplares.get(i).getNombreLibro(), i, 0);
                tblEjemplares.setValueAt(RegistroLibro.listaEjemplares.get(i).getNumero(), i, 1);
                tblEjemplares.setValueAt(RegistroLibro.listaEjemplares.get(i).getEstado(), i, 2);
            }
        }
    }//GEN-LAST:event_btnBuscarEjemplaresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarEjemplares;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEjemplares;
    private javax.swing.JTextField txtTituloLibroBuscar;
    // End of variables declaration//GEN-END:variables
}
