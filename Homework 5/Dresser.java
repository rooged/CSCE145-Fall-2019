//written by Timothy Gedney

public class Dresser {

	private Clothing[][] Clothes = new Clothing[5][10];
	
	public Dresser() {
	}
	
	public void add(Clothing cloth) {
		if (cloth.getType().equalsIgnoreCase("Undergarment")) {
			int count = 0;
			for (int i = 0; i < 10; i++) {
				if (Clothes[0][i] == null) {
					Clothes[0][i] = cloth;
					i = 9;
				}
				if (Clothes[0][i] != null) {
					count++;
					if (count == 10) {
						System.out.println("The undergarments drawer is full.");
					}
				}
			}	
		} else if (cloth.getType().equalsIgnoreCase("Socks") || cloth.getType().equalsIgnoreCase("Stockings")) {
			int count = 0;
			for (int i = 0; i < 10; i++) {
				if (Clothes[1][i] == null) {
					Clothes[1][i] = cloth;
					i = 9;
				}
				if (Clothes[1][i] != null) {
					count++;
					if (count == 10) {
						System.out.println("The socks and stockings drawer is full.");
					}
				}
			}
		} else if (cloth.getType().equalsIgnoreCase("Top")) {
			int count = 0;
			for (int i = 0; i < 10; i++) {
				if (Clothes[2][i] == null) {
					Clothes[2][i] = cloth;
					i = 9;
				}
				if (Clothes[2][i] != null) {
					count++;
					if (count == 10) {
						System.out.println("The tops drawer is full.");
					}
				}
			}
		} else if (cloth.getType().equalsIgnoreCase("Bottom")) {
			int count = 0;
			for (int i = 0; i < 10; i++) {
				if (Clothes[3][i] == null) {
					Clothes[3][i] = cloth;
					i = 9;
				}
				if (Clothes[3][i] != null) {
					count++;
					if (count == 10) {
						System.out.println("The bottoms drawer is full.");
					}
				}
			}
		} else if (cloth.getType().equalsIgnoreCase("Cape")) {
			int count = 0;
			for (int i = 0; i < 10; i++) {
				if (Clothes[4][i] == null) {
					Clothes[4][i] = cloth;
					i = 9;
				}
				if (Clothes[4][i] != null) {
					count++;
					if (count == 10) {
						System.out.println("The capes drawer is full.");
					}
				}
			}
		}
	}
	
	public void remove(Clothing cloth) {
		int count = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				if (cloth.equals(Clothes[i][j])) {
					Clothes[i][j] = null;
					count--;
				}
				count++;
			}
		}
		if (count == 50) {
			System.out.println("Clothing not found");
		}
	}
	
	public String print() {
		String list = ""; 
		String list0 = "Drawer 0: \n";
		String list1 = "Drawer 1: \n";
		String list2 = "Drawer 2: \n";
		String list3 = "Drawer 3: \n";
		String list4 = "Drawer 4: \n";
		int count0 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0;
		for (int i = 0; i < 10; i++) {
			if (Clothes[0][i] != null) {
				list0 += Clothes[0][i] + "\n";
			} else {
				count0++;
			}
		}
		if (count0 == 10) {
			list0 += "Empty\n";
		}
		for (int i = 0; i < 10; i++) {
			if (Clothes[1][i] != null) {
				list1 += Clothes[1][i] + "\n";
			} else {
				count1++;
			}
		}
		if (count1 == 10) {
			list1 += "Empty\n";
		}
		for (int i = 0; i < 10; i++) {
			if (Clothes[2][i] != null) {
				list2 += Clothes[2][i] + "\n";
			} else {
				count2++;
			}
		}
		if (count2 == 10) {
			list2 += "Empty\n";
		}
		for (int i = 0; i < 10; i++) {
			if (Clothes[3][i] != null) {
				list3 += Clothes[3][i] + "\n";
			} else {
				count3++;
			}
		}
		if (count3 == 10) {
			list3 += "Empty\n";
		}
		for (int i = 0; i < 10; i++) {
			if (Clothes[4][i] != null) {
				list4 += Clothes[4][i] + "\n";
			} else {
				count4++;
			}
		}
		if (count4 == 10) {
			list4 += "Empty\n";
		}
		list = list0 + "\n" + list1 + "\n" + list2 + "\n" + list3 +
				"\n" + list4;
		return list;
	}
}
