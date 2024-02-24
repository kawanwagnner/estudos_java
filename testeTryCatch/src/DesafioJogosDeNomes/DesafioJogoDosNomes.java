package DesafioJogosDeNomes;

public class DesafioJogoDosNomes {

	public static void main(String[] args) {

		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		for (int i = 0; i < nums.length; i++) {
		    try {
		        System.out.println(nums[i]);
		    } catch (ArrayIndexOutOfBoundsException e) {
		        System.out.println("Senão isso: ");
		        System.out.println(e);
		    }
		}


	}

}
