/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import javax.swing.*;

/**
 *
 * @author khang
 */
public class Intro extends JFrame {

    Game game = new Game();

    /**
     * Creates new form Intro
     */
    public Intro() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jName = new javax.swing.JTextField();
        jPlayButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Winner Or Loser");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, 41));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tên:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(jName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 510, -1));

        jPlayButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPlayButton.setText("Chơi thôi");
        jPlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlayButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jPlayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Chào mừng bạn đã đến với");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/360_F_229688726_NGvDW2D4NFvJBjeXTv9YEXuzzHXg0YVD.jpg"))); // NOI18N
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 339));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlayButtonActionPerformed
        String name = jName.getText().trim();
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn phải nhập tên để có thể chơi!!!");
        } else {
            int option = JOptionPane.showConfirmDialog(null, "Có tổng cộng 15 câu hỏi bạn sẵn sàng chơi chưa?", "Ai là triệu phú", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                game.setName(name);
                game.loadFile();
                game.setVisible(true);
                this.setVisible(false);
            } else {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_jPlayButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel *`/
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
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Intro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jName;
    private javax.swing.JButton jPlayButton;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
