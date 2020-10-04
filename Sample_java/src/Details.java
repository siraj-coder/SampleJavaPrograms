import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 
public class Details {
 
  public void countDupChars(String str){
 
    
    Map<Character, Integer> map = new HashMap<Character, Integer>(); 
 
    
    char[] chars = str.toCharArray();
 
       for(Character ch:chars){
      if(map.containsKey(ch)){
         map.put(ch, map.get(ch)+1);
      } else {
         map.put(ch, 1);
        }
    }
 
   
    Set<Character> keys = map.keySet();
 
    for(Character ch:keys){
      if(map.get(ch) > 1){
        System.out.println("Char "+ch+" "+map.get(ch));
      }
    }
  }
 
  public static void main(String a[]){
    Details obj = new Details();
    System.out.println("String: ItachiUchiha");
    System.out.println("-------------------------");
    obj.countDupChars("ItachiUchiha");
  
    System.out.println("\nString: JinKazama");
    System.out.println("-------------------------");
    obj.countDupChars("JinKazama");
 
    System.out.println("\nString: #@$@!#$%!!%@");
    System.out.println("-------------------------");
    obj.countDupChars("#@$@!#$%!!%@");
  }
}
