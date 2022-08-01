//Create a class named "Measurement"  that has the following members:
//- private backing field to store distance in centimeters i.e. private var _centimeters : Double
//- public getter and setter for the _centimeters backing field i.e. var centimeters get ... set ...
//- public getter and setter for inches that returns the centimeters converted to inches and sets
//the centimeters to a conversion of the inches value provided when being set

fun main() {
  val length1 = Measurement()
  length1.centimeters = 10.0
  println(length1.inches)
}

class Measurement {
    private var _centimeters: Double = 0.0
    var centimeters: Double
      get() {
          return this._centimeters
      }
      set(value) {
          this._centimeters = value
      }
    var inches: Double
      get() {
          return this._centimeters / 2.54
      }
      set(value) {
         this._centimeters = value * 2.54
      }
}