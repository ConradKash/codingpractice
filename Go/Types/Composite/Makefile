.DEFAULT_GOAL run

fmt:
	go fmt .

vet: fmt
	go vet .

build: vet
	go build

run: build
	./Composite