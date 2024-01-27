package currency;

public class NoteCount {

	public void counting(int [] currency, int amount) {
		int notes[]=new int[currency.length];
		int sum=0;
		for (int i = 0; i < currency.length; i++) {
			notes[i]=amount/currency[i];
			amount=amount%currency[i];
			sum=sum+notes[i];
		}
		for (int i = 0; i < currency.length; i++) {
			if(notes[i] !=0) {
			System.out.println(currency[i] + "X" + notes[i]);
			}
			
		}System.out.println("Your payment approach in order to give min no of notes will be " +sum);
		
	}

}
