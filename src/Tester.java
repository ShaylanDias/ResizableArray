
public class Tester {

	public static void main(String[] args) {
		
		
		ResizableArray data = new ResizableArray();
		
		data.add(5);
		data.add(0);
		data.add(2);
		data.add(7);

		System.out.println(data.toString());
		
		data.remove(0);
		System.out.println(data.toString());
		System.out.println(data.size());
		System.out.println(data.get(1));
	}

}
