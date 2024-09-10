.DEFAULT_GOAL := clean

.PHONY:fmt vet build run clean

fmt:
	go fmt .

vet: fmt
	go vet .

build: vet
	go build

run: build
	./hello_world

clean: run
	go clean