package main

import (
	"fmt"
	"os"
	"os/exec"
	"syscall"
)

func must(err error) {
	if err != nil {
		panic(err)
	}
}

func run() {
	fmt.Printf("Running %v\n", os.Args[2:])
	cmd := exec.Command(os.Args[2], os.Args[3:]...)
	cmd.Stdin = os.Stdin
	cmd.Stdout = os.Stdout
	cmd.Stderr = os.Stderr
	cmd.SysProcAttr = &syscall.SysProcAttr{
		Cloneflags: syscall.CLONE_NEWUTS,
	}
	must(cmd.Run()) // Ensure you actually call Run()
}

func main() {
	if len(os.Args) < 2 {
		fmt.Println("Usage: go run main.go run <command>")
		return
	}
	switch os.Args[1] {
	case "run":
		run()
	default:
		panic("Bad Command")
	}
}



