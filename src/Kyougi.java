
import java.util.Scanner;

public class Kyougi
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);




	}
}


/*
		int n = sc.nextInt();
		int result = 0;
		ArrayList<Integer> arrayList = new ArrayList<>();

		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			result += num;
			arrayList.add(num);
		}

		int[] array = arrayList.stream().mapToInt(i->i).toArray();

		int m = sc.nextInt();
		//Map<Integer,Integer> map = new HashMap<>();
		int[] allResults = new int[m];

		for(int i=0;i<m;i++) {
			int tmp = sc.nextInt();
			int tmp2 = sc.nextInt();
			allResults[i] = result - array[tmp-1] + tmp2 ;
			System.out.println(allResults[i]);

		}
 */
/*
 		int n = sc.nextInt();
		String s = sc.next();

		int result =0;
		while (true) {
			if(s.contains("ABC")){
				int index = s.indexOf("ABC");
				String before = s.substring(0,index);
				String after = s.substring(index+3,n);

				s = before + after;
				n -=3;
				result ++;
			} else {
				System.out.println(result);
				break;
			}

		}
 */

/*
 		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n-1];

		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i] = sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			c[i] = sc.nextInt();
		}


		int result =0;
		int tmp =-1;

		for(int i=0;i<n;i++) {

			result += b[a[i] -1];
			if(tmp - a[i] == -1 ) {
				System.out.println(c[tmp-1]);
				result += c[tmp-1];
			}

			tmp = a[i];

		}

		System.out.println(result);
 */
//=========================================================
//int a = sc.nextInt();
//String op = sc.next();
//int b = sc.nextInt();
//
//if(op.equals("+")) {
//	System.out.println(a+b);
//} else {
//	System.out.println(a-b);
/*
 		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		boolean flag = false;
		while (a < b) {
			if(a % c == 0) {
				flag = true;
				break;
			}
			a++;
		}

		if(flag==true) {
			System.out.println(a);
		} else {
			System.out.println(-1);
		}
 */
/*
		int n = sc.nextInt();
		long[] array;
		array = new long[n];


		int result=0;


		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();

			while (true) {
				if(array[i] %2 ==0) {
					array[i] /= 2;
					result ++;
				} else {
					break;
				}
			}
		}

		System.out.println(result);
		int result = 0;
		int counter = 0;

		while (true) {

			counter =0;

			ArrayList<Integer> list = new ArrayList<>();
			for(int i=0;i< n;i++) {
				if(array[i] % 2 != 0) {
					array[i] = array[i] * 3;
					counter ++;
				} else if(array[i] % 2 ==0) {
					array[i] = array[i] * 3;
					list.add(i);
				}
			}

			Optional<Integer> opNum1 = list.stream().max(Comparator.naturalOrder());
			array[opNum1.get()] = array[opNum1.get()] * 6;

			if(counter == n) {
				System.out.println(result);
				break;
			}
			result++;
		}
	}
 */

/*
 		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		int x = sc.nextInt();

		int counter =0;
		int result = 0;
		int sum = 0;

		while (true) {
			sum += array[counter];
			counter ++;
			if(counter > n-1 ) {
				counter = 0;
			}

			result++;
			if(sum > x) {
				break;
			}

		}

		System.out.println(result);
 */

/*
 *import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}

		int result = 0;


		for(int value=1;value<n+1;value++) {
			if(value % 2 ==0) {
				result += array[value-1] -1 ;
			} else {
				result += array[value-1];
			}
		}

		if(x - result >= 0) System.out.println("Yes");
		else System.out.println("No");


	}
}

 */
/*
 		int n = sc.nextInt();
		int[] b = new int[n-1];

		for(int i=0;i<n-1;i++) {
			b[i] = sc.nextInt();
		}

		int[] result= new int[n];


		int judge =b[0];
		result[0] = b[0];
		result[1] = b[0];

		for(int i=1;i<n-2;i++) {
			judge = b[i];
			int judge2 = b[i+1];
			if(judge > judge2) result[i+1] = judge2;
			else result[i+1] = judge;
		}

		result[n-1] = b[n-2];

		int resultFinal= 0;
		for(int value:result) {
			resultFinal = resultFinal + value;
		}

		System.out.println(resultFinal);
 */
/*

int r = sc.nextInt();
int c = sc.nextInt();

int[][] a1 = new int[2][2];
for (int j=0;j<2;j++) {
	for (int i=0;i<2;i++) {
		a1[i][j] = sc.nextInt();
		System.out.println(a1[i][j]);
	}
}

int answer;

answer = a1[c][r];

System.out.println(answer);

*/

/*
 * for (int f = 0, l = src.length - 1; f < l; f++, l--){
  int temp = src[f];
  src[f]  = src[l];
  src[l] = temp;
}
*/

/*
 *
 *
int aaa = sc.nextInt();
int[] array = new int[aaa];

int counter =0;
for (int i=0;i<aaa;i++){
      array[i] = sc.nextInt();
}

int counterV1 = 0;
int counterV2 = 0;
int counterV3 = 0;
int ddd = 0;

while (ddd == 0){
for(int ccc: array) {
	array[counterV1] = array[counterV1]/2;
	if(array[counterV1]%2 ==1 ) {
		 ddd++;
		 break;
	} else {
		counterV1 ++;
		counterV3 ++;
		if(counterV3 == aaa) {
			counterV2 ++;
			counterV3 = 0 ;
			counterV1 =0;
		}
	}
}
}

System.out.println(counterV2);

int N = sc.nextInt();
int A = sc.nextInt() ;
int B = sc.nextInt();


ArrayList<Integer> List = new ArrayList<Integer>();
int sum = 0;
int partTotal = 0;


for(int i=0;i<N;i++) {
	partTotal =0;
	while(i > 0){
	    List.add(i % 10);
	    i = i / 10;
	}
	for(int a:List) {
		partTotal += a;
	}

	if(A < partTotal && partTotal < B) {
		sum += partTotal;
	}
}
System.out.println(sum);


*/

/*
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt() ;
		int B = sc.nextInt();
        int sum = 0;

        for(Integer i=1;i<N+1;i++) {
        	int partTotal =0;
            char[] numList = i.toString().toCharArray();
	        for(char a:numList) {
	        	partTotal += Character.getNumericValue(a);
	         }
            if(A <= partTotal && partTotal <= B) {
	        	sum += i;
	        }
	    }
        System.out.println(sum);
}
}
*/

/*
int n = sc.nextInt();
int[] array = new int[n];

for(int i=0;i<n;i++) {
	int ai = sc.nextInt();
	array[i] = ai;
}
//System.out.println(Arrays.toString(array));

Arrays.sort(array);

ArrayList<Integer> cardOfAlice = new ArrayList<>() ;
ArrayList<Integer> cardOfBob = new ArrayList<>() ;


int sumAlice = 0;
int sumBob = 0;
int len = array.length;
for(int i=1; i<len+1; i++) {
	if(i%2 ==1) {
		cardOfAlice.add(array[array.length-1]);
		sumAlice += array[array.length-1];
	} else {
		cardOfBob.add(array[array.length-1]);
		sumBob += array[array.length-1];

	}
	array = removeLastElement(array);
}

int result;
result = sumAlice - sumBob;
System.out.println(result);
*/


/*

int countMoti = sc.nextInt();
int[] arrayMoti = new int[countMoti];

for(int i=0;i<countMoti;i++) {
	arrayMoti[i] = sc.nextInt();
}
//System.out.println(Arrays.toString(array));
int result=0;

ArrayList<Integer> list = new ArrayList<>() ;

for(int i=0;i<arrayMoti.length;i++) {
	if(list.contains(arrayMoti[i]) == false) {
		list.add(arrayMoti[i]);
		System.out.println(arrayMoti[i]);
	}
}

result = list.size();
System.out.println(result);
*/

/*
import java.util.*;

public class Main {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = "";
		String[] listString = {"eraser","erase","dreamer","dream"};

		for (int i=0;i< listString.length;i++) {
			S = S.replaceAll(listString[i], "");
		}
		if(S.length() == 0) {
			System.out.println("YES");
		}else {
			System.out.println("No");
		}

	}

}
*/
	/*		int n = 1000;
	int y = 1234000;
	//int n = sc.nextInt();
	//int y = sc.nextInt();
	int counter =0;
	boolean a = true;

	int counterYukichi = 0;
	int counterHiguchi = 0;
	int counterNoguchi = 0;

	while (true) {
		y = y - 10000;
		counter++;
		counterYukichi++;
		if(y < 10000) {
			if( y <=  5000 ) {
				a = true;
			}
			if(1000 <= y && y < 5000 ) {
				a = false;
			} else {
				a = false;
			}
			break;
		}

	}

	while (a == true) {
		y = y -5000;
		counter++;
		counterHiguchi++;
		if(y < 5000) {
			break;
		}
	}

	while (y >= 1000 ) {
		System.out.println(y);
		y = y -1000;
		counter++;
		counterNoguchi++;
		if(y < 1000) {
			break;
		}
	}

	System.out.println(counter);
	if(counter > n) {
		System.out.println("-1 -1 -1");
	} else {
		System.out.println(counterYukichi+ " " + counterHiguchi+ " " + counterNoguchi);
	}

}*/

/*
int N = sc.nextInt();
int[][] arrayTXY = new  int[N][3];

int[] patternAction = {}

for(int i=0;i< N;i++) {
	for(int j=0;j<3;j++) {
		arrayTXY[i][j] = sc.nextInt();
		//System.out.println(arrayTXY[i][j]);
	}
}
*/



/*
 * 		int x = sc.nextInt();
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();

		ArrayList<Integer> S = new ArrayList<>() ;
		S.add(a);

		int counter = a;

		int result = 0;

		for(int i = 0;i<n-1;i++) {
			counter += d;
			//ystem.out.println(counter);
			S.add(counter);
		}

		if( x == a) {
			System.out.println(result);
		}

		//System.out.println(S.size());
		 * 		int a = sc.nextInt();
		int b = sc.nextInt();

		if(a > 8 || b > 8) {
			System.out.println(":(");
		} else {
			System.out.println("Yay!");
		}
		 */

//int d = sc.nextInt();
//int n = sc.nextInt();
//
//int result =0;
//int tmp = 0;
//
//switch (d) {
//	case 0:
//		result = n;
//		break;
//	case 1:
//		tmp = 100;
//		result = tmp*n;
//		break;
//	case 2:
//		tmp = 10000;
//		result = tmp*n;
//		break;
//
//}
//
//System.out.println(result);

//int n = sc.nextInt();
//int[] array = new int[n];
//for(int i=0;i<n;i++) {
//	array[i] = sc.nextInt();
//}
//
//int[] result = new int[n];
//for(int value:array) {
//	int num = 0;
//	while (true) {
//		if(array[value] % 2 ==0) {
//			array[value] /= 2;
//			result[value] = num;
//		} else {
//			break;
//		}
//
//	}
//}
//System.out.println(result);		int k = sc.nextInt();
//int x = sc.nextInt();
//
//int result = k*500;
//if(result >= x) {
//	System.out.println("Yes");
//} else {
//	System.out.println("No");
//}