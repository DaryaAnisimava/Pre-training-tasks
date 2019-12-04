package by.epam.part2.main;

import java.util.ArrayList;
import java.util.List;

public class PackagingList {

	private List<Packaging> packagings;

	public PackagingList(){
		packagings = new ArrayList<Packaging>();
	}

	public void add(Packaging packaging) {

		packagings.add(packaging);
	}

	public void remove(Packaging packaging) {

		packagings.remove(packaging);
	}

	public List<Packaging> getPackagings() {
		return packagings;
	}

	@Override
	public String toString() {
		return "PackagingList [packagings=" + packagings + "]\n";
	}

}