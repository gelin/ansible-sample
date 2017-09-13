.PHONY: jar
jar:
	./gradlew bootRepackage

.PHONY: run
run: jar
	java -jar build/libs/hello-service-*.jar

.PHONY: clean
clean:
	./gradlew clean
