package module11

import groovy.io.FileType
import groovy.json.JsonBuilder
import groovy.sql.Sql
import groovy.xml.MarkupBuilder
import module8.cardGroovyBean

class demo_insert {
    static void main(String[] args) {

        File dir = new File("c:/groovy/logs")

        dir.eachFileMatch(FileType.FILES, ~/.*.log/){
            println(it.absolutePath)
            File out = new File(it.absolutePath)
            String line;
            it.withReader {
                while ( (line = it.readLine()) != null ){
                    def pattern = /(\d+)(?=\d{4})/
                    //def pattern = ~/\d+\s(\w+)\s+(\d+)/
                    def match = (line =~ pattern)
                    if(match.find()){
                        def str = match.group()
                        def update = out.text.replaceFirst(pattern, "*" * str.length())
                        print(update)
                        out.text = update
                    }
                }
            }
        }

        def db = new demo_db()
        Sql sql = db.getConnection();
        def timestamp = new Date().format("yyyy-MM-dd HH:mm:ss")
        println("Current time is $timestamp")

        String insert = "INSERT INTO pcirun.runlog(timstamp) VALUES( ' ${timestamp} ' )"
        sql.execute(insert)
        sql.close()
    }
}
