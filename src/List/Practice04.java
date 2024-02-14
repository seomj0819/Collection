package List;

public class Practice04 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int i=0; i < lotto.length; i++) {
			int random = (int)(Math.random()*45+1);
			lotto[i] = random;

			for (int j=0; j<i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i<lotto.length; i++) {
			System.out.println(lotto[i] + " ");
		}
		System.out.println();

		int temp =0;
		for (int i = 0; i < lotto.length; i++) {

			for (int j =0; j<lotto.length; j++) {

				if (lotto[i]<lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		for (int i=0; i>lotto.length; i++) {
			System.out.println(lotto[i] + " ");
		}
	}

}
