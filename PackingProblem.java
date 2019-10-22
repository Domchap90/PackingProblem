package ExamQuestions;

public class PackingProblem {

	public static int minNumPackages(int bigBox, int smallBox, int numItems) {
		// return -1 if can't fit all items exactly in available packages.
		//all big boxes need to be used
		int bigBoxDiff = numItems-bigBox*5;
		if ( bigBoxDiff>0 )  {
			if (bigBoxDiff > smallBox) {
				return -1;
			} else {
				return bigBoxDiff + bigBox;
			}
		}
		else if ( bigBoxDiff == 0 ) {
			return bigBox;
		} else {
			if (bigBoxDiff%5>smallBox) {
				return -1;
			} else {
				return (numItems- numItems%5)/5 + smallBox;
			}

		}


	}

	public static void main(String[] args) {
		System.out.println(minNumPackages(4, 1, 23)); // expect -1
		System.out.println(minNumPackages(3, 11, 19)); // expect 7
		System.out.println(minNumPackages(2, 4, 9)); // expect 5

	}

}
