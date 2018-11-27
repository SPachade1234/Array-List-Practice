import java.util.ArrayList;

public class ArrayListPrac{

	public static void main(String []args){
		ArrayList <Integer> list1 = new ArrayList<>();
		ArrayList <Integer> list2 = new ArrayList<>();
		ArrayList <Integer> list3 = new ArrayList<>();


		list1.add(1); list2.add(6);
		list1.add(2); list2.add(7);
		list1.add(3); list2.add(8);
		list1.add(4); list2.add(9);
		list1.add(5); list2.add(10);

		System.out.println( combineLists(list1, list2, list3) );

		printArrayList(list3);

	}

	public static ArrayList<Integer> combineLists(ArrayList<Integer> list1, ArrayList<Integer> list2, ArrayList<Integer> list3){

		for(int i = 0; i < list1.size(); i++)
			list3.add(list1.get(i));

		for(int i = 0; i < list1.size(); i++)
			list3.add(list2.get(i));

		return list3;
	}

	public static void printArrayList(ArrayList<Integer> list){
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + ", ");
	}
}