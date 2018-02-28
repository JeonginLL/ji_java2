package thread;

public class MyThreadEx3 implements Runnable{
	String str;
	int num;
	
	public MyThreadEx3(String str, int num) {
		super();
		this.str = str;
		this.num = num;
	}
	@Override
	public void run(){		//상속
		for (int i = 0; i < num; i++) {
			try {
				System.out.println(str +":"+i);
				Thread.sleep(30);
			} catch (InterruptedException e) {
				
			}
		}
	}
	public static void main(String[] args) {
/*		MyThreadEx3 ob1 = new MyThreadEx3("one", 100);
		MyThreadEx3 ob2 = new MyThreadEx3("two", 100);
		MyThreadEx3 ob3 = new MyThreadEx3("three", 100);

		Thread t1 = new Thread(ob1);
		Thread t2 = new Thread(ob2);
		Thread t3 = new Thread(ob3);

		t1.start();	//run이 아닌 start를 호출하면 thread자체를 호출 run은 메소드를 호출하는 것
		t2.start();
		t3.start();*/
		
		//이렇게 쓰는 걸 권장한다.
		new Thread(new MyThreadEx3("one", 100)).start();
		new Thread(new MyThreadEx3("two", 100)).start();
		new Thread(new MyThreadEx3("three", 100)).start();
		
		
		
	}

}
/* start()는 쓰레드(VMThread)를 생성하고, 새롭게 만들어진 Thread가 run()을 
 * 실행한다. run()은 단지 Runnable객체의 run()메서드를 호출하는 것이다
 * 
 * 즉, start()를 하기전에 new Thread()는 단지 하나의 객체일 뿐이고 start()를
 * 해야만 실제 Thread가 만들어지는 것이다
  single thread 					multi thread
	-s1 끝나면 						--	  --    --
	-s2     s2시작끝나면				    --  --
	-s3				s3시작			  --      --
							n초걸림	  			  n초 걸림
 */