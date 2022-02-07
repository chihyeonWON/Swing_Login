# Swing_JFrameJPanel
Java의 Swing을 사용해서 JFrame, JPanel 만들어보기

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

## 최종 코드는 다음과 같습니다.

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



  
