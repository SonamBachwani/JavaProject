import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Read_Json {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
   JSONParser Js = new JSONParser();
   
   try {
	FileReader fr = new FileReader("C:\\Users\\gur28443\\Desktop\\BH\\tax\\employees.json");
      Object obj = Js.parse(fr);
      JSONArray emp_list = (JSONArray) obj;
      
      System.out.println(emp_list);
      
      Iterator<JSONObject> it = emp_list.iterator();
      while(it.hasNext()) {
    	  System.out.println(it.next());
    
      }

   } catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
		   
	}

}
