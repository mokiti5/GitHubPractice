package practiceGitHub;
import java.util.HashMap;
import java.util.Map;


public class Sub {
	public static void mapPractice()  {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "田中");
		map.put(2, "佐藤");

		//System.out.println(map.get(1));

		for(Integer key : map.keySet()) {
			System.out.println(key);
		}
		for (String val : map.values()) {
			System.out.println(val);
		}
		
		//put
		//get
		//remove
		//clear
		//isEmpty
		//containsKey
		//containsValue
		//size
	}
}
