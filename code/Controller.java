
public class Controller {

	public Controller(){
		FileParser fp = new FileParser();
		char[] search = fp.getSearchPattern();
		char[] pattern = fp.getCharArray();

		KmpSearch kmp = new KmpSearch();
		kmp.searchSubString(search, pattern);
	}
	
	public static void main(String [] args){
		Controller c = new Controller();
	}
}
