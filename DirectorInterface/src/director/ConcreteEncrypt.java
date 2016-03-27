package director;


public class ConcreteEncrypt implements EncryptComponet {

	private EncryptComponet encryptComponet;
	public ConcreteEncrypt(EncryptComponet encryptComponet) {
		super();
		this.encryptComponet = encryptComponet;
	}
	public void encrypt() {
		// TODO Auto-generated method stub
		encryptComponet.encrypt();
	}

}
