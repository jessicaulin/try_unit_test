package ch5.code5_1;

public class MyTestableComplicatedInterface implements IComplicatedInterface {
	// ����]�`������ɰ������������A�ݭn�C�@��Function���]�w���A
	// �ܪ�ɶ��A�g�_�Ӹ��·�
	// �Y�P�@��Function�Q�I�s�h���A�ӫ���?
	
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
