package exemplos;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Marcos");
		list.add("Eduardo");
		list.add("Erica");

		for (String lista : list) {
			System.out.println(lista);
		}

	}

}
