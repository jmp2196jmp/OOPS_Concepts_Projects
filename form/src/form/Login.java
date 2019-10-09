package form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login {
   
	public static void main(String[] args) {
		
		JFrame f=new JFrame("LOGIN");  
	    final JTextField us=new JTextField();  
	    us.setBounds(130,55, 150,20);  
	    final JTextField ps=new JTextField();  
	    ps.setBounds(130,85, 150,20); 
	  
	    
	    
	    
	    JButton b=new JButton("Register");  
	    b.setBounds(150,160,95,30);
	    
	    JButton b1=new JButton("Login");  
	    b1.setBounds(150,110,95,30);
	    
	    JLabel ul,pl,ms1,ms2;  
	    ul=new JLabel("UserName :");  
	    ul.setBounds(50,50, 100,30);  
	     pl=new JLabel("Password :");
	    pl.setBounds(50, 70, 100, 30);
	    
	    ms1=new JLabel();
	    ms1.setBounds(120, 215, 300, 30);
	    ms2=new JLabel();
	    ms2.setBounds(120, 200, 300, 30);
	    
	   Registration r=new Registration();
	   
	  f.add(ms1);
	  f.add(ms2); 
	   b1.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){
	    		Connection con;
	    		 String mut=us.getText();
	   		    String spt=ps.getText();
	    		 int c=0;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rld","root","");
				    Statement st= con.createStatement();
				   ResultSet rt=st.executeQuery("select uname,password from user");
				  
	    	  while(rt.next())
	    	  {
	    		  if(((rt.getString(1).equals(mut))&&(rt.getString(2).equals(spt))))
	    		  {
	    			  ms1.setText("Login Success");
	    			  c++;
	    			  break;
	    		  }
	    	  }
	    	  if(c==0)
	    	  {
	    		  ms2.setText("invalid");
	    	  }
	    	}
				catch(ClassNotFoundException | SQLException e1)
				{
					e1.printStackTrace();
				}
	    	}
	    	
	   });
	      
	   
	   
	   b.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){
	    		
	    	r.register();	
	    		
	    	}
	   });
	    
	    f.add(ul);
	    f.add(pl);
	    
	    f.add(us);
	    f.add(ps);
	    f.add(b);
	    f.add(b1);
	    f.setSize(500,500);  
	    f.setLayout(null);  
	    f.setVisible(true);  

	}

}
