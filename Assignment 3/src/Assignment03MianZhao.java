/*
 * 
 * Student Name: Mian zhao
 * Lab Professor: Professor Neda Nabavi
 * Due Date: Aug 12,2022.
 * Modified: Aug 12, 2022.
 * Description:Assignment03
 */
public class Assignment03MianZhao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int roll = 0;
		int[] diceRolls = new int[16];
		int totalRolls = 0;
		int evenRolls = 0, oddRolls = 0;

		// sample the rolls
		for (int count = 0; count < 1000; count++) {
			roll = (int) (Math.random() * 16) + 1;// change 10 to 16, random 1--16
			diceRolls[roll - 1] = diceRolls[roll - 1] + 1; // adjust 1-10 value to 0-9 for index
		}
		// run a report
		for (int index = 0; index < diceRolls.length; index++) { // change <= to <,no crashes
			// System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
			if (index % 2 == 0)
				evenRolls += diceRolls[index];
			else
				oddRolls += diceRolls[index];

			totalRolls = totalRolls + diceRolls[index];
		}
		System.out.println("Total even rolls were: " + evenRolls + ",Total odd rolls were: " + oddRolls);
		System.out.println("Total rolls were: " + totalRolls);
		System.out.println("Program by MianZhao");

	}

}
