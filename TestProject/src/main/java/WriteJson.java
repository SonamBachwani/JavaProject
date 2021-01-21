import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    JSONObject emp_det = new JSONObject();
    emp_det.put("FN", "Sonam");
    emp_det.put("LN", "Bachwani");
    emp_det.put("url", "abc");
    
    
    JSONObject emp_obj = new JSONObject();
    emp_obj.put("employee", emp_det);
    
    
    JSONObject emp_det2 = new JSONObject();
    emp_det2.put("FN", "Sonam1");
    emp_det2.put("LN", "Bachwani1");
    emp_det2.put("url", "abc1");
    
    
    JSONObject emp_obj2 = new JSONObject();
    emp_obj2.put("employee", emp_det2);
    
    JSONArray emp_list = new JSONArray();
    emp_list.add(emp_obj);
    emp_list.add(emp_obj2);
    
    
    try {
		FileWriter fw = new FileWriter("C:\\Users\\gur28443\\Desktop\\BH\\tax\\employees.json");
		fw.write(emp_list.toJSONString());
		fw.flush();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	}

}
