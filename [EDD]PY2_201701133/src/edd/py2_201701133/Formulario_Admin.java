/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.py2_201701133;

import java.awt.*;
import java.io.*;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author Aragon Perez
 */
class CustomPanel extends JPanel{    
    private URL url = getClass().getResource("TablaHash.png");
    Image image = new ImageIcon(url).getImage();

    @Override
    public void paint(Graphics g){
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
public class Formulario_Admin extends javax.swing.JFrame {

    /**
     * Creates new form Formulario_Admin
     */
    public Formulario_Admin() {
        initComponents();
    }
    //no tocar metodo para colocar imagen en el jpanel
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Cerrar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Carga de Usuarios");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Reporte Usuarios");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Contraseña", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton4.setText("Ocultar Datos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Rerporte Pila");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login FMLogin=new Login();
        FMLogin.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            //generamos la imagen
            EDDPY2_201701133.tb.GraficarTabla();
        } catch (IOException ex) {
            Logger.getLogger(Formulario_Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Formulario_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Formulario_ReporteHash FmReporteHash=new Formulario_ReporteHash();
        FmReporteHash.show();
        //generamos el html y metemos la imagen
        File HTMLREPORTHASH=new File("TablaHash.html");

        
        //empezamos a agregar la imagen
        try {
            BufferedWriter Escritura = new BufferedWriter(new FileWriter(HTMLREPORTHASH));
            Escritura.write("<HTML>\n");
            Escritura.write("<HEAD>\n");
            Escritura.write("<TITLE>REPORTE TABLA HASH</TITLE>\n");
            Escritura.write("</HEAD>\n");
            Escritura.write("<BODY>\n");
            Escritura.write("<img src=\"TablaHash.png\">\n");
            Escritura.write("</BODY>\n");
            Escritura.write("</HTML>\n");
            Escritura.close();
        } catch (IOException ex) {
            Logger.getLogger(Formulario_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();

        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Carga Masiva de Usuarios
        
        String ruta = JOptionPane.showInputDialog("Ingrese Ruta del Archivo");
        BufferedReader br = null;
        try {

           br =new BufferedReader(new FileReader(ruta));
           String line = br.readLine();
           //hacemos una iteracion para quitar los titulos
           DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
           String Estado="";
           line=br.readLine();

           while (null!=line) {
               String[] parte = line.split(",");
               //comprobacion de contraseña
               if(parte[1].length()<8){
                   //tiene menos de 8 caracteres
                   boolean bandera =EDDPY2_201701133.tb.BusquedaExistencia(parte[0]);
                   if(bandera){
                       //ya existe el usuario
                        String info="Usuario: "+parte[0]+"  --El Usuario Ya existe y La Contraseña Contiene menos de 8 Caracteres  -- "+"Pass: "+parte[1];
                        JOptionPane.showMessageDialog(null,info,"CREACION USUARIO", JOptionPane.WARNING_MESSAGE );
                        Estado="--El Usuario Ya existe y La Contraseña Incorrecta  -- ";
                   }else{
                       String info="Usuario: "+parte[0]+"  --La Contraseña Contiene menos de 8 Caracteres  --"+"Pass: "+parte[1];
                       JOptionPane.showMessageDialog(null,info,"CREACION USUARIO", JOptionPane.WARNING_MESSAGE );
                       Estado="--La Contraseña Contiene menos de 8 Caracteres  --";
                   }
                   
                   
               }else{
                   boolean bandera =EDDPY2_201701133.tb.BusquedaExistencia(parte[0]);
                   if(bandera){
                       //ya existe el usuario
                        String info="Usuario: "+parte[0]+"  --El Usuario Ya existe--";
                        JOptionPane.showMessageDialog(null,info,"CREACION USUARIO", JOptionPane.WARNING_MESSAGE );
                        Estado="--El Usuario Ya existe--";
                   }else{
                       EDDPY2_201701133.tb.AsignacionDato(parte[0], parte[1],"",null);
                       Estado="--Creado Correctamente--";
                   }
               }
               
               //para la tabla
               Object [] fila=new Object[6];

                fila[0]=parte[0];
                fila[1]=parte[1];
                fila[2]=Estado;

                modelo.addRow(fila);
               line = br.readLine();
           }
        


        


        jTable1.setModel(modelo);
                //bitacora
        Calendar calendario = new GregorianCalendar();
        int hora =calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        int segundos = calendario.get(Calendar.SECOND);
        String tiempo=hora + ":" + minutos + ":" + segundos;
        EDDPY2_201701133.Bitacora.Insertar(tiempo, "Admin", "Carga Masiva de Usuarios");
        } catch (Exception e) {
            System.out.println (e);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTable1.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            //generamos la imagen
             EDDPY2_201701133.Bitacora.GraficarPila();
        } catch (IOException ex) {
            Logger.getLogger(Formulario_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Formulario_ReportePila FmReportePila=new Formulario_ReportePila();
        FmReportePila.show();
        //generamos el html y metemos la imagen
        File HTMLREPORTHASH=new File("Pila.html");

        
        //empezamos a agregar la imagen
        try {
            BufferedWriter Escritura = new BufferedWriter(new FileWriter(HTMLREPORTHASH));
            Escritura.write("<HTML>\n");
            Escritura.write("<HEAD>\n");
            Escritura.write("<TITLE>REPORTE PILA</TITLE>\n");
            Escritura.write("</HEAD>\n");
            Escritura.write("<BODY>\n");
            Escritura.write("<img src=\"Pila.png\">\n");
            Escritura.write("</BODY>\n");
            Escritura.write("</HTML>\n");
            Escritura.close();
        } catch (IOException ex) {
            Logger.getLogger(Formulario_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();

    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
