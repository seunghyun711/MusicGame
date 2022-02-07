package musicGame_Ver1_2;

import java.util.Scanner;

//장르 : 댄스

public class Dance implements MusicGame{

	@Override
	public void musicGame() {
		int score = 0;
		String ans;
		System.out.println("<게임시작>");
		System.out.println();
		System.out.println("Q1");
		System.out.println("난 미미미미미미미치고 싶어 더 빨리 뛰뛰뛰뛰뛰뛰뛰뛰고 싶어 저 높은 빌딩위로 저 푸른 하늘위로~");
		Scanner a1 = new Scanner(System.in);
		System.out.println("정답 >> ");
		ans = a1.nextLine();
		if(ans.equals("투애니원 파이어")) {
			System.out.println("정답!");
			score+=3;
		}
		else if(ans.equals("힌트")){
			System.out.println();
			System.out.println("힌트☆");
			System.out.println("ㅌㅇㄴㅇ ㅍㅇㅇ");
			System.out.println();
			System.out.println("정답 >> ");
			ans = a1.nextLine();
			if(ans.equals("투애니원 파이어")) {
				System.out.println("정답!");
				score++;
			}else {
				System.out.println("틀렸습니다.(정답 : 2NE1 - Fire)");
			}
		}else {
			System.out.println("틀렸습니다.(정답 : 2NE1 - Fire)");
		}
		
		System.out.println();
		System.out.println("Q2");
		System.out.println("이러다 미쳐 내가 여리여리 착하던 그런 내가 너 때문에 돌아 내가 독한 나로 변해 내가~ ");
		Scanner a2 = new Scanner(System.in);
		System.out.println("정답 >> ");
		ans = a2.nextLine();
		if(ans.equals("브라운아이드걸스 아브라카다브라")) {
			System.out.println("정답!");
			score+=3;
		}
		else if(ans.equals("힌트")){
			System.out.println();
			System.out.println("힌트☆");
			System.out.println("ㅂㄹㅇㅇㅇㄷㄱㅅ ㅇㅂㄹㅋㄷㅂㄹ");
			System.out.println();
			System.out.println("정답 >> ");
			ans = a2.nextLine();
			if(ans.equals("브라운아이드걸스 아브라카다브라")) {
				System.out.println("정답!");
				score++;
			}else {
				System.out.println("틀렸습니다.(정답 : 브라운아이드걸스 - Abracadabra)");
			}
		}else {
			System.out.println("틀렸습니다.(정답 : 브라운아이드걸스 - Abracadabra)");
		}
		
		System.out.println();
		System.out.println("Q3");
		System.out.println("넌 나를 원해 넌 내게 빠져 넌 내게 미쳐 헤어날 수 없어~ ");
		Scanner a3 = new Scanner(System.in);
		System.out.println("정답 >> ");
		ans = a3.nextLine();
		if(ans.equals("동방신기 주문")||ans.equals("동방신기 미로틱")) {
			System.out.println("정답!");
			score+=3;
		}
		else if(ans.equals("힌트")){
			System.out.println();
			System.out.println("힌트☆");
			System.out.println("ㄷㅂㅅㄱ ㅈㅁ or ㄷㅂㅅㄱ ㅁㄹㅌ");
			System.out.println();
			System.out.println("정답 >> ");
			ans = a3.nextLine();
			if(ans.equals("동방신기 주문")||ans.equals("동방신기 미로틱")) {
				System.out.println("정답!");
				score++;
			}else {
				System.out.println("틀렸습니다.(정답 : 동방신기 - 주문(Mirotic)");
			}
		}else {
			System.out.println("틀렸습니다.(정답 : 동방신기 - 주문(Mirotic))");
		}
		
		System.out.println();
		System.out.println("Q4");
		System.out.println("Baby 날 터질 것 처럼 안아줘 그만 생각해 뭐가 그리 어려워~ ");
		Scanner a4 = new Scanner(System.in);
		System.out.println("정답 >> ");
		ans = a4.nextLine();
		if(ans.equals("블랙핑크 마지막처럼")) {
			System.out.println("정답!");
			score+=3;
		}
		else if(ans.equals("힌트")){
			System.out.println();
			System.out.println("힌트☆");
			System.out.println("ㅂㄹㅍㅋ ㅁㅈㅁㅊㄹ ");
			System.out.println();
			System.out.println("정답 >> ");
			ans = a4.nextLine();
			if(ans.equals("블랙핑크 마지막처럼")) {
				System.out.println("정답!");
				score++;
			}else {
				System.out.println("틀렸습니다.(정답 : 블랙핑크 - 마지막처럼)");
			}
		}else {
			System.out.println("틀렸습니다.(정답 : 블랙핑크 - 마지막처럼");
		}
		
		System.out.println();
		System.out.println("Q5");
		System.out.println("정답은 묻지 말고 그대로 받아들여 느낌대로 가 alright 하늘을 마주하고 두 손을 다 위로 저위로 날 뛰고 싶어 oh~ ");
		Scanner a5 = new Scanner(System.in);
		System.out.println("정답 >> ");
		ans = a5.nextLine();
		if(ans.equals("빅뱅 판타스틱베이비")) {
			System.out.println("정답!");
			score+=3;
		}
		else if(ans.equals("힌트")){
			System.out.println();
			System.out.println("힌트☆");
			System.out.println("ㅂㅂ ㅍㅌㅅㅌㅂㅇㅂ ");
			System.out.println();
			System.out.println("정답 >> ");
			ans = a5.nextLine();
			if(ans.equals("빅뱅 판타스틱베이비")) {
				System.out.println("정답!");
				score++;
			}else {
				System.out.println("틀렸습니다.(정답 : 빅뱅 - Fantastic Baby)");
			}
		}else {
			System.out.println("틀렸습니다.(정답 : 빅뱅 - Fantastic Baby");
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
