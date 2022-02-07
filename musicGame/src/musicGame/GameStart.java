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
		
		JButton j1 = new JButton("�����ϱ�");
		JButton j1_1 = new JButton("��");
		JButton j1_2 = new JButton("�߶��");
		JButton j1_3 = new JButton("��");
		JButton j2 = new JButton("���ӹ��");
		JButton j3 = new JButton("�����ϱ�");
		
		// "�����ϱ�", "���ӹ��", "�����ϱ�" ��ư 
		jp.add(j1);
		jp.add(j2);
		jp.add(j3);
		
		
		c.add(jp);
		setTitle("Music Quiz_RemoteControl");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// "�����ϱ�" ��ư�� ������ ��
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				// "��", "�߶��", "��" ��ư ����, "�����ϱ�", "���ӹ��", "�����ϱ�" ��ư ����
				jp.add(j1_1);
				jp.remove(j1);
				jp.add(j1_2);
				jp.remove(j2);
				jp.add(j1_3);
				jp.remove(j3);
			
				
				setTitle("�帣����");
				setSize(500,200);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible(true);
				
				// "��" ��ư�� ������ ��
				j1_1.addActionListener((ActionListener) new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("���� �帣 : ��");
						MusicGame musicgame = new Rock();
						musicgame.musicGame();
						
					}
					
				});
				
				// "�߶��" ��ư�� ������ ��
				j1_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println("���� �帣 : �߶��");
						MusicGame musicgame = new Ballad();
						musicgame.musicGame();
					}
					
				});
				
				// "��" ��ư�� ������ ��
				j1_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println("���� �帣 : ��");
						MusicGame musicgame = new Dance();
						musicgame.musicGame();
					}
					
				});
				
			}
			
		});
		
		// "���ӹ��" ��ư�� ������ ��
		j2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<���� ���>");
				System.out.println("ȭ�鿡 ������ �뷡�� ���� �Ϻθ� ���� ������ ������ ���ߴ� �����Դϴ�.");
				System.out.println("���ӽ��� ��ư�� ������ ��, �߶��, �� 3���� ��ư�� ��Ÿ���ϴ�. 3���� �帣 �� ���ϴ� �帣�� �����ϸ� ������ �帣�� ���� ��� ����˴ϴ�.");
				System.out.println("������ ���ס�");
				System.out.println("1. �����̸��� �ѱ۷� ǥ���մϴ�.(�̸��� ������ ��쿡�� �ѱ۷� ǥ��)");
				System.out.println("2. �����̸�, �뷡���� ���Ⱑ �ִ� ��� �����ϰ� �ٿ��� ǥ���մϴ�.(ex ������ �񵵿���׷���)");
				System.out.println("3. �뷡�� ������ ������ ��� �ҹ��ڷ� ���� ���� ǥ���մϴ�.");
				System.out.println("4. ������ �뷡���� ���̴� ���⸦ �մϴ�.");
				System.out.println("5. ���信 '��Ʈ'��� �Է��ϸ� �ʼ� ��Ʈ�� ���ɴϴ�.");
				System.out.println();
			}
			
		});
		
		// "�����ϱ�" ��ư�� ������ ��
		j3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("<���� ����>");
				System.exit(0);
			}
			
		});
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
