
public class tip5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fee = 10000.0;
		double rate = 0.05;
		double fee1 = 0;
		double s = fee;
		for(int i = 0; i < 10; i++) {
			fee1 = s * (1.0 + rate);
			s = fee1;//s Ϊʮ����ѧ��
		}
		double sum = 0;
		double s1 = s;
		double fee2 = 0;
		for(int j = 0; j < 4; j++) {
			fee2 = s1 * (1+rate);
			s1 = fee2;
			sum += s1;//sumΪ�ӵ�10���������ڵ�ѧ���ܺ�
		}
		System.out.println("10����ѧ��Ϊ�� " + s);
		System.out.println("10������������ڵ�ѧ��Ϊ�� " + sum);
	}

}
