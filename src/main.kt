fun main() {
    identity(arrayOf("Sharon","James") )
    arrange()
    places()
    var x= names(arrayOf("Sharon","Chepkoech","James"))
    println(x)

}
//    1.Create a function that takes in 4 strings  and creates an array out of them then
//    prints out the array
fun identity(name:Array<String>){
    var name = name.contentToString()
    println(name)
}

//2.Create a function that given an array below:
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.

fun places() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    for (city in cities) {
        println(city.capitalize())
    }
}
//    3.Create one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements

fun arrange(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[1] + numbers[4]
    println(sum)
//(ii) prints out the index of 158
    println( numbers.indexOf(158))
//(iii) prints out the elements in ascending order
    var sortedNumbers = numbers.sortedArray()
    println(sortedNumbers.contentToString())
}
//    4.Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun names(name:Array<String>):String {
    var name= (name.contentToString())
    return name
}
