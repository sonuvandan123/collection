package overridingloading;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("String args[]");
	}

	public static void main(String args) {
		System.out.println("String args");
	}
	public static void main() {
		System.out.println("No arg");
	}
}
