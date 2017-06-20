
public class ClientMain {

	private static int MAX_COUNT = 6;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		int i = 0;
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("招商银行");
		while(i < MAX_COUNT) {
			Mail cloneMail = mail.clone();
			cloneMail.setAppelation("张先生");
			sendMail(cloneMail);
			i++;
		}
	}
	
	public static void sendMail(Mail mail) {
		System.out.println("标题:"+mail.getSbuject()+",发送成功");
	}
}
