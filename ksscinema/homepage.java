
package ksscinema;

import javax.swing.*;
import java.awt.*;
import java.util.Enumeration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class homepage extends javax.swing.JFrame {
    
    private String[] imagepaths ={ //path for images assign using index (array)
        "C:\\Users\\ainnuraida\\Downloads\\SEMESTER 3\\SPG 0453\\coding\\MovieTicket\\src\\movieticket\\t1.jpg",
        "C:\\Users\\ainnuraida\\Downloads\\SEMESTER 3\\SPG 0453\\coding\\MovieTicket\\src\\movieticket\\lb.jpg",
        "C:\\Users\\ainnuraida\\Downloads\\SEMESTER 3\\SPG 0453\\coding\\MovieTicket\\src\\movieticket\\wlit.jpg",
        "C:\\Users\\ainnuraida\\Downloads\\SEMESTER 3\\SPG 0453\\coding\\MovieTicket\\src\\movieticket\\minion.jpg",
        "C:\\Users\\ainnuraida\\Downloads\\SEMESTER 3\\SPG 0453\\coding\\MovieTicket\\src\\movieticket\\kahar.jpg",
        "C:\\Users\\ainnuraida\\Downloads\\SEMESTER 3\\SPG 0453\\coding\\MovieTicket\\src\\movieticket\\ipar.jpg"
    };
    
    private String[] movieNames = { //movie name according to the index (array)
        "Transformer One",
        "Look Back",
        "We Live In Time",
        "Despicable Me 4",
        "KAHAR",
        "Ipar Adalah Maut"
    };
    
    private int currentIndex = 0;
    
    public String selectedMovie;
    public String selectedDate;
    public String selectedShowtime;
    public String selectedLocation;

    public homepage() {
        initComponents();
        //set icon (logo)
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\ainnuraida\\Downloads\\SEMESTER 3\\SPG 0453\\assignments\\mini project\\KSSCinema\\src\\ksscinema\\logokss.png");
        this.setIconImage(icon);
        updateMovie();
        setDateButtons();
        pack();
        setLocationRelativeTo(null); //to center the frame
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpDate = new javax.swing.ButtonGroup();
        btnGrpLocation = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        showtime = new javax.swing.JLabel();
        showtimeOption = new javax.swing.JComboBox<>();
        date = new javax.swing.JLabel();
        date3 = new javax.swing.JRadioButton();
        date6 = new javax.swing.JRadioButton();
        date2 = new javax.swing.JRadioButton();
        date5 = new javax.swing.JRadioButton();
        date1 = new javax.swing.JRadioButton();
        date4 = new javax.swing.JRadioButton();
        next = new javax.swing.JButton();
        moviePanel = new javax.swing.JPanel();
        moviesLabel = new javax.swing.JLabel();
        prev = new javax.swing.JButton();
        movieHeading = new javax.swing.JLabel();
        movieNameLabel = new javax.swing.JLabel();
        nexthp = new javax.swing.JButton();
        location4 = new javax.swing.JRadioButton();
        location8 = new javax.swing.JRadioButton();
        location3 = new javax.swing.JRadioButton();
        location2 = new javax.swing.JRadioButton();
        location7 = new javax.swing.JRadioButton();
        location6 = new javax.swing.JRadioButton();
        location10 = new javax.swing.JRadioButton();
        location9 = new javax.swing.JRadioButton();
        location5 = new javax.swing.JRadioButton();
        location1 = new javax.swing.JRadioButton();
        location = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        location11 = new javax.swing.JRadioButton();
        location12 = new javax.swing.JRadioButton();

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
        setBounds(new java.awt.Rectangle(100, 100, 1600, 9000));
        setName("home page"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(1600, 900));
        jPanel1.setMinimumSize(new java.awt.Dimension(1600, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(1600, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showtime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showtime.setForeground(new java.awt.Color(142, 217, 115));
        showtime.setText("SELECT A SHOWTIME");
        jPanel1.add(showtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 420, -1, -1));

        showtimeOption.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        showtimeOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:15 AM", "11: 30 AM", "12:45 PM", "1:00 PM", "3:15 PM" }));
        jPanel1.add(showtimeOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 470, 195, -1));

        date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(142, 217, 115));
        date.setText("SELECT A DATE");
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        date3.setBackground(new java.awt.Color(0, 0, 0));
        date3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date3.setForeground(new java.awt.Color(255, 255, 255));
        date3.setText("November 24, SUN");
        date3.setFocusPainted(false);
        date3.setName("date3"); // NOI18N
        date3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date3ActionPerformed(evt);
            }
        });
        jPanel1.add(date3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, -1, -1));

        date6.setBackground(new java.awt.Color(0, 0, 0));
        date6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date6.setForeground(new java.awt.Color(255, 255, 255));
        date6.setText("November 27, TUE");
        date6.setFocusPainted(false);
        date6.setName("date6"); // NOI18N
        date6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date6ActionPerformed(evt);
            }
        });
        jPanel1.add(date6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, -1, -1));

        date2.setBackground(new java.awt.Color(0, 0, 0));
        date2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date2.setForeground(new java.awt.Color(255, 255, 255));
        date2.setText("November 23, SAT");
        date2.setFocusPainted(false);
        date2.setName("date2"); // NOI18N
        date2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date2ActionPerformed(evt);
            }
        });
        jPanel1.add(date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));

        date5.setBackground(new java.awt.Color(0, 0, 0));
        date5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date5.setForeground(new java.awt.Color(255, 255, 255));
        date5.setText("November 26, TUE");
        date5.setFocusPainted(false);
        date5.setName("date5"); // NOI18N
        date5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date5ActionPerformed(evt);
            }
        });
        jPanel1.add(date5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, -1, -1));

        date1.setBackground(new java.awt.Color(0, 0, 0));
        date1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date1.setForeground(new java.awt.Color(255, 255, 255));
        date1.setText("November 22, FRI");
        date1.setFocusPainted(false);
        date1.setName("date1"); // NOI18N
        date1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date1ActionPerformed(evt);
            }
        });
        jPanel1.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        date4.setBackground(new java.awt.Color(0, 0, 0));
        date4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date4.setForeground(new java.awt.Color(255, 255, 255));
        date4.setText("November 25, MON");
        date4.setFocusPainted(false);
        date4.setName("date4"); // NOI18N
        date4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date4ActionPerformed(evt);
            }
        });
        jPanel1.add(date4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 220, -1));

        next.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        next.setText(">");
        next.setToolTipText("NEXT");
        next.setFocusPainted(false);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 220, -1, -1));

        moviesLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout moviePanelLayout = new javax.swing.GroupLayout(moviePanel);
        moviePanel.setLayout(moviePanelLayout);
        moviePanelLayout.setHorizontalGroup(
            moviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(moviesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        moviePanelLayout.setVerticalGroup(
            moviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(moviesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );

        jPanel1.add(moviePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, -1, -1));

        prev.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prev.setText("<");
        prev.setToolTipText("PREVIOUS");
        prev.setFocusPainted(false);
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });
        jPanel1.add(prev, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, -1, -1));

        movieHeading.setBackground(new java.awt.Color(204, 204, 204));
        movieHeading.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        movieHeading.setForeground(new java.awt.Color(142, 217, 115));
        movieHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movieHeading.setText("MOVIES");
        jPanel1.add(movieHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, -1, -1));

        movieNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        movieNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        movieNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movieNameLabel.setText("name");
        jPanel1.add(movieNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 232, 24));

        nexthp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nexthp.setText("NEXT");
        nexthp.setFocusPainted(false);
        nexthp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nexthpActionPerformed(evt);
            }
        });
        jPanel1.add(nexthp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 810, 142, 33));

        location4.setBackground(new java.awt.Color(0, 0, 0));
        location4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        location4.setForeground(new java.awt.Color(255, 255, 255));
        location4.setText("Mid Valley Megamall, KL");
        location4.setFocusPainted(false);
        location4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                location4ActionPerformed(evt);
            }
        });
        jPanel1.add(location4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 710, -1, -1));

        location8.setBackground(new java.awt.Color(0, 0, 0));
        location8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        location8.setForeground(new java.awt.Color(255, 255, 255));
        location8.setText("Ipoh Parade Mall, Ipoh");
        location8.setFocusPainted(false);
        jPanel1.add(location8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 660, -1, -1));

        location3.setBackground(new java.awt.Color(0, 0, 0));
        location3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        location3.setForeground(new java.awt.Color(255, 255, 255));
        location3.setText("MyTOWN, Kuala Lumpur");
        location3.setFocusPainted(false);
        location3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                location3ActionPerformed(evt);
            }
        });
        jPanel1.add(location3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 760, -1, -1));

        location2.setBackground(new java.awt.Color(0, 0, 0));
        location2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        location2.setForeground(new java.awt.Color(255, 255, 255));
        location2.setText("IOI City Mall, Putrajaya (New Wing)");
        location2.setFocusPainted(false);
        location2.setName(""); // NOI18N
        jPanel1.add(location2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 710, -1, -1));

        location7.setBackground(new java.awt.Color(0, 0, 0));
        location7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        location7.setForeground(new java.awt.Color(255, 255, 255));
        location7.setText("AmanJaya Mall, Sg Petani");
        location7.setFocusPainted(false);
        jPanel1.add(location7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 660, -1, -1));

        location6.setBackground(new java.awt.Color(0, 0, 0));
        location6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        location6.setForeground(new java.awt.Color(255, 255, 255));
        location6.setText("1 Utama (OU), Petaling Jaya");
        location6.setFocusPainted(false);
        location6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                location6ActionPerformed(evt);
            }
        });
        jPanel1.add(location6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 660, -1, -1));

        location10.setBackground(new java.awt.Color(0, 0, 0));
        location10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        location10.setForeground(new java.awt.Color(255, 255, 255));
        location10.setText("IMAGO Mall, KK");
        location10.setFocusPainted(false);
        jPanel1.add(location10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 710, -1, -1));

        location9.setBackground(new java.awt.Color(0, 0, 0));
        location9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        location9.setForeground(new java.awt.Color(255, 255, 255));
        location9.setText("Paradigm Mall, JB");
        location9.setFocusPainted(false);
        jPanel1.add(location9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 760, -1, -1));

        location5.setBackground(new java.awt.Color(0, 0, 0));
        location5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        location5.setForeground(new java.awt.Color(255, 255, 255));
        location5.setText("Lalaport BBCC, KL");
        location5.setFocusPainted(false);
        jPanel1.add(location5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 710, -1, 20));

        location1.setBackground(new java.awt.Color(0, 0, 0));
        location1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        location1.setForeground(new java.awt.Color(255, 255, 255));
        location1.setText("IOI City Mall, Putrajaya");
        location1.setFocusPainted(false);
        jPanel1.add(location1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 660, -1, -1));

        location.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        location.setForeground(new java.awt.Color(142, 217, 115));
        location.setText("SELECT A THEATRE LOCATION");
        jPanel1.add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, -1, -1));

        logout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logout.setText("[ < ]");
        logout.setToolTipText("LOGOUT");
        logout.setFocusPainted(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("username");
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 185, -1));

        location11.setBackground(new java.awt.Color(0, 0, 0));
        location11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        location11.setForeground(new java.awt.Color(255, 255, 255));
        location11.setText("East Cost Mall,Kuantan");
        location11.setFocusPainted(false);
        location11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                location11ActionPerformed(evt);
            }
        });
        jPanel1.add(location11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 760, -1, -1));

        location12.setBackground(new java.awt.Color(0, 0, 0));
        location12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        location12.setForeground(new java.awt.Color(255, 255, 255));
        location12.setText("Kuantan City Mall");
        location12.setFocusPainted(false);
        location12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                location12ActionPerformed(evt);
            }
        });
        jPanel1.add(location12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 760, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
        showPrevImage(); //show previous image
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
        selectedMovie = movieNames[currentIndex]; // to get movie name and movie images

        // get the selected date
        String selectedDate = null;
        for (Enumeration<AbstractButton> buttons = btnGrpDate.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                selectedDate = button.getText();
                break;
            }
        }

        // get the selected showtime
        selectedShowtime = (String) showtimeOption.getSelectedItem();

        // get the selected location
        String selectedLocation = null;
        for (Enumeration<AbstractButton> buttons = btnGrpLocation.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                selectedLocation = button.getText();
                break;
            }
        }
        
        // if user hasn't select for all required fields
        if (selectedMovie == null || selectedDate == null || selectedLocation == null || selectedShowtime == null) {
            JOptionPane.showMessageDialog(this, "Please fill out all the fields.", "Selection Required", JOptionPane.ERROR_MESSAGE);
        
        } else{
            this.dispose();
            payment pay = new payment(selectedMovie, selectedDate, selectedShowtime, selectedLocation); //fix this so that it will direct to seating page
            pay.setVisible(true);
        }
    }//GEN-LAST:event_nexthpActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.dispose(); //this: component; syntax to close this frame when user click logout button
        KSSCinema login = new KSSCinema(); // go to login/signup page
        login.frame.setVisible(true); //make the login frame visible
    }//GEN-LAST:event_logoutActionPerformed

    private void date4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date4ActionPerformed

    private void location6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_location6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_location6ActionPerformed

    private void location3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_location3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_location3ActionPerformed

    private void date3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date3ActionPerformed

    private void date6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date6ActionPerformed

    private void date2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date2ActionPerformed

    private void date5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date5ActionPerformed

    private void location11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_location11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_location11ActionPerformed

    private void location12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_location12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_location12ActionPerformed

    private void showPrevImage() { //to change movie image when click previous
        currentIndex = (currentIndex - 1 + imagepaths.length) % imagepaths.length; //to ensure the current index is still in the range
        updateMovie();
    }
    
    private void showNextImage() { //to change movie image when click next
        currentIndex = (currentIndex + 1) % imagepaths.length; //to ensure the current index is still in the range
        updateMovie();
    }
    
    private void updateMovie() {
        
        //set size for the movie image
        int width = 216;
        int height = 286;

        // load and resize the image 
        ImageIcon icon = new ImageIcon(imagepaths[currentIndex]);
        Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        moviesLabel.setIcon(new ImageIcon(scaledImage));
        
        movieNameLabel.setText(movieNames[currentIndex]); //movie's name according to the movie image
    }
    
    private void setDateButtons() {
        //to get real-time date
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM dd, EEEE");
        LocalDate currentDate = LocalDate.now(); JRadioButton[] dateButtons = {date1, date2, date3, date4, date5, date6};
        for (int i = 0; i < dateButtons.length; i++) { 
            LocalDate date = currentDate.plusDays(i);
            dateButtons[i].setText(date.format(dateFormatter)); 
        } 
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel location;
    private javax.swing.JRadioButton location1;
    private javax.swing.JRadioButton location10;
    private javax.swing.JRadioButton location11;
    private javax.swing.JRadioButton location12;
    private javax.swing.JRadioButton location2;
    private javax.swing.JRadioButton location3;
    private javax.swing.JRadioButton location4;
    private javax.swing.JRadioButton location5;
    private javax.swing.JRadioButton location6;
    private javax.swing.JRadioButton location7;
    private javax.swing.JRadioButton location8;
    private javax.swing.JRadioButton location9;
    private javax.swing.JButton logout;
    private javax.swing.JLabel movieHeading;
    private javax.swing.JLabel movieNameLabel;
    private javax.swing.JPanel moviePanel;
    private javax.swing.JLabel moviesLabel;
    private javax.swing.JButton next;
    private javax.swing.JButton nexthp;
    private javax.swing.JButton prev;
    private javax.swing.JLabel showtime;
    private javax.swing.JComboBox<String> showtimeOption;
    public javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}