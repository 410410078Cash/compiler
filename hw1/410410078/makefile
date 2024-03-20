ANTLR_JAR = ./antlr-3.5.3-complete-no-st3.jar

all: mylexer compile

mylexer:
	java -jar $(ANTLR_JAR) mylexer.g

compile:
	javac -cp $(ANTLR_JAR):. *.java

ex1:
	java -cp $(ANTLR_JAR):. testLexer.java example1.c

ex2:
	java -cp $(ANTLR_JAR):. testLexer.java example2.c

ex3:
	java -cp $(ANTLR_JAR):. testLexer.java example3.c

clean:
	rm -f *.class
	rm -f *.tokens
	rm -f mylexer.java
