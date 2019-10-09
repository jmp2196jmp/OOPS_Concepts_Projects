package form;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Registration {
	public void register()
	{
		JFrame f=new JFrame("REGISTRATION");
		
		Container c = f.getContentPane();
        c.setBackground(Color.red);
        
        
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
	  
	    
	    JLabel l1,l2,user,pass,rp,mob,em,msg;  
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
	    		
	    		 msg.setText("registration completed");  
	            String fn,lt,usr,pw,rep,mbl,eml;
	            
	            fn=tf1.getText();
	            lt=ln.getText();
	            usr=un.getText();
	            pw=ps.getText();
	            rep=r.getText();
	            mbl=mb.getText();
	            eml=me.getText();

				Connection con;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
				
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rld","root","");
				 Statement st= con.createStatement();
			
				st.execute("insert into user values('"+fn+"','"+lt+"','"+usr+"','"+pw+"','"+rep+"','"+mbl+"','"+eml+"')");
			
			} catch (ClassNotFoundException | SQLException e1) {
				
				e1.printStackTrace();
			}
	            
	            
			        }  
			    });  
	  
	    f.add(b);
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
