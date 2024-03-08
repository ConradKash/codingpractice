package main

import (
    "fmt"
    "os"
    )

func main() {
    var x = "Hello, World!"
    fmt.Println(x)
    fmt.Println(os.Getenv("GOPATH"))
    fmt.Println(len(x))
    fmt.Println(x[1])
    var y string
    y = "first"
    fmt.Println(y)
    var z string
    z = y
    y += " second"
    fmt.Println(y)
    fmt.Println(z==y)

    var a = "Conrad"
    b := "Conrad"
    println(a == b)

    dogsName := "Max"
    fmt.Println("My dog's name is", dogsName)

    fmt.Print("Enter a number: ")
    var input float64
    fmt.Scanf("%f", &input)
    output := input * 2
    fmt.Println(output)
}