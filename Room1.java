
public class Room1 {
	int roomNo;
	String roomType;
	float roomArea;
	String acMachine;
	
Room1(){
	roomNo = 10;
	roomType = "Standard";
	roomArea = 10;
	acMachine = "LG";
}

Room1(int roomNo, String roomType, float roomArea, String acMachine){
	this.roomNo = roomNo;
	this.roomType = roomType;
	this.roomArea = roomArea;
	this.acMachine = acMachine;
}

Room1(Room1 c){
	this.roomNo = c.roomNo;
	this.roomType = c.roomType;
	this.roomArea = c.roomArea;
	this.acMachine = c.acMachine;
}
void show() {
	System.out.println("Room Number: " + this.roomNo + " Room Type: " + this.roomType + " Room Area: " + this.roomArea + " AC: " + this.acMachine);
}

public static void main(String []args) {
	Room1 r1 = new Room1();
	Room1 r2 = new Room1(20, "Deluxe", 20, "Daikin");
	Room1 r3 = new Room1(r2);
	System.out.println("Default Constructor:");
	r1.show();
	System.out.println("Parameterized Constructor:");
	r2.show();
	System.out.println("Copy Constructor:");
	r3.show();
}
}
