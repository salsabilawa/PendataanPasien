package Utama;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author QONITA
 */
public class DataDokter extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public DataDokter() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();
        btn_dasboard = new javax.swing.JLabel();
        btn_dokter = new javax.swing.JLabel();
        btn_pasien = new javax.swing.JLabel();
        btn_petugas = new javax.swing.JLabel();
        btn_laporan = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_dokter1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Line 4.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 10, 430));

        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new logout.png"))); // NOI18N
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logoutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_logoutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_logoutMouseReleased(evt);
            }
        });
        jPanel3.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 190, 50));

        btn_dasboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard new.png"))); // NOI18N
        btn_dasboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dasboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_dasboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_dasboardMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_dasboardMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_dasboardMouseReleased(evt);
            }
        });
        jPanel3.add(btn_dasboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 190, 50));

        btn_dokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new data dokter.png"))); // NOI18N
        btn_dokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dokterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_dokterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_dokterMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_dokterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_dokterMouseReleased(evt);
            }
        });
        jPanel3.add(btn_dokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 50));

        btn_pasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new data pasien.png"))); // NOI18N
        btn_pasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pasienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pasienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pasienMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_pasienMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_pasienMouseReleased(evt);
            }
        });
        jPanel3.add(btn_pasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 190, 50));

        btn_petugas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new data petugas.png"))); // NOI18N
        btn_petugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_petugasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_petugasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_petugasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_petugasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_petugasMouseReleased(evt);
            }
        });
        jPanel3.add(btn_petugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 190, 50));

        btn_laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new laporan.png"))); // NOI18N
        btn_laporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_laporanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_laporanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_laporanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_laporanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_laporanMouseReleased(evt);
            }
        });
        jPanel3.add(btn_laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 190, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tambah.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 100, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 110, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pencarian.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 310, 30));

        btn_dokter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new data dokter.png"))); // NOI18N
        btn_dokter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dokter1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_dokter1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_dokter1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_dokter1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_dokter1MouseReleased(evt);
            }
        });
        jPanel3.add(btn_dokter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frame 4.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dasboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dasboardMouseClicked
        this.dispose();
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_btn_dasboardMouseClicked

    private void btn_dasboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dasboardMouseEntered
         btn_dasboard.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\dasboard klik.png"));
    }//GEN-LAST:event_btn_dasboardMouseEntered

    private void btn_dasboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dasboardMouseExited
        btn_dasboard.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\dashboard new.png"));
    }//GEN-LAST:event_btn_dasboardMouseExited

    private void btn_dasboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dasboardMousePressed
         btn_dasboard.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\dashboard new.png"));
    }//GEN-LAST:event_btn_dasboardMousePressed

    private void btn_dasboardMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dasboardMouseReleased
         btn_dasboard.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\dasboard klik.png"));
    }//GEN-LAST:event_btn_dasboardMouseReleased

    private void btn_dokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dokterMouseClicked
        this.dispose();
        new DataDokter().setVisible(true);
    }//GEN-LAST:event_btn_dokterMouseClicked

    private void btn_dokterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dokterMouseEntered
        btn_dokter.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\data dokter klik.png"));
    }//GEN-LAST:event_btn_dokterMouseEntered

    private void btn_dokterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dokterMouseExited
        btn_dokter.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\new data dokter.png"));
    }//GEN-LAST:event_btn_dokterMouseExited

    private void btn_dokterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dokterMousePressed
        btn_dokter.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\new data dokter.png"));
    }//GEN-LAST:event_btn_dokterMousePressed

    private void btn_dokterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dokterMouseReleased
       btn_dokter.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\data dokter klik.png"));
    }//GEN-LAST:event_btn_dokterMouseReleased

    private void btn_pasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pasienMouseClicked
        this.dispose();
        new DataPasien().setVisible(true);
    }//GEN-LAST:event_btn_pasienMouseClicked

    private void btn_pasienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pasienMouseEntered
        btn_pasien.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\data pasien klik.png"));
    }//GEN-LAST:event_btn_pasienMouseEntered

    private void btn_pasienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pasienMouseExited
        btn_pasien.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\new data pasien.png"));
    }//GEN-LAST:event_btn_pasienMouseExited

    private void btn_pasienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pasienMousePressed
        btn_pasien.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\new data pasien.png"));
    }//GEN-LAST:event_btn_pasienMousePressed

    private void btn_pasienMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pasienMouseReleased
     btn_pasien.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\data pasien klik.png"));
    }//GEN-LAST:event_btn_pasienMouseReleased

    private void btn_petugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_petugasMouseClicked
        this.dispose();
        new DataPetugas().setVisible(true);
    }//GEN-LAST:event_btn_petugasMouseClicked

    private void btn_petugasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_petugasMouseEntered
        btn_petugas.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\data petugas klik.png"));
    }//GEN-LAST:event_btn_petugasMouseEntered

    private void btn_petugasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_petugasMouseExited
        btn_petugas.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\new data petugas.png"));
    }//GEN-LAST:event_btn_petugasMouseExited

    private void btn_petugasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_petugasMousePressed
        btn_petugas.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\new data petugas.png"));
    }//GEN-LAST:event_btn_petugasMousePressed

    private void btn_petugasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_petugasMouseReleased
        btn_petugas.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\data petugas klik.png"));
    }//GEN-LAST:event_btn_petugasMouseReleased

    private void btn_laporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_laporanMouseClicked
        this.dispose();
        new Laporan().setVisible(true);
    }//GEN-LAST:event_btn_laporanMouseClicked

    private void btn_laporanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_laporanMouseEntered
        btn_laporan.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\btn_laporan klik.png"));
    }//GEN-LAST:event_btn_laporanMouseEntered

    private void btn_laporanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_laporanMouseExited
        btn_laporan.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\new laporan.png"));
    }//GEN-LAST:event_btn_laporanMouseExited

    private void btn_laporanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_laporanMousePressed
        btn_laporan.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\new laporan.png"));
    }//GEN-LAST:event_btn_laporanMousePressed

    private void btn_laporanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_laporanMouseReleased
        btn_laporan.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\btn_laporan klik.png"));
    }//GEN-LAST:event_btn_laporanMouseReleased

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
    int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin logout?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);
    
    if (confirm == JOptionPane.YES_OPTION) {
        // Lakukan operasi logout di sini, seperti membersihkan sesi atau mengarahkan ke halaman login
        // Contoh: Anda dapat mengarahkan kembali ke halaman login
        Login loginForm = new Login();
        loginForm.setVisible(true);
        this.dispose(); // Menutup frame saat ini
    }
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseEntered
        btn_logout.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\logout klik.png"));
    }//GEN-LAST:event_btn_logoutMouseEntered

    private void btn_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseExited
        btn_logout.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\new logout.png"));
    }//GEN-LAST:event_btn_logoutMouseExited

    private void btn_logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMousePressed
        btn_logout.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\new logout.png"));
    }//GEN-LAST:event_btn_logoutMousePressed

    private void btn_logoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseReleased
        btn_logout.setIcon(new javax.swing.ImageIcon("D:\\java\\PendataanPasien\\src\\img\\logout klik.png"));
    }//GEN-LAST:event_btn_logoutMouseReleased

    private void btn_dokter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dokter1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dokter1MouseClicked

    private void btn_dokter1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dokter1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dokter1MouseEntered

    private void btn_dokter1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dokter1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dokter1MouseExited

    private void btn_dokter1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dokter1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dokter1MousePressed

    private void btn_dokter1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dokter1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dokter1MouseReleased

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
            java.util.logging.Logger.getLogger(DataDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataDokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_dasboard;
    private javax.swing.JLabel btn_dokter;
    private javax.swing.JLabel btn_dokter1;
    private javax.swing.JLabel btn_laporan;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JLabel btn_pasien;
    private javax.swing.JLabel btn_petugas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
