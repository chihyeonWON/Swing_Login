import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogIn extends JFrame {
	public LogIn() {
		JPanel panel = new JPanel(); // ID,PW �г�
		JLabel label = new JLabel("ID : "); // ID ��
		JLabel pswrd = new JLabel("Password : "); // PW ��
		JTextField txtID = new JTextField(10); //ID �Է�â
		JPasswordField txtPass = new JPasswordField(10); // PW �Է�â
		JButton logBtn = new JButton("Log In");
		
		panel.add(label);
		panel.add(txtID);
		panel.add(pswrd);
		panel.add(txtPass);
		panel.add(logBtn);
		add(panel);
		
		setVisible(true); // ȭ�鿡 ǥ��
		setSize(600,400); // �������
		setLocationRelativeTo(null);
		setResizable(false); // ����������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new LogIn();
	}
	
}
