
public class KmpSearch {
	
	public int[] preProcessArray(char[] charArray) {
	    int i = 0, j = -1;
	    int caLength = charArray.length;
	    int[] b = new int[caLength + 1];
	 
	    b[i] = j;
	    while (i < caLength) {            
	            while (j >= 0 && charArray[i] != charArray[j]) {
	            // if there is mismatch consider the next widest border
	            // The borders to be examined are obtained in decreasing order from 
	            //  the values b[i], b[b[i]] etc.
	            j = b[j];
	        }
	        i++;
	        j++;
	        b[i] = j;
	    }
	    return b;
	}
	
	public void searchSubString(char[] text, char[] ptrn) {

        int i = 0, j = 0;
        // pattern and text lengths
        int ptrnLen = ptrn.length;
        int txtLen = text.length;
 
        // initialize new array and preprocess the pattern
        int[] b = preProcessArray(ptrn);
        while (i < txtLen) {
            while (j >= 0 && text[i] != ptrn[j]) {
                j = b[j];
            }
            i++;
            j++;
 
            // a match is found
            if (j == ptrnLen) {
                System.out.println("Found substring at index:" + (i - ptrnLen));
                j = b[j];
            }
        }
    }
}
