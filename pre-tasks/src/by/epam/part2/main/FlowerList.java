package by.epam.part2.main;

import java.util.ArrayList;
import java.util.List;

public class FlowerList {

	private List<Flower> flowers;

	public FlowerList() {
		
		flowers = new ArrayList<Flower>();
	}
	
	public void add(Flower flower) {

		flowers.add(flower);
	}

	public void remove(Flower flower) {

		flowers.remove(flower);
	}

	public List<Flower> getFlowers() {
		return flowers;
	}	

	public void setFlowers(List<Flower> flowers) {
		this.flowers = flowers;
	}
	
	@Override
	public String toString() {
		return "FlowerList [flowers=" + flowers + "]\n";
	}
}


