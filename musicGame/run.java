package musicGame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class run {

	public static void main(String[] args) throws Exception {
		//���� ����
		GameStart gamestart = new GameStart();
		
		//��ġ ��Ʈ
		Reader reader = new FileReader(
				run.class.getResource("1.2PatchNotes.txt").getPath());
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			String data = br.readLine();
			if(data==null) break;
			System.out.println(data);
		}
		
		br.close();

	}

}
