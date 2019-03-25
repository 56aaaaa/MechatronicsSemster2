package UserInterface;

/*
 * @author Team 15
 */
public class UI extends javax.swing.JFrame {

    public UI() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrameSettings = new javax.swing.JFrame();
        jLabelAbout1 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuHomesettings = new javax.swing.JMenuItem();
        jMenuSettings = new javax.swing.JMenuItem();
        jMenuAboutsettings = new javax.swing.JMenuItem();
        jFrameAbout = new javax.swing.JFrame();
        jLabelAbout = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuHomeabout = new javax.swing.JMenuItem();
        jMenuSettingsabout = new javax.swing.JMenuItem();
        jMenuAbout = new javax.swing.JMenuItem();
        exitButton = new javax.swing.JButton();
        jLabelOccupants = new javax.swing.JLabel();
        jLabelHumidity = new javax.swing.JLabel();
        jLabelWeather = new javax.swing.JLabel();
        jTextRoomTemp = new javax.swing.JTextField();
        jTextHumidity = new javax.swing.JTextField();
        jTextWeather = new javax.swing.JTextField();
        jLabelRoomTemp = new javax.swing.JLabel();
        jTextOccupants = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuHome = new javax.swing.JMenuItem();
        jMenuSettingshome = new javax.swing.JMenuItem();
        jMenuAbouthome = new javax.swing.JMenuItem();

        jLabelAbout1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelAbout1.setText("Settings");

        jMenu3.setText("Menu");

        jMenuHomesettings.setText("Home");
        jMenuHomesettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHomesettingsActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuHomesettings);

        jMenuSettings.setText("Settings");
        jMenu3.add(jMenuSettings);

        jMenuAboutsettings.setText("About");
        jMenuAboutsettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAboutsettingsActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuAboutsettings);

        jMenuBar3.add(jMenu3);

        jFrameSettings.setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout jFrameSettingsLayout = new javax.swing.GroupLayout(jFrameSettings.getContentPane());
        jFrameSettings.getContentPane().setLayout(jFrameSettingsLayout);
        jFrameSettingsLayout.setHorizontalGroup(
            jFrameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAbout1)
                .addContainerGap(301, Short.MAX_VALUE))
        );
        jFrameSettingsLayout.setVerticalGroup(
            jFrameSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAbout1)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        jLabelAbout.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelAbout.setText("About");

        jMenu2.setText("Menu");

        jMenuHomeabout.setText("Home");
        jMenuHomeabout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHomeaboutActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuHomeabout);

        jMenuSettingsabout.setText("Settings");
        jMenu2.add(jMenuSettingsabout);

        jMenuAbout.setText("About");
        jMenuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAboutActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuAbout);

        jMenuBar2.add(jMenu2);

        jFrameAbout.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jFrameAboutLayout = new javax.swing.GroupLayout(jFrameAbout.getContentPane());
        jFrameAbout.getContentPane().setLayout(jFrameAboutLayout);
        jFrameAboutLayout.setHorizontalGroup(
            jFrameAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameAboutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAbout)
                .addContainerGap(324, Short.MAX_VALUE))
        );
        jFrameAboutLayout.setVerticalGroup(
            jFrameAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameAboutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAbout)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Smart Home System");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("jFrameHome"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabelOccupants.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabelOccupants.setText("Current occupants");

        jLabelHumidity.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabelHumidity.setText("Humidity");

        jLabelWeather.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabelWeather.setText("Weather");

        jTextRoomTemp.setEditable(false);
        jTextRoomTemp.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jTextRoomTemp.setText("0");
        jTextRoomTemp.setBorder(null);

        jTextHumidity.setEditable(false);
        jTextHumidity.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jTextHumidity.setText("0");
        jTextHumidity.setBorder(null);

        jTextWeather.setEditable(false);
        jTextWeather.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jTextWeather.setText("0");
        jTextWeather.setBorder(null);

        jLabelRoomTemp.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabelRoomTemp.setText("Room Temperature");

        jTextOccupants.setEditable(false);
        jTextOccupants.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jTextOccupants.setText("0");
        jTextOccupants.setBorder(null);

        jMenu1.setText("Menu");

        jMenuHome.setText("Home");
        jMenuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHomeActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuHome);

        jMenuSettingshome.setText("Settings");
        jMenu1.add(jMenuSettingshome);

        jMenuAbouthome.setText("About");
        jMenuAbouthome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAbouthomeActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAbouthome);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelHumidity)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
                                        .addComponent(jTextHumidity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelWeather)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextWeather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelOccupants)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextOccupants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelRoomTemp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextRoomTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(81, 81, 81)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextRoomTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRoomTemp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHumidity)
                    .addComponent(jTextHumidity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWeather)
                    .addComponent(jTextWeather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOccupants)
                    .addComponent(jTextOccupants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void jMenuAbouthomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAbouthomeActionPerformed

    }//GEN-LAST:event_jMenuAbouthomeActionPerformed

    private void jMenuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHomeActionPerformed
        
    }//GEN-LAST:event_jMenuHomeActionPerformed

    private void jMenuHomeaboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHomeaboutActionPerformed
        //home button on About page
        this.setVisible(false);
        //new jFrameHome().setVisible(true);
    }//GEN-LAST:event_jMenuHomeaboutActionPerformed

    private void jMenuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAboutActionPerformed

    private void jMenuHomesettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHomesettingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuHomesettingsActionPerformed

    private void jMenuAboutsettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAboutsettingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAboutsettingsActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JFrame jFrameAbout;
    private javax.swing.JFrame jFrameSettings;
    private javax.swing.JLabel jLabelAbout;
    private javax.swing.JLabel jLabelAbout1;
    private javax.swing.JLabel jLabelHumidity;
    private javax.swing.JLabel jLabelOccupants;
    private javax.swing.JLabel jLabelRoomTemp;
    private javax.swing.JLabel jLabelWeather;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuAbout;
    private javax.swing.JMenuItem jMenuAbouthome;
    private javax.swing.JMenuItem jMenuAboutsettings;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuHome;
    private javax.swing.JMenuItem jMenuHomeabout;
    private javax.swing.JMenuItem jMenuHomesettings;
    private javax.swing.JMenuItem jMenuSettings;
    private javax.swing.JMenuItem jMenuSettingsabout;
    private javax.swing.JMenuItem jMenuSettingshome;
    private javax.swing.JTextField jTextHumidity;
    private javax.swing.JTextField jTextOccupants;
    private javax.swing.JTextField jTextRoomTemp;
    private javax.swing.JTextField jTextWeather;
    // End of variables declaration//GEN-END:variables
}
