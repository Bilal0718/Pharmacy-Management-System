package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import static main.Login.id;

public class Pharmacy extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res = null;
    static int ex;
    User user;
    Company comp;
    static Drug drug;
    Buy_Drug buy;
    Date d;
    SimpleDateFormat dd;
    static String to;
    static String from;
    static String text;
    static String almost_expired_bar;
    static String expired_bar;

    public Pharmacy() {
        initComponents();
        con = Connect.connect();
        showDate();
        expiredUpdate();
        buttonvis();
        user = new User();
        drug = new Drug();
        comp = new Company();
        buy = new Buy_Drug();
        loginas();
        warning();
        login_as();
        //alert_message();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        today = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        username1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userB = new javax.swing.JButton();
        drugs = new javax.swing.JButton();
        adduser = new javax.swing.JButton();
        deleteuser = new javax.swing.JButton();
        updateuser = new javax.swing.JButton();
        adddrug = new javax.swing.JButton();
        deletedrug = new javax.swing.JButton();
        updatedrug = new javax.swing.JButton();
        searchdrug = new javax.swing.JButton();
        drugdetails = new javax.swing.JButton();
        addcom = new javax.swing.JButton();
        deletecom = new javax.swing.JButton();
        movedrug = new javax.swing.JButton();
        setting = new javax.swing.JButton();
        changepass = new javax.swing.JButton();
        company = new javax.swing.JButton();
        editprice = new javax.swing.JButton();
        purchase = new javax.swing.JButton();
        renew_validate = new javax.swing.JButton();
        buydrug = new javax.swing.JButton();
        updatedeals = new javax.swing.JButton();
        alldeals = new javax.swing.JButton();
        sales = new javax.swing.JButton();
        salesbill = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        shiftsales = new javax.swing.JButton();
        druglist = new javax.swing.JButton();
        expired1 = new javax.swing.JButton();
        almost = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pharmacy Management System");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pharmacy Management");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Time");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Today");

        time.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        time.setForeground(new java.awt.Color(204, 0, 0));
        time.setText("00:00:00");

        today.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        today.setForeground(new java.awt.Color(204, 0, 0));
        today.setText("00-00-0000");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jButton1.setToolTipText("Logout");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(204, 0, 0));
        username.setText("ADMIN/EMPLOYEE");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Login As: ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("User Name: ");

        username1.setBackground(new java.awt.Color(255, 255, 255));
        username1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username1.setForeground(new java.awt.Color(204, 0, 0));
        username1.setText("Login As ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("(Admin)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(username1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(username)))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(103, 103, 103)))
                .addGap(116, 116, 116)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(today, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(149, 149, 149)
                        .addComponent(jLabel3)
                        .addGap(94, 94, 94))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(username))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(username1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(today))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1220, 80);

        userB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userB.setForeground(new java.awt.Color(0, 51, 51));
        userB.setText("User");
        userB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userBActionPerformed(evt);
            }
        });
        jPanel1.add(userB);
        userB.setBounds(1050, 100, 140, 34);

        drugs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        drugs.setForeground(new java.awt.Color(0, 51, 51));
        drugs.setText("Drugs");
        drugs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugsActionPerformed(evt);
            }
        });
        jPanel1.add(drugs);
        drugs.setBounds(860, 100, 150, 34);

        adduser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        adduser.setText("Add User");
        adduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adduserActionPerformed(evt);
            }
        });
        jPanel1.add(adduser);
        adduser.setBounds(1050, 150, 140, 22);

        deleteuser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteuser.setText("Delete User");
        deleteuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteuserActionPerformed(evt);
            }
        });
        jPanel1.add(deleteuser);
        deleteuser.setBounds(1050, 190, 140, 22);

        updateuser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateuser.setText("Update User");
        updateuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateuserActionPerformed(evt);
            }
        });
        jPanel1.add(updateuser);
        updateuser.setBounds(1050, 230, 140, 22);

        adddrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        adddrug.setText("Add Drug");
        adddrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddrugActionPerformed(evt);
            }
        });
        jPanel1.add(adddrug);
        adddrug.setBounds(860, 150, 150, 22);

        deletedrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deletedrug.setText("Delete Drug");
        deletedrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletedrugActionPerformed(evt);
            }
        });
        jPanel1.add(deletedrug);
        deletedrug.setBounds(860, 190, 150, 22);

        updatedrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updatedrug.setText("Update Drug");
        updatedrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatedrugActionPerformed(evt);
            }
        });
        jPanel1.add(updatedrug);
        updatedrug.setBounds(860, 230, 150, 22);

        searchdrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchdrug.setText("Search Drug");
        searchdrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchdrugActionPerformed(evt);
            }
        });
        jPanel1.add(searchdrug);
        searchdrug.setBounds(860, 270, 150, 22);

        drugdetails.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        drugdetails.setForeground(new java.awt.Color(0, 51, 51));
        drugdetails.setText("Drug Details");
        drugdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugdetailsActionPerformed(evt);
            }
        });
        jPanel1.add(drugdetails);
        drugdetails.setBounds(670, 100, 150, 34);

        addcom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addcom.setText("Add");
        addcom.setActionCommand("Add Company");
        addcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcomActionPerformed(evt);
            }
        });
        jPanel1.add(addcom);
        addcom.setBounds(188, 154, 118, 22);

        deletecom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deletecom.setText("Delete");
        deletecom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletecomActionPerformed(evt);
            }
        });
        jPanel1.add(deletecom);
        deletecom.setBounds(188, 195, 118, 22);

        movedrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        movedrug.setText("Drugs List");
        movedrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movedrugActionPerformed(evt);
            }
        });
        jPanel1.add(movedrug);
        movedrug.setBounds(860, 310, 150, 22);

        setting.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        setting.setForeground(new java.awt.Color(0, 51, 51));
        setting.setText("Setting");
        setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingActionPerformed(evt);
            }
        });
        jPanel1.add(setting);
        setting.setBounds(10, 102, 141, 34);

        changepass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        changepass.setText("Change Password");
        changepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepassActionPerformed(evt);
            }
        });
        jPanel1.add(changepass);
        changepass.setBounds(10, 150, 139, 22);

        company.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        company.setText("Company");
        company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyActionPerformed(evt);
            }
        });
        jPanel1.add(company);
        company.setBounds(188, 102, 118, 34);

        editprice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editprice.setText("Edit Prices");
        editprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpriceActionPerformed(evt);
            }
        });
        jPanel1.add(editprice);
        editprice.setBounds(670, 150, 150, 22);

        purchase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purchase.setForeground(new java.awt.Color(0, 51, 51));
        purchase.setText("Purchases");
        purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseActionPerformed(evt);
            }
        });
        jPanel1.add(purchase);
        purchase.setBounds(520, 100, 130, 34);

        renew_validate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        renew_validate.setText("Renew Validity");
        renew_validate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renew_validateActionPerformed(evt);
            }
        });
        jPanel1.add(renew_validate);
        renew_validate.setBounds(670, 230, 150, 22);

        buydrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buydrug.setText("Buy Drugs");
        buydrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buydrugActionPerformed(evt);
            }
        });
        jPanel1.add(buydrug);
        buydrug.setBounds(520, 150, 130, 22);

        updatedeals.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updatedeals.setText("Update Deals");
        updatedeals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatedealsActionPerformed(evt);
            }
        });
        jPanel1.add(updatedeals);
        updatedeals.setBounds(520, 190, 130, 22);

        alldeals.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        alldeals.setText("All Deals");
        alldeals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alldealsActionPerformed(evt);
            }
        });
        jPanel1.add(alldeals);
        alldeals.setBounds(520, 230, 130, 22);

        sales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sales.setForeground(new java.awt.Color(0, 51, 51));
        sales.setText("Sales");
        sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesActionPerformed(evt);
            }
        });
        jPanel1.add(sales);
        sales.setBounds(338, 102, 150, 34);

        salesbill.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        salesbill.setText("Sales Bill");
        salesbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesbillActionPerformed(evt);
            }
        });
        jPanel1.add(salesbill);
        salesbill.setBounds(338, 154, 150, 22);

        logout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(10, 190, 141, 22);

        shiftsales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        shiftsales.setText("Shift Sales");
        shiftsales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftsalesActionPerformed(evt);
            }
        });
        jPanel1.add(shiftsales);
        shiftsales.setBounds(338, 195, 150, 22);

        druglist.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        druglist.setText("Drugs_List");
        druglist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                druglistActionPerformed(evt);
            }
        });
        jPanel1.add(druglist);
        druglist.setBounds(0, 0, 90, 21);

        expired1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        expired1.setText("Expired Drugs");
        expired1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expired1ActionPerformed(evt);
            }
        });
        jPanel1.add(expired1);
        expired1.setBounds(670, 190, 150, 22);

        almost.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        almost.setText("Almost Finished");
        almost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almostActionPerformed(evt);
            }
        });
        jPanel1.add(almost);
        almost.setBounds(670, 270, 150, 22);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/capsules.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 80, 1200, 510);

        jMenuBar1.setToolTipText("");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1193, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1209, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void druglistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_druglistActionPerformed
        new Drug_List().setVisible(true);
    }//GEN-LAST:event_druglistActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesActionPerformed
        sales();
    }//GEN-LAST:event_salesActionPerformed

    private void expiredUpdate() {
    String dateString = "2024-01-15";
    String sql = "UPDATE drugs SET EXPIRY = 'expired' WHERE EXPIRATION_DATE < ?";
    try {
        pre = con.prepareStatement(sql);
        pre.setString(1, dateString);
        pre.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
    }
}



    private void purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseActionPerformed
        if (!username.getText().equals("Employee")) {
            enterpurchase();
        } else {
            String pass = JOptionPane.showInputDialog("You are not allowed to check user Inforamtion\nTo get in please confirm Admin Password");
            String sql = "select NAME,PASSWORD from users where NAME='Hamza' ";
            try {
                pre = con.prepareStatement(sql);
                res = pre.executeQuery();
                if (res.next()) {
                    if (res.getString("PASSWORD").equals(pass)) {
                        enterpurchase();
                    } else if (pass.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "You must write admin Password", "Failed Access", 2);
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong Password", "Failed Access", 2);
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
            }
        }
    }//GEN-LAST:event_purchaseActionPerformed

    private void editpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpriceActionPerformed
        new Edit_Price().setVisible(true);
    }//GEN-LAST:event_editpriceActionPerformed

    private void companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyActionPerformed
        company();
    }//GEN-LAST:event_companyActionPerformed

    private void changepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepassActionPerformed
        new Change_Password().setVisible(true);
    }//GEN-LAST:event_changepassActionPerformed

    private void settingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingActionPerformed
        setting();
    }//GEN-LAST:event_settingActionPerformed

    private void movedrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movedrugActionPerformed
        new Drug_List().setVisible(true);
    }//GEN-LAST:event_movedrugActionPerformed

    private void deletecomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletecomActionPerformed
        comp.setVisible(true);
        comp.save.setEnabled(false);
        comp.delete.setEnabled(true);
    }//GEN-LAST:event_deletecomActionPerformed

    private void addcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcomActionPerformed
        comp.setVisible(true);
        comp.save.setEnabled(true);
        comp.delete.setEnabled(false);
    }//GEN-LAST:event_addcomActionPerformed

    private void drugdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugdetailsActionPerformed
        enterdrugdetails();
    }//GEN-LAST:event_drugdetailsActionPerformed

    private void updatedrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatedrugActionPerformed
        drug.setVisible(true);
        drug.adddrug.setEnabled(false);
        drug.deletedrug.setEnabled(false);
        drug.updatedrug.setEnabled(true);
    }//GEN-LAST:event_updatedrugActionPerformed

    private void deletedrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletedrugActionPerformed
        drug.setVisible(true);
        drug.updatedrug.setEnabled(false);
        drug.adddrug.setEnabled(false);
        drug.deletedrug.setEnabled(true);
    }//GEN-LAST:event_deletedrugActionPerformed

    private void adddrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddrugActionPerformed
        drug.setVisible(true);
        drug.updatedrug.setEnabled(false);
        drug.deletedrug.setEnabled(false);
        drug.adddrug.setEnabled(true);
    }//GEN-LAST:event_adddrugActionPerformed

    private void updateuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateuserActionPerformed
        user.setVisible(true);
        user.deleteuser.setEnabled(false);
        user.adduser.setEnabled(false);
        user.updateuser.setEnabled(true);
        user.id.setEditable(false);
    }//GEN-LAST:event_updateuserActionPerformed

    private void deleteuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteuserActionPerformed
        user.setVisible(true);
        user.adduser.setEnabled(false);
        user.updateuser.setEnabled(false);
        user.deleteuser.setEnabled(true);
    }//GEN-LAST:event_deleteuserActionPerformed

    private void adduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adduserActionPerformed
        user.setVisible(true);
        user.deleteuser.setEnabled(false);
        user.updateuser.setEnabled(false);
        user.adduser.setEnabled(true);
    }//GEN-LAST:event_adduserActionPerformed

    private void drugsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugsActionPerformed
        enterdrugs();
    }//GEN-LAST:event_drugsActionPerformed

    private void userBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userBActionPerformed
        if (!username.getText().equals("Employee")) {
            enteruser();
        } else {
            String pass = JOptionPane.showInputDialog(null, "You are not allowed to check user Inforamtion\nTo get in please confirm Admin Password");
            String sql = "select NAME,PASSWORD from users where NAME='Hamza' ";
            try {
                pre = con.prepareStatement(sql);
                res = pre.executeQuery();
                if (res.next()) {
                    if (res.getString("PASSWORD").equals(pass)) {
                        enteruser();
                    } else if (pass.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "You must write admin Password", "Failed Access", 2);
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong Password", "Failed Access", 2);
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
            }
        }
    }//GEN-LAST:event_userBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void renew_validateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renew_validateActionPerformed
        new Renew_Validity().setVisible(true);
    }//GEN-LAST:event_renew_validateActionPerformed

    private void expired1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expired1ActionPerformed
        new Expired_Drug().setVisible(true);
    }//GEN-LAST:event_expired1ActionPerformed

    private void buydrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buydrugActionPerformed
        buy.setVisible(true);
        buy.makedeal.setEnabled(true);
        buy.update.setEnabled(false);
    }//GEN-LAST:event_buydrugActionPerformed

    private void updatedealsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatedealsActionPerformed
        buy.setVisible(true);
        buy.update.setEnabled(true);
        buy.makedeal.setEnabled(false);
    }//GEN-LAST:event_updatedealsActionPerformed

    private void alldealsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alldealsActionPerformed
        new All_Deal().setVisible(true);
    }//GEN-LAST:event_alldealsActionPerformed

    private void salesbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesbillActionPerformed
        new Sales_Bill().setVisible(true);
    }//GEN-LAST:event_salesbillActionPerformed

    private void almostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almostActionPerformed
        new Almost_Finish().setVisible(true);
    }//GEN-LAST:event_almostActionPerformed

    private void shiftsalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftsalesActionPerformed
        new Shift_Sales().setVisible(true);
    }//GEN-LAST:event_shiftsalesActionPerformed

    private void searchdrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchdrugActionPerformed
        new Search_Drug().setVisible(true);
    }//GEN-LAST:event_searchdrugActionPerformed

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
            java.util.logging.Logger.getLogger(Pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Pharmacy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcom;
    private javax.swing.JButton adddrug;
    private javax.swing.JButton adduser;
    private javax.swing.JButton alldeals;
    private javax.swing.JButton almost;
    private javax.swing.JButton buydrug;
    private javax.swing.JButton changepass;
    private javax.swing.JButton company;
    private javax.swing.JButton deletecom;
    private javax.swing.JButton deletedrug;
    private javax.swing.JButton deleteuser;
    private javax.swing.JButton drugdetails;
    private javax.swing.JButton druglist;
    private javax.swing.JButton drugs;
    private javax.swing.JButton editprice;
    private javax.swing.JButton expired1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton movedrug;
    public javax.swing.JButton purchase;
    private javax.swing.JButton renew_validate;
    private javax.swing.JButton sales;
    private javax.swing.JButton salesbill;
    private javax.swing.JButton searchdrug;
    private javax.swing.JButton setting;
    private javax.swing.JButton shiftsales;
    public static javax.swing.JLabel time;
    public static javax.swing.JLabel today;
    private javax.swing.JButton updatedeals;
    private javax.swing.JButton updatedrug;
    private javax.swing.JButton updateuser;
    public javax.swing.JButton userB;
    private javax.swing.JLabel username;
    public static javax.swing.JLabel username1;
    // End of variables declaration//GEN-END:variables
private void showDate() {
        d = new Date();
        dd = new SimpleDateFormat("dd-MM-yyyy");
        today.setText(dd.format(d));

        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date d = new Date();
                SimpleDateFormat dd = new SimpleDateFormat("hh:mm:ss a");
                time.setText(dd.format(d));
            }
        }).start();
    }

    private void buttonvis() {
        adduser.setVisible(false);
        deleteuser.setVisible(false);
        updateuser.setVisible(false);

        adddrug.setVisible(false);
        deletedrug.setVisible(false);
        updatedrug.setVisible(false);
        searchdrug.setVisible(false);
        movedrug.setVisible(false);

        editprice.setVisible(false);
        renew_validate.setVisible(false);
        expired1.setVisible(false);
        almost.setVisible(false);

        buydrug.setVisible(false);
        updatedeals.setVisible(false);
        alldeals.setVisible(false);

        salesbill.setVisible(false);
        shiftsales.setVisible(false);

        addcom.setVisible(false);
        deletecom.setVisible(false);

        changepass.setVisible(false);
        logout.setVisible(false);
    }

    private void uservis() {
        adduser.setVisible(true);
        deleteuser.setVisible(true);
        updateuser.setVisible(true);

    }

    private void enteruser() {
        userB.setEnabled(false);
        drugs.setEnabled(true);
        drugdetails.setEnabled(true);
        sales.setEnabled(true);
        purchase.setEnabled(true);
        setting.setEnabled(true);
        company.setEnabled(true);

        adduser.setVisible(true);
        deleteuser.setVisible(true);
        updateuser.setVisible(true);

        adddrug.setVisible(false);
        deletedrug.setVisible(false);
        updatedrug.setVisible(false);
        searchdrug.setVisible(false);
        movedrug.setVisible(false);

        editprice.setVisible(false);
        renew_validate.setVisible(false);
        expired1.setVisible(false);
        almost.setVisible(false);

        buydrug.setVisible(false);
        updatedeals.setVisible(false);
        alldeals.setVisible(false);

        salesbill.setVisible(false);
        shiftsales.setVisible(false);

        addcom.setVisible(false);
        deletecom.setVisible(false);

        changepass.setVisible(false);
        logout.setVisible(false);
    }

    private void enterdrugs() {
        drugs.setEnabled(false);
        userB.setEnabled(true);
        drugdetails.setEnabled(true);
        sales.setEnabled(true);
        purchase.setEnabled(true);
        setting.setEnabled(true);
        company.setEnabled(true);

        adduser.setVisible(false);
        deleteuser.setVisible(false);
        updateuser.setVisible(false);

        adddrug.setVisible(true);
        deletedrug.setVisible(true);
        updatedrug.setVisible(true);
        searchdrug.setVisible(true);
        movedrug.setVisible(true);

        editprice.setVisible(false);
        renew_validate.setVisible(false);
        expired1.setVisible(false);
        almost.setVisible(false);

        buydrug.setVisible(false);
        updatedeals.setVisible(false);
        alldeals.setVisible(false);

        salesbill.setVisible(false);
        shiftsales.setVisible(false);

        addcom.setVisible(false);
        deletecom.setVisible(false);

        changepass.setVisible(false);
        logout.setVisible(false);
    }

    private void enterdrugdetails() {
        drugdetails.setEnabled(false);
        userB.setEnabled(true);
        drugs.setEnabled(true);
        sales.setEnabled(true);
        purchase.setEnabled(true);
        setting.setEnabled(true);
        company.setEnabled(true);

        adduser.setVisible(false);
        deleteuser.setVisible(false);
        updateuser.setVisible(false);

        adddrug.setVisible(false);
        deletedrug.setVisible(false);
        updatedrug.setVisible(false);
        searchdrug.setVisible(false);
        movedrug.setVisible(false);

        editprice.setVisible(true);
        renew_validate.setVisible(true);
        expired1.setVisible(true);
        almost.setVisible(true);

        buydrug.setVisible(false);
        updatedeals.setVisible(false);
        alldeals.setVisible(false);

        salesbill.setVisible(false);
        shiftsales.setVisible(false);

        addcom.setVisible(false);
        deletecom.setVisible(false);

        changepass.setVisible(false);
        logout.setVisible(false);
    }

    private void enterpurchase() {
        purchase.setEnabled(false);
        userB.setEnabled(true);
        drugs.setEnabled(true);
        drugdetails.setEnabled(true);
        sales.setEnabled(true);
        setting.setEnabled(true);
        company.setEnabled(true);

        adduser.setVisible(false);
        deleteuser.setVisible(false);
        updateuser.setVisible(false);

        adddrug.setVisible(false);
        deletedrug.setVisible(false);
        updatedrug.setVisible(false);
        searchdrug.setVisible(false);
        movedrug.setVisible(false);

        editprice.setVisible(false);
        renew_validate.setVisible(false);
        expired1.setVisible(false);
        almost.setVisible(false);

        buydrug.setVisible(true);
        updatedeals.setVisible(true);
        alldeals.setVisible(true);

        salesbill.setVisible(false);
        shiftsales.setVisible(false);

        addcom.setVisible(false);
        deletecom.setVisible(false);

        changepass.setVisible(false);
        logout.setVisible(false);
    }

    private void sales() {
        sales.setEnabled(false);
        userB.setEnabled(true);
        drugs.setEnabled(true);
        drugdetails.setEnabled(true);
        purchase.setEnabled(true);
        setting.setEnabled(true);
        company.setEnabled(true);

        adduser.setVisible(false);
        deleteuser.setVisible(false);
        updateuser.setVisible(false);

        adddrug.setVisible(false);
        deletedrug.setVisible(false);
        updatedrug.setVisible(false);
        searchdrug.setVisible(false);
        movedrug.setVisible(false);

        editprice.setVisible(false);
        renew_validate.setVisible(false);
        expired1.setVisible(false);
        almost.setVisible(false);

        buydrug.setVisible(false);
        updatedeals.setVisible(false);
        alldeals.setVisible(false);

        salesbill.setVisible(true);
        shiftsales.setVisible(true);

        addcom.setVisible(false);
        deletecom.setVisible(false);

        changepass.setVisible(false);
        logout.setVisible(false);
    }

    private void setting() {
        setting.setEnabled(false);
        userB.setEnabled(true);
        drugs.setEnabled(true);
        drugdetails.setEnabled(true);
        sales.setEnabled(true);
        purchase.setEnabled(true);
        company.setEnabled(true);

        adduser.setVisible(false);
        deleteuser.setVisible(false);
        updateuser.setVisible(false);

        adddrug.setVisible(false);
        deletedrug.setVisible(false);
        updatedrug.setVisible(false);
        searchdrug.setVisible(false);
        movedrug.setVisible(false);

        editprice.setVisible(false);
        renew_validate.setVisible(false);
        expired1.setVisible(false);
        almost.setVisible(false);

        buydrug.setVisible(false);
        updatedeals.setVisible(false);
        alldeals.setVisible(false);

        salesbill.setVisible(false);
        shiftsales.setVisible(false);

        addcom.setVisible(false);
        deletecom.setVisible(false);

        changepass.setVisible(true);
        logout.setVisible(true);
    }

    private void company() {
        company.setEnabled(false);
        userB.setEnabled(true);
        drugs.setEnabled(true);
        drugdetails.setEnabled(true);
        sales.setEnabled(true);
        purchase.setEnabled(true);
        setting.setEnabled(true);

        adduser.setVisible(false);
        deleteuser.setVisible(false);
        updateuser.setVisible(false);

        adddrug.setVisible(false);
        deletedrug.setVisible(false);
        updatedrug.setVisible(false);
        searchdrug.setVisible(false);
        movedrug.setVisible(false);

        editprice.setVisible(false);
        renew_validate.setVisible(false);
        expired1.setVisible(false);
        almost.setVisible(false);

        buydrug.setVisible(false);
        updatedeals.setVisible(false);
        alldeals.setVisible(false);

        salesbill.setVisible(false);
        shiftsales.setVisible(false);

        addcom.setVisible(true);
        deletecom.setVisible(true);

        changepass.setVisible(false);
        logout.setVisible(false);
    }

    private void loginas() {
        String sql = "select ID,NAME from users where ID='" + Login.id.getText() + "' ";
        try {
            pre = con.prepareStatement(sql);
            res = pre.executeQuery();
            if (res.next()) {
                username1.setText(res.getString("NAME"));
                if (res.getString("ID").equals("23482")) {
                    username.setText("ADMIN");
                } else if (res.getString("ID").equals("23092")) {
                    username.setText("ADMIN");
                } else if (res.getString("ID").equals("1")) {
                    username.setText("ADMIN");
                } else {
                    username.setText("EMPLOYEE");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
        }
    }

    private void warning() {
        //check the Expiration of the drugs;

        int ex_year;
        int current_year;
        int ex_month;
        int ex_day;
        int current_month;
        int current_day;
        String sql = "select BARCODE,EXPIRATION_DATE from drugs";
        try {
            pre = con.prepareStatement(sql);
            res = pre.executeQuery();
            while (res.next()) {
                Warning warning = new Warning();
                ex_year = Integer.parseInt(res.getString("EXPIRATION_DATE").split("-")[2]);
                ex_month = Integer.parseInt(res.getString("EXPIRATION_DATE").split("-")[1]);
                ex_day = Integer.parseInt(res.getString("EXPIRATION_DATE").split("-")[0]);
                current_year = Integer.parseInt(dd.format(d).split("-")[2]);
                current_month = Integer.parseInt(dd.format(d).split("-")[1]);
                current_day = Integer.parseInt(dd.format(d).split("-")[0]);
                if (ex_year == current_year) {
                    if (ex_month - current_month == 2) {
                        ex = 1;
                        almost_expired_bar = res.getString("BARCODE");
                        warning.setVisible(true);
                    } else if (ex_month == current_month) {
                        if (ex_day == current_day) {
                            ex = 0;
                            expired_bar = res.getString("BARCODE");
                            update_to_expired();
                            warning.setVisible(true);
                        }
                    }
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
        }
    }

    private void update_to_expired() {
        String sql = "update drugs set EXPIRY='Expired' where BARCODE='" + expired_bar + "' ";
        try {
            pre = con.prepareStatement(sql);
            pre.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
        }
    }

    private void login_as() {
        Date d = new Date();
        SimpleDateFormat dd = new SimpleDateFormat("hh:mm:ss");
        String sql = "insert into login (NAME,TYPE,DATE,TIME) values ('" + username1.getText() + "' ,'" + username.getText() + "' ,'" + today.getText() + "' ,'" + dd.format(d) + "' )";
        try {
            pre = con.prepareStatement(sql);
            pre.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
        }
    }

// private void alert_message(){
//     String sql = "select MESSAGE_TO,MESSAGE_FROM,MESSAGE_TEXT from message_history where MESSAGE_TO='"+username1.getText()+"' ";
//     try{
//      pre=con.prepareStatement(sql);
//      res=pre.executeQuery();
//      if(res.next()){
//      to=res.getString("MESSAGE_TO");
//      from=res.getString("MESSAGE_FROM");
//      text=res.getString("MESSAGE_TEXT");
//      }
//     }catch(Exception e){
//  JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);       
//     }}
}
