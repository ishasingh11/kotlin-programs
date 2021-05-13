open class Vehicle {
    open fun startEngine(){
        //code to start the engine
    }
}

class BMWCar(): Vehicle() {
    override fun startEngine() {
        println("BMWCar: starting the engine")
        super.startEngine()
    }
}

class AudiCar(): Vehicle() {
    override fun startEngine() {
        println("AudiCar: starting the engine")
        super.startEngine()
    }
}

fun main() {
    val bmwCar: Vehicle = BMWCar()
    startCar(bmwCar)

    val audiCar: Vehicle = AudiCar()
    startCar(audiCar)
}

fun startCar(car: Vehicle) {
    //do some initial step
    car.startEngine()
}

//fun startBmwCar(car: BMWCar) {
//    //do some initial step
//    car.startEngine()
//}
//
//fun startAudiCar(car: AudiCar) {
//    //do some initial step
//    car.startEngine()
//}