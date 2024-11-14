
package ksscinema;

import javax.swing.*;
import java.awt.*;
import java.util.Enumeration;

public class homepage extends javax.swing.JFrame {
    
    private String[] imagepaths ={
        "C:\\Users\\ainnuraida\\Downloads\\SEMESTER 3\\SPG 0453\\coding\\MovieTicket\\src\\movieticket\\t1.jpg",
        "C:\\Users\\ainnuraida\\Downloads\\SEMESTER 3\\SPG 0453\\coding\\MovieTicket\\src\\movieticket\\lb.jpg",
        "C:\\Users\\ainnuraida\\Downloads\\SEMESTER 3\\SPG 0453\\coding\\MovieTicket\\src\\movieticket\\wlit.jpg",
        "C:\\Users\\ainnuraida\\Downloads\\SEMESTER 3\\SPG 0453\\coding\\MovieTicket\\src\\movieticket\\minion.jpg",
        "C:\\Users\\ainnuraida\\Downloads\\SEMESTER 3\\SPG 0453\\coding\\MovieTicket\\src\\movieticket\\kahar.jpg",
        "C:\\Users\\ainnuraida\\Downloads\\SEMESTER 3\\SPG 0453\\coding\\MovieTicket\\src\\movieticket\\ipar.jpg"
    };
    
    private String[] movieNames = {
        "Transformer One",
        "    Look Back",
        "We Live In Time",
        "Despicable Me 4",
        "       KAHAR",
        "Ipar Adalah Maut"
    };
    
    
    private int currentIndex = 0;
    
    private String selectedMovie;
    private String selectedDate;
    private String selectedShowtime;
    private String selectedLocation;

    public homepage() {
        initComponents();
        updateMovie();
        pack();
        setLocationRelativeTo(null);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpDate = new javax.swing.ButtonGroup();
        btnGrpLocation = new javax.swing.ButtonGroup();
        moviePanel = new javax.swing.JPanel();
        moviesLabel = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        prev = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        location = new javax.swing.JLabel();
        showtime = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        date1 = new javax.swing.JRadioButton();
        date3 = new javax.swing.JRadioButton();
        date2 = new javax.swing.JRadioButton();
        date5 = new javax.swing.JRadioButton();
        date6 = new javax.swing.JRadioButton();
        date4 = new javax.swing.JRadioButton();
        location1 = new javax.swing.JRadioButton();
        location2 = new javax.swing.JRadioButton();
        location3 = new javax.swing.JRadioButton();
        location4 = new javax.swing.JRadioButton();
        location5 = new javax.swing.JRadioButton();
        location6 = new javax.swing.JRadioButton();
        location7 = new javax.swing.JRadioButton();
        location8 = new javax.swing.JRadioButton();
        location9 = new javax.swing.JRadioButton();
        location10 = new javax.swing.JRadioButton();
        nexthp = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        movieNameLabel = new javax.swing.JLabel();

        btnGrpDate.add(date1);
        btnGrpDate.add(date2);
        btnGrpDate.add(date3);
        btnGrpDate.add(date4);
        btnGrpDate.add(date5);
        btnGrpDate.add(date6);

        btnGrpLocation.add(location1);
        btnGrpLocation.add(location2);
        btnGrpLocation.add(location3);
        btnGrpLocation.add(location4);
        btnGrpLocation.add(location5);
        btnGrpLocation.add(location6);
        btnGrpLocation.add(location7);
        btnGrpLocation.add(location8);
        btnGrpLocation.add(location9);
        btnGrpLocation.add(location10);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Home Page");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(100, 100, 915, 700));
        setMaximumSize(new java.awt.Dimension(915, 700));
        setName("home page"); // NOI18N
        setPreferredSize(new java.awt.Dimension(915, 700));

        javax.swing.GroupLayout moviePanelLayout = new javax.swing.GroupLayout(moviePanel);
        moviePanel.setLayout(moviePanelLayout);
        moviePanelLayout.setHorizontalGroup(
            moviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(moviesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        moviePanelLayout.setVerticalGroup(
            moviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(moviesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );

        next.setText(">");
        next.setToolTipText("NEXT");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        prev.setText("<");
        prev.setToolTipText("PREVIOUS");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MOVIES");

        date.setText("SELECT A DATE");

        location.setText("SELECT A THEATRE LOCATION");

        showtime.setText("SELECT A SHOWTIME");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:15 AM", "11: 30 AM", "12:45 PM", "1:00 PM", "3:15 PM" }));

        date1.setText("November 22, FRI");
        date1.setName("date1"); // NOI18N
        date1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date1ActionPerformed(evt);
            }
        });

        date3.setText("November 24, SUN");
        date3.setName("date3"); // NOI18N

        date2.setText("November 23, SAT");
        date2.setName("date2"); // NOI18N

        date5.setText("November 26, TUE");
        date5.setName("date5"); // NOI18N

        date6.setText("November 27, TUE");
        date6.setName("date6"); // NOI18N

        date4.setText("November 25, MON");
        date4.setName("date4"); // NOI18N

        location1.setText("IOI City Mall, Putrajaya");

        location2.setText("IOI City Mall, Putrajaya (New Wing)");
        location2.setName(""); // NOI18N

        location3.setText("MyTOWN, Kuala Lumpur");

        location4.setText("Mid Valley Megamall, KL");
        location4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                location4ActionPerformed(evt);
            }
        });

        location5.setText("Lalaport BBCC, KL");

        location6.setText("1 Utama (OU), Petaling Jaya");

        location7.setText("AmanJaya Mall, Sg Petani");

        location8.setText("Ipoh Parade Mall, Ipoh");

        location9.setText("Paradigm Mall, JB");

        location10.setText("IMAGO Mall, KK");

        nexthp.setText("NEXT");
        nexthp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nexthpActionPerformed(evt);
            }
        });

        logout.setText("[ < ]");
        logout.setToolTipText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(location9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(location)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(date1)
                                                .addComponent(date4))
                                            .addGap(22, 22, 22)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(date2)
                                                .addComponent(date5))
                                            .addGap(34, 34, 34)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(date6)
                                                .addComponent(date3)))
                                        .addComponent(date))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(showtime)))
                                .addComponent(nexthp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(location1)
                                        .addComponent(location5))
                                    .addGap(22, 22, 22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(location2)
                                        .addComponent(location6)
                                        .addComponent(location10))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(location7)
                                        .addComponent(location3))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(location8)
                                        .addComponent(location4)))))
                        .addGap(0, 233, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(416, 416, 416))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(prev)
                                .addGap(18, 18, 18)
                                .addComponent(moviePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(next)
                                .addGap(310, 310, 310))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(movieNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(251, 251, 251))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moviePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prev)
                                    .addComponent(next))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(movieNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(date)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date2)
                            .addComponent(date3)
                            .addComponent(date1))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date4)
                            .addComponent(date5)
                            .addComponent(date6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(showtime)
                        .addGap(9, 9, 9)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85)
                .addComponent(location)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(location1)
                    .addComponent(location2)
                    .addComponent(location3)
                    .addComponent(location4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(location5)
                    .addComponent(location6)
                    .addComponent(location7)
                    .addComponent(location8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(location9)
                    .addComponent(location10))
                .addGap(37, 37, 37)
                .addComponent(nexthp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(342, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
        showPrevImage();
        
    }//GEN-LAST:event_prevActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        showNextImage();
    }//GEN-LAST:event_nextActionPerformed

    private void date1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date1ActionPerformed

    private void location4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_location4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_location4ActionPerformed

    private void nexthpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nexthpActionPerformed
        selectedMovie = movieNames[currentIndex]; // Or use movie names if available

        // Capture the selected date
        String selectedDate = null;
        for (Enumeration<AbstractButton> buttons = btnGrpDate.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                selectedDate = button.getText();
                break;
            }
        }

        // Capture the selected showtime
        selectedShowtime = (String) jComboBox1.getSelectedItem();

        // Capture the selected location
        String selectedLocation = null;
        for (Enumeration<AbstractButton> buttons = btnGrpLocation.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                selectedLocation = button.getText();
                break;
            }
        }
        
        if (selectedMovie == null || selectedDate == null || selectedLocation == null || selectedShowtime == null) {
        JOptionPane.showMessageDialog(this, "Please fill out all the fields.", "Selection Required", JOptionPane.ERROR_MESSAGE);
        }
        
        /*System.out.println("Selected Movie: " + selectedMovie);
        System.out.println("Selected Date: " + selectedDate);
        System.out.println("Selected Showtime: " + selectedShowtime);
        System.out.println("Selected Location: " + selectedLocation);*/
    }//GEN-LAST:event_nexthpActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        KSSCinema login = new KSSCinema(); // go to main menu
        login.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void showPrevImage() {
        currentIndex = (currentIndex - 1 + imagepaths.length) % imagepaths.length;
        updateMovie();
    }
    
    private void showNextImage() {
        currentIndex = (currentIndex + 1) % imagepaths.length;
        updateMovie();
    }
    
    private void updateMovie() {
    int width = 150;
    int height = 200;

    // Load and resize the image 
    ImageIcon icon = new ImageIcon(imagepaths[currentIndex]);
    Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
    moviesLabel.setIcon(new ImageIcon(scaledImage));
    
    movieNameLabel.setText(movieNames[currentIndex]);
    }
    
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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrpDate;
    private javax.swing.ButtonGroup btnGrpLocation;
    private javax.swing.JLabel date;
    private javax.swing.JRadioButton date1;
    private javax.swing.JRadioButton date2;
    private javax.swing.JRadioButton date3;
    private javax.swing.JRadioButton date4;
    private javax.swing.JRadioButton date5;
    private javax.swing.JRadioButton date6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel location;
    private javax.swing.JRadioButton location1;
    private javax.swing.JRadioButton location10;
    private javax.swing.JRadioButton location2;
    private javax.swing.JRadioButton location3;
    private javax.swing.JRadioButton location4;
    private javax.swing.JRadioButton location5;
    private javax.swing.JRadioButton location6;
    private javax.swing.JRadioButton location7;
    private javax.swing.JRadioButton location8;
    private javax.swing.JRadioButton location9;
    private javax.swing.JButton logout;
    private javax.swing.JLabel movieNameLabel;
    private javax.swing.JPanel moviePanel;
    private javax.swing.JLabel moviesLabel;
    private javax.swing.JButton next;
    private javax.swing.JButton nexthp;
    private javax.swing.JButton prev;
    private javax.swing.JLabel showtime;
    // End of variables declaration//GEN-END:variables
}
