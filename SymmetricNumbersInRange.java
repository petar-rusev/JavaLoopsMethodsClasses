import java.util.Scanner;


public class SymmetricNumbersInRange {
public static boolean symmetric(int numbertoCheck){
	boolean check=false;
	String number=Integer.toString(numbertoCheck);
	if(numbertoCheck<10|numbertoCheck==11){
		check=true;
	}
	else{
		for(int i=0;i<number.length()/2;i++){
			for(int x=number.length()-1;x>number.length()/2;x--){
				if(number.charAt(i)==number.charAt(x)){
					check=true;
				}
				else{
					check=false;
				}
			}
		}
	}
	if(number.length()%2==0){
		for(int i=0;i<number.length()/2;i++){
			for(int x=number.length()-1;x>=number.length()/2;x--){
				if(number.charAt(i)==number.charAt(x)){
					check=true;
				}
				else{
					check=false;
				}
			}
		}//1234
	}
	
	return check;
	
}
	public static void main(String[] args) {
		System.out.println("Please enter the range numbers (from) (to)");
		try(Scanner input=new Scanner(System.in)){
			int from=input.nextInt();
			int to=input.nextInt();
			boolean isSymmetric=false;
			
			for(int i=from;i<=to;i++){
				isSymmetric=symmetric(i);
				if(isSymmetric==true){
					System.out.printf("%s\n",i);
				}
			}
			
		}
	}

}
