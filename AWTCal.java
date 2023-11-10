

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTCal extends Frame implements ActionListener {
    //Components
    Frame f=new Frame();

    TextField t1 = new TextField("Number 1");
    TextField t2 = new TextField("Number 2");
    TextField t3 = new TextField("Result");

    Button badd=new Button("Add");
    Button bsub=new Button("Sub");
    Button bmul=new Button("Mul");
    Button bdiv=new Button("Div");

    Button Exit=new Button("Exit");

    Label l1=new Label("Number 1:");
    Label l2=new Label("Number 2:");
    Label l3=new Label("Result :");

    
    public AWTCal(){
        l1.setBounds(50, 100, 100, 30);
        l2.setBounds(50, 140, 100, 30);
        l3.setBounds(50, 180, 100, 30);

        t1.setBounds(200, 100, 100, 30);
        t2.setBounds(200, 140, 100, 30);
        t3.setBounds(200, 180, 100, 30);

        badd.setBounds( 50,230, 50, 30);
        bsub.setBounds( 100,230, 50, 30);
        bmul.setBounds( 150,230, 50, 30);
        bdiv.setBounds( 200,230, 50, 30);
        Exit.setBounds( 250,230, 100, 30);

        f.add(badd);
        f.add(bsub);
        f.add(bmul);
        f.add(bdiv);
        f.add(Exit);

        f.add(l1);
        f.add(l2);
        f.add(l3);


        f.add(t1);
        f.add(t2);
        f.add(t3);


        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);

        Exit.addActionListener(this);

        f.setLayout(null);
		f.setVisible(true);
		f.setSize(500,450);	
		f.setTitle("Calculator");
        
        
        
        
    }

    public void actionPerformed(ActionEvent e) {
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        if(e.getSource()==badd){
            t3.setText(String.valueOf(n1+n2));
        }
        if(e.getSource()==bsub){
            t3.setText(String.valueOf(n1-n2));   
        }
        if(e.getSource()==bmul){
            t3.setText(String.valueOf(n1*n2));   
        }
        if(e.getSource()==bdiv){
            t3.setText(String.valueOf(n1/n2));   
        }
        if(e.getSource()==Exit){
            System.exit(0);  
        }
    }

    public static void main(String[] args) {
        new AWTCal();
    }
}
