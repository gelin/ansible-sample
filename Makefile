.PHONY: jar
jar:
	cd hello-service && $(MAKE) jar

.PHONY: run
run:
	cd hello-service && $(MAKE) run

.PHONY: clean
clean:
	cd hello-service && $(MAKE) clean

.PHONY: deploy
deploy: jar
	cd ansible && $(MAKE) deploy
