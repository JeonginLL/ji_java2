package thread;
/*데몬쓰레드(daemon thread)
 * 일반쓰레드가 모두 종료되면 데몬쓰레드를 강제로 종료한다	
 * 일반쓰레드가 종료되면 데몬쓰레드의 존재 의미가 없기 때문이다
 * ex) 워드프로세서의 자동저장, 화면 자동 갱신등
 */
class Demon extends Thread{

	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(300);
				System.out.println("Hello");
			} catch (InterruptedException e) {}
		}
	}
}

public class MyThreadEx4 {

	public static void main(String[] args) throws InterruptedException {
		Demon ob = new Demon();
		ob.setDaemon(true);  	//true:main이 종료되면 demon도 종료
		//이 문장을 안쓰면 main이 종료돼도 run이 계속 돌고 있음
		ob.start();
		
		int n = 0;
		while(n<10){
			n++;
			Thread.sleep(300);
		}
	}

}
