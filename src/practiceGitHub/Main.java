package practiceGitHub;
import java.util.*;


public class Main {
	public static void main(String[] args ) {


		/*
		 Gitはデータを圧縮してスナップショットで保存している
		Gitの用語
		マージ・・・加えた修正を統合する作業をします。変更を加えたブランチを元のブランチにマージして修正します。
		フェッチ・・・リモートリポジトリの内容をローカルに落とす(マージを行うことで反映させる)
		コミット・・・追加・変更したファイルをリポジトリに記録します。
		プル・・・リモートリポジトリのコミットをローカルリポジトリに送り込みます。
		プルリクエスト・・・開発者のローカルリポジトリでの変更を他の開発者に通知するGitHubの機能です。
		プッシュ・・・ローカルリポジトリの内容をリモートリポジトリに反映させます
		フェッチ・・・リモートリポジトリの最新の履歴の取得を行います。取得を行うのみなので、マージが自動で行われないのがpullとの違い
		コンフリクト・・・Gitの場合同じファイルの同じ場所への変更が同時にある時に生じるエラーのことを言います。


		＠使い分け(フェッチとプル)
		マスターブランチかつ変更がない時はプルでも
		基本的にはフェッチ→マージするほうが安全(ブランチを確認し安全と判断できいる場合プルでもよし)

		*/


		System.out.println("こんにちは世界");
		//競技プログラミング中に使用したJavaの文法をまとめておく
		//Scanner sc = new Scanner(System.in);


		//四則演算等
		//割った余りを求める  %
		//＋　ー　＊　/
		int shou = 100%2;
		//System.out.println(shou);

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
		//System.out.println(gs.getNumber());




		//配列2つをMap型に合成する.Subクラスのメソッドを使用
		String[] strMap = {"山田","田中","佐藤","黒田"};
		int[] numMap = {1,2,3,4};

		Map<Integer,String> map = Sub.arrayToMap(numMap, strMap);

		for(Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator() ; iterator.hasNext() ;){
			Map.Entry<Integer, String> entry = iterator.next();
			//System.out.println(entry.getKey() + " : " + entry.getValue());
		}


		//乱数生成のプログラム
		Random rand = new Random();
		int num = rand.nextInt(10) ; //0~9
		int num2 = rand.nextInt(200) - 100;//-100~99
		//System.out.println(num);
		//swich文を書いていく。ネストせずに早期にreturn、breakを
		int jouken = rand.nextInt(3);
		String result = "";
		//boolean jouken = true;

		switch (jouken) {
		case 0:
			result = "your number is 0";
			break;
		case 1:
			result = "you win ";
			break;
		case 2:
			result = "you lose";
			break;
		}

		//while文
		while (true) {
			break;
		}


		//再起処理。メソッドの中で同じメソッドを呼び出す。
		System.out.println("再帰処理の結果："+ saiki(5));

	}

	public static int saiki(int n) {
		if(n<=0) {
			return 1;
		}else {
			return saiki(n-1)*n;
		}
	}
}

