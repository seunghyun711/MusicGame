package musicGame_Ver1_2;

import java.util.Scanner;

//�帣 : ��

public class Dance implements MusicGame{

	@Override
	public void musicGame() {
		int score = 0;
		String ans;
		System.out.println("<���ӽ���>");
		System.out.println();
		System.out.println("Q1");
		System.out.println("�� �̹̹̹̹̹̹�ġ�� �;� �� ���� �ٶٶٶٶٶٶٶٰ� �;� �� ���� �������� �� Ǫ�� �ϴ�����~");
		Scanner a1 = new Scanner(System.in);
		System.out.println("���� >> ");
		ans = a1.nextLine();
		if(ans.equals("���ִϿ� ���̾�")) {
			System.out.println("����!");
			score+=3;
		}
		else if(ans.equals("��Ʈ")){
			System.out.println();
			System.out.println("��Ʈ��");
			System.out.println("�������� ������");
			System.out.println();
			System.out.println("���� >> ");
			ans = a1.nextLine();
			if(ans.equals("���ִϿ� ���̾�")) {
				System.out.println("����!");
				score++;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.(���� : 2NE1 - Fire)");
			}
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.(���� : 2NE1 - Fire)");
		}
		
		System.out.println();
		System.out.println("Q2");
		System.out.println("�̷��� ���� ���� �������� ���ϴ� �׷� ���� �� ������ ���� ���� ���� ���� ���� ����~ ");
		Scanner a2 = new Scanner(System.in);
		System.out.println("���� >> ");
		ans = a2.nextLine();
		if(ans.equals("������̵�ɽ� �ƺ��ī�ٺ��")) {
			System.out.println("����!");
			score+=3;
		}
		else if(ans.equals("��Ʈ")){
			System.out.println();
			System.out.println("��Ʈ��");
			System.out.println("���������������� ��������������");
			System.out.println();
			System.out.println("���� >> ");
			ans = a2.nextLine();
			if(ans.equals("������̵�ɽ� �ƺ��ī�ٺ��")) {
				System.out.println("����!");
				score++;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.(���� : ������̵�ɽ� - Abracadabra)");
			}
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.(���� : ������̵�ɽ� - Abracadabra)");
		}
		
		System.out.println();
		System.out.println("Q3");
		System.out.println("�� ���� ���� �� ���� ���� �� ���� ���� �� �� ����~ ");
		Scanner a3 = new Scanner(System.in);
		System.out.println("���� >> ");
		ans = a3.nextLine();
		if(ans.equals("����ű� �ֹ�")||ans.equals("����ű� �̷�ƽ")) {
			System.out.println("����!");
			score+=3;
		}
		else if(ans.equals("��Ʈ")){
			System.out.println();
			System.out.println("��Ʈ��");
			System.out.println("�������� ���� or �������� ������");
			System.out.println();
			System.out.println("���� >> ");
			ans = a3.nextLine();
			if(ans.equals("����ű� �ֹ�")||ans.equals("����ű� �̷�ƽ")) {
				System.out.println("����!");
				score++;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.(���� : ����ű� - �ֹ�(Mirotic)");
			}
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.(���� : ����ű� - �ֹ�(Mirotic))");
		}
		
		System.out.println();
		System.out.println("Q4");
		System.out.println("Baby �� ���� �� ó�� �Ⱦ��� �׸� ������ ���� �׸� �����~ ");
		Scanner a4 = new Scanner(System.in);
		System.out.println("���� >> ");
		ans = a4.nextLine();
		if(ans.equals("����ũ ������ó��")) {
			System.out.println("����!");
			score+=3;
		}
		else if(ans.equals("��Ʈ")){
			System.out.println();
			System.out.println("��Ʈ��");
			System.out.println("�������� ���������� ");
			System.out.println();
			System.out.println("���� >> ");
			ans = a4.nextLine();
			if(ans.equals("����ũ ������ó��")) {
				System.out.println("����!");
				score++;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.(���� : ����ũ - ������ó��)");
			}
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.(���� : ����ũ - ������ó��");
		}
		
		System.out.println();
		System.out.println("Q5");
		System.out.println("������ ���� ���� �״�� �޾Ƶ鿩 ������� �� alright �ϴ��� �����ϰ� �� ���� �� ���� ������ �� �ٰ� �;� oh~ ");
		Scanner a5 = new Scanner(System.in);
		System.out.println("���� >> ");
		ans = a5.nextLine();
		if(ans.equals("��� ��Ÿ��ƽ���̺�")) {
			System.out.println("����!");
			score+=3;
		}
		else if(ans.equals("��Ʈ")){
			System.out.println();
			System.out.println("��Ʈ��");
			System.out.println("���� �������������� ");
			System.out.println();
			System.out.println("���� >> ");
			ans = a5.nextLine();
			if(ans.equals("��� ��Ÿ��ƽ���̺�")) {
				System.out.println("����!");
				score++;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.(���� : ��� - Fantastic Baby)");
			}
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.(���� : ��� - Fantastic Baby");
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
