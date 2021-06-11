
package arraych;

import java.util.ArrayList;
import java.util.List;


public class ArrayCh {

    
    public static void main(String[] args) {
        //Changeable string array numbers
        String[] list ={"[5, 2, 3,5,6,4,2,2]","[2, 2, 3, 10, 6,15,12,3,4,5,6]"}; 
        
        List<Integer> numbers = new ArrayList<Integer>();
        int array1=0;
        int array2=0;
        int x=0;
       
        for(String par: list){
            for(String text : par.split("\\D+")){
                if(text.isEmpty()){
                    continue;
                }
                else{             
                    numbers.add(Integer.parseInt(text));
                    x++;
                }
            }
            array1 = numbers.size()-x;
            x=0;
        }
        
        array2 = numbers.size()- array1;
        int[] dizi1= new int[array1];
        int[] dizi2= new int[array2];
        int y=0;
        
        for (int i = 0; i < dizi1.length; i++) {
            dizi1[i]= numbers.get(i);
            y++;
        }
        
        for (int i = 0; i < dizi2.length; i++) {
            dizi2[i]=numbers.get(y);
            y++;
        }
        
        List<Integer> result = new ArrayList<Integer>();
        int m=0;
        
        if(dizi1.length<dizi2.length){
            for (int i = 0; i <= dizi1.length; i++) {    
                result.add(dizi1[i]+dizi2[i]);
                m++;
            }
            for (int i = m; i < dizi2.length; i++) {
            result.add(dizi2[m]);
            m++;
            }
        }else{
            for (int i = 0; i < dizi2.length; i++) {    
                result.add(dizi1[i]+dizi2[i]);
                m++;
            }
            for (int i = m; i < dizi1.length; i++) {
            result.add(dizi1[m]);
            m++;
            }
        }       
        
        for(int a: result)
            System.out.println(a);
        
    }
    
}
