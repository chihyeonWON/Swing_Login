import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LogIn extends JFrame {
	public LogIn() {
		JPanel panel = new JPanel(); // ID,PW �г�
		JLabel label = new JLabel("ID : "); // ID ��
		JTextField txtID = new JTextField(10); //ID �Է�â
		
		panel.add(label);
		panel.add(txtID);
		
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
