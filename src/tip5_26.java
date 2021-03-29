
public class tip5_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10000;i<=100000;i+=10000) {
			double num = 1.0;
			double e = 1.0;
			for(int j=1;j<=i;j++) {
				num/=j;
				e+=num;
			}
			System.out.printf("i=%d,e=%f\n",i,e);
		}
	}

}
