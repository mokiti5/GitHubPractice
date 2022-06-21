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

		Sub.mapPractice();

	}
}
