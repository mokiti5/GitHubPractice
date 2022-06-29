package practiceGitHub;
import java.util.HashMap;
import java.util.Map;


public class Sub {

	/*put
	get
	remove
	clear
	isEmpty
	containsKey
	containsValue
	size
	*/

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


	//https://www.fenet.jp/java/column/java_tips/6779/
	//値渡し
	//「値(プリミティブ)型の中身をコピーして渡すもの」
	//参照渡し(Javaでは実装されていない)
	//「変数のアドレスを渡すもの」
	//参照の値渡し
	//Javaでは、オブジェクトを初期化しようとすると、今までの領域はそのままにして新しい領域を確保してしまう


	/*
	callbackとは(https://deecode.net/?p=404)
	他のクラスや関数に引数として渡される関数オブジェクトのこと
	非同期処理が完了した後に実行してほしい処理をコールバックとして渡す
	ボタン押したときにしてほしい処理をコールバックとして渡す

	interface AsyncFunctionCallback {
	// 成功したらisSucceedにtrueを渡すようにする
	void onAsyncFunctionFinished(boolean isSucceed);
	}

	import java.util.*;

	public class Main {
	interface AsyncFunctionCallback {
	    void onAsyncFunctionFinished(boolean isSucceed);
	}

	public static void main(String[]args){
	    // 無名クラスでコールバックオブジェクトの定義
	    AsyncFunctionCallback callback = new AsyncFunctionCallback() {
	        // コールバック処理の定義
	        @Override
	        public void onAsyncFunctionFinished(boolean isSucceed) {
	            System.out.println("Async function finished.");
	        }
	    };
	    asyncFunction(callback);  // 非同期処理実行
	    System.out.println("非同期処理実行中...");
	}


	private static void asyncFunction(AsyncFunctionCallback callback) {
	    // 新しいスレッドを生成して非同期処理する
	    Thread t = new Thread(new Runnable() {
	        @Override
	        public void run() {
	            System.out.println("別スレッドで非同期処理開始");
	            try {
	                Thread.sleep(1000); // 1秒処理を止める
	                // 処理が終わったらコールバックを呼び出す
	                callback.onAsyncFunctionFinished(true);
	            } catch (InterruptedException e) {
	                // 処理失敗したらコールバックにfalse渡す
	                callback.onAsyncFunctionFinished(false);
	            }
	        }
	    });
	    t.setDaemon(false);
	    t.start();
	}
}
	*/



}


