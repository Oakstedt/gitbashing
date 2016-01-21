
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
// Vad är detta för skit? Måste vara en total klåpare som skapat detta... Alltså allvarligt.
// Det är så uselt att jag tänker skriva en dikt om det:
//  
//  Kod är ful
//  Inget kul
//
// SE! Till och med poesing är kass.
public class C_HOBBS {
	private char[] charArray, searchArray;
	
	public FileParser() {
		charArray = parseTextFile("C:/Users/ae5832/Downloads/abracadabraabracadabra.txt");
		searchArray = search();
	}
	
	public char[] search(){
		String serch = JOptionPane.showInputDialog(null, "Hello.... What word are you looking for?");
		return serch.toCharArray();
	}
	
	
	public char[] parseTextFile(String textToParse) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(textToParse))) {
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString().toCharArray();
	}
	
	public char[] getSearchPattern(){
		return searchArray;
		
	}
	
	public char[] getCharArray(){
		return charArray;
		
	}

//	private void simpleCompare() {
//		int is = 0, complete = 0;
//		int sal = searchArray.length;
//		for (int i = 0; i < charArray.length; i++) {
//			if(charArray[i]==searchArray[is]){
//				is++;
//				System.out.println("Match at pos: "+ (i+1) + " in charArray. And pos: "+ is+" in searchArray");
//				if(sal == is){
//					is=0;
//					complete++;
//					System.out.println("The whole of the searchstring was found");
//				}
//			}else{
//				if(is>0){
//					System.out.println("Did not find the whole searchString, matches found: "+ is+" out of: "+sal);	
//				}
//				is=0;
//			}	
//		}
//	}
//	
//	private void naiveSearch() {
//		for (int i = 0; i < charArray.length; i++) {
//			if(charArray[i]==searchArray[0]){
//				compareArrays(i);		
//			}
//		}
//	}

//	private boolean compareArrays(int i) {
//		StringBuilder sb = new StringBuilder();
//		boolean boo = true;
//		try{
//			for (int j = 0; j < searchArray.length; j++) {
//				if(searchArray[j]==charArray[i]){
//					i++;
//					boo = true;
//					sb.append(searchArray[j]);
//				}else{
//					System.out.println("The prefix of the searchstring: " + sb.toString());
//					return false;
//				}
//			}
//			}catch(ArrayIndexOutOfBoundsException e){
//				System.out.println("The prefic of the searchstring: " + sb.toString());
//				return false;
//			}
//		System.out.println("The whole String matches: " + sb.toString());
//		return boo;
//	}
	

}
