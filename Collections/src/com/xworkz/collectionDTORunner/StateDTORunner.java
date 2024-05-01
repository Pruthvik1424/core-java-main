package com.xworkz.collectionDTORunner;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import com.xworkz.collection.dto.Direction;
import com.xworkz.collection.dto.StateDTO;

public class StateDTORunner {

	public static void main(String[] args) {
	
		StateDTO state1 = new StateDTO("Karnataka", 34628000l, Direction.SOUTH, "siddaramaiah", 10.3, 68273981l);
		StateDTO state2 = new StateDTO("Andhara Pradesh", 5678902100l, Direction.EAST, "Shri YS Jagan Reddy", 12.4,
				23910910l);
		StateDTO state3 = new StateDTO("Arunachal Pradesh", 739898000l, Direction.SOUTH, "Shri Pema Khandu", 10d,
				83798219l);
		StateDTO state4 = new StateDTO("Assam", 380840900l, Direction.NORTH, "Shri Himanta Biswa Sarma", 12.4d,
				9378280919l);
		StateDTO state5 = new StateDTO("Bihar", 908989283800l, Direction.WEST, "Shri Nitish Kumar", 8d, 38780190l);
		StateDTO state6 = new StateDTO("Chattisgarh", 8738091803l, Direction.SOUTH, "Shri Bhupesh Baghel", 7.5d,
				283728910l);
		StateDTO state7 = new StateDTO("Delhi", 734821309300l, Direction.EAST, "Shri Arvind Kejriwal", 6.6d,
				88920192l);
		StateDTO state8 = new StateDTO("Goa", 34878900l, Direction.SOUTH, "Shri pramod Sawant", 5.2d, 82178291892l);
		StateDTO state9 = new StateDTO("Gujarat", 7849198130l, Direction.NORTH, "Shri Bhupendra Patel", 3.6d,
				76182912019l);
		StateDTO state10 = new StateDTO("Haryana", 876239281938l, Direction.WEST, "Shri Manohar Lal", 9d, 76288190l);
		StateDTO state11 = new StateDTO("Himachal Pradesh", 74690183000l, Direction.SOUTH, "Shri Jairam Thakur",
				11.4d, 23281892109l);
		StateDTO state12 = new StateDTO("Jharkhand", 729130198309l, Direction.EAST, "Shri Hemant Soren", 14d,
				3782098402l);
		StateDTO state13 = new StateDTO("Kerala", 376120380130l, Direction.WEST, "Shri pinarayi Vijayan", 15d,
				739208019l);
		StateDTO state14 = new StateDTO("Madhya Pradesh", 7836498401l, Direction.SOUTH, "Shri Shivraj Singh Chouhan",
				20d, 879328109301l);
		StateDTO state15 = new StateDTO("Maharashtra", 7360190920121l, Direction.NORTH, "Shri Uddhav Thackeray", 24d,
				239729801l);
		StateDTO state16 = new StateDTO("Manipur", 92301901092l, Direction.SOUTH, "Shri N.Biren Singh", 30d,
				87390931093l);
		StateDTO state17 = new StateDTO("Meghalaya", 7492309001l, Direction.NORTH, "Shri Conrad Kongkal Sangma", 34d,
				876837918l);
		StateDTO state18 = new StateDTO("Mizoram", 98983928l, Direction.WEST, "Shri Pu Zoramthaga", 19d, 39809109l);
		StateDTO state19 = new StateDTO("Nagaland", 8912891892l, Direction.EAST, "Shri Neiphiu Rio", 26d,
				7893193801l);
		StateDTO state20 = new StateDTO("Odisha", 1219283928l, Direction.SOUTH, "Shri Naveen Patnaik", 29d,
				379130139l);
		StateDTO state21 = new StateDTO("Puducheerry", 82983912121l, Direction.WEST, "Shri V.Narayanasamy", 31d,
				7219813801l);
		StateDTO state22 = new StateDTO("Punjab", 8898989121l, Direction.NORTH, "Shri Charanjit Singh", 28d,
				8739091l);
		StateDTO state23 = new StateDTO("Rajasthan", 98729182l, Direction.SOUTH, "Shri Ashok Gehlot", 34d, 8772981l);
		StateDTO state24 = new StateDTO("Sikkim", 87291021l, Direction.EAST, "Shri PS Golay", 34d, 78319301l);
		StateDTO state25 = new StateDTO("Tamil Nadu", 78891829819l, Direction.WEST, "R.N Ravi", 18d, 872371983l);
		StateDTO state26 = new StateDTO("Telangana", 87891201101l, Direction.SOUTH, "Shri K Chandrasekhar", 9d,
				872913091l);
		StateDTO state27 = new StateDTO("Tripura", 878239289192l, Direction.NORTH, "Shri Yogi Aditya Nath", 12d,
				892309128039l);
		StateDTO state28 = new StateDTO("Uttar Pradesh", 8792819921092l, Direction.SOUTH, "Shri pushkar Singh", 8d,
				8281938l);
		StateDTO state29 = new StateDTO("West Bengal", 7892019201297l, Direction.WEST, "Km.Mamata Banrjee", 9d,
				872391039l);

		Collection<StateDTO> stateCollection = new ArrayList<StateDTO>();
		stateCollection.add(state1);
		stateCollection.add(state2);
		stateCollection.add(state3);
		stateCollection.add(state4);
		stateCollection.add(state5);
		stateCollection.add(state6);
		stateCollection.add(state7);
		stateCollection.add(state8);
		stateCollection.add(state9);
		stateCollection.add(state10);
		stateCollection.add(state11);
		stateCollection.add(state12);
		stateCollection.add(state13);
		stateCollection.add(state14);
		stateCollection.add(state15);
		stateCollection.add(state16);
		stateCollection.add(state17);
		stateCollection.add(state18);
		stateCollection.add(state19);
		stateCollection.add(state20);
		stateCollection.add(state21);
		stateCollection.add(state22);
		stateCollection.add(state23);
		stateCollection.add(state24);
		stateCollection.add(state25);
		stateCollection.add(state26);
		stateCollection.add(state27);
		stateCollection.add(state28);
		stateCollection.add(state29);

		System.out.println("Fix default sorting by name ascending");

		stateCollection.stream().sorted().forEach(n -> System.out.println(n));

		System.out.println("___________________________________________");

		System.out.println("Sort all states by name in descending");

		stateCollection.stream().sorted((s1, s2) -> s2.getName().compareTo(s1.getName()))
				.forEach(state -> System.out.println(state));

		System.out.println("___________________________________________");

		// System.out.println("Get all states by each EAST direction");

		System.out.println("Get all states with direction EAST");

		stateCollection.stream().filter(state -> state.getDirection() == Direction.EAST)
				.forEach(state -> System.out.println(state));

		System.out.println("______________________________________");

		System.out.println("Get all states with direction NORTH");

		stateCollection.stream().filter(state -> state.getDirection() == Direction.NORTH)
				.forEach(state -> System.out.println(state));

		System.out.println("______________________________________");

		System.out.println("Get all states with direction WEST");

		stateCollection.stream().filter(state -> state.getDirection() == Direction.WEST)
				.forEach(state -> System.out.println(state));

		System.out.println("______________________________________");

		System.out.println("Get all states with direction SOUTH");

		stateCollection.stream().filter(state -> state.getDirection() == Direction.SOUTH)
				.forEach(state -> System.out.println(state));

//		statesCollection
//		.stream()
//		.filter(d -> d.getDirection().equals("EAST"))
//		//.filter(d->d.getName().equals("Karnataka"))
//		.forEach(di -> System.out.println(di));

		System.out.println("___________________________________________");

		System.out.println("get all population only by ascending");

		stateCollection.stream().sorted((p1, p2) -> p1.getPopulation().compareTo(p2.getPopulation()))
				.forEach(p -> System.out.println(p));

		System.out.println("___________________________________________");

		System.out.println("Get population only by state name");

		stateCollection.stream().map(name -> name.getName()).forEach(n -> System.out.println(n));

		System.out.println("_________________________________________");

		System.out.println("get state by minimum budget");
		Optional<StateDTO> stateWithMinBudget = stateCollection.stream()
				.min((s1, s2) -> s1.getBudget().compareTo(s2.getBudget()));

		// Check if the Optional is present and print the minimum budget number
		stateWithMinBudget.ifPresent(state -> System.out.println("Minimum budget: " + state.getBudget()));

		System.out.println("________________________________________");
		System.out.println("get state maximum Budget");
		Optional<StateDTO> stateWithMaxBudget = stateCollection.stream()
				.max((s1, s2) -> s1.getBudget().compareTo(s2.getBudget()));

		// Check if the Optional is present and print the minimum budget number
		stateWithMaxBudget.ifPresent(state -> System.out.println("Maximum budget: " + state.getBudget()));

		System.out.println("______________________________________");

		System.out.println("Get second maximum budget");

		// Get the maximum budget if present
		double maxBudget = stateWithMaxBudget.map(StateDTO::getBudget).orElse(Long.MIN_VALUE);

		// Find the second maximum budget by filtering out the maximum budget
		Optional<StateDTO> stateWithSecondMaxBudget = stateCollection.stream()
				.filter(state -> state.getBudget() < maxBudget)
				.max((s1, s2) -> s1.getBudget().compareTo(s2.getBudget()));

		// Print the second maximum budget if present
		stateWithSecondMaxBudget.ifPresent(state -> System.out.println("Second maximum budget: " + state.getBudget()));

		System.out.println("___________________________________________");

		System.out.println("Get ChiftMinister name by state name");

		stateCollection.stream().filter(minister -> minister.getName().equals("Karnataka"))
				.map(c -> c.setChiefMinister()).forEach(n -> System.out.println(n));

		System.out.println("___________________________________________");

		System.out.println("Get all by revennue greater than 10");

		stateCollection
		.stream()
		.filter(r -> r.getRevenue() > 10)
		.forEach(n -> System.out.println(n));
	}

}
