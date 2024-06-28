
package socios;

import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author Daniela Gil
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    //Se crea la lista dinámica socios:
    private List <TSocio> socios;
    
    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        //Se inicializa la lista:
        socios = new ArrayList<>();
        inicializarSocios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoCategoria = new javax.swing.ButtonGroup();
        background = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        panelAgregar = new javax.swing.JPanel();
        etiquetaN = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        etiquetaA = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        etiquetaDNI = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        etiquetaTel = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        etiquetaCat = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnMenor = new javax.swing.JRadioButton();
        btnMayor = new javax.swing.JRadioButton();
        btnCadete = new javax.swing.JRadioButton();
        panelEliminar = new javax.swing.JPanel();
        etiquetaEli = new javax.swing.JLabel();
        etiquetaDNI2 = new javax.swing.JLabel();
        txtDNI2 = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        panelVer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaSalida = new javax.swing.JTextArea();
        btnListar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(243, 243, 243));

        title.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 79, 77));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Manejo de Socios");

        panelAgregar.setBackground(new java.awt.Color(243, 243, 243));
        panelAgregar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar socio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(0, 79, 77))); // NOI18N
        panelAgregar.setForeground(new java.awt.Color(0, 79, 77));

        etiquetaN.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        etiquetaN.setText("Nombre/s:");

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 132, 128)));
        txtNombre.setSelectionColor(new java.awt.Color(204, 255, 204));

        etiquetaA.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        etiquetaA.setText("Apellido/s:");

        txtApellido.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 132, 128)));
        txtApellido.setSelectionColor(new java.awt.Color(204, 255, 204));

        etiquetaDNI.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        etiquetaDNI.setText("D.N.I.:");

        txtDNI.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtDNI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 132, 128)));
        txtDNI.setSelectionColor(new java.awt.Color(204, 255, 204));

        etiquetaTel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        etiquetaTel.setText("Teléfono:");

        txtTelefono.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 132, 128)));
        txtTelefono.setSelectionColor(new java.awt.Color(204, 255, 204));

        etiquetaCat.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        etiquetaCat.setText("Categoría:");

        btnAgregar.setBackground(new java.awt.Color(0, 79, 77));
        btnAgregar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnMenor.setBackground(new java.awt.Color(243, 243, 243));
        grupoCategoria.add(btnMenor);
        btnMenor.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnMenor.setText("Menor (de 0 a 12 años)");

        btnMayor.setBackground(new java.awt.Color(243, 243, 243));
        grupoCategoria.add(btnMayor);
        btnMayor.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnMayor.setText("Mayor (más de 18 años)");

        btnCadete.setBackground(new java.awt.Color(243, 243, 243));
        grupoCategoria.add(btnCadete);
        btnCadete.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCadete.setText("Cadete (de 13 a 18 años)");

        javax.swing.GroupLayout panelAgregarLayout = new javax.swing.GroupLayout(panelAgregar);
        panelAgregar.setLayout(panelAgregarLayout);
        panelAgregarLayout.setHorizontalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(etiquetaCat)
                        .addComponent(etiquetaN)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                        .addComponent(etiquetaA)
                        .addComponent(txtDNI)
                        .addComponent(etiquetaDNI)
                        .addComponent(etiquetaTel)
                        .addComponent(txtTelefono)
                        .addComponent(txtApellido))
                    .addComponent(btnMenor)
                    .addComponent(btnMayor)
                    .addComponent(btnCadete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgregarLayout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        panelAgregarLayout.setVerticalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(etiquetaN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(etiquetaA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(etiquetaDNI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(etiquetaTel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(etiquetaCat)
                .addGap(17, 17, 17)
                .addComponent(btnMenor)
                .addGap(17, 17, 17)
                .addComponent(btnCadete)
                .addGap(17, 17, 17)
                .addComponent(btnMayor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        panelEliminar.setBackground(new java.awt.Color(243, 243, 243));
        panelEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar socio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(0, 79, 77))); // NOI18N

        etiquetaEli.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        etiquetaEli.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaEli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaEli.setText("Ingrese el D.N.I del socio que desee eliminar.");

        etiquetaDNI2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        etiquetaDNI2.setText("D.N.I.:");

        txtDNI2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtDNI2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 132, 128)));
        txtDNI2.setSelectionColor(new java.awt.Color(204, 255, 204));

        btnEliminar.setBackground(new java.awt.Color(143, 26, 53));
        btnEliminar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEliminarLayout = new javax.swing.GroupLayout(panelEliminar);
        panelEliminar.setLayout(panelEliminarLayout);
        panelEliminarLayout.setHorizontalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaEli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelEliminarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaDNI2)
                    .addComponent(txtDNI2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        panelEliminarLayout.setVerticalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEliminarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(etiquetaEli)
                .addGap(17, 17, 17)
                .addComponent(etiquetaDNI2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDNI2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panelVer.setBackground(new java.awt.Color(243, 243, 243));
        panelVer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ver socios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(0, 79, 77))); // NOI18N

        txaSalida.setColumns(20);
        txaSalida.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txaSalida.setRows(5);
        txaSalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 132, 128)));
        txaSalida.setSelectionColor(new java.awt.Color(204, 255, 204));
        jScrollPane1.setViewportView(txaSalida);

        btnListar.setBackground(new java.awt.Color(75, 73, 82));
        btnListar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnListar.setForeground(new java.awt.Color(255, 255, 255));
        btnListar.setText("Listar");
        btnListar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVerLayout = new javax.swing.GroupLayout(panelVer);
        panelVer.setLayout(panelVerLayout);
        panelVerLayout.setHorizontalGroup(
            panelVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVerLayout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        panelVerLayout.setVerticalGroup(
            panelVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnGuardar.setBackground(new java.awt.Color(0, 119, 116));
        btnGuardar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(150, 55, 77));
        btnSalir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAbrir.setBackground(new java.awt.Color(121, 113, 122));
        btnAbrir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAbrir.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrir.setText("Abrir");
        btnAbrir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelVer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(panelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelVer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Se crea un componente para controlar el tiempo de aparición de los mensajes a usuarios:
    private void mensajeAlerta(String mensaje, String title, int tipo, int tiempo) {
        final JOptionPane cuadro = new JOptionPane(mensaje, tipo);
        final JDialog dialogo = cuadro.createDialog(this, title);
        dialogo.setModal(false);
        dialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialogo.setVisible(true);

        new Timer(tiempo, (ActionEvent evt) -> {
            dialogo.setVisible(false);
            dialogo.dispose();
        }).start();
    }
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Se definen las variables que se utilizarán para instanciar la clase TSocio:
        String nom = txtNombre.getText().trim();
        String ape = txtApellido.getText().trim();
        String dni = txtDNI.getText().trim();
        String tel = txtTelefono.getText().trim();
        String cat = "";
        
        if (btnMenor.isSelected()){
           cat = "Menor";
        } else if (btnCadete.isSelected()){
            cat = "Cadete";
        } else if (btnMayor.isSelected()){
            cat = "Mayor";
        }
        
        //Validación de campos vacíos:
        if (nom.isEmpty() || ape.isEmpty() || dni.isEmpty() || tel.isEmpty() || cat.isEmpty()){
            mensajeAlerta("Es necesario llenar todos los datos para agredar un socio.", "Error de validación", JOptionPane.ERROR_MESSAGE, 4000);
            return;
        }
        
        //Validación para que DNI y Teléfono sean numéricos:
        if (!dni.matches("\\d+")) {
            mensajeAlerta("Ingrese un formato válido para D.N.I.", "Error de validación", JOptionPane.ERROR_MESSAGE, 4000);
            return;
        }

        if (!tel.matches("\\d+")) {
            mensajeAlerta("Ingrese un formato válido para teléfono.", "Error de validación", JOptionPane.ERROR_MESSAGE, 4000);
            return;
        }
        
       //Validación para evitar DNI repetido:
        for (TSocio socio : socios) {
            String dniUsados = socio.getDni().trim();
            if(dniUsados.equals(dni)){
                mensajeAlerta("Ya existe un socio registrado con el mismo D.N.I.", "Error de validación", JOptionPane.ERROR_MESSAGE, 4000);
                return;
            }
        }

        //Instanciar un objeto de la clase TSocio:
        TSocio socio = new TSocio(nom, ape, dni, tel, cat);
        socios.add(socio);
        mensajeAlerta("¡Se ha agregado un nuevo socio con éxito!", "Información", JOptionPane.INFORMATION_MESSAGE, 2000);
        
        //Limpiar campos de texto:
        txtNombre.setText("");
        txtApellido.setText("");
        txtDNI.setText("");
        txtTelefono.setText("");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Se guarda el DNI ingresado por el usuario:
        String dni = txtDNI2.getText().trim();
        
        //Se compara el DNI ingresado con los de otras instancias de la lista, de encontrar coincidencias elimina el registro:
        boolean eliminado = socios.removeIf(socio -> socio.getDni().trim().equals(dni));

        if (eliminado) {
            mensajeAlerta("Se ha eliminado el socio correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE, 2000);
            txtDNI2.setText("");
        } else {
            mensajeAlerta("No se ha encontrado un socio con esos datos.", "Información", JOptionPane.INFORMATION_MESSAGE, 2000);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        //Se muestran por pantalla los elementos de la lista:
        txaSalida.setText("");
        for (TSocio socio : socios) {
            txaSalida.append(socio.toString()+"\n--------------------------------\n");
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        inicializarSocios();
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarCambios();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        guardarCambios();
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void inicializarSocios(){
        //Carga en la lista los datos almacenados en el fichero:
        try (BufferedReader lectorCont = new BufferedReader(new FileReader("fichero.txt"))) {
            String instancias;
            socios.clear();
            while ((instancias = lectorCont.readLine()) != null) {
                socios.add(TSocio.fromString(instancias));
            }
            mensajeAlerta("Se han cargado correctamente los datos de los socios.", "Información", JOptionPane.INFORMATION_MESSAGE, 2000);
        } catch (IOException e) {
            mensajeAlerta("Ha ocurrido un error al cargar los datos: " + e.getMessage(), "Error de validación", JOptionPane.ERROR_MESSAGE, 4000);
        }
    }
    
    private void guardarCambios(){
         //Almacena los datos de la lista en el fichero:
        try (BufferedWriter escritorCont = new BufferedWriter(new FileWriter("fichero.txt"))) {
            for (TSocio socio : socios) {
                escritorCont.write(socio.toString());
                escritorCont.newLine();
            }
            mensajeAlerta("Se han guardado los cambios correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE, 2000);
        } catch (IOException e) {
            mensajeAlerta("Error al guardar cambios: " + e.getMessage(), "Error de validación", JOptionPane.ERROR_MESSAGE, 4000);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JRadioButton btnCadete;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JRadioButton btnMayor;
    private javax.swing.JRadioButton btnMenor;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel etiquetaA;
    private javax.swing.JLabel etiquetaCat;
    private javax.swing.JLabel etiquetaDNI;
    private javax.swing.JLabel etiquetaDNI2;
    private javax.swing.JLabel etiquetaEli;
    private javax.swing.JLabel etiquetaN;
    private javax.swing.JLabel etiquetaTel;
    private javax.swing.ButtonGroup grupoCategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelAgregar;
    private javax.swing.JPanel panelEliminar;
    private javax.swing.JPanel panelVer;
    private javax.swing.JLabel title;
    private javax.swing.JTextArea txaSalida;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDNI2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
