import javax.swing.*;
import java.awt.event.*;

public class Student extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2;
    JComboBox cb;
    JRadioButton rb1 , rb2;
    JCheckBox ch1 ,ch2 , ch3;
    JTextArea text;
    JButton Summit;


    Student(){
        JFrame f = new JFrame("Student Form");
        //Name
        JLabel l1=new JLabel("Name :");
        JTextField t1=new JTextField();
        l1.setBounds(20,20,100,30);
        t1.setBounds(100,20,100,30);
        f.add(l1);f.add(t1);

        //Mobile
        JLabel l2=new JLabel("Mobile :");
        JTextField t2=new JTextField();
        l2.setBounds(20,70,100,30);
        t2.setBounds(100,70,100,30);
        f.add(l2);f.add(t2);

        //Gender
        JLabel l3=new JLabel("Gender :");
        l3.setBounds(20, 120, 80, 30);
        rb1=new JRadioButton("Male");
        rb1.setBounds(100, 120, 80, 30);
        rb2=new JRadioButton("Female");
        rb2.setBounds(180, 120, 80, 30);

        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);bg.add(rb2);
        f.add(l3);f.add(rb1);f.add(rb2);

        //Age
        JLabel l4=new JLabel("Age: ");
        l4.setBounds(20, 170, 80, 30);
        String age[]={"18","19","20","21","22"};
        cb=new JComboBox(age);
        cb.setBounds(100, 170, 80, 30);
        f.add(l4);f.add(cb);

        //Hobby
        JLabel l5=new JLabel("Hobbies :");
        l5.setBounds(20, 220, 120, 30);
        ch1 = new JCheckBox("Drawing");
        ch1.setBounds(140, 220, 120, 30);
        ch2 = new JCheckBox("Dancing");
        ch2.setBounds(260, 220, 120, 30);
        ch3 = new JCheckBox("Sports");
        ch3.setBounds(380, 220, 80, 30);
        f.add(l5);
        f.add(ch1);f.add(ch2);f.add(ch3);

        JButton b = new JButton("Submit");
        b.setBounds(140, 280, 75, 20);
        f.add(b);

        text =new JTextArea();
        text.setBounds(30, 320, 320, 100);
        f.add(text);

        b.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setSize(600,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String Name=t1.getText();
        String Mobile=t2.getText();
        String Gender=rb1.isSelected()?" Male ":rb2.isSelected()?"Female":"-";
        String Age=cb.getItemAt(cb.getSelectedIndex()).toString();
        String Hobby = "";
        if(ch1.isSelected()){
            Hobby = "Reading";
        }
        if(ch2.isSelected()){
            Hobby=Hobby+"Dancing";
        }
        if(ch3.isSelected()){
            Hobby=Hobby+""+"Sports";
        }
        text.setText("Name: " + Name + "\n" + "Mobile Number: " + Mobile + "\n" + "Gender: " + Gender + "\n" + "AGE: "
                + Age + "\n" + "'Hobbies: " + Hobby);
    }
    public static void main(String[] args) {
        new Student();
    }
    
}