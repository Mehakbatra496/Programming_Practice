package programpractice;
import java.util.HashMap;

public class C5_StringArray 
{
    public static void main(String[] args) 
    {
        int count=0;
        String st="I am am new new new hh computer";
        String arr[]= st.split(" ");
        HashMap<String, Integer> hash= new HashMap();
        
        for(int i=0; i<arr.length; i++)
        {
            if(hash.containsKey(arr[i]))
            {
                count=hash.get(arr[i]);
                count=count+1;
                hash.put(arr[i], count);
//                System.out.println(arr[i]+" is time "+count);
//                
//
            }
            else
            {
                hash.put(arr[i], 1);
            }
        }
        
        System.out.println(hash);        
    }
}
