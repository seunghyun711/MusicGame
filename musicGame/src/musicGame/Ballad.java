package musicGame;

import java.util.Scanner;

//�帣 : �߶��

public class Ballad implements MusicGame {

	@Override
	public void musicGame() {
		int score = 0;
		String ans;
		System.out.println("<���ӽ���>");
		System.out.println();
		System.out.println("Q1");
		System.out.println("�� �׸��� �� �θ��� �� �Ϸ�� ���¿��� ����ģ �߾��� �ݰ���~");
		Scanner a1 = new Scanner(System.in);
		System.out.println("���� >> ");
		ans = a1.nextLine();
		if(ans.equals("���ð� �Ÿ�����")) {
			System.out.println("����!");
			score+=3;
		}
		else if(ans.equals("��Ʈ")){
			System.out.println();
			System.out.println("��Ʈ��");
			System.out.println("������ ��������");
			System.out.println();
			System.out.println("���� >> ");
			ans = a1.nextLine();
			if(ans.equals("���ð� �Ÿ�����")) {
				System.out.println("����!");
				score++;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.(���� : ���ð� - �Ÿ�����)");
			}
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.(���� : ���ð� - �Ÿ�����)");
		}
		
		System.out.println();
		System.out.println("Q2");
		System.out.println("�Ȱ��� ���� ���� ���� ��� ��𼭵� �Բ� �ִ� �Ŷ��~");
		Scanner a2 = new Scanner(System.in);
		System.out.println("���� >> ");
		ans = a2.nextLine();
		if(ans.equals("���� ��������")) {
			System.out.println("����!");
			score+=3;
		}
		else if(ans.equals("��Ʈ")){
			System.out.println();
			System.out.println("��Ʈ��");
			System.out.println("���� ��������");
			System.out.println();
			System.out.println("���� >> ");
			ans = a2.nextLine();
			if(ans.equals("���� �������")) {
				System.out.println("����!");
				score++;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.(���� : ���� - ���� ����)");
			}
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.(���� : ���� - ���� ����)");
		}
		
		System.out.println();
		System.out.println("Q3");
		System.out.println("����ؿ� ����ؿ� ���� �״뿡�� ������ �� ������ ������ �ȴ� ���� ��ĥ���� ������ �״��� ������ �Ǹ���~");
		Scanner a3 = new Scanner(System.in);
		System.out.println("���� >> ");
		ans = a3.nextLine();
		if(ans.equals("���������ʺ� ����")) {
			System.out.println("����!");
			score+=3;
		}
		else if(ans.equals("��Ʈ")){
			System.out.println();
			System.out.println("��Ʈ��");
			System.out.println("������������ ������");
			System.out.println();
			System.out.println("���� >> ");
			ans = a3.nextLine();
			if(ans.equals("���������ʺ� ����")) {
				System.out.println("����!");
				score++;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.(���� : SG���ʺ� - ����)");
			}
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.(���� : SG���ʺ� - ����)");
		}
		
		System.out.println();
		System.out.println("Q4");
		System.out.println("�ذ� �������� ����� ó�� ���� �׶��� �׸����� ���~");
		Scanner a4 = new Scanner(System.in);
		System.out.println("���� >> ");
		ans = a4.nextLine();
		if(ans.equals("��â�� �������������")) {
			System.out.println("����!");
			score+=3;
		}
		else if(ans.equals("��Ʈ")){
			System.out.println();
			System.out.println("��Ʈ��");
			System.out.println("������ ��������������");
			System.out.println();
			System.out.println("���� >> ");
			ans = a4.nextLine();
			if(ans.equals("��â�� �������������")) {
				System.out.println("����!");
				score++;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.(���� : ��â�� - ���� ������ ���)");
			}
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.(���� : ��â�� - ���� ������ ���)");
		}
		
		System.out.println();
		System.out.println("Q5");
		System.out.println("���Ҵ� ��︸ �׸��� ������ �ϰ� ������ �� �� ���� �̷��� ���� ���ִ�~");
		Scanner a5 = new Scanner(System.in);
		System.out.println("���� >> ");
		ans = a5.nextLine();
		if(ans.equals("��ȿ�� �߻�ȭ")) {
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
			if(ans.equals("��ȿ�� �߻�ȭ")) {
				System.out.println("����!");
				score++;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.(���� : ��ȿ�� - �߻�ȭ)");
			}
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.(���� : ��ȿ�� - �߻�ȭ)");
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
