
public class home extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(home.class.getName());

    public home() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("🏠Home");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLog = new javax.swing.JButton();
        btnDiag = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnFullHistory = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btn_Search = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLog.setBackground(new java.awt.Color(255, 51, 0));
        btnLog.setFont(new java.awt.Font("Herculanum", 0, 24)); // NOI18N
        btnLog.setForeground(new java.awt.Color(0, 102, 102));
        btnLog.setText("🚪Logout");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        btnDiag.setBackground(new java.awt.Color(204, 0, 204));
        btnDiag.setFont(new java.awt.Font("Hiragino Sans", 3, 24)); // NOI18N
        btnDiag.setForeground(new java.awt.Color(255, 255, 51));
        btnDiag.setText("🩺📋Diagnosis");
        btnDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 255, 0));
        btnUpdate.setFont(new java.awt.Font("Hoefler Text", 3, 24)); // NOI18N
        btnUpdate.setText("🔧Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnFullHistory.setBackground(new java.awt.Color(102, 102, 0));
        btnFullHistory.setFont(new java.awt.Font("Hoefler Text", 3, 24)); // NOI18N
        btnFullHistory.setForeground(new java.awt.Color(204, 255, 255));
        btnFullHistory.setText("📜Full Histroy");
        btnFullHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFullHistoryActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(0, 255, 0));
        btnAdd.setFont(new java.awt.Font("Hiragino Sans", 3, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("👤Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btn_Search.setBackground(new java.awt.Color(51, 102, 255));
        btn_Search.setFont(new java.awt.Font("Hoefler Text", 3, 24)); // NOI18N
        btn_Search.setForeground(new java.awt.Color(255, 255, 255));
        btn_Search.setText("🔍Search");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });

        btn_Delete.setBackground(new java.awt.Color(255, 0, 0));
        btn_Delete.setFont(new java.awt.Font("Hoefler Text", 3, 24)); // NOI18N
        btn_Delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_Delete.setText("🗑Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFullHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDiag, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFullHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiag, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        this.setVisible(false);
        new update().setVisible(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed

        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagActionPerformed

        this.setVisible(false);
        new project_1().setVisible(true);
    }//GEN-LAST:event_btnDiagActionPerformed

    private void btnFullHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFullHistoryActionPerformed

           this.setVisible(false);
           new FullHistoryOffPatient().setVisible(true); 
    }//GEN-LAST:event_btnFullHistoryActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        this.setVisible(false);
        new AddNewPatientRecord().setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SearchByID().setVisible(true);
    }//GEN-LAST:event_btn_SearchActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new DeletePatient().setVisible(true);
    }//GEN-LAST:event_btn_DeleteActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new home().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDiag;
    private javax.swing.JButton btnFullHistory;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Search;
    // End of variables declaration//GEN-END:variables
}
