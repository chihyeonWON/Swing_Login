import javax.swing.JFrame;

public class LogIn extends JFrame {
	public LogIn() {
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
