# CSV Parser
Sample project for Java 21 and GraalVM performance when parsing 1 million row CSV file.

The `CsvParser` Maven project was bootstrapped off ChatGPT, including the `generate_csv.py` Python script.

## Generate CSV file
To generate the 1 million row CSV file, you will need to run:

```
python generate_csv.py
```

Then move the generated file into `src/main/resources`.

## Commands
To build:

```
mvn clean package
```

To run directly:

```
mvn exec:java -Dexec.mainClass="com.example.csvparser.CsvParser"
```

To run JAR:

```
java -jar target/csv-parser-1.0-SNAPSHOT-jar-with-dependencies.jar
```

Compile to native image:

```
native-image -jar target/csv-parser-1.0-SNAPSHOT-jar-with-dependencies.jar
```

To run the native image:

```
./csv-parser-1.0-SNAPSHOT-jar-with-dependencies
```