package Formularios;

import entidades.Ejemplar;
import entidades.Prestamo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class RegistroDevolucion extends javax.swing.JInternalFrame {

    boolean seAbrio = false;

    public RegistroDevolucion() {
        initComponents();
        for (int i = 0; i < RegistroUsuario.listaUsuarios.size(); i++) {
            cmbNombreUsuario.insertItemAt(RegistroUsuario.listaUsuarios.get(i).getNombres(), i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cmbNombreUsuario = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbLibrosPrestados = new javax.swing.JComboBox<>();
        btnDevolver = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registro de devoluciones");

        jLabel2.setText("USUARIO:");

        cmbNombreUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNombreUsuarioItemStateChanged(evt);
            }
        });

        jLabel3.setText("Libros prestados:");

        btnDevolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        btnDevolver.setText("Devolver");
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbNombreUsuario, 0, 164, Short.MAX_VALUE)
                            .addComponent(cmbLibrosPrestados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbLibrosPrestados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        Ejemplar ej = RegistroLibro.listaEjemplares.getEjemplarxCodigo((String) cmbLibrosPrestados.getSelectedItem());
        Prestamo pr = RegistroPrestamos.listaPrestamos.getPrestamoxEjemplar(ej);
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYY");
        String hoy = formatoFecha.format(fecha);
        int diaQueSeDevuelve = Integer.parseInt(hoy.charAt(0) + "" + hoy.charAt(1));
        int mesQueSeDevuelve = Integer.parseInt(hoy.charAt(3) + "" + hoy.charAt(4));
        int diaFinalDelPrestamo = Integer.parseInt(pr.getFechaFin().charAt(0) + "" + pr.getFechaFin().charAt(1));
        int mesFinalDelPrestamo = Integer.parseInt(pr.getFechaFin().charAt(3) + "" + pr.getFechaFin().charAt(4));
        int diaInicialDelPrestamo = Integer.parseInt(pr.getFechaInicio().charAt(0) + "" + pr.getFechaInicio().charAt(1));
        int mesInicialDelPrestamo = Integer.parseInt(pr.getFechaInicio().charAt(3) + "" + pr.getFechaInicio().charAt(4));
        if (mesQueSeDevuelve >= mesInicialDelPrestamo && mesQueSeDevuelve <= mesFinalDelPrestamo) {
            if (mesQueSeDevuelve != mesInicialDelPrestamo) {
                JOptionPane.showMessageDialog(this, "Entregado a tiempo", "Info", 1);
                ej.setEstado("No prestado");
            } else {
                if (mesQueSeDevuelve == mesFinalDelPrestamo) {
                    if (diaQueSeDevuelve >= diaInicialDelPrestamo && diaQueSeDevuelve <= diaFinalDelPrestamo) {
                        JOptionPane.showMessageDialog(this, "Entregado a tiempo", "Info", 1);
                        ej.setEstado("No prestado");
                    } else {
                        JOptionPane.showMessageDialog(this, "Entregado a tiempo", "Info", 2);
                    }
                }
            }
        } else {

        }
        JOptionPane.showMessageDialog(this, "Entregado a tiempo");
        ej.setEstado("No prestado");

    }//GEN-LAST:event_btnDevolverActionPerformed

    private void cmbNombreUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNombreUsuarioItemStateChanged
        if (seAbrio == false) {
            ArrayList<Prestamo> listaPrestamosTemp = RegistroPrestamos.listaPrestamos.getLista();
            ArrayList<Prestamo> listaPrestamosTemp2 = new ArrayList<>();
            for (int i = 0; i < listaPrestamosTemp.size(); i++) {
                if (((String) cmbNombreUsuario.getSelectedItem()).equals(listaPrestamosTemp.get(i).getUsuario().getNombres())) {
                    listaPrestamosTemp2.add(listaPrestamosTemp.get(i));
                }
            }
            for (int i = 0; i < listaPrestamosTemp2.size(); i++) {
                cmbLibrosPrestados.insertItemAt(listaPrestamosTemp2.get(i).getEjemplar().getNumero(), i);
            }
            seAbrio = true;
        } else {
            cmbLibrosPrestados.removeAllItems();
            seAbrio = false;
        }
    }//GEN-LAST:event_cmbNombreUsuarioItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevolver;
    private javax.swing.JComboBox<String> cmbLibrosPrestados;
    private javax.swing.JComboBox<String> cmbNombreUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
