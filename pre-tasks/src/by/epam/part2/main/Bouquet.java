package by.epam.part2.main;

import java.util.HashMap;
import java.util.Map;

	public class Bouquet {

		private Map<FlowerList, PackagingList> bouqet;

		public Bouquet() {

			bouqet = new HashMap<FlowerList, PackagingList>();
		}

		public void add(FlowerList flowers, PackagingList packagings) {

			bouqet.put(flowers, packagings);
		}

		public void remove(FlowerList flowers, PackagingList packagings) {

			bouqet.remove(flowers, packagings);
		}	

		public Map<FlowerList, PackagingList> getBouqet() {
			return bouqet;
		}

		public void setBouqet(Map<FlowerList, PackagingList> bouqet) {
			this.bouqet = bouqet;
		}

		@Override
		public String toString() {
			return "Bouquet [bouqet=" + bouqet + "]";
		}

	}

