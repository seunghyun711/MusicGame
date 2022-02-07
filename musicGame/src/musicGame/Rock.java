package musicGame;

import java.util.Scanner;

// 장르 : 락

public class Rock implements MusicGame{

	@Override
	public void musicGame() {	
		int score = 0;
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
			score+=3;
		}
		
		else if(ans.equals("힌트")){
			System.out.println();
			System.out.println("힌트☆");
			System.out.println("ㅂㅈ ㄱㅅ");
			System.out.println();
			System.out.println("정답 >> ");
			ans = a1.nextLine();
			if(ans.equals("버즈 가시")) {
				System.out.println("정답!");
				score+=1;
			}else {
				System.out.println("틀렸습니다.(정답 : 버즈 - 가시)");
			}
		}else {
			System.out.println("틀렸습니다.(정답 : 버즈 - 가시)");
		}
	
		System.out.println();
		System.out.println("Q2");
		System.out.println("봄바람 휘날리며 흩날리는 벚꽃 잎이 울려퍼질 이 거리를 둘이 걸어요~");
		Scanner a2 = new Scanner(System.in);
		System.out.println("정답 >> ");
		ans = a2.nextLine();
		if(ans.equals("버스커버스커 벚꽃엔딩")) {
			System.out.println("정답!");
			score+=3;
		}
		else if(ans.equals("힌트")){
			System.out.println();
			System.out.println("힌트☆");
			System.out.println("ㅂㅅㅋㅂㅅㅋ ㅂㄲㅇㄷ");
			System.out.println();
			System.out.println("정답 >> ");
			ans = a2.nextLine();
			if(ans.equals("버스커버스커 벚꽃엔딩")) {
				System.out.println("정답!");
				score+=1;
			}else {
				System.out.println("틀렸습니다.(정답 : 버스커 버스커 - 벚꽃 엔딩)");
			}
		}else {
			System.out.println("틀렸습니다.(정답 : 버스커 버스커 - 벚꽃 엔딩)");
		}
		
		System.out.println();
		System.out.println("Q3");
		System.out.println("하루에 네번 사랑을 말하고 여덢번 웃고 여섯번의 키스를 해줘~");
		Scanner a3 = new Scanner(System.in);
		System.out.println("정답 >> ");
		ans = a3.nextLine();
		if(ans.equals("윤하 비밀번호486")) {
			System.out.println("정답!");
			score+=3;
		}
		else if(ans.equals("힌트")){
			System.out.println();
			System.out.println("힌트☆");
			System.out.println("ㅇㅎ ㅂㅁㅂㅎ486");
			System.out.println();
			System.out.println("정답 >> ");
			ans = a3.nextLine();
			if(ans.equals("윤하 비밀번호486")) {
				System.out.println("정답!");
				score+=1;
			}else {
				System.out.println("틀렸습니다.(정답 : 윤하 - 비밀번호 486)");
			}
		}else {
			System.out.println("틀렸습니다.(정답 : 윤하 - 비밀번호 486)");
		}
		
		System.out.println();
		System.out.println("Q4");
		System.out.println("너무나 많이 사랑한 죄 널 너무나 많이 사랑한 죄~");
		Scanner a4 = new Scanner(System.in);
		System.out.println("정답 >> ");
		ans = a4.nextLine();
		if(ans.equals("에프티아일랜드 사랑앓이")) {
			System.out.println("정답!");
			score+=3;
		}
		else if(ans.equals("힌트")){
			System.out.println();
			System.out.println("힌트☆");
			System.out.println("ㅇㅍㅌㅇㅇㄹㄷ ㅅㄹㅇㅇ");
			System.out.println();
			System.out.println("정답 >> ");
			ans = a4.nextLine();
			if(ans.equals("에프티아일랜드 사랑앓이")) {
				System.out.println("정답!");
				score+=1;
			}else {
				System.out.println("틀렸습니다.(정답 : FT아일랜드 - 사랑앓이)");
			}
		}else {
			System.out.println("틀렸습니다.(정답 : FT아일랜드 - 사랑앓이)");
		}
		
		System.out.println();
		System.out.println("Q5");
		System.out.println("널 잊어야 해 힘들어도 널 지워야 해 기억 속에서~");
		Scanner a5 = new Scanner(System.in);
		System.out.println("정답 >> ");
		ans = a5.nextLine();
		if(ans.equals("와이비 잊을께")) {
			System.out.println("정답!");
			score+=3;
		}
		else if(ans.equals("힌트")){
			System.out.println();
			System.out.println("힌트☆");
			System.out.println("ㅇㅇㅂ ㅇㅇㄲ");
			System.out.println();
			System.out.println("정답 >> ");
			ans = a5.nextLine();
			if(ans.equals("와이비 잊을께")) {
				System.out.println("정답!");
				score+=1;
			}else {
				System.out.println("틀렸습니다.(정답 : YB - 잊을께)");
			}
		}else {
			System.out.println("틀렸습니다.(정답 : YB - 잊을께)");
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
