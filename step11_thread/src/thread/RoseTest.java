package thread;
public class RoseTest extends Thread {
	private String str;
	

	public RoseTest(String str) {
		this.str = str;
	}


	@Override
	public void run() {
		for (int i = 1; i <= 300; i++) {
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
				}
				System.out.println(str+" "+Thread.currentThread());
		}
	}


	public static void main(String[] args) {
		RoseTest ob1 = new RoseTest("���");
		RoseTest ob2 = new RoseTest("���");
		RoseTest ob3 = new RoseTest("����");
		
		try {
			ob1.start();
			ob1.join();//ob1�� ���������� ob2,ob3�� ���
		} catch (InterruptedException e) {
		}
		ob2.start();
		ob3.start();
	}

}
/*public class RoseTest extends Thread {
	private String str;
	

	public RoseTest(String str) {
		this.str = str;
	}


	@Override
	public void run() {
		for (int i = 1; i <= 300; i++) {
			for (int j = 1; j < 2000000000; j++) {
				System.out.println(str+" "+Thread.currentThread());
			}
		}
	}


	public static void main(String[] args) {
		RoseTest ob1 = new RoseTest("���");
		RoseTest ob2 = new RoseTest("���");
		RoseTest ob3 = new RoseTest("����");

		ob1.setPriority(1);
		
		ob1.start();
		ob2.start();
		ob3.start();
	}

}*/
/*�켱����
: setPriority()�޼��带 �̿��Ͽ� �켱������ �ο��Ѵ�(1~10)
  �켱������ ���� ������� �켱������ ���� �����忡 ���� ����ð��� ���� �Ҵ� �޴´�.
  �ٸ� �����忡 ���� ���� ����ð��� �ʿ�� �Ѵٸ� �켱������ ���� �θ� �ȴ�.

MAX_PRIORITY    : �켱���� 10(�ְ����)
MIN_PRIORITY    : �켱���� 1(��������)
NORM_PRIORITY   : �켱���� 5(���� ������)

main�� �켱������ 5�� �����Ǿ� �ִ�.


join() : �� �������� ������ ���������� ����Ѵ�
*/