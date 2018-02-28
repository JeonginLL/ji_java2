package thread;
// single thread 
public class MyThreadEx1 {
	String str;
	int num;
	
	public MyThreadEx1(String str, int num) {
		super();
		this.str = str;
		this.num = num;
	}
	public void view(){
		for (int i = 0; i < num; i++) {
			try {
				System.out.println(str +":"+i);
				Thread.sleep(30);
			} catch (InterruptedException e) {
				
			}
		}
	}
	public static void main(String[] args) {
		MyThreadEx1 ob1 = new MyThreadEx1("one", 100);
		MyThreadEx1 ob2 = new MyThreadEx1("two", 100);
		MyThreadEx1 ob3 = new MyThreadEx1("three", 100);

		ob1.view();
		ob2.view();
		ob3.view();
		//one:1-99 다끝나고 two:1-99 다끝나고 three:1-99가 끝난다
	}

}
