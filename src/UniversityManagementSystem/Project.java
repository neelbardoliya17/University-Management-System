package UniversityManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Project extends JFrame implements ActionListener {
    Project()
    {
        setSize(1925,1020);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/campus.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1925, 920, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        JMenuBar mb=new JMenuBar();

        //new Information Added
        JMenu newInformation=new JMenu("New Information");
        newInformation.setForeground(Color.blue);
        mb.add(newInformation);


        JMenuItem facultyInfo=new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.white);
        newInformation.add(facultyInfo);


        JMenuItem studentInfo=new JMenuItem("New Student Information");
        facultyInfo.setBackground(Color.white);
        newInformation.add(studentInfo);

        //Details
        JMenu details=new JMenu("View Details");
        details.setForeground(Color.red);
        mb.add(details);


        JMenuItem facultydetails=new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.white);
        details.add(facultydetails);

        JMenuItem studentdetails=new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.white);
        details.add(studentdetails);

        //Leave
        JMenu leave=new JMenu("Apply for Leave");
        leave.setForeground(Color.blue);
        mb.add(leave);


        JMenuItem facultyleave=new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.white);
        leave.add(facultyleave);

        JMenuItem studentleave=new JMenuItem("Student Leave");
        studentleave.setBackground(Color.white);
        leave.add(studentleave);


        //Leave Details
        JMenu leavedetails=new JMenu("Leave Details");
        leavedetails.setForeground(Color.red);
        mb.add(leavedetails);


        JMenuItem facultyleavedetails=new JMenuItem("Faculty Leave Details");
        facultyleavedetails.setBackground(Color.white);
        leavedetails.add(facultyleavedetails);

        JMenuItem studentleavedetails=new JMenuItem("Student Leave Details");
        studentleavedetails.setBackground(Color.white);
        leavedetails.add(studentleavedetails);


        //Exam
        JMenu exam=new JMenu("Examination");
        exam.setForeground(Color.blue);
        mb.add(exam);


        JMenuItem exminationdetails=new JMenuItem("Examination Results");
        exminationdetails.setBackground(Color.white);
        exam.add(exminationdetails);

        JMenuItem entermarks=new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.white);
        exam.add(entermarks);

        //UpdateInfomation
        JMenu updateInfo=new JMenu("Update Details");
        updateInfo.setForeground(Color.red);
        mb.add(updateInfo);


        JMenuItem updatefacultyinfo=new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(Color.white);
        updateInfo.add(updatefacultyinfo);

        JMenuItem updatestudentinfo=new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.white);
        updateInfo.add(updatestudentinfo);

        //Fee
        JMenu fee=new JMenu("Fee Details");
        fee.setForeground(Color.blue);
        mb.add(fee);


        JMenuItem feestructure=new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.white);
        fee.add(feestructure);

        JMenuItem feeform=new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.white);
        fee.add(feeform);

        //Utility
        JMenu utility=new JMenu("Utility");
        utility.setForeground(Color.red);
        mb.add(utility);


        JMenuItem notepad=new JMenuItem("Notepad");
        notepad.setBackground(Color.white);
        notepad.addActionListener(this);
        utility.add(notepad);

        JMenuItem calc=new JMenuItem("Calculator");
        calc.setBackground(Color.white);
        calc.addActionListener(this);
        utility.add(calc);

//        JMenuItem excel=new JMenuItem("Excel");
//        excel.setBackground(Color.white);
//        excel.addActionListener(this);
//        utility.add(excel);



        //Exit
        JMenu exit=new JMenu("Exit");
        exit.setForeground(Color.blue);
        mb.add(exit);


        JMenuItem ex=new JMenuItem("Exit");
        ex.setBackground(Color.white);
        ex.addActionListener(this);
        exit.add(ex);

        setJMenuBar(mb);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String msg=e.getActionCommand();
        if(msg.equals("Exit")){
            setVisible(false);
        }
        else if(msg.equals("Calculator"))
        {
            try
            {
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception ce)
            {

            }
        }
        else if(msg.equals("Notepad"))
        {
            try
            {
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception ce)
            {

            }
        }
    }
    public static void main(String[] args) {
        new Project();
    }
}
