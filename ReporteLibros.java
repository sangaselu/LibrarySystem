package Formularios;

import entidades.Libro;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ReporteLibros extends javax.swing.JInternalFrame {

    public ReporteLibros() {
        initComponents();
        ArrayList<Libro> listaLibrosTemp = RegistroLibro.listasLibros.getLista();
        ArrayList<Libro> listaParaCategoria1 = new ArrayList<>();
        ArrayList<Libro> listaParaCategoria2 = new ArrayList<>();
        ArrayList<Libro> listaParaCategoria3 = new ArrayList<>();

        for (int i = 0; i < listaLibrosTemp.size(); i++) {
            if (("Categoria 1").equals(listaLibrosTemp.get(i).getCategoria())) {
                listaParaCategoria1.add(listaLibrosTemp.get(i));
            }
        }
        for (int i = 0; i < listaLibrosTemp.size(); i++) {
            if (("Categoria 2").equals(listaLibrosTemp.get(i).getCategoria())) {
                listaParaCategoria2.add(listaLibrosTemp.get(i));
            }
        }
        for (int i = 0; i < listaLibrosTemp.size(); i++) {
            if (("Categoria 3").equals(listaLibrosTemp.get(i).getCategoria())) {
                listaParaCategoria3.add(listaLibrosTemp.get(i));
            }
        }
        for (int i = 0; i < listaParaCategoria1.size(); i++) {
            tblLibros.setValueAt(listaParaCategoria1.get(i).getTitulo() + ""
                    + ", cant=" + listaParaCategoria1.get(i).getCantidad(), i, 0);
        }
        for (int i = 0; i < listaParaCategoria2.size(); i++) {
            tblLibros.setValueAt(listaParaCategoria2.get(i).getTitulo() + ""
                    + ", cant=" + listaParaCategoria2.get(i).getCantidad(), i, 1);
        }
        for (int i = 0; i < listaParaCategoria3.size(); i++) {
            tblLibros.setValueAt(listaParaCategoria3.get(i).getTitulo() + ""
                    + ", cant=" + listaParaCategoria3.get(i).getCantidad(), i, 2);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Reporte de libros");

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null}
            },
            new String [] {
                "Categoria 1", "Categoria 2", "Categoria 3"
            }
        ));
        jScrollPane1.setViewportView(tblLibros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLibros;
    // End of variables declaration//GEN-END:variables
}
