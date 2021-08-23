package musicGame_ver1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class musicGame extends JFrame implements ActionListener{
	
	public musicGame() {
		Container c =  getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		JButton j1 = new JButton("시작하기");
		JButton j2 = new JButton("게임방법");
		JButton j3 = new JButton("종료하기");
		JButton j4 = new JButton("힌트");
		
		jp.add(j1);
		jp.add(j2);
		jp.add(j3);
		
		c.add(jp);
		setTitle("Music Quiz_RemoteControl");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sum = 0;
				String ans;
				System.out.println("<게임시작>");
				System.out.println();
				System.out.println("Q1");
				System.out.println("그대 기억이 지난 사랑이~");
				Scanner a1 = new Scanner(System.in);
				System.out.println("정답 >> ");
				ans = a1.nextLine();
				if(ans.equals("버즈 가시")) {
					System.out.println("정답!");
					sum++;
				}else {
					System.out.println("틀렸습니다.(정답 - 버즈 가시)");
				}
				
				System.out.println();
				System.out.println("Q2");
				System.out.println("봄바람 휘날리며 흩날리는 벚꽃 잎이 울려퍼질 이 거리를 둘이 걸어요~");
				Scanner a2 = new Scanner(System.in);
				System.out.println("정답 >> ");
				ans = a2.nextLine();
				if(ans.equals("버스커버스커 벚꽃엔딩")) {
					System.out.println("정답!");
					sum++;
				}else {
					System.out.println("틀렸습니다.(정답 : 버스커 버스커 - 벚꽃 엔딩)");
				}
				
				System.out.println();
				System.out.println("Q3");
				System.out.println("너를 잊을 순 업지만 붙잡고 싶지만 이별 앞에서 할 수 있는 건~");
				Scanner a3 = new Scanner(System.in);
				System.out.println("정답 >> ");
				ans = a3.nextLine();
				if(ans.equals("에스지워너비 timeless")) {
					System.out.println("정답!");
					sum++;
				}else {
					System.out.println("틀렸습니다.(정답 : SG워너비 - Timeless)");
				}
				
				System.out.println();
				System.out.println("Q4");
				System.out.println("느낌이 오잖아 떨리고 있잖아 언제가지 눈치만 볼 거니~");
				Scanner a4 = new Scanner(System.in);
				System.out.println("정답 >> ");
				ans = a4.nextLine();
				if(ans.equals("아이유 내손을잡아")) {
					System.out.println("정답!");
					sum++;
				}else {
					System.out.println("틀렸습니다.(정답 : 아이유 - 내 손을 잡아)");
				}
				
				System.out.println();
				System.out.println("Q5");
				System.out.println("사랑해요 사랑해요 내가 그대에게 부족한걸 알지만~");
				Scanner a5 = new Scanner(System.in);
				System.out.println("정답 >> ");
				ans = a5.nextLine();
				if(ans.equals("에스지워너비 라라라")) {
					System.out.println("정답!");
					sum++;
				}else {
					System.out.println("틀렸습니다.(정답 : SG워너비 - 라라라)");
				}
				
				System.out.println();
				System.out.println("Q6");
				System.out.println("우리의 믿음 우리의 사랑 그 영원한 약속들을~");
				Scanner a6 = new Scanner(System.in);
				System.out.println("정답 >> ");
				ans = a6.nextLine();
				if(ans.equals("나얼 바람기억")) {
					System.out.println("정답!");
					sum++;
				}else {
					System.out.println("틀렸습니다.(정답 : 나얼 - 바람기억)");
				}
				
				System.out.println();
				System.out.println("Q7");
				System.out.println("슬픈 밤이 오면 내가 그대를 지켜줄게 내 마음 들려오나요~");
				Scanner a7 = new Scanner(System.in);
				System.out.println("정답 >> ");
				ans = a7.nextLine();
				if(ans.equals("태연 그대라는시")) {
					System.out.println("정답!");
					sum++;
				}else {
					System.out.println("틀렸습니다.(정답 : 태연 - 그대라는 시)");
				}
				
				System.out.println();
				System.out.println("Q8");
				System.out.println("이상하게 생각해도 어쩔 수 없어 반했으니까~");
				Scanner a8 = new Scanner(System.in);
				System.out.println("정답 >> ");
				ans = a8.nextLine();
				if(ans.equals("트와이스 heartshaker")) {
					System.out.println("정답!");
					sum++;
				}else {
					System.out.println("틀렸습니다.(정답 : 트와이스 - Heart Shaker)");
				}
				
				System.out.println();
				System.out.println("Q9");
				System.out.println("다신 나 같은 사람 만나지마요 혹시 찾아가도 두번 다시 나를 허락해주지 마요~");
				Scanner a9 = new Scanner(System.in);
				System.out.println("정답 >> ");
				ans = a9.nextLine();
				if(ans.equals("버즈 monologue")) {
					System.out.println("정답!");
					sum++;
				}else {
					System.out.println("틀렸습니다.(정답 : 버즈 - Monologue)");
				}
				
				System.out.println();
				System.out.println("Q10");
				System.out.println("사랑 누구나 하는 흔하디 흔한 이야기~");
				Scanner a10 = new Scanner(System.in);
				System.out.println("정답 >> ");
				ans = a10.nextLine();
				if(ans.equals("임창정 하루도그대를사랑하지않은적이없었다")) {
					System.out.println("정답!");
					sum++;
				}else {
					System.out.println("틀렸습니다.(정답 : 임창정 - 하루도 그대를 사랑하지 않은 적이 없었다)");
				}
				
				System.out.println();
				System.out.println("결과>> " + sum + "/10");
			}
			
		});
		
		j2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<게임 방법>");
				System.out.println("화면에 나오는 노래의 소절 일부를 보고 가수와 제목을 맞추는 게임입니다.");
				System.out.println("※유의 사항※");
				System.out.println("1. 가수이름은 한글로 표기합니다.(이름이 영어인 경우에도 한글로 표기)");
				System.out.println("2. 가수이름, 노래제목에 띄어쓰기가 있는 경우 무시하고 붙여서 표기합니다.(ex 헤이즈 비도오고그래서)");
				System.out.println("3. 노래의 제목이 영어일 경우 소문자로 띄어쓰기 없이 표기합니다.");
				System.out.println("4. 가수와 노래제목 사이는 띄어쓰기를 합니다.");
				System.out.println();
			}
			
		});
		
		j3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("<게임 종료>");
				System.exit(0);
			}
			
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	

	
	
		
}
	
	


