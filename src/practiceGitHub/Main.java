package practiceGitHub;
import java.util.*;


public class Main {
	public static void main(String[] args ) {

		System.out.println("こんにちは世界");
		//競技プログラミング中に使用したJavaの文法をまとめておく
		//Scanner sc = new Scanner(System.in);

		//★型変換

		//数値→文字列
		int a = 100;
		String str = String.valueOf(a);
		//char[] numList = i.toString().toCharArray();

		//文字列→数値
		String before = "100";
		int afterInt = Integer.parseInt(before);


		//文字列→Long型への変換
		//long input = sc.nextInt();
		String inputToString = "";
		//input = Long.valueOf(inputToString);


		//LISTから配列へ(整数型)
		ArrayList<Integer> list = new ArrayList<>();
		int[] array = list.stream().mapToInt(i->i).toArray();
		//配列をシャッフルする
		Arrays.sort(array);


		//トランプのアルゴリズム
		String[] Mark = {"♣","♠","♦","♥"};
		int[] Number;
		Number = new int[13];
		for(int i = 0;i < 13;i++) {
			Number[i] =i+1;
			//System.out.println(Number[i]);
		}

		String[] Card;
		int counter =0;
		Card =new String[52];
		for(String MarkOfCard : Mark) {
			for(int NumberOfCard : Number) {
				Card[counter] = MarkOfCard + NumberOfCard;
				//System.out.println(Card[counter]);
				counter ++;
			}
		}

		//System.out.println(Arrays.toString(Card));

		List<String> lists = Arrays.asList(Card);
		Collections.shuffle(lists);
		list.toArray(Card);
		//System.out.println(Arrays.toString(Card));

		//Sub.mapPractice();



		//getter・setter練習
		practiceGetterSetter gs = new practiceGetterSetter();
		gs.setNumber(10);
		System.out.println(gs.getNumber());



		//配列2つをMap型に合成する
		String[] strMap = {"山田","田中","佐藤","黒田"};
		int[] numMap = {1,2,3,4};

		Map<Integer,String> map = Sub.arrayToMap(numMap, strMap);

		for(Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator() ; iterator.hasNext() ;){
			Map.Entry<Integer, String> entry = iterator.next();
			//System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		//System.out.println("よくわからんくなってきた");

		/*
		Gitの用語
		マージ・・・加えた修正を統合する作業をします。変更を加えたブランチを元のブランチにマージして修正します。
		コミット・・・追加・変更したファイルをリポジトリに記録します。
		プル・・・リモートリポジトリのコミットをローカルリポジトリに送り込みます。
		プルリクエスト・・・開発者のローカルリポジトリでの変更を他の開発者に通知するGitHubの機能です。
		プッシュ・・・ローカルリポジトリの内容をリモートリポジトリに反映させます
		フェッチ・・・リモートリポジトリの最新の履歴の取得を行います。取得を行うのみなので、マージが自動で行われないのがpullとの違い
		コンフリクト・・・Gitの場合同じファイルの同じ場所への変更が同時にある時に生じるエラーのことを言います。
		*/


	}
}
