import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LogIn extends JFrame {
	public LogIn() {
		JPanel panel = new JPanel(); // ID,PW 패널
		JLabel label = new JLabel("ID : "); // ID 라벨
		JTextField txtID = new JTextField(10); //ID 입력창
		
		panel.add(label);
		panel.add(txtID);
		
		add(panel);
		
		setVisible(true); // 화면에 표시
		setSize(600,400); // 사이즈변경
		setLocationRelativeTo(null);
		setResizable(false); // 사이즈변경금지
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new LogIn();
	}
	
}
