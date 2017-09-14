INVENTORY ?= testing

.PHONY: provision
provision:
	ansible-playbook -i $(INVENTORY) provision.yml

.PHONY: deploy
deploy:
	ansible-playbook -i $(INVENTORY) provision.yml
