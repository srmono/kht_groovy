package module9

import groovy.io.FileType
import groovy.json.JsonBuilder
import groovy.xml.MarkupBuilder
import module8.cardGroovyBean

class demo_markup {
    static void main(String[] args) {

        File dir = new File("c:/groovy/logs")
        List cardList = []
        MarkupBuilder builder = new MarkupBuilder(
                new PrintWriter("output.xml")
        );

        MarkupBuilder htmlBuilder = new MarkupBuilder(
                new PrintWriter("output.html")
        )

        JsonBuilder jsonBuilder = new JsonBuilder()

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
            //Xml file
            builder.cards(){
                cardList.each { indCard ->
                    card{
                        name indCard.name
                        digits indCard.num_digits
                    }
                }
            }

            //Html file
            htmlBuilder.html(){
                head {
                    title "Card Details"
                }
                body {
                    h1 "Card Details in the input file"
                }
                table {
                    tr {
                        th "Card Name"
                        th "Number of Digits"
                    }
                    cardList.each { indCard ->
                        tr {
                            td indCard.name
                            td indCard.num_digits
                        }
                    }
                }
            }

            //Json File
            jsonBuilder.cards{
                card cardList.each {
                    [
                            name: it.getName(),
                            digits: it.getNum_digits()
                    ]
                }
            }

            println(jsonBuilder.toPrettyString())

            File json_out = new File("output.json")
            json_out.write(jsonBuilder.toPrettyString())

            cardList.each { card -> println("$card.name is $card.num_digits digits long")}
        }catch(Exception e){
            println("Exception occured ${e.getMessage()}")
        }

    }
}
