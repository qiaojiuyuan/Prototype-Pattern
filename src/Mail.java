
public class Mail implements Cloneable{

	private String receiver;
	private String sbuject;
	private String appelation;
	private String contxt;
	private String tail;
	
	public Mail(AdvTemplate advTemplate) {
		this.contxt = advTemplate.getAdvContext();
	}
	
	@Override
	protected Mail clone() throws CloneNotSupportedException {
		Mail mail = null;
		//使用此方法来获取对象引用
		mail = (Mail) super.clone();
		return mail;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSbuject() {
		return sbuject;
	}

	public void setSbuject(String sbuject) {
		this.sbuject = sbuject;
	}

	public String getAppelation() {
		return appelation;
	}

	public void setAppelation(String appelation) {
		this.appelation = appelation;
	}

	public String getContxt() {
		return contxt;
	}

	public void setContxt(String contxt) {
		this.contxt = contxt;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}
	
	
}
