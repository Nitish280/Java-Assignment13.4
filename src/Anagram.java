/*
 * here we are creating the program to find the anagram set
 *  
 */
import java.util.ArrayList;
import java.util.Arrays;
//here we are creating a class Anagram
public class Anagram {
	public static void main(String arr[])
	{
		  // TODO Auto-generated method stub
		//here we are creating an array
        String[] input = { "listen", "pot", "part", "opt", "trap", "silent", "top", "this", "hello", "hits", "what",
                "shit" };
        String[] newArr = new String[input.length];
        
        
        //sort and store in an new array
        for (int index = 0;index<input.length;index++) {
            char[] ar = input[index].toCharArray();
            //here are applying the sort method for the array
            Arrays.sort(ar);
            //here we are creating a new String
            String a = new String(ar);
            newArr[index] = a;                        
        }

        //search matches and create sets
        for (int index1=0; index1<newArr.length;index1++) {
        	//here we are creating a arrayList of string type
            ArrayList<String> array = new ArrayList<String>();
            
            for(int index2=0;index2<newArr.length;index2++){
                if(newArr[index1].equals(newArr[index2])){
                    //System.out.print(input[index2]);
                    array.add(input[index2]);
                }
                
            }
            //here it will  initialize element of new set 
            for(String element: array){
                System.out.print("{"+element+"}");
            }
            System.out.print("\n......\n" );
        }
    }

}
	
	