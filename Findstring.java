public class NoOfOccurrenceOfCharacters
{
	static final int max _char=256;
	static void getOccuringchar(String str){

	
	int count[] = new int [max_char]
	int len = str.length();
	for( int i = 0;i< len; i++)
		count[str.charAt(i)]++;
	char ch[]= new char[str.length()];
	for( int i = 0; i < len; i++){
		ch[i]=str.charAt(i);
		int find = 0;
		for( int j=0; j<=i,j++){
			if(str.charAt(i)==ch[j])
				finf ++;
		}
		if (find==1)
			System.out.println("Number of occurence of" + str.charAt(i)+"is:" + count[str.charAt(i)]);
	}
	}
	public static void main(String[] args)
	{
		String str = "Nitish";
		getOccuringChar(str);
	}

}