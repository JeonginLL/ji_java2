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
	public void run(){		//���
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

		t1.start();	//run�� �ƴ� start�� ȣ���ϸ� thread��ü�� ȣ�� run�� �޼ҵ带 ȣ���ϴ� ��
		t2.start();
		t3.start();*/
		
		//�̷��� ���� �� �����Ѵ�.
		new Thread(new MyThreadEx3("one", 100)).start();
		new Thread(new MyThreadEx3("two", 100)).start();
		new Thread(new MyThreadEx3("three", 100)).start();
		
		
		
	}

}
/* start()�� ������(VMThread)�� �����ϰ�, ���Ӱ� ������� Thread�� run()�� 
 * �����Ѵ�. run()�� ���� Runnable��ü�� run()�޼��带 ȣ���ϴ� ���̴�
 * 
 * ��, start()�� �ϱ����� new Thread()�� ���� �ϳ��� ��ü�� ���̰� start()��
 * �ؾ߸� ���� Thread�� ��������� ���̴�
  single thread 					multi thread
	-s1 ������ 						--	  --    --
	-s2     s2���۳�����				    --  --
	-s3				s3����			  --      --
							n�ʰɸ�	  			  n�� �ɸ�
 */