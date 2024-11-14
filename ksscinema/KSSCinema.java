package ksscinema;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.*;
import java.util.HashMap;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class KSSCinema {

	private JFrame frame;
	private JTextField Password_Login;
	private JTextField Username_Login;
	private JTextField Username_Signup;
	private JTextField Password_Signup;
	private JTextField Reenter_password;

	private static HashMap<String, String> usersinfo = new HashMap<>(); // store user info (temporary)

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KSSCinema window = new KSSCinema();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private static boolean isValidUsername(String Username) {
		if (Username.contains(" ")) {
	        return false;
	    }
		
        return Username.length() >= 4; //only minimum 4 characters (a 'space' is counted as a character)
    }

    private static boolean isValidPassword(String password) {
    	
        if (password.contains(" ")) {
            return false;
        }
        if (password.length() < 8) return false; //must be minimum 8 characters 
        boolean hasLower = false, hasUpper = false, hasDigit = false, hasSpecial = false;
        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) hasLower = true; //has at least 1 lowercase
            else if (Character.isUpperCase(ch)) hasUpper = true; //has at least 1 uppercase
            else if (Character.isDigit(ch)) hasDigit = true; //has at least 1 number
            else if (!Character.isLetterOrDigit(ch)) hasSpecial = true; //has atleast 1 special character
        }
        return hasLower && hasUpper && hasDigit && hasSpecial;
    }


	/**
	 * Create the application.
	 */
	public KSSCinema() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
            
	frame = new JFrame();
	frame.getContentPane().setBackground(new Color(0, 0, 0));
	frame.setBounds(100, 100, 915, 700);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
		
	JLabel lblPassword_Login = new JLabel("Password\r\n");
	lblPassword_Login.setForeground(new Color(255, 255, 255));
	lblPassword_Login.setFont(new Font("Tahoma", Font.PLAIN, 12));
	lblPassword_Login.setBounds(453, 233, 341, 31);
	frame.getContentPane().add(lblPassword_Login);
		
	JLabel lblNewLabel_1 = new JLabel("New label");
	lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\moviehomm.png"));
	lblNewLabel_1.setBounds(0, 0, 443, 663);
	frame.getContentPane().add(lblNewLabel_1);
		
	Password_Login = new JTextField();
	Password_Login.setBounds(453, 274, 438, 31);
	frame.getContentPane().add(Password_Login);
	Password_Login.setColumns(10);
		
	JLabel lblUsername_Login = new JLabel("Username");
	lblUsername_Login.setForeground(new Color(255, 255, 255));
	lblUsername_Login.setFont(new Font("Tahoma", Font.PLAIN, 12));
	lblUsername_Login.setBounds(453, 134, 341, 31);
	frame.getContentPane().add(lblUsername_Login);
		
	Username_Login = new JTextField();
	Username_Login.setColumns(10);
	Username_Login.setBounds(453, 175, 438, 31);
	frame.getContentPane().add(Username_Login);
		
	JLabel lblLogIn = new JLabel("LOG IN");
	lblLogIn.setForeground(new Color(255, 255, 255));
	lblLogIn.setFont(new Font("Verdana", Font.BOLD, 24));
	lblLogIn.setBounds(453, 62, 341, 31);
	frame.getContentPane().add(lblLogIn);
		
	JLabel lblNotAMember = new JLabel("Not a Member Yet ?");
	lblNotAMember.setForeground(Color.WHITE);
	lblNotAMember.setFont(new Font("Tahoma", Font.PLAIN, 12));
	lblNotAMember.setBounds(615, 391, 119, 31);
	frame.getContentPane().add(lblNotAMember);
		
	JButton btnNewButton = new JButton("Login\r\n");
	btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				
            String Username_LI = Username_Login.getText();
            String Password_LI = Password_Login.getText();
                 
            if (!usersinfo.containsKey(Username_LI)) {//if there is no matching username
                JOptionPane.showMessageDialog(null, "User hasn't signed up. Please sign up first.", "Error", JOptionPane.ERROR_MESSAGE);
                Username_Login.setText(null);
                Password_Login.setText(null);
                return;
                     
            } else if (usersinfo.get(Username_LI).equals(Password_LI)) { //username & password correct
                Username_Login.setText(null);
                Password_Login.setText(null);
                homepage hp = new homepage(); // go to main menu
                hp.setVisible(true);
                     
                } else {//username & password are incorrect
                JOptionPane.showMessageDialog(null, "Invalid username or password. Please re-enter your credentials.", "Error", JOptionPane.ERROR_MESSAGE);
                Username_Login.setText(null);
                Password_Login.setText(null);
                return;
                }
            }
	});
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
	btnNewButton.setBounds(453, 344, 438, 37);
	frame.getContentPane().add(btnNewButton);
		
	JButton btnNewButton_1 = new JButton("Sign Up");
	btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
		String Username_SU = Username_Signup.getText();
                String Password_SU = Password_Signup.getText();
                String REPassword_SU = Reenter_password.getText();
                 
                if (Username_SU != null && Password_SU != null) {
                    if (usersinfo.containsKey(Username_SU)) { //if username is same with other registered username (avoid redundancy) 
                        JOptionPane.showMessageDialog(null, "Username already taken. Please choose another.", "Error", JOptionPane.ERROR_MESSAGE);
                        Username_Signup.setText(null);
                     
                    } else if (!REPassword_SU.equals(Password_SU)){
                        JOptionPane.showMessageDialog(null, "Password does not match. Please re-enter password.", "Error", JOptionPane.ERROR_MESSAGE);
                        Reenter_password.setText(null);
                        Password_Signup.setText(null);
                    } else if (Username_SU.contains(" ") || Password_SU.contains(" ")) {
                    	JOptionPane.showMessageDialog(null, "Username/password cannot contain blank spaces. Please re-enter your details", "Error", JOptionPane.ERROR_MESSAGE);
                    	Username_Signup.setText(null);
                        Password_Signup.setText(null);
                        Reenter_password.setText(null);
                    }else if (!isValidUsername(Username_SU) || !isValidPassword(Password_SU)) {
                    	JOptionPane.showMessageDialog(null, "Username or password doesn't meet the requirements. Please re-enter your details", "Error", JOptionPane.ERROR_MESSAGE);
                    	Username_Signup.setText(null);
                        Password_Signup.setText(null);
                        Reenter_password.setText(null);
                    } else if (Password_SU.contains(Username_SU)) {
                    	JOptionPane.showMessageDialog(null, "Password cannot contain username. Please re-enter your details", "Error", JOptionPane.ERROR_MESSAGE);
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
        
        btnNewButton_1.setBackground(new Color(255, 255, 255));
	btnNewButton_1.setForeground(new Color(0, 0, 128));
	btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
	btnNewButton_1.setBounds(630, 629, 111, 24);
	frame.getContentPane().add(btnNewButton_1);
		
	JLabel Yes = new JLabel("Username");
	Yes.setForeground(Color.WHITE);
	Yes.setFont(new Font("Tahoma", Font.PLAIN, 12));
	Yes.setBounds(453, 431, 54, 31);
	frame.getContentPane().add(Yes);
		
	Username_Signup = new JTextField();
	Username_Signup.setColumns(10);
	Username_Signup.setBounds(453, 453, 438, 31);
	frame.getContentPane().add(Username_Signup);
		
	JLabel lblNewLabel_2 = new JLabel("Password\r\n");
	lblNewLabel_2.setForeground(Color.WHITE);
	lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
	lblNewLabel_2.setBounds(453, 481, 54, 31);
	frame.getContentPane().add(lblNewLabel_2);
		
	Password_Signup = new JTextField();
	Password_Signup.setColumns(10);
	Password_Signup.setBounds(453, 505, 438, 31);
	frame.getContentPane().add(Password_Signup);
		
	JLabel lblEmail_1_1 = new JLabel("Re-enter Password");
	lblEmail_1_1.setForeground(Color.WHITE);
	lblEmail_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
	lblEmail_1_1.setBounds(453, 535, 341, 31);
	frame.getContentPane().add(lblEmail_1_1);
		
	Reenter_password = new JTextField();
	Reenter_password.setColumns(10);
	Reenter_password.setBounds(453, 559, 438, 31);
	frame.getContentPane().add(Reenter_password);
		
	JLabel lblminimumCharacters_Username = new JLabel("(minimum 4 characters)");
	lblminimumCharacters_Username.setForeground(new Color(192, 192, 192));
	lblminimumCharacters_Username.setFont(new Font("Tahoma", Font.PLAIN, 12));
	lblminimumCharacters_Username.setBounds(510, 431, 137, 31);
	frame.getContentPane().add(lblminimumCharacters_Username);
		
	JLabel lblminimumCharacters_Password = new JLabel("(minimum 8 characters; Uppercase, special character & number required)");
	lblminimumCharacters_Password.setForeground(Color.LIGHT_GRAY);
	lblminimumCharacters_Password.setFont(new Font("Tahoma", Font.PLAIN, 11));
	lblminimumCharacters_Password.setBounds(510, 481, 381, 31);
	frame.getContentPane().add(lblminimumCharacters_Password);

	}

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
