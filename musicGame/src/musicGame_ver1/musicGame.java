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
		
		JButton j1 = new JButton("�����ϱ�");
		JButton j2 = new JButton("���ӹ��");
		JButton j3 = new JButton("�����ϱ�");
		JButton j4 = new JButton("��Ʈ");
		
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
				System.out.println("<���ӽ���>");
				System.out.println();
				System.out.println("Q1");
				System.out.println("�״� ����� ���� �����~");
				Scanner a1 = new Scanner(System.in);
				System.out.println("���� >> ");
				ans = a1.nextLine();
				if(ans.equals("���� ����")) {
					System.out.println("����!");
					sum++;
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�.(���� - ���� ����)");
				}
				
				System.out.println();
				System.out.println("Q2");
				System.out.println("���ٶ� �ֳ����� �𳯸��� ���� ���� ������� �� �Ÿ��� ���� �ɾ��~");
				Scanner a2 = new Scanner(System.in);
				System.out.println("���� >> ");
				ans = a2.nextLine();
				if(ans.equals("����Ŀ����Ŀ ���ɿ���")) {
					System.out.println("����!");
					sum++;
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�.(���� : ����Ŀ ����Ŀ - ���� ����)");
				}
				
				System.out.println();
				System.out.println("Q3");
				System.out.println("�ʸ� ���� �� ������ ����� ������ �̺� �տ��� �� �� �ִ� ��~");
				Scanner a3 = new Scanner(System.in);
				System.out.println("���� >> ");
				ans = a3.nextLine();
				if(ans.equals("���������ʺ� timeless")) {
					System.out.println("����!");
					sum++;
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�.(���� : SG���ʺ� - Timeless)");
				}
				
				System.out.println();
				System.out.println("Q4");
				System.out.println("������ ���ݾ� ������ ���ݾ� �������� ��ġ�� �� �Ŵ�~");
				Scanner a4 = new Scanner(System.in);
				System.out.println("���� >> ");
				ans = a4.nextLine();
				if(ans.equals("������ ���������")) {
					System.out.println("����!");
					sum++;
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�.(���� : ������ - �� ���� ���)");
				}
				
				System.out.println();
				System.out.println("Q5");
				System.out.println("����ؿ� ����ؿ� ���� �״뿡�� �����Ѱ� ������~");
				Scanner a5 = new Scanner(System.in);
				System.out.println("���� >> ");
				ans = a5.nextLine();
				if(ans.equals("���������ʺ� ����")) {
					System.out.println("����!");
					sum++;
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�.(���� : SG���ʺ� - ����)");
				}
				
				System.out.println();
				System.out.println("Q6");
				System.out.println("�츮�� ���� �츮�� ��� �� ������ ��ӵ���~");
				Scanner a6 = new Scanner(System.in);
				System.out.println("���� >> ");
				ans = a6.nextLine();
				if(ans.equals("���� �ٶ����")) {
					System.out.println("����!");
					sum++;
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�.(���� : ���� - �ٶ����)");
				}
				
				System.out.println();
				System.out.println("Q7");
				System.out.println("���� ���� ���� ���� �״븦 �����ٰ� �� ���� ���������~");
				Scanner a7 = new Scanner(System.in);
				System.out.println("���� >> ");
				ans = a7.nextLine();
				if(ans.equals("�¿� �״��½�")) {
					System.out.println("����!");
					sum++;
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�.(���� : �¿� - �״��� ��)");
				}
				
				System.out.println();
				System.out.println("Q8");
				System.out.println("�̻��ϰ� �����ص� ��¿ �� ���� �������ϱ�~");
				Scanner a8 = new Scanner(System.in);
				System.out.println("���� >> ");
				ans = a8.nextLine();
				if(ans.equals("Ʈ���̽� heartshaker")) {
					System.out.println("����!");
					sum++;
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�.(���� : Ʈ���̽� - Heart Shaker)");
				}
				
				System.out.println();
				System.out.println("Q9");
				System.out.println("�ٽ� �� ���� ��� ���������� Ȥ�� ã�ư��� �ι� �ٽ� ���� ��������� ����~");
				Scanner a9 = new Scanner(System.in);
				System.out.println("���� >> ");
				ans = a9.nextLine();
				if(ans.equals("���� monologue")) {
					System.out.println("����!");
					sum++;
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�.(���� : ���� - Monologue)");
				}
				
				System.out.println();
				System.out.println("Q10");
				System.out.println("��� ������ �ϴ� ���ϵ� ���� �̾߱�~");
				Scanner a10 = new Scanner(System.in);
				System.out.println("���� >> ");
				ans = a10.nextLine();
				if(ans.equals("��â�� �Ϸ絵�״븦��������������̾�����")) {
					System.out.println("����!");
					sum++;
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�.(���� : ��â�� - �Ϸ絵 �״븦 ������� ���� ���� ������)");
				}
				
				System.out.println();
				System.out.println("���>> " + sum + "/10");
			}
			
		});
		
		j2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<���� ���>");
				System.out.println("ȭ�鿡 ������ �뷡�� ���� �Ϻθ� ���� ������ ������ ���ߴ� �����Դϴ�.");
				System.out.println("������ ���ס�");
				System.out.println("1. �����̸��� �ѱ۷� ǥ���մϴ�.(�̸��� ������ ��쿡�� �ѱ۷� ǥ��)");
				System.out.println("2. �����̸�, �뷡���� ���Ⱑ �ִ� ��� �����ϰ� �ٿ��� ǥ���մϴ�.(ex ������ �񵵿���׷���)");
				System.out.println("3. �뷡�� ������ ������ ��� �ҹ��ڷ� ���� ���� ǥ���մϴ�.");
				System.out.println("4. ������ �뷡���� ���̴� ���⸦ �մϴ�.");
				System.out.println();
			}
			
		});
		
		j3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("<���� ����>");
				System.exit(0);
			}
			
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	

	
	
		
}
	
	


