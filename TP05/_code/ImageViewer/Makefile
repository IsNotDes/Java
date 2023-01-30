SRC=./
MAINCLASS=TestImageViewer
SRCJAVA=$(wildcard $(SRC)/*.java)
CLASSFILES = $(SRCJAVA:.java=.class)

all: run

# Compile
%.class: %.java
	javac $^

# Run
run: $(SRC)/$(MAINCLASS).class
	java $(MAINCLASS)

tar: clean

clean:
	rm -f $(SRC)/*.class $(SRC)/*~ *~
