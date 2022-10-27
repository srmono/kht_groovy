package module8

trait swipability {

    int num_swipes = 0
    void validateSwipe(){
        println("Validating swipe from trait")
    }

    int getSwipes(){
        num_swipes += 1
        num_swipes
    }

}