
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
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
public class VistaAlumnos extends javax.swing.JFrame {
    DefaultTableModel modeloTabla;
    Controlador controlador;
    DefaultListModel modeloLista1, modeloLista2;
    /**
     * Creates new form VistaAlumnos
     */
    public VistaAlumnos() {
        modeloTabla=new DefaultTableModel();
        modeloLista1=new DefaultListModel();
        modeloLista2=new DefaultListModel();
        initComponents();
        controlador=new Controlador();
        modeloTabla.addColumn("Alumno");
        modeloTabla.addColumn("Asignatura");
        rellenarCurso();
        rellenarEvaluacion();
        rellenarAsignaturas();
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
        ResultSet resultado=controlador.obtenerRegistrosGroup("notas","evaluacion");
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
    
    public void rellenarAsignaturas(){
        ResultSet resultado=controlador.obtenerRegistroAsignatura((String) chCurso.getSelectedItem());
        try {
            if(resultado!=null){
                while(resultado.next()){
                    chAsignatura.addItem(resultado.getString("asignatura"));
                }
            }
        } catch (Exception e) {
            System.out.println("Fallo al rellenar el choice Asignaturas");
        }
    }
    
    public void rellenarAlumnosCandidatos(){
        ResultSet resultado=controlador.obtenerAlumnosCandidatos((String) chCurso.getSelectedItem());
        try {
            if(resultado!=null){
                while(resultado.next()){
                    modeloLista1.addElement(resultado.getString("nombre"));
                }
            }
        } catch (Exception e) {
            System.out.println("Fallo al rellenar la lista alumnos candidatos");
        }
    }
    
    public void pasarCandidatoSeleccionado(){
        modeloLista2.addElement(modeloLista1.getElementAt(lCandidatos.getSelectedIndex()));
        modeloLista1.removeElementAt(lCandidatos.getSelectedIndex());
    }
    
    public void pasarSeleccionadoCandidato(){
        modeloLista1.addElement(modeloLista2.getElementAt(lSeleccionados.getSelectedIndex()));
        modeloLista2.removeElementAt(lSeleccionados.getSelectedIndex());
    }
    
    public void pasarTodosCandidatos(){
        for (int i = 0; i < modeloLista1.getSize(); i++) {
            modeloLista2.addElement(modeloLista1.getElementAt(i));
        }
        modeloLista1.removeAllElements();
    }
    
    public void pasarTodosSeleccionados(){
        for (int i = 0; i < modeloLista2.getSize(); i++) {
            modeloLista1.addElement(modeloLista2.getElementAt(i));
        }
        modeloLista2.removeAllElements();
    }
    
    public void crearTabla(){
        if(chAsignatura.getSelectedItem()!=null){
            modeloTabla.setColumnCount(1);
            modeloTabla.addColumn(chAsignatura.getSelectedItem());
        }else{
            System.out.println("No hay datos en el choice");
        }
        for (int i = 0; i < modeloLista2.getSize(); i++) {
            ResultSet resultado=controlador.obtenerNota((String) modeloLista2.getElementAt(i),
                    (String) chCurso.getSelectedItem(), (String) chEvaluacion.getSelectedItem(),
                    (String) chAsignatura.getSelectedItem());
            try {
                if(resultado.getString("nota") == ""){
                    modeloTabla.addRow(new Object [] {modeloLista2.getElementAt(i), "0"});
                }else{
                    modeloTabla.addRow(new Object [] {modeloLista2.getElementAt(i), resultado.getString("nota")});
                } 
            } catch (Exception e) {
            }
        }
        modeloLista2.removeAllElements();
    }
    
    public void insertarValores(){
        for (int i=0; i<modeloTabla.getRowCount(); i++){
            String nota=(String) modeloTabla.getValueAt(i, 1);
            String nombre=(String) modeloTabla.getValueAt(i, 0);
            String asignatura=chAsignatura.getSelectedItem();
            String evaluacion=chEvaluacion.getSelectedItem();
            controlador.modificarNota(nombre, asignatura, evaluacion, nota);
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        chCurso = new java.awt.Choice();
        chEvaluacion = new java.awt.Choice();
        chAsignatura = new java.awt.Choice();
        bAplicar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        lSeleccionados = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        lCandidatos = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        bEvaluar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tEvaluacion = new javax.swing.JTable();
        bProcesar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(766, 693));
        setMinimumSize(new java.awt.Dimension(766, 693));
        setPreferredSize(new java.awt.Dimension(766, 693));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Asignatura");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 30, -1, -1));

        jLabel2.setText("Alumno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 200, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 52, 645, 10));

        jLabel3.setText("Curso");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 76, -1, -1));

        jLabel4.setText("Evaluación");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 126, -1, -1));

        jLabel5.setText("Asignatura");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 76, -1, -1));

        chCurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chCursoItemStateChanged(evt);
            }
        });
        getContentPane().add(chCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 72, 156, -1));
        getContentPane().add(chEvaluacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 122, 156, -1));
        getContentPane().add(chAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 72, 156, -1));

        bAplicar.setText("Aplicar");
        bAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAplicarActionPerformed(evt);
            }
        });
        getContentPane().add(bAplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 228, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 222, 645, 10));

        lSeleccionados.setModel(modeloLista2);
        jScrollPane1.setViewportView(lSeleccionados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 200, -1));

        lCandidatos.setModel(modeloLista1);
        jScrollPane2.setViewportView(lCandidatos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 200, -1));

        jLabel6.setText("Candidatos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jLabel7.setText("Seleccionados");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        b1.setText(">>");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 80, -1));

        b2.setText(">|");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 80, -1));

        b3.setText("<<");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 80, -1));

        b4.setText("|<");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 80, -1));

        bEvaluar.setText("Evaluar");
        bEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEvaluarActionPerformed(evt);
            }
        });
        getContentPane().add(bEvaluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, -1, -1));

        jLabel8.setText("Evaluación");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 630, -1));

        tEvaluacion.setModel(modeloTabla);
        jScrollPane3.setViewportView(tEvaluacion);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, -1, 120));

        bProcesar.setText("Procesar");
        bProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProcesarActionPerformed(evt);
            }
        });
        getContentPane().add(bProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 570, -1, -1));

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        getContentPane().add(bSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 610, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        try {
            pasarTodosCandidatos();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed

    private void chCursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chCursoItemStateChanged
        chAsignatura.removeAll();
        rellenarAsignaturas();
    }//GEN-LAST:event_chCursoItemStateChanged

    private void bAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAplicarActionPerformed
        modeloLista1.removeAllElements();
        rellenarAlumnosCandidatos();
    }//GEN-LAST:event_bAplicarActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        try {
            pasarCandidatoSeleccionado();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        try {
            pasarSeleccionadoCandidato();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        try {
            pasarTodosSeleccionados();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void bEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEvaluarActionPerformed
        modeloTabla.setRowCount(0);
        crearTabla();
    }//GEN-LAST:event_bEvaluarActionPerformed

    private void bProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProcesarActionPerformed
        insertarValores();
        modeloTabla.setRowCount(0);
    }//GEN-LAST:event_bProcesarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton bAplicar;
    private javax.swing.JButton bEvaluar;
    private javax.swing.JButton bProcesar;
    private javax.swing.JButton bSalir;
    private java.awt.Choice chAsignatura;
    private java.awt.Choice chCurso;
    private java.awt.Choice chEvaluacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JList lCandidatos;
    private javax.swing.JList lSeleccionados;
    private javax.swing.JTable tEvaluacion;
    // End of variables declaration//GEN-END:variables
}
