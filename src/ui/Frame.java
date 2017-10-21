package ui;

import javax.ws.rs.core.MediaType;
import entities.Product;
import rest.RESTController;
import util.StringFormatter;

/**
 *
 * @author Idar
 */
public class Frame extends javax.swing.JFrame {
    
    private Product product;

    /**
     * Creates new form Frame
     */
    public Frame() {
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

        auctionButtons = new javax.swing.ButtonGroup();
        mimeButtons = new javax.swing.ButtonGroup();
        scrollWindow = new javax.swing.JScrollPane();
        outputWindow = new javax.swing.JTextArea();
        tabs = new javax.swing.JTabbedPane();
        postPanel = new javax.swing.JPanel();
        postNameLabel = new javax.swing.JLabel();
        postNameField = new javax.swing.JTextField();
        postPictureLabel = new javax.swing.JLabel();
        postPictureField = new javax.swing.JTextField();
        postFeaturesLabel = new javax.swing.JLabel();
        postFeaturesField = new javax.swing.JTextField();
        postRatingLabel = new javax.swing.JLabel();
        postStatusLabel = new javax.swing.JLabel();
        postRatingField = new javax.swing.JTextField();
        postDeadlineLabel = new javax.swing.JLabel();
        postDeadlineField = new javax.swing.JTextField();
        postCustomerLabel = new javax.swing.JLabel();
        postCustomerField = new javax.swing.JTextField();
        postStatusDropdown = new javax.swing.JComboBox<>();
        getPanel = new javax.swing.JPanel();
        showAllButton = new javax.swing.JRadioButton();
        showSingleButton = new javax.swing.JRadioButton();
        getIdLabel = new javax.swing.JLabel();
        getIdField = new javax.swing.JTextField();
        putPanel = new javax.swing.JPanel();
        putIdLabel = new javax.swing.JLabel();
        putIdField = new javax.swing.JTextField();
        putNameLabel = new javax.swing.JLabel();
        putNameField = new javax.swing.JTextField();
        putPictureLabel = new javax.swing.JLabel();
        putPictureField = new javax.swing.JTextField();
        putFeaturesLabel = new javax.swing.JLabel();
        putFeaturesField = new javax.swing.JTextField();
        putRatingLabel = new javax.swing.JLabel();
        putStatusLabel = new javax.swing.JLabel();
        putRatingField = new javax.swing.JTextField();
        putDeadlineLabel = new javax.swing.JLabel();
        putDeadlineField = new javax.swing.JTextField();
        putCustomerLabel = new javax.swing.JLabel();
        putCustomerField = new javax.swing.JTextField();
        putStatusDropdown = new javax.swing.JComboBox<>();
        deletePanel = new javax.swing.JPanel();
        deleteIdLabel = new javax.swing.JLabel();
        deleteIdField = new javax.swing.JTextField();
        settingsPanel = new javax.swing.JPanel();
        xmlButton = new javax.swing.JRadioButton();
        jsonButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        outputWindow.setColumns(20);
        outputWindow.setRows(5);
        scrollWindow.setViewportView(outputWindow);

        postNameLabel.setText("Name");

        postPictureLabel.setText("Picture");

        postPictureField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postPictureFieldActionPerformed(evt);
            }
        });

        postFeaturesLabel.setText("Features");

        postFeaturesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postFeaturesFieldActionPerformed(evt);
            }
        });

        postRatingLabel.setText("Rating");

        postStatusLabel.setText("Status");

        postRatingField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postRatingFieldActionPerformed(evt);
            }
        });

        postDeadlineLabel.setText("Deadline");

        postCustomerLabel.setText("Customer ID");

        postStatusDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unpublished", "Published", "Sold" }));

        javax.swing.GroupLayout postPanelLayout = new javax.swing.GroupLayout(postPanel);
        postPanel.setLayout(postPanelLayout);
        postPanelLayout.setHorizontalGroup(
            postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(postPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(postPanelLayout.createSequentialGroup()
                        .addComponent(postNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(postNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, postPanelLayout.createSequentialGroup()
                        .addComponent(postPictureLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(postPictureField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(postPanelLayout.createSequentialGroup()
                        .addComponent(postFeaturesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(postFeaturesField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, postPanelLayout.createSequentialGroup()
                        .addGroup(postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(postCustomerLabel)
                            .addComponent(postDeadlineLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(postDeadlineField)
                            .addComponent(postCustomerField, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, postPanelLayout.createSequentialGroup()
                        .addGroup(postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(postRatingLabel)
                            .addComponent(postStatusLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(postStatusDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(postRatingField, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))))
                .addContainerGap())
        );
        postPanelLayout.setVerticalGroup(
            postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(postPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postPictureField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postPictureLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postFeaturesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postFeaturesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postRatingLabel)
                    .addComponent(postRatingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postStatusLabel)
                    .addComponent(postStatusDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postDeadlineLabel)
                    .addComponent(postDeadlineField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postCustomerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postCustomerLabel))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        tabs.addTab("POST", postPanel);

        auctionButtons.add(showAllButton);
        showAllButton.setSelected(true);
        showAllButton.setText("Show all auctions");
        showAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllButtonActionPerformed(evt);
            }
        });

        auctionButtons.add(showSingleButton);
        showSingleButton.setText("Show a single auction");
        showSingleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSingleButtonActionPerformed(evt);
            }
        });

        getIdLabel.setText("Product ID");
        getIdLabel.setEnabled(false);

        getIdField.setEnabled(false);
        getIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getIdFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout getPanelLayout = new javax.swing.GroupLayout(getPanel);
        getPanel.setLayout(getPanelLayout);
        getPanelLayout.setHorizontalGroup(
            getPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(getPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(getPanelLayout.createSequentialGroup()
                        .addComponent(getIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(getIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(getPanelLayout.createSequentialGroup()
                        .addGroup(getPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showSingleButton)
                            .addComponent(showAllButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        getPanelLayout.setVerticalGroup(
            getPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showAllButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showSingleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(getPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getIdLabel))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        tabs.addTab("GET", getPanel);

        putIdLabel.setText("Product ID");

        putIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putIdFieldActionPerformed(evt);
            }
        });

        putNameLabel.setText("Name");

        putPictureLabel.setText("Picture");

        putPictureField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putPictureFieldActionPerformed(evt);
            }
        });

        putFeaturesLabel.setText("Features");

        putFeaturesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putFeaturesFieldActionPerformed(evt);
            }
        });

        putRatingLabel.setText("Rating");

        putStatusLabel.setText("Status");

        putRatingField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putRatingFieldActionPerformed(evt);
            }
        });

        putDeadlineLabel.setText("Deadline");

        putCustomerLabel.setText("Customer ID");

        putStatusDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unpublished", "Published", "Sold" }));

        javax.swing.GroupLayout putPanelLayout = new javax.swing.GroupLayout(putPanel);
        putPanel.setLayout(putPanelLayout);
        putPanelLayout.setHorizontalGroup(
            putPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(putPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(putPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(putPanelLayout.createSequentialGroup()
                        .addComponent(putIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(putIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(putPanelLayout.createSequentialGroup()
                        .addComponent(putNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(putNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, putPanelLayout.createSequentialGroup()
                        .addComponent(putPictureLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(putPictureField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(putPanelLayout.createSequentialGroup()
                        .addComponent(putFeaturesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(putFeaturesField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, putPanelLayout.createSequentialGroup()
                        .addGroup(putPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(putStatusLabel)
                            .addComponent(putRatingLabel)
                            .addComponent(putDeadlineLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(putPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(putRatingField, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(putDeadlineField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(putStatusDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, putPanelLayout.createSequentialGroup()
                        .addComponent(putCustomerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(putCustomerField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        putPanelLayout.setVerticalGroup(
            putPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(putPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(putPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(putIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(putIdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(putPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(putNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(putNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(putPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(putPictureField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(putPictureLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(putPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(putFeaturesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(putFeaturesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(putPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(putRatingLabel)
                    .addComponent(putRatingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(putPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(putStatusLabel)
                    .addComponent(putStatusDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(putPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(putDeadlineLabel)
                    .addComponent(putDeadlineField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(putPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(putCustomerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(putCustomerLabel))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tabs.addTab("PUT", putPanel);

        deleteIdLabel.setText("Product ID");

        deleteIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteIdFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deletePanelLayout = new javax.swing.GroupLayout(deletePanel);
        deletePanel.setLayout(deletePanelLayout);
        deletePanelLayout.setHorizontalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteIdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(deleteIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteIdLabel))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        tabs.addTab("DELETE", deletePanel);

        mimeButtons.add(xmlButton);
        xmlButton.setSelected(true);
        xmlButton.setText("XML");

        mimeButtons.add(jsonButton);
        jsonButton.setText("JSON");

        jLabel1.setText("Use the following MIME type:");

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xmlButton)
                    .addComponent(jsonButton)
                    .addComponent(jLabel1))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(xmlButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsonButton)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        tabs.addTab("SETTINGS", settingsPanel);

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(submitButton)
                    .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollWindow, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollWindow)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitButton)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getIdFieldActionPerformed

    private void deleteIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteIdFieldActionPerformed

    private void postPictureFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postPictureFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postPictureFieldActionPerformed

    private void postFeaturesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postFeaturesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postFeaturesFieldActionPerformed

    private void postRatingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postRatingFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postRatingFieldActionPerformed

    private void putIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_putIdFieldActionPerformed

    private void putFeaturesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putFeaturesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_putFeaturesFieldActionPerformed

    private void putRatingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putRatingFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_putRatingFieldActionPerformed

    private void putPictureFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putPictureFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_putPictureFieldActionPerformed

    private void showAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllButtonActionPerformed
        getIdLabel.setEnabled(false);
        getIdField.setEnabled(false);
    }//GEN-LAST:event_showAllButtonActionPerformed

    private void showSingleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSingleButtonActionPerformed
        getIdLabel.setEnabled(true);
        getIdField.setEnabled(true);
    }//GEN-LAST:event_showSingleButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        int page = tabs.getSelectedIndex();
        String mediaType = xmlButton.isSelected() ? MediaType.APPLICATION_XML : MediaType.APPLICATION_JSON;
        switch (page) {
            case 0:
                // Not implemented
                break;
            case 1:
                String id = null;
                if (showSingleButton.isSelected()) {
                    id = getIdField.getText();
                }
                String text = RESTController.get(id, mediaType);
                text = StringFormatter.format(text, 4, mediaType);
                outputWindow.setText(text);
                outputWindow.setCaretPosition(0);
                break;
            case 2:
                // Not implemented
                break;
            case 3:
                // Not implemented
                break;
            default:
                break;
        }
    }//GEN-LAST:event_submitButtonActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         *
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        */
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup auctionButtons;
    private javax.swing.JTextField deleteIdField;
    private javax.swing.JLabel deleteIdLabel;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JTextField getIdField;
    private javax.swing.JLabel getIdLabel;
    private javax.swing.JPanel getPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jsonButton;
    private javax.swing.ButtonGroup mimeButtons;
    private javax.swing.JTextArea outputWindow;
    private javax.swing.JTextField postCustomerField;
    private javax.swing.JLabel postCustomerLabel;
    private javax.swing.JTextField postDeadlineField;
    private javax.swing.JLabel postDeadlineLabel;
    private javax.swing.JTextField postFeaturesField;
    private javax.swing.JLabel postFeaturesLabel;
    private javax.swing.JTextField postNameField;
    private javax.swing.JLabel postNameLabel;
    private javax.swing.JPanel postPanel;
    private javax.swing.JTextField postPictureField;
    private javax.swing.JLabel postPictureLabel;
    private javax.swing.JTextField postRatingField;
    private javax.swing.JLabel postRatingLabel;
    private javax.swing.JComboBox<String> postStatusDropdown;
    private javax.swing.JLabel postStatusLabel;
    private javax.swing.JTextField putCustomerField;
    private javax.swing.JLabel putCustomerLabel;
    private javax.swing.JTextField putDeadlineField;
    private javax.swing.JLabel putDeadlineLabel;
    private javax.swing.JTextField putFeaturesField;
    private javax.swing.JLabel putFeaturesLabel;
    private javax.swing.JTextField putIdField;
    private javax.swing.JLabel putIdLabel;
    private javax.swing.JTextField putNameField;
    private javax.swing.JLabel putNameLabel;
    private javax.swing.JPanel putPanel;
    private javax.swing.JTextField putPictureField;
    private javax.swing.JLabel putPictureLabel;
    private javax.swing.JTextField putRatingField;
    private javax.swing.JLabel putRatingLabel;
    private javax.swing.JComboBox<String> putStatusDropdown;
    private javax.swing.JLabel putStatusLabel;
    private javax.swing.JScrollPane scrollWindow;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JRadioButton showAllButton;
    private javax.swing.JRadioButton showSingleButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JRadioButton xmlButton;
    // End of variables declaration//GEN-END:variables
}