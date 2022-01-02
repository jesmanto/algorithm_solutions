fun main(){
    fun gradingStudents(grades: Array<Int>): Array<Int> {
        // Write your code here
        var newScore = 0
        for (score in grades){
            if ((((((score / 5)+1)*5) - score) < 3) && (score >= 38)){
                newScore = 5 * ((score / 5)+1)
            } else{
                newScore = score
            }
            grades[grades.indexOf(score)] = newScore
        }
        return grades
    }
    val arr = arrayOf(54,56,76,3,45,33)
    print(gradingStudents(arr))
}