package practiceGitHub;



//https://camp.trainocate.co.jp/magazine/java-enum/


public class EnumSample {
	public enum Season {
	    Spring,
	    Summer,
	    Autumn,
	    Winter;
	}

	/**
	 * 春夏秋冬に応じて処理を変えるメソッド
	 * @param season 季節
	 */
	public void setStatus(Season season) {
	  if (season == Season.Spring) {
	    // 春の処理
	  } else if (season == Season.Summer) {
	    // 夏の処理
	  } else if (season == Season.Autumn) {
	    // 秋の処理
	  } else {
	    // 冬の処理
	  }
	}



	public enum Fruit {
		  Orange,
		  Apple,
		  Cherry;
		}
	/**
	 * フルーツの美味しい食べ方を紹介するメソッド
	 * @param fruit 紹介するフルーツ
	 */
	public static void howToEat(Fruit fruit) {
	  switch(fruit) {
	    case Orange:
	      System.out.println("ジュースにするとおいしいよ");
	      break;
	    case Apple:
	      System.out.println("アップルパイはいかが？");
	      break;
	    case Cherry:
	      System.out.println("そのままがおいしいよ");
	      break;
	  }
	}

//	// メインメソッド
//	public static void main(String[] args) {
//	  howToEat(Fruit.Orange);
//	}
}

