/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Toolkit;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class loginFrame extends javax.swing.JFrame {

    /**
     * Creates new form loginFrame
     */
     
    public loginFrame() {
        initComponents();
//        icon();
    }

//    private void icon(){
//        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("signage.png")));
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logi_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        showPass = new javax.swing.JCheckBox();
        reset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(550, 200));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userName.setToolTipText("Enter your Username");
        userName.setActionCommand("null");
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 151, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 151, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(userName);
        jLabel1.setText("User Name");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setLabelFor(password);
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        logi_btn.setText("Login");
        logi_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logi_btnActionPerformed(evt);
            }
        });
        getContentPane().add(logi_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGIN ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 110, -1));

        showPass.setBackground(new java.awt.Color(19, 19, 19));
        showPass.setForeground(new java.awt.Color(255, 255, 255));
        showPass.setText("Show Password");
        showPass.setToolTipText("to show your password");
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });
        getContentPane().add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 120, -1));

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 62, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\final_project\\src\\icons\\background.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logi_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logi_btnActionPerformed
        // TODO add your handling code here:
        String x="";
        String y="";
       String name = userName.getText();
       String pass=password.getText();
       String test="null";
       File file=new File ("C:\\Users\\DELL\\Desktop\\final_project\\src\\back end\\Employee.txt");
       try{
           Scanner input = new Scanner(file);
           while (input.hasNext()){
               input.next();
               if(name.equalsIgnoreCase(input.next())){
                   x=input.next();
                   if(x.equalsIgnoreCase("#Admin")||x.equalsIgnoreCase("#Entry")||x.equalsIgnoreCase("#Exit")){
                       y=input.next();
                       if(pass.equalsIgnoreCase(y)&&x.equalsIgnoreCase("#Admin")){
                       //*هيخش صفحه الادمن
                       test="admin";
                       this.setVisible(false);
                       new admin(name).setVisible(true);
                       break;
                       }
                       if(pass.equalsIgnoreCase(y)&&x.equalsIgnoreCase("#Entry")){
                       //*هيخش صفحه الادمن
                       test="oe";
                       this.setVisible(false);
                       new OpEntry(name).setVisible(true) ;
                       break;
                       }
                        if(pass.equalsIgnoreCase(y)&&x.equalsIgnoreCase("#Exit")){
                       //*هيخش صفحه الادمن
                       test="exit";
                       this.setVisible(false);
                       new Exit(name).setVisible(true) ;
                       break;
                       }
                      
                   }
               }
               
           }
       
       }catch(Exception e){}
      
       if(test.equalsIgnoreCase("null")){
            JOptionPane.showMessageDialog(this, "Login Filed\nInvalid Username or Password !");
       }  
    }//GEN-LAST:event_logi_btnActionPerformed
    
    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        if (showPass.isSelected()){
        password.setEchoChar((char)0);
        }
        else{
        password.setEchoChar('*');
        }
    }//GEN-LAST:event_showPassActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
         userName.setText("");
         password.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new loginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton logi_btn;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton reset;
    private javax.swing.JCheckBox showPass;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
