//A program to generate random words, not real words mind you.  Just something fun I tried at one point

public class WordGen
{
	
	//A random number Generator
	public static void RandNumGen (int a, int c, int m, int xCur, int n, int [] temp)
	{
		int x = n, xNext = xCur;
		int y = 0;
		while(x >= 0)
		{
			xNext = (a * xNext + c) % m;
			temp[y] = xNext;
			x--;
			y++;
		}
	}
	public static void main (String [] args)
	{
		//Read in our arguments
		int size = Integer.parseInt(args[1]); 
		int seed = Integer.parseInt(args[0]); 
		int numWords = Integer.parseInt(args[2]);
		int [] word = new int[size];
		char [] randWord = new char[size];
		for(int j = 0; j < numWords; j++) //Logic for word generation
		{
			RandNumGen(445, 700001, 2097152, seed, size - 1, word);  
			seed = word[size - 1];
			
			//loop through word array and set even numbers from 1 - 19 and odd numbers from 1 - 5 
			for(int i = 0; i < word.length; i++)
			{
				if(i%2 == 0)
					word[i] = word[i]%19 + 1;
				else	
					word[i] = word[i]%5 + 1;
			}
			for(int i = 0; i < word.length; i++)
			{
				if(i%2 == 0)  //Even numbers are represented as consonants.  q and y are not used.
					switch(word[i])
					{
						case 1:
							randWord[i] = 'b';
							break;
						case 2: 
							randWord[i] = 'c';
							break;
						case 3: 
							randWord[i] = 'd';
							break;
						case 4: 
							randWord[i] = 'f';
							break;
						case 5: 
							randWord[i] = 'g';
							break;
						case 6:
							randWord[i] = 'h';
							break;
						case 7:
							randWord[i] = 'j';
							break;
						case 8:
							randWord[i] = 'k';
							break;
						case 9:
							randWord[i] = 'l';
							break;
						case 10:
							randWord[i] = 'm';
							break;
						case 11: 
							randWord[i] = 'n';
							break;
						case 12: 
							randWord[i] = 'p';
							break;
						case 13:
							randWord[i] = 'r';
							break;
						case 14:
							randWord[i] = 's';
							break;
						case 15:
							randWord[i] = 't';
							break;
						case 16: 
							randWord[i] = 'v';
							break;
						case 17:
							randWord[i] = 'w';
							break;
						case 18: 
							randWord[i] = 'x';
							break;
						case 19:
							randWord[i] = 'z';
							break;
					}
				else  //odd numbers are replaced with vowels
					switch(word[i])
					{
						case 1:
							randWord[i] = 'a';
							break;
						case 2:
							randWord[i] = 'e';
							break;
						case 3:
							randWord[i] = 'i';
							break;
						case 4:
							randWord[i] = 'o';
							break;
						case 5:
							randWord[i] = 'u';
							break;
					}
			}
			System.out.println(randWord);
		}
	}
}