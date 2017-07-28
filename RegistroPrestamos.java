package Formularios;

import accesoDatos.ListaPrestamo;
import entidades.Ejemplar;
import entidades.Prestamo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class RegistroPrestamos extends javax.swing.JInternalFrame {

    public static ListaPrestamo listaPrestamos;
    boolean seAbrio = false;

    public RegistroPrestamos() {
        initComponents();
        for (int i = 0; i < RegistroLibro.listasLibros.size(); i++) {
            cmbLibro.insertItemAt(RegistroLibro.listasLibros.get(i).getTitulo(), i);
        }
        for (int i = 0; i < RegistroUsuario.listaUsuarios.size(); i++) {
            cmbUsuario.insertItemAt(RegistroUsuario.listaUsuarios.get(i).getNombres(), i);
        }
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYY");
        String fechaSalida = formatoFecha.format(fecha);
        txtFechaSalida.setText(fechaSalida);
        txtFechaEntrega.setText("");
        listaPrestamos = new ListaPrestamo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPrestar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmbEjemplar = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbLibro = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFechaSalida = new javax.swing.JTextField();
        txtFechaEntrega = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbUsuario = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registro de prestamos");

        btnPrestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carrito.gif"))); // NOI18N
        btnPrestar.setText("Prestar libro");
        btnPrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestarActionPerformed(evt);
            }
        });

        jLabel4.setText("Ejemplar:");

        jLabel5.setText("Libro:");

        cmbLibro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbLibroItemStateChanged(evt);
            }
        });

        jLabel6.setText("Fecha de salida:");

        jLabel7.setText("Fecha de entrega:");

        txtFechaSalida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaSalida.setEnabled(false);

        txtFechaEntrega.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setText("Usuario:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(67, 67, 67)
                                .addComponent(cmbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtFechaSalida, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbLibro, javax.swing.GroupLayout.Alignment.LEADING, 0, 173, Short.MAX_VALUE)
                                    .addComponent(cmbEjemplar, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFechaEntrega)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestarActionPerformed
        String nombreUsuario = cmbUsuario.getSelectedItem().toString();
        String nombreEjemplar = cmbEjemplar.getSelectedItem().toString();
        Ejemplar e = RegistroLibro.listaEjemplares.getEjemplarxCodigo(nombreEjemplar);
        Prestamo pr = new Prestamo(txtFechaSalida.getText(), txtFechaEntrega.getText(), RegistroUsuario.listaUsuarios.getUsuarioxNombre(nombreUsuario), e);
        e.setEstado("Prestado");
        listaPrestamos.agregarPrestamo(pr);
        JOptionPane.showMessageDialog(this, "Prestado", "Info", 1);
    }//GEN-LAST:event_btnPrestarActionPerformed

    private void cmbLibroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbLibroItemStateChanged
        if (seAbrio == false) {
            ArrayList<Ejemplar> listaEjemplaresTemp = RegistroLibro.listaEjemplares.getLista();
            ArrayList<Ejemplar> listaEjemplaresTemp2 = new ArrayList<>();
            for (int i = 0; i < listaEjemplaresTemp.size(); i++) {
                if (((String) cmbLibro.getSelectedItem()).equals(listaEjemplaresTemp.get(i).getNombreLibro())) {
                    listaEjemplaresTemp2.add(listaEjemplaresTemp.get(i));
                }
            }
            for (int i = 0; i < listaEjemplaresTemp2.size(); i++) {
                cmbEjemplar.insertItemAt("" + listaEjemplaresTemp2.get(i).getNumero(), i);
            }
            seAbrio = true;
        } else {
            cmbEjemplar.removeAllItems();
            seAbrio = false;
        }
    }//GEN-LAST:event_cmbLibroItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrestar;
    private javax.swing.JComboBox<String> cmbEjemplar;
    private javax.swing.JComboBox<String> cmbLibro;
    private javax.swing.JComboBox<String> cmbUsuario;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtFechaEntrega;
    private javax.swing.JTextField txtFechaSalida;
    // End of variables declaration//GEN-END:variables
}
