package clock;

public class ClockMain {
	public static void main(String[] args) {
		DigitalClock dc=new DigitalClock("������ �ð�");
		Thread th=new Thread(dc);
		th.setDaemon(true);  //main�� ����Ǹ� ���� ����
		th.start();
	}
}
