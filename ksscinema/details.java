
package ksscinema;

import javax.swing.*;
import java.awt.*;

public class details extends javax.swing.JFrame {

    public details(String movie, String date, String showtime, String location, String payment) {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\ainnuraida\\Downloads\\SEMESTER 3\\SPG 0453\\assignments\\mini project\\KSSCinema\\src\\ksscinema\\logokss.png");
        this.setIconImage(icon);
        setLocationRelativeTo(null); //to center the frame
        booking(movie, date, showtime, location, payment);
        
        ImageIcon qrr = new ImageIcon("C:\\Users\\ainnuraida\\Downloads\\SEMESTER 3\\SPG 0453\\assignments\\mini project\\KSSCinema\\src\\ksscinema\\qr.png");
        Image image = qrr.getImage();
        Image scaledImage = image.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        qr.setIcon(scaledIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mname = new javax.swing.JLabel();
        Lmname = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        Ldate = new javax.swing.JLabel();
        Llocation = new javax.swing.JLabel();
        location = new javax.swing.JLabel();
        showtime = new javax.swing.JLabel();
        Lshowtime = new javax.swing.JLabel();
        tickets = new javax.swing.JLabel();
        Ltickets = new javax.swing.JLabel();
        seats = new javax.swing.JLabel();
        Lseats = new javax.swing.JLabel();
        tprice = new javax.swing.JLabel();
        Ltotalprice = new javax.swing.JLabel();
        Lpayment = new javax.swing.JLabel();
        payment1 = new javax.swing.JLabel();
        OKbtn = new javax.swing.JButton();
        qr = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Booking Details");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(100, 100, 1600, 900));
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setName("details"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(1600, 900));
        jPanel1.setMinimumSize(new java.awt.Dimension(1600, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(1600, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(142, 217, 115));
        jLabel1.setText("BOOKING DETAILS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("________________________________________________________________________________________________________________________________________");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 740, 1360, -1));

        mname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mname.setForeground(new java.awt.Color(142, 217, 115));
        mname.setText("MOVIE NAME");
        jPanel1.add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        Lmname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lmname.setForeground(new java.awt.Color(255, 255, 255));
        Lmname.setText("name");
        jPanel1.add(Lmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 240, -1));

        date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(142, 217, 115));
        date.setText("DATE");
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        Ldate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Ldate.setForeground(new java.awt.Color(255, 255, 255));
        Ldate.setText("date");
        jPanel1.add(Ldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 240, -1));

        Llocation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Llocation.setForeground(new java.awt.Color(255, 255, 255));
        Llocation.setText("location");
        jPanel1.add(Llocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 240, -1));

        location.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        location.setForeground(new java.awt.Color(142, 217, 115));
        location.setText("LOCATION");
        jPanel1.add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        showtime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showtime.setForeground(new java.awt.Color(142, 217, 115));
        showtime.setText("SHOWTIME");
        jPanel1.add(showtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        Lshowtime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lshowtime.setForeground(new java.awt.Color(255, 255, 255));
        Lshowtime.setText("showtime");
        jPanel1.add(Lshowtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 240, -1));

        tickets.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tickets.setForeground(new java.awt.Color(142, 217, 115));
        tickets.setText("TICKETS");
        jPanel1.add(tickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        Ltickets.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Ltickets.setForeground(new java.awt.Color(255, 255, 255));
        Ltickets.setText("tickets");
        jPanel1.add(Ltickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 240, -1));

        seats.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seats.setForeground(new java.awt.Color(142, 217, 115));
        seats.setText("SEAT NO");
        jPanel1.add(seats, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));

        Lseats.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lseats.setForeground(new java.awt.Color(255, 255, 255));
        Lseats.setText("seats");
        jPanel1.add(Lseats, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 240, -1));

        tprice.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tprice.setForeground(new java.awt.Color(142, 217, 115));
        tprice.setText("TOTAL PRICE");
        jPanel1.add(tprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 610, -1, -1));

        Ltotalprice.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Ltotalprice.setForeground(new java.awt.Color(255, 255, 255));
        Ltotalprice.setText("price");
        jPanel1.add(Ltotalprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 660, 240, -1));

        Lpayment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lpayment.setForeground(new java.awt.Color(255, 255, 255));
        Lpayment.setText("payment");
        jPanel1.add(Lpayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, -1, -1));

        payment1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        payment1.setForeground(new java.awt.Color(142, 217, 115));
        payment1.setText("PAYMENT METHOD");
        jPanel1.add(payment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        OKbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        OKbtn.setText("OK");
        OKbtn.setFocusPainted(false);
        OKbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKbtnActionPerformed(evt);
            }
        });
        jPanel1.add(OKbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 810, 140, 40));

        qr.setForeground(new java.awt.Color(255, 255, 255));
        qr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        qr.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/ksscinema/qr.png"))); // NOI18N
        qr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(qr, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 220, 400, 400));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("________________________________________________________________________________________________________________________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 1360, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKbtnActionPerformed
        this.dispose();
        homepage hp = new homepage();
        hp.setVisible(true);
        
    }//GEN-LAST:event_OKbtnActionPerformed
    
    private void booking(String movie, String date, String showtime, String location, String payment){
        Lmname.setText(movie);
        Ldate.setText(date);
        Lshowtime.setText(showtime);
        Llocation.setText(location);
        Lpayment.setText(payment);
        //Lseats.setText(); //seat number
        //Ltickets.setText(location); //tickets
        //Ltotalprice.setText(); //total price
    }
    
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
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new details("", "", "", "", "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ldate;
    private javax.swing.JLabel Llocation;
    private javax.swing.JLabel Lmname;
    private javax.swing.JLabel Lpayment;
    private javax.swing.JLabel Lseats;
    private javax.swing.JLabel Lshowtime;
    private javax.swing.JLabel Ltickets;
    private javax.swing.JLabel Ltotalprice;
    private javax.swing.JButton OKbtn;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel location;
    private javax.swing.JLabel mname;
    private javax.swing.JLabel payment1;
    private javax.swing.JLabel qr;
    private javax.swing.JLabel seats;
    private javax.swing.JLabel showtime;
    private javax.swing.JLabel tickets;
    private javax.swing.JLabel tprice;
    // End of variables declaration//GEN-END:variables
}