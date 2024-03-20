ANTLR_JAR = ./antlr-3.5.3-complete-no-st3.jar

all: mylexer compile

mylexer:
	java -cp $(ANTLR_JAR) org.antlr.Tool mylexer.g

compile:
	javac -cp $(ANTLR_JAR):. testLexer.java mylexer.java

test1:
	java -cp $(ANTLR_JAR):. testLexer example1.c

test2:
	java -cp $(ANTLR_JAR):. testLexer example2.c

test3:
	java -cp $(ANTLR_JAR):. testLexer example3.c

clean:
	rm -f *.class