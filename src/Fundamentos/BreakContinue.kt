package Fundamentos

fun main() {

//    for(i in 1..10){
//
//        if(i == 5){
//            break
//        }
//
//        println("Atual $i")
//    }
//
//    loop@for(i in 1..10){
//        for (j in 1..5){
//            if(i == 4 && j == 4) {
//                println("Quebrei")
//                break@loop
//            }
//        }
//    }

    for (i in 1..10){
        if (i == 5){
            continue
        }
        println("atual $i")
    }
}