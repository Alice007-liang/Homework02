import java.util.Scanner;
public class tip5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("����һ��1-15֮��������� ");
		int line = input.nextInt();
		for(int i=1;i<=line;i++){
            for(int j=1;j<=7-i;j++)
                System.out.print("  ");
            for(int j=i;j>1;j--)
                System.out.print(j+" ");
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.print('\n');
        }
		
	}

}
