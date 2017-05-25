package testing;

import java.util.ArrayList;
import java.util.Collections;

public class JunitTesting {

	//No need for public methods right now
	int square(int x){
		return x*x;
	}

	int countA(String word){
		int count = 0;
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)=='a' || word.charAt(i)=='A'){
				count++;
			}
		}
		return count;
	}
	
	ArrayList<String> appendAndSort(ArrayList<String> wordArray1, ArrayList<String> wordArray2){
		wordArray1.removeAll(wordArray2); //remove duplicates
		wordArray1.addAll(wordArray2); //merge into wordArray1
		Collections.sort(wordArray1);
		return wordArray1;
	}
}
