import javax.swing.JFrame;

public class LogIn extends JFrame {
	public LogIn() {
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
