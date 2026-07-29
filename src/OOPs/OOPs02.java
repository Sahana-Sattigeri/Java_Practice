package OOPs;

class computer{
	public void playMusic() {
		System.out.println("music playing");
	}
	public String getMePen(int cost) {
    if(cost>=10)
		return "Pen";
    else
    	return "nothing";
	}
}

public class OOPs02 {

	public static void main(String[] args) {
		
		computer obj = new computer();
		obj.playMusic();
		String str = obj.getMePen(4);
	
		System.out.println(str);

	}

}
