/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasCok;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Albert
 */
public class AbsentRequest extends javax.swing.JFrame {

    /**
     * Creates new form AttendanceRequest
     */
    public AbsentRequest() {
        initComponents();
        try {
            FileReader inputFile = new FileReader(".\\src\\tugasCok\\absentRequest.txt");
            Scanner in = new Scanner(inputFile);
            String currLine;
            Scanner lineTokenizer;
            //format:Request ID;student ID;first Name;last Name; date of absent;reason
            //check take all available number and put the number into arrayList 

            String idTag = "";
            while (in.hasNext()) {
                currLine = in.nextLine();
                lineTokenizer = new Scanner(currLine);
                lineTokenizer.useDelimiter(";");
                idTag = lineTokenizer.next();
                requestComboBox.addItem(idTag);
            }

        } catch (IOException fileError) {

        }
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        requestComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        insertName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        insertId = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        insertDate = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rejectButton = new javax.swing.JButton();
        approveButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        insertModule = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.setEditable(false);

        jLabel1.setText("Change Absent to Absent with Reason");

        requestComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Student Name:");

        insertName.setText("(Name here)");

        jLabel4.setText("Student ID:");

        insertId.setText("(Id here)");

        jLabel6.setText("Date of Absent:");

        insertDate.setText("(Absent date)");

        jLabel8.setText("Request ID:");

        jLabel9.setText("Reason:");

        rejectButton.setText("Reject");
        rejectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectButtonActionPerformed(evt);
            }
        });

        approveButton.setText("Approve");
        approveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Exit");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("Module ID:");

        insertModule.setText("(Module Code)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(insertModule)
                                    .addComponent(requestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(rejectButton)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(insertId)
                                    .addComponent(insertName)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(approveButton)
                                        .addComponent(insertDate))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(CancelButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(requestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(insertModule))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(insertName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(insertId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(insertDate))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rejectButton)
                            .addComponent(approveButton))
                        .addGap(18, 18, 18)
                        .addComponent(CancelButton)
                        .addGap(27, 27, 27))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        setVisible(false);
        removeAll();
        this.dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void requestComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestComboBoxActionPerformed
        try {
            FileReader inputFile = new FileReader(".\\src\\tugasCok\\absentRequest.txt");
            Scanner in = new Scanner(inputFile);
            refreshComboBox(in);
            in.close();
            inputFile.close();
        } catch (IOException fileError) {

        }
    }//GEN-LAST:event_requestComboBoxActionPerformed

    private void approveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveButtonActionPerformed
        ApproveRequest();
    }//GEN-LAST:event_approveButtonActionPerformed
    public void ApproveRequest() {
        final JPanel panel = new JPanel();
        List<String> sessionList = new ArrayList<String>();
        try {
            FileReader inputFile = new FileReader(".\\src\\tugasCok\\absentRequest.txt");
            Scanner in = new Scanner(inputFile);
            String currLine;
            Scanner lineTokenizer;
            String absentId = "", studentId = "", firstName = "", lastName = "", dateOfAbsent = "", reason = "";
            boolean isFound = false;
            //format:Request ID;student ID;first Name;last Name; date of absent;reason
            //check take all available number and put the number into arrayList 
            int lineCount = 0;
            while (in.hasNext()) {
                currLine = in.nextLine();
                lineTokenizer = new Scanner(currLine);
                lineTokenizer.useDelimiter(";");
                absentId = lineTokenizer.next();
                if (requestComboBox.getSelectedItem().toString().compareTo(absentId) == 0) {

                    studentId = lineTokenizer.next();
                    firstName = lineTokenizer.next();
                    lastName = lineTokenizer.next();
                    dateOfAbsent = lineTokenizer.next();

                    int numberOfLine = 0;
                    String textLine = "";
                    inputFile = new FileReader(".\\src\\tugasCok\\sessionList.txt");
                    in = new Scanner(inputFile);
                    String session, lecturerID, moduleCode, moduleName, intakeCode, startTime, endTime, lectureDate, recordedStudent;

                    while (in.hasNext()) {
                        currLine = in.nextLine();
                        lineTokenizer = new Scanner(currLine);
                        lineTokenizer.useDelimiter(";");
                        session = lineTokenizer.next();
                        lecturerID = lineTokenizer.next();
                        moduleCode = lineTokenizer.next();
                        moduleName = lineTokenizer.next();
                        intakeCode = lineTokenizer.next();
                        startTime = lineTokenizer.next();
                        endTime = lineTokenizer.next();
                        lectureDate = lineTokenizer.next();
                        recordedStudent = lineTokenizer.next();
                        if (moduleCode.compareToIgnoreCase(moduleCode) == 0 && lectureDate.compareTo(dateOfAbsent) == 0) {
                            String[] splitted = recordedStudent.split(",");
                            String tempId = insertId.getText();

                            for (int x = 0; x < splitted.length; x += 4) {
                                if (tempId.compareTo(splitted[x]) == 0) {
                                    if (splitted[x + 3].compareTo("ABSENT") == 0) {
                                        splitted[x + 3] = "ABSENT_WITH_REASON";
                                        isFound = true;
                                        break;
                                    }
                                }
                            }
                            String constructSession = "";
                            for (int x = 0; x < splitted.length; x++) {
                                if (x == splitted.length - 1) {
                                    constructSession += splitted[x];
                                } else {
                                    constructSession += splitted[x] + ",";
                                }
                            }
                            recordedStudent = constructSession;
                            String savedSession = session + ";" + lecturerID + ";" + moduleCode + ";" + moduleName + ";" + intakeCode + ";";
                            savedSession += startTime + ";" + endTime + ";" + lectureDate + ";" + recordedStudent;
                            sessionList.add(savedSession);
                        } else {
                            String savedSession = session + ";" + lecturerID + ";" + moduleCode + ";" + moduleName + ";" + intakeCode + ";";
                            savedSession += startTime + ";" + endTime + ";" + lectureDate + ";" + recordedStudent;
                            sessionList.add(savedSession);
                        }
                    }

                    if (isFound) {
                        PrintWriter output = new PrintWriter(".\\src\\tugasCok\\SessionList.txt");
                        currLine = "";
                        for (int index = 0; index < sessionList.size(); index++) {
                            if (index > 0) {
                                output.append('\n');
                            }
                            output.append(sessionList.get(index));
                        }
                        inputFile.close();
                        output.close();
                        RemoveRequest();
                        JOptionPane.showMessageDialog(panel, "Attendance has changed!");

                        break;
                    }
                }
                if (isFound == false) {
                    JOptionPane.showMessageDialog(panel, "Actual absence is not found! Please ask the student to put valid absent request", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (IOException fileError) {

        }
    }
    private void rejectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectButtonActionPerformed
        boolean isFound = RemoveRequest();
        final JPanel panel = new JPanel();
        if (isFound == false) {
            JOptionPane.showMessageDialog(panel, "Request not found");
        } else {
            JOptionPane.showMessageDialog(panel, "Request rejected");
        }
    }//GEN-LAST:event_rejectButtonActionPerformed

    public boolean RemoveRequest() {
        boolean isFound = false;
        try {
            FileReader inputFile = new FileReader(".\\src\\tugasCok\\absentRequest.txt");
            Scanner in = new Scanner(inputFile);
            int numberOfLine = 0;
            String currLine = "", absentId = "";
            Scanner lineTokenizer;
            List<String> line = new ArrayList<String>();

            while (in.hasNext()) {
                currLine = in.nextLine();
                lineTokenizer = new Scanner(currLine);
                lineTokenizer.useDelimiter(";");
                absentId = lineTokenizer.next();
                if (requestComboBox.getSelectedItem().toString().compareTo(absentId) != 0) {
                    line.add(currLine);
                } else {
                    isFound = true;
                }
            }
            PrintWriter output = new PrintWriter(".\\src\\tugasCok\\absentRequest.txt");

            for (int x = 0; x < line.size(); x++) {
                if (numberOfLine > 0) {
                    output.append('\n');
                }
                output.append(line.get(x));
                numberOfLine++;
            }

            output.close();
            inputFile.close();
        } catch (IOException fileError) {

        }
        
         if (isFound == false) {
            return false;
        } else {
            return true;
        }
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
            java.util.logging.Logger.getLogger(AbsentRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbsentRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbsentRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbsentRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AbsentRequest().setVisible(true);
            }
        });
    }

    public void refreshComboBox(Scanner in) throws IOException {
        String currLine;
        Scanner lineTokenizer;
        String absentId = "", studentId = "", firstName = "", lastName = "", dateOfAbsent = "", moduleCode = "", reason = "";
        while (in.hasNext()) {
            currLine = in.nextLine();
            lineTokenizer = new Scanner(currLine);
            lineTokenizer.useDelimiter(";");
            absentId = lineTokenizer.next();
            if (requestComboBox.getSelectedItem().toString().compareTo(absentId) == 0) {
                studentId = lineTokenizer.next();
                insertId.setText(studentId);
                firstName = lineTokenizer.next();
                lastName = lineTokenizer.next();
                insertName.setText(firstName + " " + lastName);
                dateOfAbsent = lineTokenizer.next();
                insertDate.setText(dateOfAbsent);
                moduleCode = lineTokenizer.next();
                insertModule.setText(moduleCode);
                reason = lineTokenizer.next();
                jTextArea1.setText(reason);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton approveButton;
    private javax.swing.JLabel insertDate;
    private javax.swing.JLabel insertId;
    private javax.swing.JLabel insertModule;
    private javax.swing.JLabel insertName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton rejectButton;
    private javax.swing.JComboBox<String> requestComboBox;
    // End of variables declaration//GEN-END:variables
}
