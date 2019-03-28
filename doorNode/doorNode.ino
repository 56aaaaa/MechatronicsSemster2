#include <Servo.h>

bool openDoor();    //method to open the door
bool closeDoor();   //method to close door

bool mat = false;   //globals need moving
bool RFID = false;  

int buttonPin=2;
int servoPin=12;

Servo servodoor;

void setup() {
  Serial.begin(9600);
  pinMode(buttonPin,INPUT);
  servodoor.attach(servoPin);
  servodoor.write(0);
}

void loop() {
  int buttonState=0;
  bool door = false;
  int occupants = 0;
  
  buttonState=digitalRead(buttonPin);
  
  if(buttonState==HIGH && !door) {    //leaving house open door (so occupants = -1)
    door = openDoor();
  }
  while(buttonState == High) {
    delay(3000);  //three seconds after door has opened close it
    buttonState=digitalRead(buttonPin); //check if button is still pressed
  }
  door = closeDoor();  //close door after a time delay
}

bool openDoor() {
  for(int i=0;i<90;i++) {
    servodoor.write(i);
    delay(20);
  }
  return true;
} 

bool closeDoor() {
  for(int i=90;i>0;i--) {
    servodoor.write(i);
    delay(20);
  }
  return false; 
}

