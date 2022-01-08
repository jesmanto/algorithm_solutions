import kotlin.math.sqrt

fun catAndMouse(x: Int, y: Int, z: Int): String {
    val xNew = x.toDouble()
    val yNew = y.toDouble()
    val zNew = z.toDouble()
    var result = ""
    val xCatDist = sqrt((xNew-zNew)*(zNew-xNew).toInt())
    val yCatDist = sqrt((yNew-zNew)*(zNew-yNew).toInt())

    if(xCatDist > yCatDist){
        result = "Cat B"
    }else if(xCatDist < yCatDist){
        result = "Cat A"
    }else{
        result = "Mouse C $xCatDist"
    }

    return result

}