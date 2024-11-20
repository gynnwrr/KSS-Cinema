package ksscinema;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.*;
import java.util.HashMap;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.lang.String;

public class KSSCinema {
    
    public JFrame frame;
    private JTextField Password_Login;
    JTextField Username_Login;
    private JTextField Username_Signup;
    private JTextField Password_Signup;
    private JTextField Reenter_password;

    private static HashMap<String, String> usersinfo = new HashMap<>(); // store user info (temporary)

    public static void main(String[] args) {
        
	EventQueue.invokeLater(new Runnable() {
            public void run() {
		try {
                    KSSCinema window = new KSSCinema(); //using window since it doesn't extend JFrame
                    window.frame.setVisible(true);
                    
		} catch (Exception e) {
                    e.printStackTrace();
                    
		}
            }
	});
    }
    
    private static boolean isValidUsername(String Username) {
	if (Username.contains(" ")) { //to make sure space is not count as a character
	    return false;
	}
        
        return Username.length() >= 4; //only minimum 4 characters (a 'space' is counted as a character)
    }

    private static boolean isValidPassword(String password) {
        if (password.contains(" ")) { //to make sure space is not count as a character
            return false;
        }
        
        if (password.length() < 8) return false; //must be minimum 8 characters 
        boolean hasLower = false, hasUpper = false, hasDigit = false, hasSpecial = false;
        
        //to check each character if the password meet each requirements
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i); // check each character using index based on the password length entered
            
            if (Character.isLowerCase(ch)) {
                hasLower = true; // has at least 1 lowercase
                
            } else if (Character.isUpperCase(ch)) {
                hasUpper = true; // has at least 1 uppercase
                
            } else if (Character.isDigit(ch)) {
                hasDigit = true; // has at least 1 number
                
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true; // has at least 1 special character
            }
        }
        return hasLower && hasUpper && hasDigit && hasSpecial;
    }
    
    public KSSCinema() {
	initialize();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\ainnuraida\\Downloads\\SEMESTER 3\\SPG 0453\\assignments\\mini project\\KSSCinema\\src\\ksscinema\\logokss.png");
        frame.setIconImage(icon);
        frame.setLocationRelativeTo(null); //to center the frame
    }

    private void initialize() {
        frame = new JFrame(); //add JFrame
        frame.setTitle("Welcome to KSS Cinema"); //frame title
        frame.getContentPane().setBackground(new Color(0, 0, 0)); //frame backgrounf
	frame.setBounds(100, 100, 1600, 900);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
		
        //password label
	JLabel lblPassword_Login = new JLabel("Password\r\n");
	lblPassword_Login.setForeground(new Color(255, 255, 255));
	lblPassword_Login.setFont(new Font("Tahoma", Font.PLAIN, 12));
	lblPassword_Login.setBounds(453, 207, 341, 31);
	frame.getContentPane().add(lblPassword_Login);
		
	JLabel lblNewLabel_1 = new JLabel("New label");
	lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\GUI_LOGIN_SIGNUP.png"));
	lblNewLabel_1.setBounds(0, 0, 443, 845);
	frame.getContentPane().add(lblNewLabel_1);
		
        //password field
	Password_Login = new JTextField();
	Password_Login.setBounds(453, 248, 438, 31);
	frame.getContentPane().add(Password_Login);
	Password_Login.setColumns(10);
		
        //username label
	JLabel lblUsername_Login = new JLabel("Username");
	lblUsername_Login.setForeground(new Color(255, 255, 255));
	lblUsername_Login.setFont(new Font("Tahoma", Font.PLAIN, 12));
	lblUsername_Login.setBounds(453, 125, 341, 31);
	frame.getContentPane().add(lblUsername_Login);
                
        //username field
	Username_Login = new JTextField();
	Username_Login.setColumns(10);
	Username_Login.setBounds(453, 166, 438, 31);
	frame.getContentPane().add(Username_Login);
		
        //log in label
	JLabel lblLogIn = new JLabel("LOG IN");
	lblLogIn.setForeground(new Color(255, 255, 255));
	lblLogIn.setFont(new Font("Verdana", Font.BOLD, 24));
	lblLogIn.setBounds(453, 62, 341, 31);
	frame.getContentPane().add(lblLogIn);
		
        //not a member label
	JLabel lblNotAMember = new JLabel("Not a Member Yet ?");
	lblNotAMember.setForeground(Color.WHITE);
	lblNotAMember.setFont(new Font("Tahoma", Font.PLAIN, 12));
	lblNotAMember.setBounds(614, 391, 119, 31);
	frame.getContentPane().add(lblNotAMember);
		
        //button for login
	JButton btnNewButton = new JButton("Login\r\n");
	btnNewButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {		
                String Username_LI = Username_Login.getText();
                String Password_LI = Password_Login.getText();
                
                if (Username_Login.getText().isEmpty() || Password_Login.getText().isEmpty()) { //to check if the fields are empty
                    JOptionPane.showMessageDialog(frame, "Please fill out the login fields.", "Empty Login Field", JOptionPane.ERROR_MESSAGE);
                    
                } else if (!usersinfo.containsKey(Username_LI)) { //if there is no matching username
                    JOptionPane.showMessageDialog(null, "User hasn't signed up. Please sign up first.", "Error", JOptionPane.ERROR_MESSAGE);
                    Username_Login.setText(null);
                    Password_Login.setText(null);
                    return;
                     
                } else if (usersinfo.get(Username_LI).equals(Password_LI)) { //username & password correct
                    frame.setVisible(false); //close this frame when homepage frame is visible
                    Username_Login.setText(null);
                    Password_Login.setText(null);
                    homepage hp = new homepage(); //go to main menu page (homepage)
                    hp.username.setText(Username_LI); //to pass username to hompeage
                    hp.setVisible(true); //to make sure the homepage frame is visible
                     
                } else { //password are incorrect
                    JOptionPane.showMessageDialog(null, "Incorrect password. Please re-enter your password.", "Error", JOptionPane.ERROR_MESSAGE);
                    Username_Login.setText(null);
                    Password_Login.setText(null);
                    return;
                }
            }
	});
        
	btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
	btnNewButton.setBounds(453, 307, 438, 37);
	frame.getContentPane().add(btnNewButton);
		
        //sign up button
	JButton btnNewButton_1 = new JButton("Sign Up");
	btnNewButton_1.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {		
		String Username_SU = Username_Signup.getText();
                String Password_SU = Password_Signup.getText();
                String REPassword_SU = Reenter_password.getText();
                
                if (Username_Signup.getText().isEmpty() || Password_Signup.getText().isEmpty() || Reenter_password.getText().isEmpty()) { //to check if the fields are empty
                    JOptionPane.showMessageDialog(frame, "Please fill out the sign up fields.", "Empty Sign Up Field", JOptionPane.ERROR_MESSAGE);
                
                } else if (Username_SU != null && Password_SU != null) {
                    if (usersinfo.containsKey(Username_SU)) { //if username is same with other registered username (avoid redundancy) 
                        JOptionPane.showMessageDialog(null, "Username is already taken. Please choose another.", "Error", JOptionPane.ERROR_MESSAGE);
                        Username_Signup.setText(null);
                     
                    } else if (!REPassword_SU.equals(Password_SU)){ // if the re-enter password doesn't match
                        JOptionPane.showMessageDialog(null, "Password does not match. Please re-enter the password.", "Error", JOptionPane.ERROR_MESSAGE);
                        Reenter_password.setText(null);
                        Password_Signup.setText(null);
                        
                    } else if (Username_SU.contains(" ") || Password_SU.contains(" ")) { //to make sure space is not count as a character
                        JOptionPane.showMessageDialog(null, "Username and password cannot contain blank spaces. Please re-enter your details.", "Error", JOptionPane.ERROR_MESSAGE);
                    	Username_Signup.setText(null);
                        Password_Signup.setText(null);
                        Reenter_password.setText(null);
                        
                    }else if (!isValidUsername(Username_SU) || !isValidPassword(Password_SU)) { //if username & password doesn't meet the requirements
                    	JOptionPane.showMessageDialog(null, "Username or password doesn't meet the requirements. Please re-enter your details.", "Error", JOptionPane.ERROR_MESSAGE);
                    	Username_Signup.setText(null);
                        Password_Signup.setText(null);
                        Reenter_password.setText(null);
                        
                    } else if (Password_SU.contains(Username_SU)) { //if password = username
                        JOptionPane.showMessageDialog(null, "Your password cannot be the same as your username. Please re-enter your details.", "Error", JOptionPane.ERROR_MESSAGE);
                        Username_Signup.setText(null);
                        Password_Signup.setText(null);
                        Reenter_password.setText(null);
                        
                    } else {
                        usersinfo.put(Username_SU, Password_SU); //username & password is available and meet all the requirements
                        JOptionPane.showMessageDialog(null, "Signup successful! You can now log in.", "Success", JOptionPane.INFORMATION_MESSAGE);
                        Username_Signup.setText(null);
                        Password_Signup.setText(null);
                        Reenter_password.setText(null);
                    }
		}
            }
        });
        
	btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 24));
	btnNewButton_1.setBounds(453, 616, 438, 37);
	frame.getContentPane().add(btnNewButton_1);
        
        //username sign up label
	JLabel Yes = new JLabel("Username (Minimum 4 characters)");
	Yes.setForeground(Color.WHITE);
	Yes.setFont(new Font("Tahoma", Font.PLAIN, 12));
	Yes.setBounds(453, 431, 500, 31);
	frame.getContentPane().add(Yes);
        
        //username sign up field
	Username_Signup = new JTextField();
	Username_Signup.setColumns(10);
	Username_Signup.setBounds(453, 453, 438, 31);
	frame.getContentPane().add(Username_Signup);
	
        //password sign up label
	JLabel lblNewLabel_2 = new JLabel("Password (Minimum 8 characters with at least 1 uppercase, 1 lowercase, 1 special character & 1 number)");
	lblNewLabel_2.setForeground(Color.WHITE);
	lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
	lblNewLabel_2.setBounds(453, 481, 600, 31);
	frame.getContentPane().add(lblNewLabel_2);
	
        //password sign up field
	Password_Signup = new JTextField();
	Password_Signup.setColumns(10);
	Password_Signup.setBounds(453, 505, 438, 31);
	frame.getContentPane().add(Password_Signup);
	
        //re-enter password label
	JLabel lblreenterpass = new JLabel("Re-enter Password");
	lblreenterpass.setForeground(Color.WHITE);
	lblreenterpass.setFont(new Font("Tahoma", Font.PLAIN, 12));
	lblreenterpass.setBounds(453, 535, 341, 31);
	frame.getContentPane().add(lblreenterpass);
	
        //re-enter password field
	Reenter_password = new JTextField();
	Reenter_password.setColumns(10);
	Reenter_password.setBounds(453, 559, 438, 31);
	frame.getContentPane().add(Reenter_password);
        
    }
}