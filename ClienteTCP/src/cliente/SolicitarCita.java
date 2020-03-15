/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author alonso, manuel
 */
public class SolicitarCita extends javax.swing.JFrame {
    ClienteCitasMedicasTCP cliente = new ClienteCitasMedicasTCP(); 
    /**
     * Creates new form SolicitarCita
     */
    public SolicitarCita() {
        this.setTitle("Asistente para Solicitar cita previa"); 
        initComponents();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        errorFormatoDNI = new javax.swing.JDialog();
        cajaDNI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menuEspecialidades = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        botonMandarSolicitud = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCalen = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();

        errorFormatoDNI.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                errorFormatoDNIComponentShown(evt);
            }
        });

        javax.swing.GroupLayout errorFormatoDNILayout = new javax.swing.GroupLayout(errorFormatoDNI.getContentPane());
        errorFormatoDNI.getContentPane().setLayout(errorFormatoDNILayout);
        errorFormatoDNILayout.setHorizontalGroup(
            errorFormatoDNILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        errorFormatoDNILayout.setVerticalGroup(
            errorFormatoDNILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cajaDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaDNIActionPerformed(evt);
            }
        });

        jLabel1.setText("Introduzca su DNI:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel3.setText("Este asistente le ayudará a solicitar una cita rápidamente. ");

        menuEspecialidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TRAUMATOLOGIA", "CARDIOLOGIA", "MEDICINA GENERAL", "NEUROLOGIA" }));
        menuEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEspecialidadesActionPerformed(evt);
            }
        });

        jLabel6.setText("Seleccione especialidad:");

        botonMandarSolicitud.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonMandarSolicitud.setText("SOLICITAR CITA");
        botonMandarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMandarSolicitudActionPerformed(evt);
            }
        });

        jLabel7.setText("Rellene los siguiente campos, después seleccione \"SOLICITAR CITA\"");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("1. Datos del paciente:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("2. Datos sobre la cita a solicitar:");

        jLabel10.setText("Seleccione la fecha de su cita:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(190, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(99, 99, 99)
                        .addComponent(cajaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCalen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonMandarSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCalen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(46, 46, 46)
                .addComponent(botonMandarSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaDNIActionPerformed

    // mandar solicitud cliente
    private void botonMandarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMandarSolicitudActionPerformed
        // hacer comprobaciones sobre los valores introducidos
        boolean todo_ok = true;// comprobarCamposIntroducidos();
        
        if (todo_ok){ // formar la cadena de String para mandarla al servidor
            String cad = new String();

            cad += jCalen.getCalendar().get(Calendar.DAY_OF_MONTH) + "/"
                +  (jCalen.getCalendar().get(Calendar.MONTH)+1) + "/" 
                +  jCalen.getCalendar().get(Calendar.YEAR) + "#" ; 
//            cad += cajaDia.getText()  + "/" + (menuMeses.getSelectedIndex()+1) + "/" + cajaAnio.getText()+ "#";

            cad += menuEspecialidades.getSelectedItem() + "#" ; 

            cad += cajaDNI.getText() + "#" ;

            cad += "1" + "#" ; 

            System.out.println("-------> "+ cad);

            System.out.println("Soy el cliente " + cliente.getId() + " y ya me han llamado !!");
            
           
            
            // ------------------------------------------------------------------------------
            // --------------- MANDAR AL CLIENTE LA CADENA DE LA SOLICITUD
            cliente.procesar(cad);
            
            System.out.println("Transacción final...");
            
            String fechaDada = cliente.getBuferRecepcion(); 
            JOptionPane.showMessageDialog(this, "Tu cita es a las: "+ fechaDada , "Notificación de cita asignada", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botonMandarSolicitudActionPerformed

    private void errorFormatoDNIComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_errorFormatoDNIComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_errorFormatoDNIComponentShown

    private void menuEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEspecialidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuEspecialidadesActionPerformed

    
    private boolean comprobarCamposIntroducidos ()
    {
        boolean errorDNI =false, 
                errorDia=false, 
                errorMes=false, 
                errorAnio=false;
        
        // comprobar el formato del DNI
        // ¡OJO! Aquí se comprueba el formato, no si el DNI existe o no.
        if (cajaDNI.getText().length() != 9)
        {
            errorDNI = true;
        }
        
        
        System.out.println(errorDNI + "  "+ errorDia + " " + errorMes + "  " + errorAnio); 
        
        // MOSTRAR CUADRO DE DIALOGO
        if (errorDNI || errorDia || errorMes || errorAnio) 
        {
            JOptionPane.showMessageDialog(this, "Algo has introducido mal. Revise los datos introducido e inténtelo de nuevo.", "Alerta sobre datos incorrectos", JOptionPane.ERROR_MESSAGE);
        }
        
        if ( !errorDNI && !errorDia && !errorMes && !errorAnio )
            return true;
        else 
            return false; 
    
    } // fin método comprobaciones
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMandarSolicitud;
    private javax.swing.JTextField cajaDNI;
    private javax.swing.JDialog errorFormatoDNI;
    private com.toedter.calendar.JDateChooser jCalen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> menuEspecialidades;
    // End of variables declaration//GEN-END:variables
}
