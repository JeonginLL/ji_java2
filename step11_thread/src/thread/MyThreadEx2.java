package thread;
//Multi Thread
public class MyThreadEx2 extends Thread{
	String str;
	int num;
	
	public MyThreadEx2(String str, int num) {
		super();
		this.str = str;
		this.num = num;
	}
	@Override
	public void run(){		//»ó¼Ó
		for (int i = 0; i < num; i++) {
			try {
				System.out.println(str +":"+i);
				Thread.sleep(30);
			} catch (InterruptedException e) {
				
			}
		}
	}
	public static void main(String[] args) {
		MyThreadEx2 ob1 = new MyThreadEx2("one", 100);
		MyThreadEx2 ob2 = new MyThreadEx2("two", 100);
		MyThreadEx2 ob3 = new MyThreadEx2("three", 100);

		ob1.start();
		ob2.start();
		ob3.start();
	}

}
