import java.util.Scanner

fun main(args: Array<String>) {
    val minT = 1
    val maxT = 5000
    val minMatrix = 1
    val maxMatrix = Math.pow(10.0, 9.0).toInt()

    val reader = Scanner(System.`in`)
    val t = reader.nextLine().toInt()

    if(t !in minT..maxT){
        throw Exception("It cannot be less than $minT and greater than $maxT")
    }
    
    var result = ""
    for(i in 1..t){
        val matrix = reader.nextLine()
        val row = matrix.split(" ")[0].toInt()
        val column = matrix.split(" ")[1].toInt()

        if((row !in minMatrix..maxMatrix) || (column !in minMatrix..maxMatrix)){
            throw Exception("The column or row cannot be less than $minMatrix and greater than $maxMatrix")
        }

        if(column == 1 || row == 1){
            if(row == 1) result += "R\n"
            else result += "D\n"
        }else if(row == column){
            if(row % 2 == 0) result += "L\n"
            else result += "R\n"
        }else if(row > column){
            if(column % 2 == 0) result += "U\n"
            else result += "D\n"
        }else {
            if(row % 2 == 0) result += "L\n"
            else result += "R\n"
        }
    }
    print(result)
}