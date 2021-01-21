import java.util.HashMap;
import java.util.Map;
import java.util.Set;

	public class Map_Class {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      Map<String,String> map = new HashMap<String,String>();
	      map.put("Name", "Sonam");
	      map.put("Phone no", "9899435505");
	      map.put("Add", "Shalimatr Bagh");
	      map.put(null, "Null Key");
	   //   map.put(null, "Null Key1");
	      
	      System.out.println(map);
	     // System.out.println(map.get("Name")); 
	      
	      
	      Set<String> ks = map.keySet();
	      
	      for(String Keys :ks)
	      {
	    	  System.out.println(map.get(Keys));
	      }
	           
		}
	
}
