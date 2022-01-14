package java8;

public class AnonymousClass {
	

	public static void main(String[] args) {
		
		
	Richman r = new Richman() {

		@Override
		public void earnMoney() {
			System.out.println("Earn Money");
		}

		@Override
		public void donation() {
			System.out.println("Donation");
		}

		@Override
		public void party() {
			System.out.println("Party");
		}
	};
	r.earnMoney();
	r.donation();
	r.party();

		
}
}