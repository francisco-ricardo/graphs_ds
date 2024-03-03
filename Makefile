.PHONY: all run push help

# target: all - Executa o run
all: run

# target: run - Executa o container
run:
	docker-compose up

# target: push - Push para os repositorios remotos do Git
push:
	git push github $(branch)

# target: help - Mostra os targets que sao executaveis
help:
	@egrep "^# target:" [Mm]akefile

# EOF