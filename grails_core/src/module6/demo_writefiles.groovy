package module6

import groovy.io.FileType

class demo_writefiles {
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
                        if(line.contains("Visa"))
                            //println(line)
                            //output.append(line+"\n")
                            // output.withWriter {it.writeLine(line)}
                            output.withWriterAppend {
                                it.writeLine(line)
                            }
                    }
                }
            }

        }catch(Exception e){
            println("Exception occured ${e.getMessage()}")
        }

        println("Readable: ${output.canRead()}")
        println("Writable: ${output.canWrite()}")
        println("Executable: ${output.canExecute()}")
    }
}
