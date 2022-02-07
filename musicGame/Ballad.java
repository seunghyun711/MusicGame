package musicGame;

import java.util.Scanner;

//장르 : 발라드

public class Ballad implements MusicGame {

	@Override
	public void musicGame() {
		int score = 0;
		String ans;
		System.out.println("<게임시작>");
		System.out.println();
		System.out.println("Q1");
		System.out.println("널 그리는 널 부르는 내 하루는 애태워도 마주친 추억이 반가워~");
		Scanner a1 = new Scanner(System.in);
		System.out.println("정답 >> ");
		ans = a1.nextLine();
		if(ans.equals("성시경 거리에서")) {
			System.out.println("정답!");
			score+=3;
		}
		else if(ans.equals("힌트")){
			System.out.println();
			System.out.println("힌트☆");
			System.out.println("ㅅㅅㄱ ㄱㄹㅇㅅ");
			System.out.println();
			System.out.println("정답 >> ");
			ans = a1.nextLine();
			if(ans.equals("성시경 거리에서")) {
				System.out.println("정답!");
				score++;
			}else {
				System.out.println("틀렸습니다.(정답 : 성시경 - 거리에서)");
			}
		}else {
			System.out.println("틀렸습니다.(정답 : 성시경 - 거리에서)");
		}
		
		System.out.println();
		System.out.println("Q2");
		System.out.println("똑같은 베개 베고서 잠이 들면 어디서든 함께 있는 거라던~");
		Scanner a2 = new Scanner(System.in);
		System.out.println("정답 >> ");
		ans = a2.nextLine();
		if(ans.equals("테이 같은베개")) {
			System.out.println("정답!");
			score+=3;
		}
		else if(ans.equals("힌트")){
			System.out.println();
			System.out.println("힌트☆");
			System.out.println("ㅌㅇ ㄱㅇㅂㄱ");
			System.out.println();
			System.out.println("정답 >> ");
			ans = a2.nextLine();
			if(ans.equals("테이 같은배게")) {
				System.out.println("정답!");
				score++;
			}else {
				System.out.println("틀렸습니다.(정답 : 테이 - 같은 베개)");
			}
		}else {
			System.out.println("틀렸습니다.(정답 : 테이 - 같은 베개)");
		}
		
		System.out.println();
		System.out.println("Q3");
		System.out.println("사랑해요 사랑해요 내가 그대에게 부족한 걸 알지만 세월을 걷다 보면 지칠때도 있지만 그대의 쉴곳이 되리라~");
		Scanner a3 = new Scanner(System.in);
		System.out.println("정답 >> ");
		ans = a3.nextLine();
		if(ans.equals("에스지워너비 라라라")) {
			System.out.println("정답!");
			score+=3;
		}
		else if(ans.equals("힌트")){
			System.out.println();
			System.out.println("힌트☆");
			System.out.println("ㅇㅅㅈㅇㄴㅂ ㄹㄹㄹ");
			System.out.println();
			System.out.println("정답 >> ");
			ans = a3.nextLine();
			if(ans.equals("에스지워너비 라라라")) {
				System.out.println("정답!");
				score++;
			}else {
				System.out.println("틀렸습니다.(정답 : SG워너비 - 라라라)");
			}
		}else {
			System.out.println("틀렸습니다.(정답 : SG워너비 - 라라라)");
		}
		
		System.out.println();
		System.out.println("Q4");
		System.out.println("잊고 잊혀지고 지우고 처음 만난 그때가 그리워진 사랑~");
		Scanner a4 = new Scanner(System.in);
		System.out.println("정답 >> ");
		ans = a4.nextLine();
		if(ans.equals("임창정 내가저지른사랑")) {
			System.out.println("정답!");
			score+=3;
		}
		else if(ans.equals("힌트")){
			System.out.println();
			System.out.println("힌트☆");
			System.out.println("ㅇㅊㅈ ㄴㄱㅈㅈㄹㅅㄹ");
			System.out.println();
			System.out.println("정답 >> ");
			ans = a4.nextLine();
			if(ans.equals("임창정 내가저지른사랑")) {
				System.out.println("정답!");
				score++;
			}else {
				System.out.println("틀렸습니다.(정답 : 임창정 - 내가 저지른 사랑)");
			}
		}else {
			System.out.println("틀렸습니다.(정답 : 임창정 - 내가 저지른 사랑)");
		}
		
		System.out.println();
		System.out.println("Q5");
		System.out.println("좋았던 기억만 그리원 마음만 니가 떠나간 그 길 위에 이렇게 남아 서있다~");
		Scanner a5 = new Scanner(System.in);
		System.out.println("정답 >> ");
		ans = a5.nextLine();
		if(ans.equals("박효신 야생화")) {
			System.out.println("정답!");
			score+=3;
		}
		else if(ans.equals("힌트")){
			System.out.println();
			System.out.println("힌트☆");
			System.out.println("ㅂㅎㅅ ㅇㅅㅎ");
			System.out.println();
			System.out.println("정답 >> ");
			ans = a5.nextLine();
			if(ans.equals("박효신 야생화")) {
				System.out.println("정답!");
				score++;
			}else {
				System.out.println("틀렸습니다.(정답 : 박효산 - 야생화)");
			}
		}else {
			System.out.println("틀렸습니다.(정답 : 박효산 - 야생화)");
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
