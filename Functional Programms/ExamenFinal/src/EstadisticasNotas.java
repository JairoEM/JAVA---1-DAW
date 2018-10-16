
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author losel
 */
public class EstadisticasNotas extends javax.swing.JFrame {
    CheckboxGroup cbg = new CheckboxGroup();
    DefaultTableModel modeloTabla;
    Controlador controlador;
    
    /**
     * Creates new form EstadisticasNotas
     */
    public EstadisticasNotas() {
        modeloTabla= new DefaultTableModel();
        controlador= new Controlador();
        initComponents();
        cbg.setSelectedCheckbox(cbT);
        rellenarCurso();
        rellenarEvaluacion();
        rellenarAsignatura();
        modeloTabla.addColumn("");
        modeloTabla.addColumn("Evaluaciones");
        modeloTabla.addRow(new Object [] {"Insuficiente",""});
        modeloTabla.addRow(new Object [] {"Suficiente",""});
        modeloTabla.addRow(new Object [] {"Bien",""});
        modeloTabla.addRow(new Object [] {"Notable",""});
        modeloTabla.addRow(new Object [] {"Sobresaliente",""});
        modeloTabla.addRow(new Object [] {"Total Alumnos",""});
    }
    
    public void rellenarCurso(){
        ResultSet resultado=controlador.obtenerRegistrosGroup("cursos","curso");
        try {
            if(resultado!=null){
                while(resultado.next()){
                    chCurso.addItem(resultado.getString("curso"));
                }
            }
        } catch (Exception e) {
            System.out.println("Fallo al rellenar el choice Cursos");
        }
    }
    
    public void rellenarEvaluacion(){
        ResultSet resultado=controlador.obtenerEvaluacionNotas((String) chAsig.getSelectedItem());
        try {
            if(resultado!=null){
                while(resultado.next()){
                    chEvaluacion.addItem(resultado.getString("evaluacion"));
                }
            }
        } catch (Exception e) {
            System.out.println("Fallo al rellenar el choice Evaluación");
        }
    }
    
    public void rellenarAsignatura(){
        ResultSet resultado=controlador.obtenerAsignatura(chCurso.getSelectedItem());
        try {
            if(resultado!=null){
                while(resultado.next()){
                    chAsig.addItem(resultado.getString("asignatura"));
                }
            }
        } catch (Exception e) {
             System.out.println("Fallo al rellenar el choice Asignatura");
        }
    }
    
    public void rellenarTabla(){
        modeloTabla.setColumnCount(1);
        int i=1;
        if(cbg.getSelectedCheckbox()==cbT){
            ResultSet resultadoEvaluacion=controlador.obtenerEvaluacionesTodas((String) chAsig.getSelectedItem());
            try {
                while (resultadoEvaluacion.next()) {
                    modeloTabla.addColumn(resultadoEvaluacion.getString("evaluacion"));

                    ResultSet notaAsignatura=controlador.obtenerNotasEstadisticas(resultadoEvaluacion.getString("evaluacion"),
                            (String) chCurso.getSelectedItem(), (String) chAsig.getSelectedItem());

                    float insuficiente=0, suficiente=0, bien=0, notable=0, sobresaliente=0;
                    int numAlumnos=0;

                    while (notaAsignatura.next()){
                        if (notaAsignatura.getFloat("nota") < 5){
                            insuficiente++;
                        }else if (notaAsignatura.getFloat("nota") < 6){
                            suficiente++;
                        }else if (notaAsignatura.getFloat("nota") < 7){
                            bien++;
                        }else if (notaAsignatura.getFloat("nota") < 9){
                            notable++;
                        }else{
                            sobresaliente++;
                        }
                        numAlumnos++;
                    }
                    modeloTabla.setValueAt(Math.round(insuficiente*100/numAlumnos)*100/100d+"%", 0, i);
                    modeloTabla.setValueAt(Math.round(suficiente*100/numAlumnos)*100/100d+"%", 1, i);
                    modeloTabla.setValueAt(Math.round(bien*100/numAlumnos)*100/100d+"%", 2, i);
                    modeloTabla.setValueAt(Math.round(notable*100/numAlumnos)*100/100d+"%", 3, i);
                    modeloTabla.setValueAt(Math.round(sobresaliente*100/numAlumnos)*100/100d+"%", 4, i);
                    modeloTabla.setValueAt(""+numAlumnos, 5, i);
                    i++;
                }
            } catch (Exception e) {
            }
        }else{
            ResultSet resultadoEvaluacion=controlador.obtenerEvaluacionesUna((String) chAsig.getSelectedItem(), 
                    (String) chEvaluacion.getSelectedItem());
            try {
                modeloTabla.addColumn((String) chEvaluacion.getSelectedItem());
                ResultSet notaAsignatura=controlador.obtenerNotasEstadisticas((String) chEvaluacion.getSelectedItem(),
                            (String) chCurso.getSelectedItem(), (String) chAsig.getSelectedItem());
                
                float insuficiente=0, suficiente=0, bien=0, notable=0, sobresaliente=0;
                int numAlumnos=0;
                
                while (notaAsignatura.next()){
                    if (notaAsignatura.getFloat("nota") < 5){
                        insuficiente++;
                    }else if (notaAsignatura.getFloat("nota") < 6){
                        suficiente++;
                    }else if (notaAsignatura.getFloat("nota") < 7){
                        bien++;
                    }else if (notaAsignatura.getFloat("nota") < 9){
                        notable++;
                    }else{
                        sobresaliente++;
                    }
                    numAlumnos++;
                }
                modeloTabla.setValueAt(Math.round(insuficiente*100/numAlumnos)*100/100d+"%", 0, i);
                modeloTabla.setValueAt(Math.round(suficiente*100/numAlumnos)*100/100d+"%", 1, i);
                modeloTabla.setValueAt(Math.round(bien*100/numAlumnos)*100/100d+"%", 2, i);
                modeloTabla.setValueAt(Math.round(notable*100/numAlumnos)*100/100d+"%", 3, i);
                modeloTabla.setValueAt(Math.round(sobresaliente*100/numAlumnos)*100/100d+"%", 4, i);
                modeloTabla.setValueAt(""+numAlumnos, 5, i);
                i++;
            } catch (Exception e) {
            }
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chCurso = new java.awt.Choice();
        chEvaluacion = new java.awt.Choice();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        chAsig = new java.awt.Choice();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bConsultar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        cbT = new java.awt.Checkbox();
        cbU = new java.awt.Checkbox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Selección Asignatura/Evaluación");

        jLabel2.setText("Curso");

        jLabel3.setText("Evaluación");

        chCurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chCursoItemStateChanged(evt);
            }
        });

        jLabel4.setText("Asignatura");

        jLabel5.setText("Evaluaciones");

        chAsig.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chAsigItemStateChanged(evt);
            }
        });

        jLabel6.setText("Estadísticas Notas");

        jTable1.setModel(modeloTabla);
        jScrollPane1.setViewportView(jTable1);

        bConsultar.setText("Consultar");
        bConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultarActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        cbT.setCheckboxGroup(cbg);
        cbT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbT.setLabel("Todas");
        cbT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbTFocusGained(evt);
            }
        });

        cbU.setCheckboxGroup(cbg);
        cbU.setLabel("Una");
        cbU.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbUFocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(chEvaluacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2))
                            .addComponent(chCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(chAsig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(chEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(cbT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bConsultar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(bSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed

    private void chCursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chCursoItemStateChanged
        chAsig.removeAll();
        rellenarAsignatura();
        chEvaluacion.removeAll();
        rellenarEvaluacion();
    }//GEN-LAST:event_chCursoItemStateChanged

    private void bConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultarActionPerformed
        rellenarTabla();
    }//GEN-LAST:event_bConsultarActionPerformed

    private void cbTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbTFocusGained
        modeloTabla.setColumnCount(1);
        ResultSet resultadoEvaluacion=controlador.obtenerEvaluacionesTodas((String) chAsig.getSelectedItem());
        try {
            while (resultadoEvaluacion.next()) {
                modeloTabla.addColumn(resultadoEvaluacion.getString("evaluacion"));
            }                  
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cbTFocusGained

    private void cbUFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbUFocusGained
        modeloTabla.setColumnCount(1);
        ResultSet resultadoEvaluacion=controlador.obtenerEvaluacionesUna((String) chAsig.getSelectedItem(), 
                    (String) chEvaluacion.getSelectedItem());
        modeloTabla.addColumn((String) chEvaluacion.getSelectedItem());
    }//GEN-LAST:event_cbUFocusGained

    private void chAsigItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chAsigItemStateChanged
        chEvaluacion.removeAll();
        rellenarEvaluacion();
    }//GEN-LAST:event_chAsigItemStateChanged

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
            java.util.logging.Logger.getLogger(EstadisticasNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadisticasNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadisticasNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadisticasNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstadisticasNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConsultar;
    private javax.swing.JButton bSalir;
    private java.awt.Checkbox cbT;
    private java.awt.Checkbox cbU;
    private java.awt.Choice chAsig;
    private java.awt.Choice chCurso;
    private java.awt.Choice chEvaluacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
