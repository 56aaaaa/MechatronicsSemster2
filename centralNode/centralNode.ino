//Humidity, temperature sensor node

float getTemp();  //method to get the temperature from the temperature sensor in celsius

void heatingOn();   //methods to turn on and off both the heater and the fan to control the systems environment temperature 
void heatingOff();
void fanOn();
void fanOff();

void tempController(int minHeat, int maxHeat, float temp);    //control loop to ensure that the temperature will be within a suitable range

int humidity = 0;
bool alarm = false;

int minHumid = 45;
int maxHumid = 55;

bool fan = false;   //indicator to check if the fan is on or off
bool heater = false;  //indicator to check if the heater is on or off
  
void setup() {
  Serial.begin(9600);
}

void loop() {
  int maxHeat = 25;
  int minHeat = 18;
  
  float temp = getTemp();

  tempController(minHeat,maxHeat,temp);
  
}

float getTemp() {
  int rawVoltage = analogRead(0);   //reads in value from analogue pin a0
  return (rawVoltage/1024.0)*500;    //converts the raw voltage value into a temperature in celsius and returns it
}

void tempController(int minHeat, int maxHeat, float temp) {
  if(temp < minHeat) {  //if the temperature is too low turn on the heater and turn off the fan if its on
    if(fan) {
      void fanOff();
      fan = false;
    }
    void heatingOn();
    heater = true;
  }
  else if(temp > maxHeat) {   //if the temperature is too high turn on the fan and turn off the heater if its on
    if(heater) {    //ensure heater is off
      void heatingOff();
      heater = false;
    }
    void fanOn();
    fan = true;
  }
  else {    //if the temperature is within desired range turn off all components
    void heatingOff();  
    void fanOff();
    heater = false;
    fan = false;
  }
}

