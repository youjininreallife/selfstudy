package day21;

import java.util.Arrays;
import java.util.Scanner;

public class BANK6_OhMyDestiny {
	public static void main(String[] args) {
		//변수
		int num = 0;
		String [][]users = {
				{"" , "" , ""},
				{"" , "" , ""},
				{"" , "" , ""} 
		};
		
		
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			System.out.println(Arrays.deepToString(users)); //[[, , ], [, , ], [, , ]]
			for(;;) {
				System.out.print("\r\r========BANK=========\r\n"
										+ "1. 추가\r\n"
										+ "2. 조회\r\n"
										+ "3. 입금\r\n"
										+ "4. 출금\r\n"
										+ "5. 삭제\r\n"
										+ "9. 종료\r\n"
										+ "입력>>> " );	
				num = scanner.nextInt();
				if(num>=1&&num<=5||num==9); {break;}
			}
			switch(num) {
			case 1: {System.out.println("ㅁ추가기능입니다.");
				////추가가 가능한지 확인
				int find = -1;
				for(int i=0; i<users.length; i++) {
					if(users[i][0].equals("")) {find=i; break;}}
				
				if(find!=-1) {
					System.out.println("ㅁ 아이디설정 : "); users[find][0] = scanner.next();
					System.out.println("ㅁ 비밀번호설정 : "); users[find][1]= scanner.next();
					System.out.println("ㅁ 입금금액 : "); users[find][2] = String.valueOf(scanner.nextInt());
					System.out.println("\n등록되었습니다.");
				} else {System.out.println("더 이상 신규가입이 불가능합니다.");}
			} break;
			case 2 : {System.out.println("ㅁ 조회기능입니다.");
				//변수
				String temp_id="", temp_pass=""; int find = -1; //배열번호가 0부터 시작하므로
				//입력
				System.out.print("아이디 : "); temp_id = scanner.next();
				System.out.print("비밀번호 : "); temp_pass = scanner.next();
				//처리(1) - 유저확인
				for(int i=0; i<users.length; i++) {
					if(temp_id.equals(users[i][0])&&temp_pass.equals(users[i][1])) {find=i; break;}}
				//처리(2) - 조회 - 그 번호로 조회
				if(find!=-1) {
					System.out.println("ㅁ 아이디 : " + users[find][0] + "\n비밀번호 : " + users[find][1]
											+ "\n잔액 : " + users[find][2]);
				} else {System.out.println("아이디와 비밀번호를 확인해주세요");}
			} break;
			case 3 : {System.out.println("ㅁ 입금기능입니다.");
				//변수
				String temp_id="", temp_pass=""; double temp_balance=0; int find = -1; 
				//입력
				System.out.print("아이디 : "); temp_id = scanner.next();
				System.out.print("비밀번호 : "); temp_pass = scanner.next();
				//처리(1) - 유저확인
				for(int i=0; i<users.length; i++) {
					if(temp_id.equals(users[i][0])&&temp_pass.equals(users[i][1])) {find=i; break;}}
				//처리(2) - 입금처리
				if(find!=-1) {
					System.out.print("입금할 금액 > "); 
					temp_balance = scanner.nextDouble();
					if(temp_balance>0) {
						users[find][2] = 
								"" + (Integer.parseInt(users[find][2]) + temp_balance); // Integer.toString 와 "" 같은 기능
						System.out.println("ㅁ 아이디 : " + users[find][0] + "\n비밀번호 : " + users[find][1]
								+ "\n잔액 : " + users[find][2]);
					} else {System.out.println("입금할 금액을 확인해주세요");}
				} else {System.out.println("아이디와 비밀번호를 확인해주세요.");}
			} break;
			case 4 : {System.out.println("ㅁ 출금기능입니다.");
				//변수
				String temp_id="", temp_pass=""; double temp_balance=0; int find = -1; 
				//입력
				System.out.print("아이디 : "); temp_id = scanner.next();
				System.out.print("비밀번호 : "); temp_pass = scanner.next();
				//처리(1) - 유저확인
				for(int i=0; i<users.length; i++) {
					if(temp_id.equals(users[i][0])&&temp_pass.equals(users[i][1])) {find=i; break;}}
				//처리(2) - 출금처리
				if(find!=-1) {
					System.out.print("출금할 금액 > "); temp_balance = scanner.nextInt();
					if(temp_balance<Integer.parseInt(users[find][2])) { // 누적하면 안돼
						users[find][2] = "" +(Integer.parseInt(users[find][2]) - temp_balance); //ㅁ 문자열로 인식할 수 있도록 "" + 괄호로 () 묶어줌
						System.out.println("ㅁ 아이디 : " + users[find][0] + "\n비밀번호 : " + users[find][1]
								+ "\n잔액 : " + users[find][2]);
					} else {System.out.print("출금할 금액을 확인해주세요");}
				} else {System.out.print("아이디와 비밀번호를 확인해주세요.");}
			} break;
			case 5 : {System.out.println("ㅁ 삭제기능입니다.");
				//변수
				String temp_id="", temp_pass=""; double temp_balance=0; int find = -1; 
				//입력
				System.out.print("아이디 : "); temp_id = scanner.next();
				System.out.print("비밀번호 : "); temp_pass = scanner.next();
				//처리(1) - 유저확인
				for(int i=0; i<users.length; i++) {
					if(temp_id.equals(users[i][0])&&temp_pass.equals(users[i][1])) 
					{find=i; break;}}
				//처리(2) - 아이디 처리
				if(find!=-1) {
					users[find][0]=""; users[find][1]=""; users[find][2]="";
				} else {System.out.println("아이디와 비밀번호를 확인해주세요.");}
			} break;
			case 9 : {System.out.println("ㅁ 종료기능입니다.");} break;
			}if(num==9) {break;}
		
		}//end first_for(;;)
	}//end main
}//end class
