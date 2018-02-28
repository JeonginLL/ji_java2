package thread;
/*���󾲷���(daemon thread)
 * �Ϲݾ����尡 ��� ����Ǹ� ���󾲷��带 ������ �����Ѵ�	
 * �Ϲݾ����尡 ����Ǹ� ���󾲷����� ���� �ǹ̰� ���� �����̴�
 * ex) �������μ����� �ڵ�����, ȭ�� �ڵ� ���ŵ�
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
		ob.setDaemon(true);  	//true:main�� ����Ǹ� demon�� ����
		//�� ������ �Ⱦ��� main�� ����ŵ� run�� ��� ���� ����
		ob.start();
		
		int n = 0;
		while(n<10){
			n++;
			Thread.sleep(300);
		}
	}

}
