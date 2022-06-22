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

	}
	//staticの使用。呼び出す際にインスタンス化が不必要
	public static Map<Integer, String> arrayToMap (int[] num,String[] str){
		Map<Integer, String> map = new HashMap<>();
		for(int i=0;i < num.length;i++) {
			map.put(num[i],str[i]);
			}
		return map;
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


