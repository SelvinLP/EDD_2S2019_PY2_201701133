/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.py2_201701133;

import Estructuras.Grafo;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.tree.*;



/**
 *
 * @author Aragon Perez
 */
public class Formulario_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario_Usuario
     */
    public String Usuario="";
    public Grafo RaizGrafo=null;
    public String CarpetaPadre="/";
    public Formulario_Usuario FMUsuaio;
    public JTree tree;
    public DefaultMutableTreeNode inicial;
    public Formulario_Usuario() {
        initComponents();
        
        inicial = new DefaultMutableTreeNode("/");
         
        //create the tree by passing in the root node
        tree= new JTree(inicial);
        tree.setBounds(160, 40, 280,430);
        this.jPanel1.add(tree);
        
    }
    
    //creacion de JTREE

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CARPETAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jButton4.setText("Subir");

        jButton3.setText("Eliminar");

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton5.setText("CERRAR SESION");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Rerporte Matriz");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Actualizar Datos");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Reporte Grafo");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ARCHIVOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jButton9.setText("Crear");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Modificar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Eliminar");

        jButton12.setText("Carga M");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton14.setText("Mostrar C");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Descargar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Abrir Descarga");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton16)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton16))
        );

        jButton13.setText("Rerporte Arbol");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13)
                        .addGap(0, 171, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton13))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode SeleccionadoPadre=(DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();
        Object nodeInfo = SeleccionadoPadre.getUserObject();
        String Cambio=nodeInfo.toString();

        try {
            RaizGrafo.LlamarGraficarArbol(Cambio);
        } catch (IOException ex) {
            Logger.getLogger(Formulario_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        Formulario_ReporteAVL FmReporteAVL=new Formulario_ReporteAVL();
        FmReporteAVL.show();
        FmReporteAVL.FMUsuario=FMUsuaio;
        //generamos el html y metemos la imagen
        File HTMLREPORTHASH=new File("ArbolAVL.html");

        //empezamos a agregar la imagen
        try {
            BufferedWriter Escritura = new BufferedWriter(new FileWriter(HTMLREPORTHASH));
            Escritura.write("<HTML>\n");
            Escritura.write("<HEAD>\n");
            Escritura.write("<TITLE>REPORTE ARBOL AVL</TITLE>\n");
            Escritura.write("</HEAD>\n");
            Escritura.write("<BODY>\n");
            Escritura.write("<img src=\"ArbolAVL.png\">\n");
            Escritura.write("</BODY>\n");
            Escritura.write("</HTML>\n");
            Escritura.close();
        } catch (IOException ex) {
            Logger.getLogger(Formulario_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.hide();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:

        DefaultMutableTreeNode SeleccionadoPadre=(DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();
        Object nodeInfo = SeleccionadoPadre.getUserObject();
        String Cambio=nodeInfo.toString();
        String NombreArchivoCont = JOptionPane.showInputDialog("Ingrese Nombre del Archivo De la Carpeta Padre:"+Cambio);
        String Contenido=RaizGrafo.MostrarContenido(Cambio, NombreArchivoCont);
        jTextArea1.setText("");
        jTextArea1.setText(Contenido);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        TreeSelectionModel smd = tree.getSelectionModel();
        if(smd.getSelectionCount()>0){
            DefaultMutableTreeNode SeleccionadoPadre=(DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();

            //creacion de nuevo nodo
            String NombreArchivoNuevo = JOptionPane.showInputDialog("Ingrese Nombre del Archivo");
            String ContenidoArchivo = JOptionPane.showInputDialog("Ingrese Contenido del Archivo");

            DefaultTreeModel model = (DefaultTreeModel) tree.getModel();

            model.reload();
            //agregar a Arbol
            Object nodeInfo = SeleccionadoPadre.getUserObject();
            CarpetaPadre=nodeInfo.toString();
            RaizGrafo.InsertarArbol(CarpetaPadre,NombreArchivoNuevo, ContenidoArchivo, this.Usuario);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        TreeSelectionModel smd = tree.getSelectionModel();
        if(smd.getSelectionCount()>0){
            DefaultMutableTreeNode SeleccionadoPadre=(DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();

            //creacion de nuevo nodo
            String NombreArchivoNuevo = JOptionPane.showInputDialog("Ingrese Nombre del Archivo");
            String ContenidoArchivo = JOptionPane.showInputDialog("Ingrese Contenido del Archivo");
            DefaultMutableTreeNode nuevo=new DefaultMutableTreeNode(NombreArchivoNuevo);
            SeleccionadoPadre.add(nuevo);

            DefaultTreeModel model = (DefaultTreeModel) tree.getModel();

            model.reload();
            //agregar a Arbol
            Object nodeInfo = SeleccionadoPadre.getUserObject();
            CarpetaPadre=nodeInfo.toString();
            RaizGrafo.InsertarArbol(CarpetaPadre,NombreArchivoNuevo, ContenidoArchivo, this.Usuario);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        try {
            //temporal
            RaizGrafo.GraficarGrafo();
        } catch (IOException ex) {
            System.out.println("Error al Generar la imagen");
        }
        Formulario_ReporteGrafo FmReporteGrafo=new Formulario_ReporteGrafo();
        FmReporteGrafo.show();
        FmReporteGrafo.FMUsuario=FMUsuaio;
        //generamos el html y metemos la imagen
        File HTMLREPORTHASH=new File("Grafo.html");

        //empezamos a agregar la imagen
        try {
            BufferedWriter Escritura = new BufferedWriter(new FileWriter(HTMLREPORTHASH));
            Escritura.write("<HTML>\n");
            Escritura.write("<HEAD>\n");
            Escritura.write("<TITLE>REPORTE GRAFO</TITLE>\n");
            Escritura.write("</HEAD>\n");
            Escritura.write("<BODY>\n");
            Escritura.write("<img src=\"Grafo.png\">\n");
            Escritura.write("</BODY>\n");
            Escritura.write("</HTML>\n");
            Escritura.close();
        } catch (IOException ex) {
            Logger.getLogger(Formulario_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.hide();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        RaizGrafo.LlenarTree(tree,inicial);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            //temporal
            RaizGrafo.GraficarMatriz();
        } catch (IOException ex) {
            System.out.println("Error al Generar la imagen");
        }
        Formulario_ReporteMatriz FmReporteMatriz=new Formulario_ReporteMatriz();
        FmReporteMatriz.show();
        FmReporteMatriz.FMUsuario=FMUsuaio;
        //generamos el html y metemos la imagen
        File HTMLREPORTHASH=new File("MatrizAdyacencia.html");

        //empezamos a agregar la imagen
        try {
            BufferedWriter Escritura = new BufferedWriter(new FileWriter(HTMLREPORTHASH));
            Escritura.write("<HTML>\n");
            Escritura.write("<HEAD>\n");
            Escritura.write("<TITLE>REPORTE MATRIZ DE ADYACENCIA</TITLE>\n");
            Escritura.write("</HEAD>\n");
            Escritura.write("<BODY>\n");
            Escritura.write("<img src=\"MatrizAdyacencia.png\">\n");
            Escritura.write("</BODY>\n");
            Escritura.write("</HTML>\n");
            Escritura.close();
        } catch (IOException ex) {
            Logger.getLogger(Formulario_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.hide();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Login login=new Login();
        login.show();
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Creacion de Carpetas
        //obtener posicion
        TreeSelectionModel smd = tree.getSelectionModel();
        if(smd.getSelectionCount()>0){
            DefaultMutableTreeNode SeleccionadoPadre=(DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();

            //creacion de nuevo nodo
            String NombreCarpetaNuva = JOptionPane.showInputDialog("Ingrese Nombre de la Carpeta");
            DefaultMutableTreeNode nuevo=new DefaultMutableTreeNode(NombreCarpetaNuva);
            SeleccionadoPadre.add(nuevo);

            DefaultTreeModel model = (DefaultTreeModel) tree.getModel();

            model.reload();
            //agregar a tabla
            Object nodeInfo = SeleccionadoPadre.getUserObject();
            CarpetaPadre=nodeInfo.toString();
            RaizGrafo.InsertarMatrizz(CarpetaPadre, NombreCarpetaNuva);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String NombreCarpetaNuva = JOptionPane.showInputDialog("Ingrese Nuevo Nombre");
        DefaultMutableTreeNode SeleccionadoPadre=(DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();
        Object nodeInfo = SeleccionadoPadre.getUserObject();
        String Cambio=nodeInfo.toString();
        boolean bandera=RaizGrafo.Modificar(Cambio,NombreCarpetaNuva);
        if(bandera){
            //se modifico correctamente
            JOptionPane.showMessageDialog(null, "Carpeta Modificada Correctamente");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
                // TODO add your handling code here:
        TreeSelectionModel smd = tree.getSelectionModel();
        if(smd.getSelectionCount()>0){
            DefaultMutableTreeNode SeleccionadoPadre=(DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();

            //creacion de nuevo nodo
            // Carga Masiva de Archivos
        
            String ruta = JOptionPane.showInputDialog("Ingrese Ruta del Archivo");
            BufferedReader br = null;
            try {

               br =new BufferedReader(new FileReader(ruta));
               String line = br.readLine();
               //hacemos una iteracion para quitar los titulos
               line=br.readLine();

               while (null!=line) {
                   String[] parte = line.split(",");
                   DefaultMutableTreeNode nuevo=new DefaultMutableTreeNode(parte[0].toString());
                   SeleccionadoPadre.add(nuevo);
                   
                   DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
                   model.reload();
                   //agregar a Arbol
                   Object nodeInfo = SeleccionadoPadre.getUserObject();
                   CarpetaPadre=nodeInfo.toString();
                   RaizGrafo.InsertarArbol(CarpetaPadre, parte[0].toString(), parte[1].toString(),this.Usuario );

                   line = br.readLine();
               }


            } catch (Exception e) {
                System.out.println (e);
            }
            

        }

     
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        String NombreDescarga = JOptionPane.showInputDialog("Ingrese Nombre del Archivo a Descagar");
        DefaultMutableTreeNode SeleccionadoPadre=(DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();
        Object nodeInfo = SeleccionadoPadre.getUserObject();
        CarpetaPadre=nodeInfo.toString();
        File Carpeta=new File("Descargas\\"+this.Usuario+"\\");
        Carpeta.mkdir();
        File archivo = new File("Descargas\\"+this.Usuario+"\\"+NombreDescarga+".txt");
        
        BufferedWriter Lect;
        try {
            Lect = new BufferedWriter(new FileWriter(archivo));
            String Cadena=RaizGrafo.MostrarContenido(CarpetaPadre, NombreDescarga);
            Lect.write(Cadena);
            Lect.close();
        } catch (Exception e) {
        }

        try {
            String cmd = "cmd /C start "+"Descargas\\"+this.Usuario+"\\"+NombreDescarga+".txt"; 
            Runtime.getRuntime().exec(cmd);
//            Runtime.getRuntime().exec("cmd /C start MatrizAdyacencia.png");  
            
        }catch (IOException ioe) {
            //en caso de error
            System.out.println (ioe);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        String ruta = JOptionPane.showInputDialog("Ingrese ruta de la Descarga(SE MOSTRARA EN EL JTEXTAREA)");
        String cadena="";
        try {
            
            BufferedReader br=new BufferedReader(new FileReader(ruta));
            String line = br.readLine();
            while (null!=line){
                cadena+=cadena+line;
                line=br.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(Formulario_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextArea1.setText("");
        jTextArea1.setText(cadena);
        
    }//GEN-LAST:event_jButton16ActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
