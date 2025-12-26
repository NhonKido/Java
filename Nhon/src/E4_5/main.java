package E4_5;

public class main {
	public static void main(String[] agrs) {
		IRecord pic = new Image("E\\windows\\Image\\anhcontro.gif",7777L, 460,390, "low");
		System.out.print(pic.timeToDownload(100));

		
	}
}
