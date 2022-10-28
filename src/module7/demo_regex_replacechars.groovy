package module7

import groovy.io.FileType

class demo_regex_replacechars {
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
//                        def pattern = /\d+(?=\d{4})/
                        def pattern = /(\d+)(?=\d{4})/
                        def match = (line =~ pattern)
                        if(match.find()){
                            def str = match.group(1)
                           //line = line.replaceFirst(pattern, "************")
                            line = line.replaceFirst(pattern, "*"*str.length())
                            println(line)
                        }
                    }
                }
            }

        }catch(Exception e){
            println("Exception occured ${e.getMessage()}")
        }

    }
}
