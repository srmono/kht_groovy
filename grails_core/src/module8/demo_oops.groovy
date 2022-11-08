package module8

import groovy.io.FileType

class demo_oops {
    static void main(String[] args) {

        File dir = new File("c:/groovy/logs")
        List cardList = []
        try{

            dir.eachFileMatch(FileType.FILES, ~/.*.log/){
                println(it.absolutePath)
                File out = new File(it.absolutePath)
                String line;
                it.withReader {
                    while ( (line = it.readLine()) != null ){
                        //def pattern = /(\d+)(?=\d{4})/
                        def pattern = ~/\d+\s(\w+)\s+(\d+)/
                        def match = (line =~ pattern)
                        if(match.find()){
                            def cardName = match.group(1)
                            int cardDigits = match.group(2).length()
                            cardGroovyBean c = new cardGroovyBean()
                            c.name = cardName
                            c.num_digits = cardDigits
                            cardList.add(c);
//                            def str = match.group(1)
//                            def update = out.text.replaceFirst(pattern, "*"*str.length())
//                            println(update)
//                            out.text = update
                        }
                    }
                }
            }
            cardList.each { card -> println("$card.name is $card.num_digits digits long")}
        }catch(Exception e){
            println("Exception occured ${e.getMessage()}")
        }

    }
}
