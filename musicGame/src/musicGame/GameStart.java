package musicGame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameStart extends JFrame implements ActionListener{
	
	public GameStart() {
		Container c =  getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		JButton j1 = new JButton("시작하기");
		JButton j1_1 = new JButton("락");
		JButton j1_2 = new JButton("발라드");
		JButton j1_3 = new JButton("댄스");
		JButton j2 = new JButton("게임방법");
		JButton j3 = new JButton("종료하기");
		
		// "시작하기", "게임방법", "종료하기" 버튼 
		jp.add(j1);
		jp.add(j2);
		jp.add(j3);
		
		
		c.add(jp);
		setTitle("Music Quiz_RemoteControl");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// "시작하기" 버튼을 눌렀을 때
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				// "락", "발라드", "댄스" 버튼 생성, "시작하기", "게임방법", "종료하기" 버튼 삭제
				jp.add(j1_1);
				jp.remove(j1);
				jp.add(j1_2);
				jp.remove(j2);
				jp.add(j1_3);
				jp.remove(j3);
			
				
				setTitle("장르선택");
				setSize(500,200);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible(true);
				
				// "락" 버튼을 눌렀을 때
				j1_1.addActionListener((ActionListener) new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("음악 장르 : 락");
						MusicGame musicgame = new Rock();
						musicgame.musicGame();
						
					}
					
				});
				
				// "발라드" 버튼을 눌렀을 때
				j1_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println("음악 장르 : 발라드");
						MusicGame musicgame = new Ballad();
						musicgame.musicGame();
					}
					
				});
				
				// "댄스" 버튼을 눌렀을 때
				j1_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println("음악 장르 : 댄스");
						MusicGame musicgame = new Dance();
						musicgame.musicGame();
					}
					
				});
				
			}
			
		});
		
		// "게임방법" 버튼을 눌렀을 때
		j2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<게임 방법>");
				System.out.println("화면에 나오는 노래의 소절 일부를 보고 가수와 제목을 맞추는 게임입니다.");
				System.out.println("게임시작 버튼을 누르면 락, 발라드, 댄스 3개의 버튼이 나타납니다. 3가지 장르 중 원하는 장르를 선택하면 선택한 장르의 음악 퀴즈가 실행됩니다.");
				System.out.println("※유의 사항※");
				System.out.println("1. 가수이름은 한글로 표기합니다.(이름이 영어인 경우에도 한글로 표기)");
				System.out.println("2. 가수이름, 노래제목에 띄어쓰기가 있는 경우 무시하고 붙여서 표기합니다.(ex 헤이즈 비도오고그래서)");
				System.out.println("3. 노래의 제목이 영어일 경우 소문자로 띄어쓰기 없이 표기합니다.");
				System.out.println("4. 가수와 노래제목 사이는 띄어쓰기를 합니다.");
				System.out.println("5. 정답에 '힌트'라고 입력하면 초성 힌트가 나옵니다.");
				System.out.println();
			}
			
		});
		
		// "종료하기" 버튼을 눌렀을 때
		j3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("<게임 종료>");
				System.exit(0);
			}
			
		});
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
