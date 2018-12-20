package ch5.code5_1;

public class MyTestableComplicatedInterface implements IComplicatedInterface {
	// 手刻虛設常式物件時做複雜的介面，需要每一個Function都設定完，
	// 很花時間，寫起來較麻煩
	// 若同一個Function被呼叫多次，該怎麼辦?
	
	public String meth1_a;
	public String meth1_b, meth2_b;
	public boolean meth1_c, meth2_c, meth3_c;
	public int meth1_x, meth2_x, meth3_x;
	public int meth1_o, meth2_o, meth3_o;
	@Override
	public void Method1(String a, String b, boolean c, int x, Object o) {
		meth1_a = a;
		meth1_b = b;
		meth1_c = c;
		meth1_x = x;
		meth1_o = (int) o;
	}

	@Override
	public void Method2(String b, boolean c, int x, Object o) {
		meth2_b = b;
		meth2_c = c;
		meth2_x = x;
		meth2_o = (int) o;
	}

	@Override
	public void Method3(boolean c, int x, Object o) {
		meth3_c = c;
		meth3_x = x;
		meth3_o = (int) o;
	}

}
