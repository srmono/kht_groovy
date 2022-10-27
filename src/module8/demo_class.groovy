package module8

import javax.swing.Icon

class card implements ICardService, swipability {
    String name;
    int num_digits;
    //constructor
    card(){
        println("A new instance of card is getting created")
    }
    //constructor with args
    card(String p_name, int p_num_digits){
        name = p_name
        num_digits = p_num_digits
        println("A new enhanced instance of card is getting created")
    }

    //Methods
    int getTotalDigits(){
        int lastThree = 3
        num_digits + lastThree
    }

    int getTotalDigits(int num){
        int lastThree = num
        num_digits + lastThree
    }

    @Override
    void alertViolations() {
        println("Sending an email to the customer")
    }

}

class chipCard extends card implements ICardService{

    void getMicroChipInfo(){
        println("This method will print the details about microchip")
    }

    @Override
    void alertViolations(){
        println("Sending an email to customer from child class")
    }

}

interface ICardService{
    void alertViolations()
    default void validateCardSwipe(){
        println("This is a default method implemente in the interface")
    }
}

card card1 = new card("Visa", 16)
println("Total number of digits ${card1.getTotalDigits(4)}")
//card1.getMicroChipInfo()
card1.alertViolations()
card1.validateCardSwipe()

card card2 = new chipCard()
card2.getMicroChipInfo()
card2.alertViolations()
card2.validateSwipe()

println("Number of swipes ${card2.getSwipes()}")
println("Number of swipes ${card2.getSwipes()}")
println("Number of swipes ${card2.getSwipes()}")

