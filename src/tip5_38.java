import java.util.Scanner;
public class tip5_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int ass = input.nextInt();
	        int mi = 1;
	        while(Math.pow(8,mi)<=ass)
	            mi++;
	        mi--;
	        for(int i=mi;i>=0;i--){
	            System.out.print((int)(ass/Math.pow(8,i)));
	            ass%=(int)(Math.pow(8,i));
	        }
	}

}
