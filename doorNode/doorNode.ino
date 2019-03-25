#include <Servo.h>

bool door = false;
bool mat = false;
int occupants = 0;
bool RFID = false;
int buttonState=0;

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
  buttonState=digitalRead(buttonPin);
  Serial.println(buttonState);
  Serial.println(door);
  if(buttonState==HIGH && !door)
  {
  for(int i=0;i<90;i++)
  {
    servodoor.write(i);
    delay(20);}
    delay(3000);
    door=true;
  } 
  if(door)
  {
    for(int i=90;i>0;i--)
    {
      servodoor.write(i);
      delay(20);}
    } 
    door=false;
}
