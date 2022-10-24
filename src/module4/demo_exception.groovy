package module4

class demo_exception {
    static void main(String[] args) {
       try{
           // Groovy doesnt require an explicit throws clause in the method signature unlike java
           //RandomAccessFile file = new RandomAccessFile("unknownfile.txt", "r")
           def cards = ["Visa", "Amex", "Discover", "Master"]
           println(cards[0].size())

           int i = 1/1
            def cardLength = [16, 14, 15, 13]
           check(cardLength)
           // Groovy exits the try block immediately after the first exception
       }
//       catch (Exception e){
//           println(e.getMessage())
//           e.printStackTrace()
//       }
//        catch (NullPointerException e){
//            println("Null pointer exception encountered")
//            println(e.getMessage())
//            e.printStackTrace()
//        }
//        catch (ArithmeticException e){
//            println(e.getCause())
//            print(e.getMessage())
//        }
        finally {
            println("Let's perform resource cleanup")
        }

        println("After try/catch Block")

    }

    static check(list){
        for(card in list){
            if(card < 14){
                throw new InvalidCardLengthException("Card contains fewer than 14 digits")
            }
            println(card)
        }
    }
}
