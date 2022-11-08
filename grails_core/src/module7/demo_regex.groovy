package module7

import groovy.io.FileType

class demo_regex {
    static void main(String[] args) {

        File dir = new File("c:/groovy/logs")
        File output = new File("c:/groovy/logs/temp.txt")
        output.setWritable(true)
        output.setText("")

        try{

            dir.eachFileMatch(FileType.FILES, ~/.*.log/){
                String line;
                it.withReader {
                    while ( (line = it.readLine()) != null ){
                        //if (line =~ "(?i)Amex|Visa"){
                        //if (line !=~ "(?i)Amex|Visa"){
                        // A "\d" regex matches one or more digits
//                        if (line =~ "card[1-5]"){
                        if (line =~ /card[\d+]/){
                            println("Credit card found")
                            output.withWriterAppend {
                                it.writeLine("Credit Card Found")
                            }
                        }
                    }
                }
            }

        }catch(Exception e){
            println("Exception occured ${e.getMessage()}")
        }

    }
}
