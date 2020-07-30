package Aplica;

import Clases.CEmpleado;
import Clases.ArregloEmpleados;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class frm_mantenimiento extends javax.swing.JFrame {

    private ArrayList<CEmpleado> emp2;
    CEmpleado e1 = new CEmpleado();

    ArregloEmpleados emp1 = new ArregloEmpleados();

    public frm_mantenimiento() {
        emp2 = new ArrayList<CEmpleado>();

        initComponents();
        formulario();
        transparenciaBotones();
    }

    private void formulario() {
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        //this.setSize(new Dimension(370,180));
        this.panel_principal.setBackground(new Color(255, 255, 255));
        this.panel_botones.setBackground(new Color(255, 255, 255));
        this.panel_datos.setBackground(new Color(255, 255, 255));
        this.txt_codigo.requestFocus();
    }

    private void transparenciaBotones() {
        this.btn_nuevo.setOpaque(false);
        this.btn_nuevo.setContentAreaFilled(false);
        this.btn_nuevo.setBorderPainted(false);
        this.btn_listar.setOpaque(false);
        this.btn_listar.setContentAreaFilled(false);
        this.btn_listar.setBorderPainted(false);
        this.btn_cerrar.setOpaque(false);
        this.btn_cerrar.setContentAreaFilled(false);
        this.btn_cerrar.setBorderPainted(false);
        this.btn_buscar.setOpaque(false);
        this.btn_buscar.setContentAreaFilled(false);
        this.btn_buscar.setBorderPainted(false);
        this.btn_eliminar.setOpaque(false);
        this.btn_eliminar.setContentAreaFilled(false);
        this.btn_eliminar.setBorderPainted(false);
        this.btn_modificar.setOpaque(false);
        this.btn_modificar.setContentAreaFilled(false);
        this.btn_modificar.setBorderPainted(false);
    }

    private void limpiar() {
        this.txt_codigo.setText("");
        //this.txt_estadistica.setText("");
        this.txt_nombre.setText("");
        this.txt_horas.setText("");
        this.txt_tarifas.setText("");
        this.txt_codigo.requestFocus();
    }

    private void Listar() {

        /*this.txt_Reporte.setText("");
        if (emp1.tamaño() == 0) {
            JOptionPane.showMessageDialog(null, "El arrayList esta Vacio...");

        } else {
            CEmpleado x;
            this.txt_Reporte.append("Registro\tCodigo\tNombre\t\tHoras\tTarifa\tSueldo");
            this.txt_Reporte.append("\n");
            for (int i = 0; i < emp1.tamaño(); i++) {
                x = emp1.obtener(i);
                this.txt_Reporte.append(i + 1 + "\t" + x.getCodigo()
                        + "\t" + x.getNombre() + "\t\t" + x.getHora()
                        + "\t" + x.getTarifa()+ "\t" + x.calcularsueldo()
                );
                this.txt_Reporte.append("\n");
            }

        }
        this.panel_datos.setBackground(new Color(255, 255, 255));
        //this.setSize(new Dimension(730,575));
    }*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel_botones = new javax.swing.JPanel();
        btn_nuevo = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        btn_listar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        panel_datos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_horas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_tarifas = new javax.swing.JTextField();
        panel_principal = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_reporte = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_botones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UserAdd_40960.png"))); // NOI18N
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UserRemove_40959 (1).png"))); // NOI18N
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close_delete_delete_theaction_theoutput_10252 (1).png"))); // NOI18N
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        btn_listar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486504328-bullet-list-menu-lines-points-items-options_81334.png"))); // NOI18N
        btn_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarActionPerformed(evt);
            }
        });

        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconfinder-document03-1622833_121957.png"))); // NOI18N
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search_find_client_user_16693.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_botonesLayout = new javax.swing.GroupLayout(panel_botones);
        panel_botones.setLayout(panel_botonesLayout);
        panel_botonesLayout.setHorizontalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_botonesLayout.setVerticalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botonesLayout.createSequentialGroup()
                .addGroup(panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 153));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EMPLEADO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panel_datos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("--Codigo--");

        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_codigoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });

        jLabel3.setText("--Nombre--");

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        jLabel4.setText("--Horas--");

        txt_horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_horasActionPerformed(evt);
            }
        });
        txt_horas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_horasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_horasKeyTyped(evt);
            }
        });

        jLabel5.setText("--Tarifas--");

        txt_tarifas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tarifasActionPerformed(evt);
            }
        });
        txt_tarifas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_tarifasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tarifasKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panel_datosLayout = new javax.swing.GroupLayout(panel_datos);
        panel_datos.setLayout(panel_datosLayout);
        panel_datosLayout.setHorizontalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3))
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_horas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_tarifas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_datosLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel2)
                    .addContainerGap(346, Short.MAX_VALUE)))
        );
        panel_datosLayout.setVerticalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tarifas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_datosLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel2)
                    .addContainerGap(38, Short.MAX_VALUE)))
        );

        panel_principal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("--Reporte--");

        jTable_reporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Horas", "Tarifa"
            }
        ));
        jScrollPane3.setViewportView(jTable_reporte);

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_principalLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel6))
                    .addGroup(panel_principalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_datos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
void leer() {

        e1.setNombre(txt_nombre.getText());
        e1.setHora(Double.parseDouble(txt_horas.getText()));
        e1.setTarifa(Double.parseDouble(txt_tarifas.getText()));
        e1.setCodigo(Integer.parseInt(txt_codigo.getText()));

        // btn_nuevo.setEnabled(true);
        //btn_calcular.setEnabled(true);
        //mostrar();
    }
    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        //TodasMayuscula(cadenareal);
        int cod;
        double hora, tarifa;
        String nom;
        cod = Integer.parseInt(txt_codigo.getText().trim());
        //String resultado = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();

        nom = txt_nombre.getText().trim();
        String resultado = nom.toUpperCase().charAt(0) + nom.substring(1, nom.length()).toLowerCase();
        hora = Double.parseDouble(txt_horas.getText().trim());
        tarifa = Integer.parseInt(txt_tarifas.getText().trim());
        CEmpleado nuevo = new CEmpleado(cod, hora, tarifa, resultado);
        emp1.adicionar(nuevo);
        //limpiar();
        Listar();
        leer();
        String Nom;
        int p1;
        double p2, p3, p4;

        try {
            Nom = txt_nombre.getText();

            p1 = Integer.parseInt(txt_codigo.getText());
            p2 = Double.parseDouble(txt_horas.getText());
            p3 = Double.parseDouble(txt_tarifas.getText());

            p4 = e1.calcularsueldo();
            // p4 = Double.parseDouble(txt_prac4.getText());
            //promp = e2.promediopracticas();
            //trab = Double.parseDouble(txt_trabajo.getText());
            //parc = Double.parseDouble(txt_parcial.getText());
            //promgen = e2.promediofinal();

            emp2.add(new CEmpleado(p1, p2, p3, Nom));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifica los campos");
        }

        verDatos();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void verDatos() {

        String Mat[][] = new String[emp2.size()][4];
        CEmpleado aux;
        for (int i = 0; i < emp2.size(); i++) {
            aux = emp2.get(i);
            Mat[i][1] = aux.getNombre();
            Mat[i][0] = Double.toString(aux.getCodigo());
            Mat[i][2] = Double.toString(aux.getHora());
            Mat[i][3] = Double.toString(aux.getTarifa());
            //   Mat[i][4] = Double.toString(aux.get());
            // Mat[i][4] = Double.toString(aux.getc());

        }

        jTable_reporte.setModel(new javax.swing.table.DefaultTableModel(
                Mat,
                new String[]{
                    "Codigo", "Nombre", "horas", "Tarifa"
                }
        ));

    }
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int c;
        try {
            c = jTable_reporte.getSelectedRow();
            emp2.remove(c);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "por favor escoja una fila");
        }
        verDatos();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        int r = JOptionPane.showOptionDialog(this, "Estas seguro de Salir", "Salida",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Si", "No"}, "Si");
        if (r == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        if (this.txt_codigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese Codigo...");
            this.txt_codigo.requestFocus();
        } else {
            if (this.txt_codigo.getText().length() != 3) {
                JOptionPane.showMessageDialog(null, "Ingrese codigo de 3 digitos");
                this.txt_codigo.setText("");
                this.txt_codigo.requestFocus();
            }
        }
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void txt_codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.txt_nombre.requestFocus();
    }//GEN-LAST:event_txt_codigoKeyPressed
    }
    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_codigoKeyTyped

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        int cont = 1;
        if (this.txt_nombre.getText().isEmpty() && cont == 1) {
            JOptionPane.showMessageDialog(null, "Ingrese Nombre de Alumno...");
            this.txt_nombre.requestFocus();
        }
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.txt_horas.requestFocus();
        }
    }//GEN-LAST:event_txt_nombreKeyPressed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_horasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_horasActionPerformed
        if (this.txt_horas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese Horas...");
            this.txt_horas.setText("");
            this.txt_horas.requestFocus();
        }


    }//GEN-LAST:event_txt_horasActionPerformed

    private void txt_horasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_horasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.txt_tarifas.requestFocus();
        }
    }//GEN-LAST:event_txt_horasKeyPressed

    private void txt_horasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_horasKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_horasKeyTyped

    private void txt_tarifasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tarifasActionPerformed
        if (this.txt_tarifas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese Nota...");
            this.txt_tarifas.setText("");
            this.txt_tarifas.requestFocus();
        }

    }//GEN-LAST:event_txt_tarifasActionPerformed

    private void txt_tarifasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tarifasKeyReleased

    }//GEN-LAST:event_txt_tarifasKeyReleased

    private void txt_tarifasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tarifasKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_tarifasKeyTyped

    private void btn_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_listarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        int c, stoc;
        String nom;
        double pre;
        CEmpleado aux;
        try {
            c = jTable_reporte.getSelectedRow();
            aux = emp2.get(c);
            nom = JOptionPane.showInputDialog("Nuevo nombre");
            aux.setNombre(nom);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "escoje una fila");
        }
        verDatos();


    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

    }//GEN-LAST:event_btn_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_mantenimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_listar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_reporte;
    private javax.swing.JPanel panel_botones;
    private javax.swing.JPanel panel_datos;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_horas;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_tarifas;
    // End of variables declaration//GEN-END:variables
}
