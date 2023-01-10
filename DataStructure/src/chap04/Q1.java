package chap04;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(2);
		while(true) {
			System.out.println();
			System.out.printf("현재 데이터 개수 : %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)초기화"
					+ " (6)indexOf (7)isEmpty (8)isFull (0)종료: ");
			
			int menu = sc.nextInt();
			if(menu == 0) {
				break;
			}
			int x;
			switch(menu) {
			case 1:
				System.out.print("데이터 : ");
				x = sc.nextInt();
				try {
					s.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2:
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 : " + x + "입니다.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 : " + x + "입니다.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 4:
				s.dump();
				break;
			case 5:
				s.clear();
				break;
			case 6:
				System.out.print("스캔할 값을 입력해주세요 : ");
				int idx = s.indexOf(sc.nextInt());
				if(idx == -1) {
					System.out.println("값이 없습니다.");
				}else {
					System.out.println(idx + "번째에 값이 존재합니다.");
				}
				break;
			case 7:
				if(s.isEmpty()) {
					System.out.println("스택이 비어있습니다.");
				}else {
					System.out.println("스택이 비어있지 않습니다.");
				}
				break;
			case 8:
				if(s.isFull()) {
					System.out.println("스택이 꽉차있습니다.");
				}else {
					System.out.println("스택이 꽉차지않았습니다.");
				}
			}
		}
	}
}
