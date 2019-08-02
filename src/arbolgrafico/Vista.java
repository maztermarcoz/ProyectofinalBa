package arbolgrafico;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
public class Vista extends javax.swing.JFrame {
    private Aab simulador = new Aab();
    public Vista() {
        initComponents();
        this.inicializar(false);
        PA F = new PA();
        this.add(F, BorderLayout.CENTER);
        this.pack();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/LogoMB.png"));
        setIconImage(icon);
    }
    private void inicializar(boolean enable) {
        this.opciones.setEnabled(enable);
        this.cmdBuscar.setEnabled(enable);
        this.botonBorrar.setEnabled(enable);      
        this.botonBMayor.setEnabled(enable);
        this.botonBMenor.setEnabled(enable);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonInsertar = new javax.swing.JButton();
        botonBMayor = new javax.swing.JButton();
        botonBMenor = new javax.swing.JButton();
        cmdBuscar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        opciones = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        lblCnodos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        impresion = new javax.swing.JTextArea();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        botonInsertar.setBackground(new java.awt.Color(255, 255, 255));
        botonInsertar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        botonBMayor.setBackground(new java.awt.Color(255, 255, 255));
        botonBMayor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonBMayor.setText("Borrar mayor");
        botonBMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBMayorActionPerformed(evt);
            }
        });

        botonBMenor.setBackground(new java.awt.Color(255, 255, 255));
        botonBMenor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonBMenor.setText("Borrar menor");
        botonBMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBMenorActionPerformed(evt);
            }
        });

        cmdBuscar.setBackground(new java.awt.Color(255, 255, 255));
        cmdBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdBuscar.setText("Buscar");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });

        botonBorrar.setBackground(new java.awt.Color(255, 255, 255));
        botonBorrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonBorrar.setText("Borrar");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        opciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        opciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Metodos", "InOrden", "PreOrden", "PosOrden", " " }));
        opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesActionPerformed(evt);
            }
        });

        jLabel1.setText("Cantidad Nodos");

        lblCnodos.setEditable(false);

        jScrollPane1.setOpaque(false);

        impresion.setEditable(false);
        impresion.setColumns(20);
        impresion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        impresion.setForeground(new java.awt.Color(0, 0, 102));
        impresion.setRows(5);
        impresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados de operaciones"));
        impresion.setOpaque(false);
        jScrollPane1.setViewportView(impresion);

        jDesktopPane1.setOpaque(false);

        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setEnabled(false);
        jInternalFrame2.setFocusCycleRoot(false);
        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        jDesktopPane1.add(jInternalFrame2);
        jInternalFrame2.setBounds(0, 0, 440, 340);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonInsertar)
                    .addComponent(botonBorrar)
                    .addComponent(cmdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(botonBMayor)
                        .addGap(77, 77, 77)
                        .addComponent(botonBMenor)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblCnodos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botonInsertar)
                                    .addGap(32, 32, 32)
                                    .addComponent(botonBorrar)
                                    .addGap(29, 29, 29)
                                    .addComponent(cmdBuscar))
                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblCnodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBMenor)
                    .addComponent(botonBMayor)
                    .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        try {
            int dato = Integer.parseInt(JOptionPane.showInputDialog("Nodo:"));
            if (this.simulador.insertar(dato)) {
             
                this.inicializar(true);
                
                complementos();
            }
        } catch (Exception e) {
   JOptionPane.showMessageDialog(null, "Nodo incorrecto");
        }
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesActionPerformed
        Object opcion = this.opciones.getSelectedItem();
        String recorrido = null;
        if (opcion.equals("InOrden")) {
            recorrido = this.simulador.inOrden();
        }
        if (opcion.equals("PreOrden")) {
            recorrido = this.simulador.preOrden();
        }
        if (opcion.equals("PosOrden")) {
            recorrido = this.simulador.posOrden();
        }
        this.impresion.setText("");
        this.impresion.setText(recorrido);
    }//GEN-LAST:event_opcionesActionPerformed

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        int dato_a_buscar = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite un dato a buscar en el arbol:"));
        String salida = this.simulador.esta(dato_a_buscar);
        this.impresion.setText("");
        this.impresion.setText(salida);
    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        try {
            int dato = Integer.parseInt(JOptionPane.showInputDialog("Digite dato entero para borrar: "));
            this.impresion.setText(this.simulador.borrar(dato));
            
            complementos();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonBMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBMayorActionPerformed
        try {
            this.impresion.setText("");
            this.impresion.setText(simulador.borrarMayor());
            
            complementos();
        } catch (Exception e) {
            complementos();
        }
    }//GEN-LAST:event_botonBMayorActionPerformed

    private void botonBMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBMenorActionPerformed

        try {
            this.impresion.setText("");
            this.impresion.setText(simulador.borrarMenor());           

            complementos();
        } catch (Exception e) {
            
            complementos();
        }
    }//GEN-LAST:event_botonBMenorActionPerformed

    public void complementos(){
        this.repintarArbol();
        this.lblCnodos.setText("");
        this.lblCnodos.setText(this.simulador.CantidadNodos());
    }
    private void repintarArbol() {
        this.jDesktopPane1.removeAll();
        Rectangle tamaño = this.jInternalFrame2.getBounds();
        this.jInternalFrame2 = null;
        this.jInternalFrame2 = new JInternalFrame("Representación gráfica", true);
        this.jDesktopPane1.add(this.jInternalFrame2, JLayeredPane.DEFAULT_LAYER);
        this.jInternalFrame2.setVisible(true);
        this.jInternalFrame2.setBounds(tamaño);
        this.jInternalFrame2.setEnabled(false);
        this.jInternalFrame2.add(this.simulador.getDibujo(), BorderLayout.CENTER);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBMayor;
    private javax.swing.JButton botonBMenor;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JTextArea impresion;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lblCnodos;
    private javax.swing.JComboBox opciones;
    // End of variables declaration//GEN-END:variables
}
