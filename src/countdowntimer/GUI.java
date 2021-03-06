/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countdowntimer;
import java.awt.event.ActionEvent;
import javax.swing.*;
/**
 *
 * @author aar
 */
public final class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    long detik, menit, jam, totalTimeMs, currentFrame;
    long getDetik, getMenit, getJam;
    
    String displayMenit, displayDetik, displayJam;
    
    String inputMenit, inputDetik, inputJam;
    
    Timer timer;
    
    int counter = 1;
    
    public GUI() {
        initComponents();
        hitungMundur();
        displayDetik = String.format("%02d", detik);
        displayMenit = String.format("%02d", menit);
        displayJam = String.format("%02d", jam);
        
        labelDisplay.setText(displayJam+":"+displayMenit+":"+displayDetik);
    }
    
    public void start(){
        totalTimeMs = getJam + getMenit + getDetik;
        timer.start();
        btnStart.setText("Stop");
    }
    
    public void stop(){
        timer.stop();
        btnStart.setText("Start");
    }
    
    public void reset(){
        timer.stop();
        sliderDetik.setValue(0);
        sliderMenit.setValue(0);
        txtJam.setText("00");
        
        totalTimeMs = 0;
        detik = 0;
        menit = 0;
        jam = 0;
        
        displayDetik = String.format("%02d", detik);
        displayMenit = String.format("%02d", menit);
        displayJam = String.format("%02d", jam);
        
        labelDisplay.setText(displayJam+":"+displayMenit+":"+displayDetik);
        btnStart.setText("Start");
    }
    
    public void hitungMundur(){
        timer = new Timer(1000, (ActionEvent e) -> {
            totalTimeMs = totalTimeMs -1000;
            detik = (totalTimeMs/1000)%60;
            menit = (totalTimeMs/ 60000)%60;
            jam = (totalTimeMs/3600000);
            
            displayDetik = String.format("%02d", detik);
            displayMenit = String.format("%02d", menit);
            displayJam = String.format("%02d", jam);
            
            labelDisplay.setText(displayJam+":"+displayMenit+":"+displayDetik);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myDialog = new javax.swing.JDialog();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Display = new javax.swing.JPanel();
        labelDisplay = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        sliderMenit = new javax.swing.JSlider();
        sliderDetik = new javax.swing.JSlider();
        labelMenit = new javax.swing.JLabel();
        labelDetik = new javax.swing.JLabel();
        txtJam = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        labelJam = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        myDialog.setMinimumSize(new java.awt.Dimension(400, 295));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Achmad Nazilul Fikri / 211201191300\nM. Rifqi Satriamas / 21120119130115\nNaufal Reyhan / ");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Kelompok 29");

        javax.swing.GroupLayout myDialogLayout = new javax.swing.GroupLayout(myDialog.getContentPane());
        myDialog.getContentPane().setLayout(myDialogLayout);
        myDialogLayout.setHorizontalGroup(
            myDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myDialogLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(myDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myDialogLayout.createSequentialGroup()
                    .addGap(0, 27, Short.MAX_VALUE)
                    .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 28, Short.MAX_VALUE)))
        );
        myDialogLayout.setVerticalGroup(
            myDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myDialogLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(248, 248, 248))
            .addGroup(myDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myDialogLayout.createSequentialGroup()
                    .addGap(0, 67, Short.MAX_VALUE)
                    .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 68, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        Display.setBackground(new java.awt.Color(0, 0, 0));

        labelDisplay.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        labelDisplay.setForeground(new java.awt.Color(255, 255, 255));
        labelDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout DisplayLayout = new javax.swing.GroupLayout(Display);
        Display.setLayout(DisplayLayout);
        DisplayLayout.setHorizontalGroup(
            DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        DisplayLayout.setVerticalGroup(
            DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelDisplay.getAccessibleContext().setAccessibleName("");

        btnReset.setBackground(new java.awt.Color(255, 51, 51));
        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(51, 51, 51));
        btnReset.setText("Reset");
        btnReset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset.setBorderPainted(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnStart.setBackground(new java.awt.Color(204, 204, 204));
        btnStart.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnStart.setText("Start");
        btnStart.setBorderPainted(false);
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        sliderMenit.setBackground(new java.awt.Color(51, 51, 51));
        sliderMenit.setMaximum(59);
        sliderMenit.setValue(0);
        sliderMenit.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderMenitStateChanged(evt);
            }
        });

        sliderDetik.setBackground(new java.awt.Color(51, 51, 51));
        sliderDetik.setMaximum(59);
        sliderDetik.setValue(0);
        sliderDetik.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderDetikStateChanged(evt);
            }
        });

        labelMenit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelMenit.setForeground(new java.awt.Color(255, 255, 255));
        labelMenit.setText("Menit");

        labelDetik.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelDetik.setForeground(new java.awt.Color(255, 255, 255));
        labelDetik.setText("Detik");

        txtJam.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtJam.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtJam.setText("00");
        txtJam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJamActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        labelJam.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelJam.setForeground(new java.awt.Color(255, 255, 255));
        labelJam.setText("Jam");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtJam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sliderMenit, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMenit))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDetik)
                            .addComponent(sliderDetik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelJam)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(labelJam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtJam, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMenit)
                    .addComponent(labelDetik))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sliderMenit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderDetik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenu1.setText("Help");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:.
        if("Start".equals(btnStart.getText())){
            start();
        }
        else{
            stop();
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        getJam = Long.parseLong(txtJam.getText()) * 3600000;
        jam = Long.parseLong(txtJam.getText());
        
        displayJam = String.format("%02d", jam);
        
        labelDisplay.setText(displayJam+":"+displayMenit+":"+displayDetik);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void sliderMenitStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderMenitStateChanged
        // TODO add your handling code here:
        getMenit = sliderMenit.getValue() * 60000;
        menit = sliderMenit.getValue();
        displayMenit = String.format("%02d", menit);
        
        labelDisplay.setText(displayJam+":"+displayMenit+":"+displayDetik);
    }//GEN-LAST:event_sliderMenitStateChanged

    private void sliderDetikStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderDetikStateChanged
        // TODO add your handling code here:
        getDetik = sliderDetik.getValue() * 1000;
        detik = sliderDetik.getValue();
        
        displayDetik = String.format("%02d", detik);
        
        labelDisplay.setText(displayJam+":"+displayMenit+":"+displayDetik);
    }//GEN-LAST:event_sliderDetikStateChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        myDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtJamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJamActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Display;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelDetik;
    private javax.swing.JLabel labelDisplay;
    private javax.swing.JLabel labelJam;
    private javax.swing.JLabel labelMenit;
    private javax.swing.JDialog myDialog;
    private javax.swing.JSlider sliderDetik;
    private javax.swing.JSlider sliderMenit;
    private javax.swing.JTextField txtJam;
    // End of variables declaration//GEN-END:variables
}
