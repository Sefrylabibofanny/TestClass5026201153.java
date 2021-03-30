public class TestClass5026201153 {

	public static void main(String[] args){
	ComputeMethods5026201153 Angka= new ComputeMethods5026201153();

	double Celcius = Angka.fToC(50);
	System.out.println("50 F = "+ Celcius+" C");

	double Hypotenuse = Angka.hypotenuse(5, 7);
	System.out.println("Hypotenuse nya adalah " +Hypotenuse);

	int rollDadu= Angka.roll();
	System.out.println("Jumlah nilai dari ke dua dadu adalah  " + rollDadu);

	}
}