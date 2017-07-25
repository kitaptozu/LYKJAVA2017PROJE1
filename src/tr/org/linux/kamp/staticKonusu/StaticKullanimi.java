package tr.org.linux.kamp.staticKonusu;

public class StaticKullanimi {

	public static String myStaticString = "Bu bir static string";

	public static String myStaticMethod() {
		return "Bu bir static method";
	}

	static {

		System.out.println("Bu bir static bloğu");
	}
	static {
		System.out.println("Bu da bir static bloğu");
	}
	static {
		System.out.println("Bu üçüncü static bloğu");
	}

}
