import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Some text");
		JButton btn1 = new JButton("Click me");
		JButton btn2 = new JButton("Exit");
		JTextArea textArea = new JTextArea();
		JTextField textField = new JTextField(200); // 200글자
		JPanel btnPanel = new JPanel();

		panel.setLayout(new BorderLayout());
		
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		panel.add(label, BorderLayout.NORTH);
		panel.add(btnPanel, BorderLayout.WEST);
		panel.add(textArea, BorderLayout.CENTER);
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(textArea.getText());
			}
			
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		});
		frame.add(panel); // 프레임에 패널을 넣어줌

		frame.setResizable(false); // 프로그램 사이즈 변경 금지
		frame.setVisible(true); // 창을 보이게 해줌
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840, 840/12*9); //프로그램 기본사이즈 설정
		frame.setLocationRelativeTo(null); // 프로그램 기본 위치 해제
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 껐을 때 종료 되도록 설정
	}
}