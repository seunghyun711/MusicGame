package musicGame;

import java.util.Scanner;

// �帣 : ��

public class Rock implements MusicGame{

	@Override
	public void musicGame() {	
		int score = 0;
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
			score+=3;
		}
		
		else if(ans.equals("��Ʈ")){
			System.out.println();
			System.out.println("��Ʈ��");
			System.out.println("���� ����");
			System.out.println();
			System.out.println("���� >> ");
			ans = a1.nextLine();
			if(ans.equals("���� ����")) {
				System.out.println("����!");
				score+=1;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.(���� : ���� - ����)");
			}
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.(���� : ���� - ����)");
		}
	
		System.out.println();
		System.out.println("Q2");
		System.out.println("���ٶ� �ֳ����� �𳯸��� ���� ���� ������� �� �Ÿ��� ���� �ɾ��~");
		Scanner a2 = new Scanner(System.in);
		System.out.println("���� >> ");
		ans = a2.nextLine();
		if(ans.equals("����Ŀ����Ŀ ���ɿ���")) {
			System.out.println("����!");
			score+=3;
		}
		else if(ans.equals("��Ʈ")){
			System.out.println();
			System.out.println("��Ʈ��");
			System.out.println("������������ ��������");
			System.out.println();
			System.out.println("���� >> ");
			ans = a2.nextLine();
			if(ans.equals("����Ŀ����Ŀ ���ɿ���")) {
				System.out.println("����!");
				score+=1;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.(���� : ����Ŀ ����Ŀ - ���� ����)");
			}
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.(���� : ����Ŀ ����Ŀ - ���� ����)");
		}
		
		System.out.println();
		System.out.println("Q3");
		System.out.println("�Ϸ翡 �׹� ����� ���ϰ� ������ ���� �������� Ű���� ����~");
		Scanner a3 = new Scanner(System.in);
		System.out.println("���� >> ");
		ans = a3.nextLine();
		if(ans.equals("���� ��й�ȣ486")) {
			System.out.println("����!");
			score+=3;
		}
		else if(ans.equals("��Ʈ")){
			System.out.println();
			System.out.println("��Ʈ��");
			System.out.println("���� ��������486");
			System.out.println();
			System.out.println("���� >> ");
			ans = a3.nextLine();
			if(ans.equals("���� ��й�ȣ486")) {
				System.out.println("����!");
				score+=1;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.(���� : ���� - ��й�ȣ 486)");
			}
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.(���� : ���� - ��й�ȣ 486)");
		}
		
		System.out.println();
		System.out.println("Q4");
		System.out.println("�ʹ��� ���� ����� �� �� �ʹ��� ���� ����� ��~");
		Scanner a4 = new Scanner(System.in);
		System.out.println("���� >> ");
		ans = a4.nextLine();
		if(ans.equals("����Ƽ���Ϸ��� �������")) {
			System.out.println("����!");
			score+=3;
		}
		else if(ans.equals("��Ʈ")){
			System.out.println();
			System.out.println("��Ʈ��");
			System.out.println("�������������� ��������");
			System.out.println();
			System.out.println("���� >> ");
			ans = a4.nextLine();
			if(ans.equals("����Ƽ���Ϸ��� �������")) {
				System.out.println("����!");
				score+=1;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.(���� : FT���Ϸ��� - �������)");
			}
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.(���� : FT���Ϸ��� - �������)");
		}
		
		System.out.println();
		System.out.println("Q5");
		System.out.println("�� �ؾ�� �� ���� �� ������ �� ��� �ӿ���~");
		Scanner a5 = new Scanner(System.in);
		System.out.println("���� >> ");
		ans = a5.nextLine();
		if(ans.equals("���̺� ������")) {
			System.out.println("����!");
			score+=3;
		}
		else if(ans.equals("��Ʈ")){
			System.out.println();
			System.out.println("��Ʈ��");
			System.out.println("������ ������");
			System.out.println();
			System.out.println("���� >> ");
			ans = a5.nextLine();
			if(ans.equals("���̺� ������")) {
				System.out.println("����!");
				score+=1;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.(���� : YB - ������)");
			}
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.(���� : YB - ������)");
		}
		
		
		a1.close();
		a2.close();
		a3.close();
		a4.close();
		a5.close();
		
		System.out.println();
		System.out.println("Score>> " + score);
	}

}
