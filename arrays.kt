fun main() {

    // declare array using type inference
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")

    // type inference not always necessary
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")

    // "concatenate" two arrays
    val solarSystem = rockPlanets + gasPlanets

    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])

    // can't resize array, this will throw an error IndexOutOfBounds
    //solarSystem[8] = "Pluto"

    // instead create new array
    val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
    println(newSolarSystem[8])

}