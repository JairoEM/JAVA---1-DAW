
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author losel
 */
public class Ejercicio1 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio1
     */
    public Ejercicio1() {
        initComponents();
    }
    ArrayList<ClasePersona> arrayAgenda=new ArrayList<ClasePersona>();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dAlerta = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        bAceptar = new javax.swing.JToggleButton();
        dBorrar = new javax.swing.JDialog();
        ldBorrar = new java.awt.Label();
        bdBorrar = new javax.swing.JButton();
        dConfirmar = new javax.swing.JDialog();
        lConfirmar = new javax.swing.JLabel();
        lcAceptar = new javax.swing.JButton();
        lcCancelar = new javax.swing.JButton();
        dFaltaTF = new javax.swing.JDialog();
        blFaltaTF = new java.awt.Label();
        bdAceptar = new javax.swing.JButton();
        lSeleccionar = new javax.swing.JLabel();
        lNombre = new javax.swing.JLabel();
        lDirrecion = new javax.swing.JLabel();
        lEdad = new javax.swing.JLabel();
        lTelefono = new javax.swing.JLabel();
        lDatos = new javax.swing.JLabel();
        bBorrar = new javax.swing.JToggleButton();
        lNuevo = new javax.swing.JButton();
        tfNombre = new javax.swing.JTextField();
        tfDireccion = new javax.swing.JTextField();
        tfEdad = new javax.swing.JTextField();
        tfTelefono = new javax.swing.JTextField();
        chSeleccionar = new java.awt.Choice();
        lAgenda = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Debes de introducir un valor numérico");

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });
        bAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bAceptarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout dAlertaLayout = new javax.swing.GroupLayout(dAlerta.getContentPane());
        dAlerta.getContentPane().setLayout(dAlertaLayout);
        dAlertaLayout.setHorizontalGroup(
            dAlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dAlertaLayout.createSequentialGroup()
                .addGroup(dAlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dAlertaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(dAlertaLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        dAlertaLayout.setVerticalGroup(
            dAlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dAlertaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAceptar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ldBorrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ldBorrar.setText("La agenda está vacía");

        bdBorrar.setText("Aceptar");
        bdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdBorrarActionPerformed(evt);
            }
        });
        bdBorrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bdBorrarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout dBorrarLayout = new javax.swing.GroupLayout(dBorrar.getContentPane());
        dBorrar.getContentPane().setLayout(dBorrarLayout);
        dBorrarLayout.setHorizontalGroup(
            dBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dBorrarLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(bdBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dBorrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ldBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dBorrarLayout.setVerticalGroup(
            dBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dBorrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ldBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(bdBorrar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        lConfirmar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lConfirmar.setText("¿Desea usted borrar el contacto?");

        lcAceptar.setText("Aceptar");
        lcAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lcAceptarActionPerformed(evt);
            }
        });

        lcCancelar.setText("Cancelar");
        lcCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lcCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dConfirmarLayout = new javax.swing.GroupLayout(dConfirmar.getContentPane());
        dConfirmar.getContentPane().setLayout(dConfirmarLayout);
        dConfirmarLayout.setHorizontalGroup(
            dConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dConfirmarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(dConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dConfirmarLayout.createSequentialGroup()
                        .addComponent(lConfirmar)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(dConfirmarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lcAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lcCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        dConfirmarLayout.setVerticalGroup(
            dConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dConfirmarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(dConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lcAceptar)
                    .addComponent(lcCancelar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        blFaltaTF.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        blFaltaTF.setText("Hay campos vacíos, completalos");

        bdAceptar.setText("Aceptar");
        bdAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dFaltaTFLayout = new javax.swing.GroupLayout(dFaltaTF.getContentPane());
        dFaltaTF.getContentPane().setLayout(dFaltaTFLayout);
        dFaltaTFLayout.setHorizontalGroup(
            dFaltaTFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dFaltaTFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blFaltaTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(dFaltaTFLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(bdAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dFaltaTFLayout.setVerticalGroup(
            dFaltaTFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dFaltaTFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blFaltaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bdAceptar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lSeleccionar.setText("Seleccionar");

        lNombre.setText("Nombre");

        lDirrecion.setText("Direccion");

        lEdad.setText("Edad");

        lTelefono.setText("Teléfono");

        lDatos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lDatos.setText("Datos de contacto");

        bBorrar.setText("Borrar");
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

        lNuevo.setText("Nuevo");
        lNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNuevoActionPerformed(evt);
            }
        });

        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

        tfDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDireccionActionPerformed(evt);
            }
        });

        tfEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEdadActionPerformed(evt);
            }
        });
        tfEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfEdadKeyReleased(evt);
            }
        });

        tfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonoActionPerformed(evt);
            }
        });
        tfTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfTelefonoKeyReleased(evt);
            }
        });

        chSeleccionar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chSeleccionarItemStateChanged(evt);
            }
        });

        lAgenda.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lAgenda.setText("AGENDA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lAgenda)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lSeleccionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chSeleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lDirrecion)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lNombre)
                                            .addGap(21, 21, 21)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lTelefono)
                                            .addComponent(lEdad))
                                        .addGap(17, 17, 17)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lDatos)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                            .addComponent(tfEdad)
                                            .addComponent(tfDireccion)
                                            .addComponent(tfNombre))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lAgenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lSeleccionar)
                        .addGap(8, 8, 8))
                    .addComponent(chSeleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDirrecion)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEdad)
                    .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTelefono)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lNuevo)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        if(chSeleccionar.getSelectedIndex()>=0){
            dConfirmar.pack();
            dConfirmar.setVisible(true);
        }else{
            dBorrar.pack();
            dBorrar.setVisible(true);
        }
    }//GEN-LAST:event_bBorrarActionPerformed

    private void lNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNuevoActionPerformed
        if("".equals(tfNombre.getText())){
            tfNombre.requestFocus();
            dFaltaTF.pack();
            dFaltaTF.setVisible(true);
        }else{
            if("".equals(tfDireccion.getText())){
                tfDireccion.requestFocus();
                dFaltaTF.pack();
                dFaltaTF.setVisible(true);
            }else{
                if("".equals(tfEdad.getText())){
                    tfEdad.requestFocus();
                    dFaltaTF.pack();
                    dFaltaTF.setVisible(true);
                }else{
                    if("".equals(tfTelefono.getText())){
                        tfTelefono.requestFocus();
                        dFaltaTF.pack();
                        dFaltaTF.setVisible(true); 
                    }else{
                        //Creamos clase persona y rellenamos       
                        ClasePersona persona=new ClasePersona();
                        persona.setNombre(tfNombre.getText());     
                        persona.setDireccion(tfDireccion.getText());       
                        persona.setEdad(tfEdad.getText());       
                        persona.setTelefono(tfTelefono.getText());
        
                        //Insertamos datos en array y choice
                        arrayAgenda.add(persona);
                        chSeleccionar.add(persona.getNombre());
        
                        //Reseteamos tf
                        tfTelefono.setText(null);
                        tfEdad.setText(null);
                        tfNombre.setText(null);
                        tfDireccion.setText(null);
        
                        tfNombre.requestFocus(); 
                    }
                }
            }              
        } 
    }//GEN-LAST:event_lNuevoActionPerformed

    private void tfEdadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEdadKeyReleased
        try{
           int edad=Integer.valueOf(tfEdad.getText()).intValue();
        }catch(NumberFormatException e){
            switch(tfEdad.getText()){
                case "" :
                    ;break;
                default:
                    dAlerta.pack();
                    dAlerta.setVisible(true);   
            }              
        }
    }//GEN-LAST:event_tfEdadKeyReleased

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        dAlerta.setVisible(false);
    }//GEN-LAST:event_bAceptarActionPerformed

    private void tfTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefonoKeyReleased
        try{
           int telefono=Integer.valueOf(tfTelefono.getText()).intValue();
        }catch(NumberFormatException e){
            switch(tfTelefono.getText()){
                case "" :
                    ;break;
                default:
                    dAlerta.pack();
                    dAlerta.setVisible(true);   
            }              
        }
    }//GEN-LAST:event_tfTelefonoKeyReleased

    private void chSeleccionarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chSeleccionarItemStateChanged
        //Creamos el nuevo objeto persona
        ClasePersona chPersona=new ClasePersona();       
        chPersona=arrayAgenda.get(chSeleccionar.getSelectedIndex());
        
        //Rellenamos textfields
        tfNombre.setText(chPersona.getNombre());
        tfDireccion.setText(chPersona.getDireccion());
        tfEdad.setText(chPersona.getEdad());
        tfTelefono.setText(chPersona.getTelefono());
        
    }//GEN-LAST:event_chSeleccionarItemStateChanged

    private void tfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonoActionPerformed
      if("".equals(tfNombre.getText())){
            tfNombre.requestFocus();
            dFaltaTF.pack();
            dFaltaTF.setVisible(true);
        }else{
            if("".equals(tfDireccion.getText())){
                tfDireccion.requestFocus();
                dFaltaTF.pack();
                dFaltaTF.setVisible(true);
            }else{
                if("".equals(tfEdad.getText())){
                    tfEdad.requestFocus();
                    dFaltaTF.pack();
                    dFaltaTF.setVisible(true);
                }else{
                    if("".equals(tfTelefono.getText())){
                        tfTelefono.requestFocus();
                        dFaltaTF.pack();
                        dFaltaTF.setVisible(true); 
                    }else{
                        //Creamos clase persona y rellenamos       
                        ClasePersona persona=new ClasePersona();
                        persona.setNombre(tfNombre.getText());     
                        persona.setDireccion(tfDireccion.getText());       
                        persona.setEdad(tfEdad.getText());       
                        persona.setTelefono(tfTelefono.getText());
        
                        //Insertamos datos en array y choice
                        arrayAgenda.add(persona);
                        chSeleccionar.add(persona.getNombre());
        
                        //Reseteamos tf
                        tfTelefono.setText(null);
                        tfEdad.setText(null);
                        tfNombre.setText(null);
                        tfDireccion.setText(null);
        
                        tfNombre.requestFocus(); 
                    }
                }
            }              
        }
    }//GEN-LAST:event_tfTelefonoActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        tfDireccion.requestFocus();
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDireccionActionPerformed
        tfEdad.requestFocus();
    }//GEN-LAST:event_tfDireccionActionPerformed

    private void tfEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEdadActionPerformed
        tfTelefono.requestFocus();
    }//GEN-LAST:event_tfEdadActionPerformed

    private void lcAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lcAceptarActionPerformed
        //Removemos valores del array y del ch
            arrayAgenda.remove(chSeleccionar.getSelectedIndex());
            chSeleccionar.remove(chSeleccionar.getSelectedIndex());
        
        //Ponemos todos los tf a nulo
            tfNombre.setText(null);
            tfDireccion.setText(null);
            tfEdad.setText(null);
            tfTelefono.setText(null);
        
            tfNombre.requestFocus();
            
        dConfirmar.setVisible(false);
    }//GEN-LAST:event_lcAceptarActionPerformed

    private void lcCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lcCancelarActionPerformed
        dConfirmar.setVisible(false);
    }//GEN-LAST:event_lcCancelarActionPerformed

    private void bdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdBorrarActionPerformed
        dBorrar.setVisible(false);
    }//GEN-LAST:event_bdBorrarActionPerformed

    private void bdBorrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bdBorrarKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            dBorrar.setVisible(false);
        }
    }//GEN-LAST:event_bdBorrarKeyReleased

    private void bdAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdAceptarActionPerformed
        dFaltaTF.setVisible(false);
    }//GEN-LAST:event_bdAceptarActionPerformed

    private void bAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bAceptarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            dBorrar.setVisible(false);
        }
    }//GEN-LAST:event_bAceptarKeyPressed

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
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bAceptar;
    private javax.swing.JToggleButton bBorrar;
    private javax.swing.JButton bdAceptar;
    private javax.swing.JButton bdBorrar;
    private java.awt.Label blFaltaTF;
    private java.awt.Choice chSeleccionar;
    private javax.swing.JDialog dAlerta;
    private javax.swing.JDialog dBorrar;
    private javax.swing.JDialog dConfirmar;
    private javax.swing.JDialog dFaltaTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lAgenda;
    private javax.swing.JLabel lConfirmar;
    private javax.swing.JLabel lDatos;
    private javax.swing.JLabel lDirrecion;
    private javax.swing.JLabel lEdad;
    private javax.swing.JLabel lNombre;
    private javax.swing.JButton lNuevo;
    private javax.swing.JLabel lSeleccionar;
    private javax.swing.JLabel lTelefono;
    private javax.swing.JButton lcAceptar;
    private javax.swing.JButton lcCancelar;
    private java.awt.Label ldBorrar;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfEdad;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
