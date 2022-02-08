# Java Swing

## 프로젝트와 클래스 생성

Lesson이라는 프로젝트와 Frame이라는 클래스를 하나 생성해줍니다.

Frame.java
```Java
public class Frame {
	public static void main(String[] args) {
	}
}
```

## 창 생성 (JFrame)

JFrame 클래스의 기능을 사용하기 위해 new 생성자로 호출한 후 변수에 저장합니다.
```Java
import javax.swing.JFrame;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
	}
}
```
   
JFrame 클래스의 setVisible 메서드를 사용해서 창을 화면에 표시합니다.
```Java
import javax.swing.JFrame;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
    
		frame.setVisible(true); // 창을 보이게 해줌
	}
}
```

## 창의 기본적인 옵션 설정

### 먼저 창의 크기를 변경하는 메서드인 setPreferredSize와 setSize를 사용합니다.
```Java
import java.awt.Dimension;

import javax.swing.JFrame;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setVisible(true); // 창을 보이게 해줌
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840, 840/12*9); //프로그램 기본사이즈 설정
	}
}
```

setPreferredSize안에 가로,세로의 형식으로 넣을 수 있도록 Dimension 클래스를 새로운 생성자로 호출해서 사이즈를 설정합니다.   
   
setSize 메서드로 자세한 크기를 가로,세로 형식으로 설정합니다.

### 창의 위치를 설정하는 메서드인 setLocationRelativeTo와 창의 위치,사이즈 변경을 금지하는 setResizable를 사용합니다.

```Java
import java.awt.Dimension;

import javax.swing.JFrame;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setResizable(false); // 프로그램 사이즈 변경 금지
		frame.setVisible(true); // 창을 보이게 해줌
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840, 840/12*9); //프로그램 기본사이즈 설정
		frame.setLocationRelativeTo(null); // 프로그램 기본 위치 해제
	}
}
```

### 창을 껐을 때 프로그램이 완전히 종료되도록 하기 위해서 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)을 설정해줍니다.

## 패널 생성

패널 클래스를 사용하기 위해 패널을 새로운 생성자로 호출한 뒤 panel 변수에 저장합니다.

```Java
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.add(panel); // 프레임에 패널을 넣어줌
		
		
		
		frame.setResizable(false); // 프로그램 사이즈 변경 금지
		frame.setVisible(true); // 창을 보이게 해줌
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840, 840/12*9); //프로그램 기본사이즈 설정
		frame.setLocationRelativeTo(null); // 프로그램 기본 위치 해제
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 껐을 때 종료 되도록 설정
	}
}
```

### 패널이 생성된 프레임 위에 나타나도록 frame.add에 생성한 패널을 넣어줍니다.

```Java
frame.add(panel); // 프레임에 패널을 넣어줌
```

## JLabel 레이블 생성과 배치

레이블은 텍스트를 입력한는 공간입니다. 레이블을 생성하는 코드는 다음과 같습니다.
```Java
JLabel label = new JLabel("Some Text");
```
코드를 입력하고 ctrl + shift + O를 눌러 모듈을 import 해줍니다.

## Widget의 배치

Widget을 배치할때는 panel.setLayout(new BorderLayout());을 사용합니다.
```Java
panel.setLayout(new BorderLayout());
```

방금 만든 레이블을 이 레이아웃을 사용해 동서남북으로 지정해줄 수 있습니다.
```Java
panel.add(label, BorderLayout.NORTH);
```
라벨을 북쪽(위쪽)으로 배치하였습니다.

## 버튼 생성과 배치

버튼을 생성할 때는 라벨과 같은 방법으로 생성합니다.
```Java
JButton btn1 = new JButton("Click me");
```

배치 또한 라벨과 동일합니다.
```Java
panel.add(btn1, BorderLayout.WEST);
```
WEST 값을주어 (서쪽)왼쪽에 위치하도록 배치하였습니다.

## TextArea와 TextField

텍스트에이리어(TextArea)는 많은 글자를 입력하는 공간을 생성하고   
   
텍스트필드(TextField)는 안에 숫자를 넣어 글자를 넣을 공간을 지정할 수 있습니다.

만드는 방법은 다음과 같습니다.
```Java
JTextArea textArea = new TextArea();
JTextField textField = new TextField(200); //글자 수를 200으로 제한
```

배치 또한 라벨과 버튼과 같이 배치합니다.
```Java
panel.add(textArea, BorderLayout.CENTER)
```
텍스트에이리어를 가운데 배치했습니다.

## 버튼패널 생성하고 그 안에 버튼들을 넣기

버튼들이 들어있는 패널 하나를 생성하고 기존에 만든 버튼을 넣어보겠습니다.
```Java
JButton btn1 = new JButton();
JPanel btnPanel = new JPanel();

btnPanel.add(btn1);
panel.add(btnPanel, BorderLayout.WEST);
```
## 새로운 버튼을 생성하고 버튼패널에 넣기

프로그램을 종료하는 기능을 하는 버튼을 새로 만들고 버튼패널에 넣어보겠습니다.
```Java
JButton btn2 = new JButton("Exit");

btnPanel.add(btn2);
```

## 버튼에 각종 기능 넣기

버튼에 기능을 넣는 방법으로는 addActionListener를 사용하는 방법이 있습니다.
```Java
btn1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e) {
		textArea.append("You are amazing");
	}
});
```
먼저 btn1에 클릭했을 때 textArea에 You are amazing 글자가 추가되도록 기능을 추가했습니다.
   
마찬가지로 btn2에는 클릭했을 때 프로그램이 종료되도록하는 기능을 추가했습니다.
```Java
btn2.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
});
```

btn1을 클릭했을 때 textArea의 쓴 글자를 받아서 label 추가되록 기능을 추가해보겠습니다.
```Java
btn1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e) {
		label.setText(textArea.getText());
	}
});
