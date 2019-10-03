package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Page {

	public static void main(String[] args) {
		//JFrame f=new JFrame("REGISTRATION");
		//f.setSize(150,200);
		//JButton b=new JButton("Submit");
	//	b.setBounds(50, 100, 95, 30);
		//final JTextField tf= new JTextField();
		//tf.setBounds(50,50,150,20);
//Entering
		 JFrame f=new JFrame("REGISTRATION");  
		    final JTextField tf1=new JTextField();  
		    tf1.setBounds(130,55, 150,20);  
		    final JTextField ln=new JTextField();  
		    ln.setBounds(130,75, 150,20);
		    final JTextField un=new JTextField();  
		    un.setBounds(130,95, 150,20);
		    final JTextField ps=new JTextField();  
		    ps.setBounds(130,115, 150,20); 
		    final JTextField r=new JTextField();  
		    r.setBounds(130,135, 150,20);
		    final JTextField mb=new JTextField();  
		    mb.setBounds(130,155, 150,20); 
		    final JTextField me=new JTextField();  
		    me.setBounds(130,175, 150,20); 
		    
		    JButton b=new JButton("Submit");  
		    b.setBounds(150,300,95,30);
		   // final JTextField tf=new JTextField();  
		   // tf.setBounds(120,355, 150,20);
		    
		    JLabel l1,l2,user,pass,rp,mob,em,msg,fn,l,u,pd,re,mo,el;  
		    l1=new JLabel("First Name :");  
		    l1.setBounds(50,50, 100,30);  
		    l2=new JLabel("Last Name :");  
		    l2.setBounds(50,70, 100,30); 
		    user=new JLabel("User name:");
		    user.setBounds(50, 90, 100, 30);
		    pass=new JLabel("Password:");
		    pass.setBounds(50, 110, 100, 30);
		    rp=new JLabel("Re-Password:");
		    rp.setBounds(50, 130, 100, 30);
		    mob=new JLabel("Mobile :");
		    mob.setBounds(50, 150, 100, 30);
		    em=new JLabel("Email:");
		    em.setBounds(50, 170, 100, 30);
	//printing	    
		    msg=new JLabel();
		    msg.setBounds(120, 355, 300, 30);
		    fn=new JLabel();
		    fn.setBounds(120, 375, 300, 30);
		    l =new JLabel();
		    l.setBounds(120, 385, 300, 30);
		    u =new JLabel();
		    u.setBounds(120, 395, 300, 30);
		    mo=new JLabel();
		    mo.setBounds(120, 405, 300, 30);
		    el =new JLabel();
		    el.setBounds(120, 415, 300, 30);
//to frame		    
		    f.add(l1); 
		    f.add(l2);  
		    f.add(user);
		    f.add(pass);
		    f.add(rp);
		    f.add(mob);
		    f.add(em);
//event		    
		    f.add(msg);
		    b.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){
		    		f.add(fn);
		    		f.add(l);
		    		f.add(u);
		    		f.add(mo);
		    		f.add(el);
		    		
		    		 msg.setText("registration completed");  
		            fn.setText(tf1.getText());
		            l.setText(ln.getText());
		            u.setText(un.getText());
		           // pd.setText(ps.getText());
		           // re.setText(r.getText());
		            mo.setText(mb.getText());
		            el.setText(me.getText());
		            
				        }  
				    });  
		  
		    f.add(b);
		   // f.add(tf);
		    f.add(tf1);  
		    f.add(ln);
		    f.add(un);
		    f.add(ps);
		    f.add(r);
		    f.add(mb);
		    f.add(me);
		    f.setSize(500,500);  
		    f.setLayout(null);  
		    f.setVisible(true);  

	}

}
