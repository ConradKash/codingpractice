package main

import (
	"fmt"
	"os"
)

func main() {
	if len(os.Args) < 1 {
		fmt.Println("Usage: " + os.Args[0] + " <file>")
	} else {
		fmt.Printf("Using file %s\n", os.Args[1])
	}
}
