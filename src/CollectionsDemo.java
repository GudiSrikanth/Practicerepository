import java.util.ArrayList;

public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList lst=new ArrayList();
		lst.add(10);
		lst.add("Arun");
		lst.add("Shri");
		lst.add(20);
		lst.add("Bhargavi");
		lst.add(true);
		lst.add("Srikanth");
		lst.add(12.3f);
		lst.add(true);
		lst.add("Nandini");
		
		lst.add(1,4.3);
		System.out.println("Contains"+lst.contains("nandini"));
		System.out.println("Index of"+lst.indexOf("nandini"));
        
		
		lst.stream().forEach((t)->System.out.println(t));
	}

}
