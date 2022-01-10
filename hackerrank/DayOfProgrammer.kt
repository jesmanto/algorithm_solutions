fun dayOfProgrammer(year: Int): String {

    return if(year > 1918 && (year % 4 == 0 && year % 100 != 0)){
        "12.09.$year"
    }else if(year > 1918 && year % 400 == 0){
        "12.09.$year"
    }else if (year < 1918 && year % 4 == 0){
        "12.09.$year"
    }else if(year < 1918 && year % 4 != 0){
        "13.09.$year"
    }else if(year == 1918){
        "26.09.$year"
    }else{
        "13.09.$year"
    }
}