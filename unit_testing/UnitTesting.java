public class Car{

drive(){
  startCar();
}
startCar(){
  checkSourceOfIgnition();
  putSeatbeltOn();
    }
checkSourceOfIgnition(){
  if(key)
    startKeyCar();
  else(pressButton) //imperative
}
startKeyCar(){
      put key into igniion //imperative
      turn //imperative
      if(carb) press gas //imperative
      else //
}
putSeatbeltOn(){
  if(seatbelt = true)
    wearSeatbelt();
}
putInGear(){
  if(manual)
    shiftManual();
  else
    shiftAuto();
}
ShiftManual(){
  pressClutch(){workClutch(true)}
  moveGearShift(gear);
  releaseClutch(){workClutch(false);}

workClutch(boolean press){
  if(press)
  //do steps to press
  else //do steps to release
}
Acccelerate();
turn();
brake();

main(){
      drive();
  }
  }
}
