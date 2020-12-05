package com.mycompany.zipper;

import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;

public class MainFrame extends javax.swing.JFrame {

    private JFileChooser fc;
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        initFileChooser();
        initList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filesListScrollPane = new javax.swing.JScrollPane();
        filesList = new javax.swing.JList<>();
        compressButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        filesMenu = new javax.swing.JMenu();
        openFolderMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        filesListScrollPane.setViewportView(filesList);

        compressButton.setText("Comprimir");

        filesMenu.setText("Ficheros");

        openFolderMenuItem.setText("Abrir carpeta");
        openFolderMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFolderMenuItemActionPerformed(evt);
            }
        });
        filesMenu.add(openFolderMenuItem);

        menuBar.add(filesMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filesListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(compressButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filesListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(compressButton)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openFolderMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFolderMenuItemActionPerformed
        fc.setDialogTitle("Eliga una carpeta fuente");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        // disable the "All files" option.
        fc.setAcceptAllFileFilterUsed(false);
        
        int result = fc.showOpenDialog(this);
        
        if( result == JFileChooser.APPROVE_OPTION ){
            File folder = fc.getSelectedFile();
            folder.listFiles( (file) -> file.isFile());
            
        }
    }//GEN-LAST:event_openFolderMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton compressButton;
    private javax.swing.JList<String> filesList;
    private javax.swing.JScrollPane filesListScrollPane;
    private javax.swing.JMenu filesMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openFolderMenuItem;
    // End of variables declaration//GEN-END:variables

    private void initList() {
        DefaultListModel<String> model = new DefaultListModel<String>();
        model.addElement("Abre una carpeta para ver contenido");
        this.filesList.setModel(model);
    }

    private void initFileChooser() {
        this.fc = new JFileChooser();
    }
}
