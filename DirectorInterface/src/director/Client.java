package director;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncryptComponet ss,abc1,abc2,abc3;
		ss = new RawData();
		abc1 = new TranslateEncrypt(ss);
		//abc1.encrypt();
		abc2 = new ReversEncrypt(abc1);
		//abc2.encrypt();
		abc3 = new SuperEncrypt(abc2);
		abc3.encrypt();
	}

}
