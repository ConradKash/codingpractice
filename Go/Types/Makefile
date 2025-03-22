.DEFAULT_GOAL = run

.PHONY: fmt vet build run clean

fmt:
	cd ./PreDeclared &&	go fmt .

vet: fmt
	cd ./PreDeclared && go vet .

build: vet
	cd ./PreDeclared && go build .

run: build
	./PreDeclared/PreDeclared
