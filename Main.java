package Formularios;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JInternalFrame;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main extends javax.swing.JFrame implements Runnable{

    String hora, minuto, segundo, ampm;
    Thread hilo;
    
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblFecha.setText(fecha());
        hilo = new Thread(this);
        hilo.start();
    }

    public static void centrar(JInternalFrame If) {
        int x = (dspFondo.getWidth() / 2) - (If.getWidth() / 2);
        int y = (dspFondo.getHeight() / 2) - (If.getHeight() / 2);
        if (If.isShowing()) {
            If.setLocation(x, y);
        } else {
            dspFondo.add(If);
            If.setLocation(x, y);
            If.show();
        }
    }

    public static void paraNumeroEnteros(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                int c = (int) e.getKeyChar();
                if (c > 47 && c < 58) {

                } else {
                    e.setKeyChar((char) KeyEvent.VK_CLEAR);
                    e.consume();
                    JOptionPane.showMessageDialog(null, "Ingresa solo numeros", "Error", 0);
                }
            }
        });
    }
    
        public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYY");
        return formatoFecha.format(fecha);
    }

    public void hora() {
        Calendar calendario = new GregorianCalendar();
        Date horaActual = new Date();
        calendario.setTime(horaActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY);
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minuto = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundo = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }

    public void run() {
        Thread current = Thread.currentThread();
        while (current == hilo) {
            hora();
            lblHora.setText(hora + ":" + minuto + " " + ampm);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dspFondo = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        mbhkm = new javax.swing.JMenu();
        mnuRegistroUsuario = new javax.swing.JMenuItem();
        mnuRegistroLibros = new javax.swing.JMenuItem();
        mnuRegistroPrestamos = new javax.swing.JMenuItem();
        mnuRegistroDevoluciones = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnuReporteEjemplares = new javax.swing.JMenuItem();
        mnuReporteUsuarios = new javax.swing.JMenuItem();
        mnuReporteLibros = new javax.swing.JMenuItem();
        mnuReportePrestamos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuMantenimientoLibros = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/upao_interna.jpg"))); // NOI18N

        dspFondo.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dspFondoLayout = new javax.swing.GroupLayout(dspFondo);
        dspFondo.setLayout(dspFondoLayout);
        dspFondoLayout.setHorizontalGroup(
            dspFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
        dspFondoLayout.setVerticalGroup(
            dspFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );

        lblFecha.setText("jLabel2");

        lblHora.setText("jLabel2");

        mbhkm.setText("Menu");

        mnuRegistroUsuario.setText("Registro de usuarios");
        mnuRegistroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegistroUsuarioActionPerformed(evt);
            }
        });
        mbhkm.add(mnuRegistroUsuario);

        mnuRegistroLibros.setText("Registro de libros");
        mnuRegistroLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegistroLibrosActionPerformed(evt);
            }
        });
        mbhkm.add(mnuRegistroLibros);

        mnuRegistroPrestamos.setText("Registro de prestamos");
        mnuRegistroPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegistroPrestamosActionPerformed(evt);
            }
        });
        mbhkm.add(mnuRegistroPrestamos);

        mnuRegistroDevoluciones.setText("Registro de devoluciones");
        mnuRegistroDevoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegistroDevolucionesActionPerformed(evt);
            }
        });
        mbhkm.add(mnuRegistroDevoluciones);

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mbhkm.add(mnuSalir);

        jMenuBar2.add(mbhkm);

        jMenu1.setText("Reporte");

        mnuReporteEjemplares.setText("Ejemplares");
        mnuReporteEjemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReporteEjemplaresActionPerformed(evt);
            }
        });
        jMenu1.add(mnuReporteEjemplares);

        mnuReporteUsuarios.setText("Usuarios");
        mnuReporteUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReporteUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(mnuReporteUsuarios);

        mnuReporteLibros.setText("Libros");
        mnuReporteLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReporteLibrosActionPerformed(evt);
            }
        });
        jMenu1.add(mnuReporteLibros);

        mnuReportePrestamos.setText("Prestamos");
        mnuReportePrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReportePrestamosActionPerformed(evt);
            }
        });
        jMenu1.add(mnuReportePrestamos);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Mantenimiento");

        mnuMantenimientoLibros.setText("Libros");
        mnuMantenimientoLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMantenimientoLibrosActionPerformed(evt);
            }
        });
        jMenu2.add(mnuMantenimientoLibros);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dspFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblFecha)
                .addGap(88, 88, 88)
                .addComponent(lblHora))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dspFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(lblHora))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuRegistroLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegistroLibrosActionPerformed
        try {
            RegistroUsuario.listaUsuarios.getLista();
            RegistroLibro RL = new RegistroLibro();
            dspFondo.add(RL);
            RL.setVisible(true);
            centrar(RL);
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "No se registraron usuarios", "Error", 0);
        }
    }//GEN-LAST:event_mnuRegistroLibrosActionPerformed

    private void mnuReporteEjemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReporteEjemplaresActionPerformed
        try {
            RegistroLibro.listaEjemplares.getLista();
            ReporteEjemplares le = new ReporteEjemplares();
            dspFondo.add(le);
            le.setVisible(true);
            centrar(le);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No se registraron ejemplares", "Error", 0);
        }
    }//GEN-LAST:event_mnuReporteEjemplaresActionPerformed

    private void mnuRegistroPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegistroPrestamosActionPerformed
        try {
            RegistroLibro.listasLibros.getLista();
            RegistroUsuario.listaUsuarios.getLista();
            RegistroPrestamos p = new RegistroPrestamos();
            dspFondo.add(p);
            p.setVisible(true);
            centrar(p);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No se registraron libros ni usuarios", "Error", 0);
        }
    }//GEN-LAST:event_mnuRegistroPrestamosActionPerformed

    private void mnuReporteUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReporteUsuariosActionPerformed
        try {
            RegistroUsuario.listaUsuarios.getLista();
            ReporteUsuarios lu = new ReporteUsuarios();
            dspFondo.add(lu);
            lu.setVisible(true);
            centrar(lu);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No se registraron usuarios", "Error", 0);
        }
    }//GEN-LAST:event_mnuReporteUsuariosActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        int valor = JOptionPane.showConfirmDialog(null, "¿Salir?", "Confirma", JOptionPane.YES_NO_OPTION, 2);
        if (valor == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuReporteLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReporteLibrosActionPerformed
        try {
            RegistroLibro.listasLibros.getLista();
            ReporteLibros ll = new ReporteLibros();
            dspFondo.add(ll);
            ll.setVisible(true);
            centrar(ll);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No se registraron libros", "Error", 0);
        }
    }//GEN-LAST:event_mnuReporteLibrosActionPerformed

    private void mnuReportePrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReportePrestamosActionPerformed
        try {
            ReportePrestamos pu = new ReportePrestamos();
            dspFondo.add(pu);
            pu.setVisible(true);
            centrar(pu);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No se registraron prestamos", "Error", 0);
        }
    }//GEN-LAST:event_mnuReportePrestamosActionPerformed

    private void mnuRegistroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegistroUsuarioActionPerformed
        RegistroUsuario ru = new RegistroUsuario();
        dspFondo.add(ru);
        ru.setVisible(true);
        centrar(ru);
    }//GEN-LAST:event_mnuRegistroUsuarioActionPerformed

    private void mnuMantenimientoLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMantenimientoLibrosActionPerformed
        try {
            RegistroLibro.listasLibros.getLista();
            MantenimientoLibros ml = new MantenimientoLibros();
            dspFondo.add(ml);
            ml.setVisible(true);
            centrar(ml);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No se registraron libros", "Error", 0);
        }
    }//GEN-LAST:event_mnuMantenimientoLibrosActionPerformed

    private void mnuRegistroDevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegistroDevolucionesActionPerformed
        try {
            RegistroPrestamos.listaPrestamos.getLista();
            RegistroDevolucion rd = new RegistroDevolucion();
            dspFondo.add(rd);
            rd.setVisible(true);
            centrar(rd);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No se registraron prestamos", "Error", 0);
        }
    }//GEN-LAST:event_mnuRegistroDevolucionesActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane dspFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JMenu mbhkm;
    private javax.swing.JMenuItem mnuMantenimientoLibros;
    private javax.swing.JMenuItem mnuRegistroDevoluciones;
    private javax.swing.JMenuItem mnuRegistroLibros;
    private javax.swing.JMenuItem mnuRegistroPrestamos;
    private javax.swing.JMenuItem mnuRegistroUsuario;
    private javax.swing.JMenuItem mnuReporteEjemplares;
    private javax.swing.JMenuItem mnuReporteLibros;
    private javax.swing.JMenuItem mnuReportePrestamos;
    private javax.swing.JMenuItem mnuReporteUsuarios;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables
}
