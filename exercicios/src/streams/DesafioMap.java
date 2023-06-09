package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import utilitarios.RevertString;

public class DesafioMap {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Function<Integer, String> numToBin = num -> Integer.toBinaryString(num);

		UnaryOperator<String> revertString = initialString -> RevertString.reverseString(initialString);

		Function<String, Integer> binToInt = binNumber -> Integer.parseInt(binNumber, 2);

		System.out.println(nums);
		nums.stream()
			.map(numToBin)
			.map(revertString)
			.map(binToInt)
			.forEach(System.out::println);
	}

}
