
public class Room {
		int roomNo;
		String roomType;
		float roomArea;
		String acMachine;
		
		void setData(int roomNo, String roomType, float roomArea, String acMachine) {
			this.roomNo = roomNo;
			this.roomType = roomType;
			this.roomArea = roomArea;
			this.acMachine = acMachine;
	}
		void displayData() {
			System.out.println("Room Number: " + this.roomNo + " Room Type: " + this.roomType + " Room Area: " + this.roomArea + " AC: " + this.acMachine);
			
		}
		public static void main(String []args) {
			Room r1 = new Room();
			r1.setData(40, "Standard", 10, "LG");
			r1.displayData();
		}
}
