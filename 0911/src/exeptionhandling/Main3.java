package exeptionhandling;

import java.util.Scanner;

public class Main3 {

	//메인에 throws를 만들면 예외가 발생한 경우 운영체제가 처리한다.
	//main은 운영체제가 호출하기 때문
	public static void main(String[] args) throws InterruptedException {
		// 1-10까지 대기하면서 출력하기
		for(int n = 1 ; n<=10 ; n= n+1) {
			System.out.printf("%d\n",n);
			//1초씩 대기			
				Thread.sleep(1000); //예외처리 해주지 않으면 에러 발생(sleep 속성)
		}
		
		//Scanner를 사용하는 경우 close()를 호출하지 않으면 메모리 누수(leak)
		//가 발생한다고 경고가 보인다.
		//try안에서 만들면 자동으로 마지막에 close()를 호출하기 때문에 경고가 발생하지 않는다.
		try(Scanner sc = new Scanner(System.in);){
		sc.hasNextInt();
		}
	
	}

}


