package jdbc;

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

public class ConnectionManager {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		
		 JFrame f=new JFrame("REGISTRATION");  
		    final JTextField tf1=new JTextField();  
		    tf1.setBounds(130,55, 150,20);  
		   
		   
		    final JTextField mb=new JTextField();  
		    mb.setBounds(130,155, 150,20); 
		    final JTextField me=new JTextField();  
		    me.setBounds(130,175, 150,20); 
		    
		    JButton b=new JButton("Submit");  
		    b.setBounds(150,300,95,30);
		   
		    JLabel l1,mob,em,msg,fn,mo,el;  
		    l1=new JLabel("Name :");  
		    l1.setBounds(50,50, 100,30);  
		    
		   
		    mob=new JLabel("Mobile :");
		    mob.setBounds(50, 150, 100, 30);
		    em=new JLabel("Email:");
		    em.setBounds(50, 170, 100, 30);
	//printing	    
		    msg=new JLabel();
		    msg.setBounds(120, 355, 300, 30);
		    fn=new JLabel();
		    fn.setBounds(120, 375, 300, 30);
		   
		    mo=new JLabel();
		    mo.setBounds(120, 405, 300, 30);
		    el =new JLabel();
		    el.setBounds(120, 415, 300, 30);
//to frame		    
		    f.add(l1); 
		    
		    f.add(mob);
		    f.add(em);
//event		    
		    f.add(msg);
		    b.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){
		    		f.add(fn);
		    		f.add(mo);
		    		f.add(el);
		    		msg.setText("registration completed");  
		            fn.setText(tf1.getText());
		            mo.setText(mb.getText());
		            el.setText(me.getText());
		            
		            String nm,eml,mobi;
				    nm=tf1.getText();
				  mobi=mb.getText();
				  eml=me.getText();
				  
					
				
				 
					Connection con;
					try {
						Class.forName("com.mysql.jdbc.Driver");
						
					
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/udb","root","");
					 Statement st= con.createStatement();
				
					st.execute("insert into user values('"+nm+"','"+mobi+"','"+eml+"')");
				
				} catch (ClassNotFoundException | SQLException e1) {
					
					e1.printStackTrace();
				}
				  
				        }  
				    });  
		   
		    f.add(b);
		    f.add(tf1);  
		    f.add(me);
		     f.add(mb);
		   f.setSize(500,500);  
		    f.setLayout(null);  
		    f.setVisible(true);  

		
		/*if (con != null)
		{
			System.out.println("Connected");
		}
		else
		{
			System.out.println("not Connected");
	    }*/
		
}
}
