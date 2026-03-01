package television;

class Main {

	public static void main(String[] args) {
		//dos objetos 
		Televisor t1 = new Televisor();
		Televisor t2 = new Televisor("Sony",1800,"Oled");
		System.out.println(t2.toString());

	}

}
