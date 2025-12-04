
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("🔐Login");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_Login = new javax.swing.JButton();
        btn_Login1 = new javax.swing.JButton();
        txt_pass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setText("UserName : ");
        jLabel1.setToolTipText("");

        txt_username.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel2.setText("Password  :");
        jLabel2.setToolTipText("");

        btn_Login.setBackground(new java.awt.Color(51, 255, 51));
        btn_Login.setFont(new java.awt.Font("Hoefler Text", 3, 24)); // NOI18N
        btn_Login.setText("🔓Login");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });

        btn_Login1.setBackground(new java.awt.Color(255, 0, 0));
        btn_Login1.setFont(new java.awt.Font("Hoefler Text", 3, 24)); // NOI18N
        btn_Login1.setText("🔚Close");
        btn_Login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Login1ActionPerformed(evt);
            }
        });

        txt_pass.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel3.setText("🔑");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel4.setText("👤");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_username, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(txt_pass)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addComponent(btn_Login1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Login1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Login1ActionPerformed
        // TODO add your handling code here
        int choise = JOptionPane.showConfirmDialog(null, "Do you really want to close Application", "SELECT", JOptionPane.YES_NO_OPTION);

        if (choise == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_Login1ActionPerformed

    boolean Check(String Obj1, String Obj2) {
        return (Obj1.equals(Obj2));
    }

    void CheckError(boolean User, boolean Pass) {

        if ((!Pass) && (!User)) {
            JOptionPane.showConfirmDialog(null, "Incorrct UserName And Password");
            return;
        }
        if (!User) {
            JOptionPane.showConfirmDialog(null, "Incorrct UserName");
            return;
        }
        if (!Pass) {
            JOptionPane.showConfirmDialog(null, "Incorrct Password");
            return;
        }
    }

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed

        String UserName = txt_username.getText();
        String Password = txt_pass.getText();

        boolean User = Check(UserName, "admin");
        boolean Pass = Check(Password, "admin1234");

        if (User) {
            if (Pass) {
                setVisible(false);
                new home().setVisible(true);
                return;
            }
        }

        CheckError(User, Pass);

    }//GEN-LAST:event_btn_LoginActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_Login1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
