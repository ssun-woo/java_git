package main;

import java.util.Scanner;

import board.BoardService;
import edit.Edit;
import loginservice.Login;
import member.Member;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Edit e = new Edit();
		Login l = new Login();
		Member m = new Member();
		BoardService b = new BoardService();
		
		int num;
		while (true) {
			System.out.println("1. 로그인 기능");
			System.out.println("2. 회원 기능");
			System.out.println("3. 수정 기능");
			System.out.println("4. 게시판 기능");
			num = input.nextInt();

			switch (num) {
			case 1:
				l.login();
				break;
			case 2:
				m.member();
				break;
			case 3:
				e.edit();
				break;
			case 4:
				b.board();
				break;
			}
		}
	}

}
