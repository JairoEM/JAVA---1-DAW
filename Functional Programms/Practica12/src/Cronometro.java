/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author losel
 */
public class Cronometro extends javax.swing.JFrame implements Runnable{
    Thread hilo;
    int nHoras, nMinutos, nSegundos, nMilis;
    String lHoras, lMinutos, lSegundos, lMilis;
    /**
     * Creates new form Cronometro
     */
    public Cronometro() {
        initComponents();
    }
    
    public void run() {
        try{
            crono();
        }catch(InterruptedException e){}
    }
    public void crono() throws InterruptedException{
        while (Thread.currentThread()==hilo){
            Thread.sleep(100);
            nMilis++;
            if(nMilis>=10){
                nMilis=0;
                nSegundos++;
                if(nSegundos>=60){
                    nMinutos++;
                    nSegundos=0;
                    if(nMinutos>=60){
                        nHoras++;
                        nMinutos=0;
                    }
                }
            }
            lHoras=String.format("%02d",nHoras);
            lMinutos=String.format("%02d",nMinutos);
            lSegundos=String.format("%02d",nSegundos);
            lMilis=String.format("%02d",nMilis);
            tfCrono.setText(lHoras+":"+lMinutos+":"+lSegundos+"'"+lMilis);
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

        tfCrono = new javax.swing.JTextField();
        bReanudar = new javax.swing.JButton();
        bIniciar = new javax.swing.JButton();
        bPausar = new javax.swing.JButton();
        bParar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfCrono.setEditable(false);
        tfCrono.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        bReanudar.setText("Reanudar");
        bReanudar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReanudarActionPerformed(evt);
            }
        });

        bIniciar.setText("Iniciar");
        bIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIniciarActionPerformed(evt);
            }
        });

        bPausar.setText("Pausar");
        bPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPausarActionPerformed(evt);
            }
        });

        bParar.setText("Parar");
        bParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(bIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bReanudar)
                        .addGap(18, 18, 18)
                        .addComponent(bParar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(tfCrono, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tfCrono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bReanudar)
                    .addComponent(bIniciar)
                    .addComponent(bParar)
                    .addComponent(bPausar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bReanudarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReanudarActionPerformed
        hilo.resume();
    }//GEN-LAST:event_bReanudarActionPerformed

    private void bIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIniciarActionPerformed
        hilo=new Thread(this);
        hilo.start();
    }//GEN-LAST:event_bIniciarActionPerformed

    private void bPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPararActionPerformed
        hilo.suspend();
        hilo=null;
        tfCrono.setText(null);
    }//GEN-LAST:event_bPararActionPerformed

    private void bPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPausarActionPerformed
        hilo.suspend();
    }//GEN-LAST:event_bPausarActionPerformed

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
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cronometro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bIniciar;
    private javax.swing.JButton bParar;
    private javax.swing.JButton bPausar;
    private javax.swing.JButton bReanudar;
    private javax.swing.JTextField tfCrono;
    // End of variables declaration//GEN-END:variables
}
