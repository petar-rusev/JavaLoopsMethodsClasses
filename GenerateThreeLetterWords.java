import java.util.Scanner;


public class GenerateThreeLetterWords {

	public static void main(String[] args) {
		try(Scanner input=new Scanner(System.in)){
			String chars=input.next();
			  char[] charArray = chars.toCharArray();
			  
			  for(int i=0;i<3;i++){
				  charArray[i]=chars.charAt(i);
				  for(int j=0;j<3;j++){
					  charArray[j]=chars.charAt(j);
					  for(int k=0;k<3;k++){
						  charArray[k]=chars.charAt(k);
						  System.out.printf("%s%s%s \n",charArray[i],charArray[j],charArray[k]);
					  }
				  }
				  
				  
			  }
		}
		}

	}


